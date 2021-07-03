
package agenciadeportes;
import java.util.Scanner;
import java.util.ArrayList;
public class Agenciadeportes {

    public static void main(String[] args) {
      ArrayList <Futbolista> Futbolista = new ArrayList();
        int i = 0;
        int menu;
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
        double pagaBase;
        String posicion;
        int cantidadFutbolistas = 0;
        int cantidadBeisbolista = 0;
        do{
            System.out.println("1.-Agregar futbolista.\n2.-Agrgar beisbolista.\n3.-Imprimir deportista.\n4.-Imprimir futbolista.\n5.-Imprimir beisbolista.\n6.-Salir\n");
        System.out.println("Elija opcion:\n");
        menu = sc.nextInt();
        switch(menu){
            case 1: 
                // lo correcto es declararlo arriba junto con menu pero para
              
                int numGoles;
                int numParadas;
                sc.nextLine();
                System.out.println("Digite el nombre del deportista  ");
                nombre = sc.nextLine();
                System.out.println("Digite la edad");  
                edad= sc.nextInt();
                sc.nextLine();
                System.out.println("Digite la paga");
                
                pagaBase = sc.nextDouble();
                sc.nextLine();
                System.out.println("Digite la posicion");
                posicion = sc.nextLine();
                sc.nextLine();
                System.out.println("Digite numero de goles");
                numGoles = sc.nextInt();
                sc.nextLine();
                System.out.println("Digite numero de paradas");
                numParadas = sc.nextInt();
                sc.nextLine();
                // AQUI APLICAMOS EL POLIMORFISMO
                /* YA QUE COMO SABEMOS UN FUTBOLISTA ES UN DEPORTISTA 
                POR LO CUAL SI HACEMOS UN ARREGLO DE DEPORTISTA PUEDE SER
                TANTO FUTBOLISTA COMO BEIBOLISTA ENTONCES
                LA INSTANCIA DEL FUTBOLISTA SE HACE DE ESTA MANERA
                */
                Deportista deportista = new Deportista( nombre,  edad, pagaBase);
               deportista = new Futbolista(deportista.nombre,deportista.edad, (int) deportista.pagaBase,posicion,numGoles,numParadas);
                i++; // el arreglo aumenta ya que deportista[i] puede ser un futbolista o un beisbolista y en este caso es futbolista
                cantidadFutbolistas++;
                 Futbolista.add((Futbolista) deportista);
                   break;
            
            case 2:   
                // lo correcto es declararlo arriba junto con menu pero para

                int numHomeRuns;
                int numStrikes;
                System.out.println("Digite el nombre del deportista , la edad, su paga base, la posicion del mismo, su numero de Home Runs y su numero de Strikes: ");
                nombre = sc.nextLine();
                edad= sc.nextInt();
                pagaBase = sc.nextDouble();
                posicion = sc.nextLine();
                numHomeRuns = sc.nextInt();
                numStrikes = sc.nextInt();
                // AQUI APLICAMOS EL POLIMORFISMO
                /* YA QUE COMO SABEMOS UN FUTBOLISTA ES UN DEPORTISTA 
                POR LO CUAL SI HACEMOS UN ARREGLO DE DEPORTISTA PUEDE SER
                TANTO FUTBOLISTA COMO BEIBOLISTA ENTONCES
                LA INSTANCIA DEL FUTBOLISTA SE HACE DE ESTA MANERA
                */
               deportista = new Beisbolista(nombre,edad, (int) pagaBase,posicion,numHomeRuns,numStrikes);
                i++;
                cantidadBeisbolista++;
                break;
                
            case 3: 
                int ayuda;
              for(ayuda=0;ayuda<i;ayuda++){
                 // System.out.println("El nombre del deportista: " + deportista);
                  //System.out.println("Su edad es: " + deportista[ayuda]);
                 // System.out.println("su paga base es: " + deportista[ayuda]);
              }
               break;
            case 4:
                int auxiliar = 0;
            
                // convertimos al deportista en un futbolista con un cast para poder usar sus funciones
                
                    for(auxiliar=0;auxiliar<cantidadFutbolistas;auxiliar++){
                       // if(deportista[auxiliar] instanceof Futbolista){
                        //    Futbolista f = (Futbolista) deportista[i]; // esto lo hacemos para poder utilizar las funciones de un futbolista
                             System.out.println("El nombre del Futbolista es:" + f.getNombre());
                             System.out.println("su paga es: " + f.getPagaBase());
                        }
                       
                    }
                
                break;
            case 5: 
                int auxiliarDos;
                for(auxiliarDos=0;auxiliarDos<cantidadBeisbolista;auxiliarDos++){
                    
                }
                    
        }
        
    }while(menu != 6);
    
}
}
