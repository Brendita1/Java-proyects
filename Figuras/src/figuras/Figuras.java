/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        do{
        Scanner leer = new Scanner(System.in);
        float lado,base,altura,triangulo;
        int opc;
        System.out.println("Elije cual figura quieres formar \n");
        System.out.println("1 Cuadrado \n");
        System.out.println("2 Triangulo\n");
        System.out.println("3 Rectangulo \n");
        opc= leer.nextInt();
        switch(opc){
            case 1:
          Cuadrado cuadrado_obj = new Cuadrado();
                System.out.println("Introduce el lado");
                cuadrado_obj.lado= leer.nextFloat();
                cuadrado_obj.Dibuja_cuadrado();
                System.out.println("\n");
                break;
            case 2:
                System.out.print("Este es un triangulo equilatero, porfavor introduzca la altura\n");
                 
                Triangulo triangulo_obj = new Triangulo();
                triangulo_obj.lado= leer.nextFloat();
                triangulo_obj.Dibuja_triangulo();
                System.out.println("\n");
                break;
         
            case 3:
                Rectangulo rectangulo_obj = new Rectangulo();
                System.out.print("Tamano de la base: ");
                 rectangulo_obj.base=leer.nextInt();
         
                System.out.print("Tamano de las altura: ");
                rectangulo_obj.altura=leer.nextInt();
                rectangulo_obj.Dibuja_Rectangulo();
                System.out.println("\n");
      	 	break;
                
                }
            System.out.println("Desea agregar otra figura? 1)si 2) no");
            opcion= leer.nextInt();
        }while(opcion!=2);
     }
    }
    

