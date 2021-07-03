/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascal.solucionado;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PascalSolucionado {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        int opc;
        do{
        Scanner entrada = new Scanner(System.in);
        int n=0,mas_grande = 1,espacios,aux,espacios_aux,espacios_entrenumeros;
        int[] arreglo = new int[1]; 
        System.out.println("Ingrese por favor la potencia");
        n= entrada.nextInt();
        /*Primero calcularemos el numero de espacios para imprimir la piramide. A base de observacion, inferimos que los espacios suficientes antes de imprimir 
        la primera linea es igual al numero de la potencia. Notamos que para conservar la alineación necesitabamos disminuir el numero de digitos del numero mas grande en cada iteracion.
        Tambien era importante que todos los numeros ocuparan los mismos "espacios" que la cantidad de digitos del numero mas grande.
        Respecto al  numero de espacio entre los numeros generados es igual a los digitos del mas grande. Por ejemplo:
        Tome el siguiente ejemplo:
        Potencia 5
        ----------&1**
        --------&1**&1**
        ------&1**&2**&1**
        ----&1**&3**&3**&1**
        --&1**&4**&6**&4**&1**
        &1**&5**10**10**&5**&1**
        
        Si el numero mas grande tiene dos digitos (10), entonces todos tienen que tener dos espacios para conservar la alineacion.
        Donde "-" representa los espacios previos
        Los "&" llena el espacio vacio para tener dos digitos
        Los "*" son los espacios entre cada numero generado
        */
        
        for(int i=1;i<=n+1;i++) // Haremos el proceso dos veces, esta primera vez para encontrar el numero de digitos del mas grande
        {
            
            int[]pascal = new int[i];
            for(int k=0;k<i;k++){
                // esta es una condicion para saber que el ciclo esta funcionando bien
                if (k==0||k==(i-1)){
                    pascal[k]=1;
                    if(pascal[k]>mas_grande) mas_grande=pascal[k];
                }
                else{
                    //Sumamos los numeros que estan en cada posicion para formar el numero, buscando tambien en esta parte, el numero mas grande
                    pascal[k] = arreglo[k] +arreglo[k-1];
                    if(pascal[k]>mas_grande) mas_grande=pascal[k];
                    
                }
            }
            arreglo=pascal;
        }
        espacios=(Integer.toString(mas_grande)).length(); //Notamos que para conservar la alineación, era necesario considerar el numero de digitos del numero mas grande, por lo que procedemos a guaradrlo
        aux=n*espacios; //Si n es la potencia, entonces aux * el numero de digitos del numero mas grande representara el numero de espacios previos en cada linea
        
        /*En esta parte se explicará el proceso de generacion de cada numero de la piramide de pascal*/
        for(int i=1;i<=n+1;i++) // Colocamos un arreglo y colocamos la variable i del ciclo for que sera el tamaño que tendra el arreglo cada vez que el ciclo se haga
        {
            int[]pascal = new int[i];
            for(int j= 0; j<aux;j++)
            {
                System.out.print(" "); //Espacios previos en cada linea
                
            }
            for(int k=0;k<i;k++){
                // esta es una condicion para saber que el ciclo esta funcionando bien
                if (k==0||k==(i-1)){
                    pascal[k]=1;
                }
                else{
                    //Sumamos los numeros que estan en cada posicion para formar el triangulo
                    pascal[k] = arreglo[k] +arreglo[k-1];
                    
                }
                espacios_aux=(Integer.toString(pascal[k])).length();
                espacios_entrenumeros=espacios-espacios_aux;
                for(int h=0;h<espacios_entrenumeros;h++){
                System.out.print(" "); //Espacio previo para cada digito, para conservar la alineación
                }
                System.out.print(pascal[k]);
                for(int h=0;h<espacios;h++){ //Espacios entre numeros
                System.out.print(" ");
                }
            }
            arreglo= pascal;
            aux=aux-espacios; //Disminuiremos aux para conservar la correcta alineación
            System.out.println();
        }
        
        System.out.println("¿Desea continuar con otra potencia?\n[1]Si [2]No\nOpcion: ");
        opc= entrada.nextInt();
         if(opc!=2 && opc!=1)
         {
             System.out.println("Porfavor ingrese una opcion valida");
         }
     
       }while(opc==1||opc>2||opc<1) ;
    }
    
}
