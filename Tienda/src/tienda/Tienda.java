/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int i=0,n=1,opc,salir;
        
        ArrayList <Perecedero> Perecedero = new ArrayList();
        ArrayList <NoPerecedero> NoPerecedero = new ArrayList();
        ArrayList <Otro> Otro = new ArrayList();
        
        
        
        while(i<n){
            
        System.out.println("Introduzca la opcion deseada: \n[1]Perecedero\n[2]NoPerecedero\n[3]Otro\nOpcion: ");
        opc=leer.nextInt();
        leer.nextLine();
           
            switch(opc){
                case 1:     int dias;
                            String nombre,descripcion;
                            int cantidad,precio;
                            System.out.println("Introduzca el nombre: ");
                            nombre = leer.nextLine();
                            System.out.println("Introduzca la descripcion: ");
                            descripcion=leer.nextLine();
                            System.out.println("Introduzca la cantidad: ");
                            cantidad=leer.nextInt();
                            leer.nextLine();
                            System.out.println("Introduzca el precio: ");
                            precio=leer.nextInt();
                            leer.nextLine();
                            System.out.println("Introduzca la cantidad de dias a caducar: ");
                            dias = leer.nextInt();
                            leer.nextLine();
                            
                            Perecedero perecedero = new Perecedero(cantidad,precio,descripcion,nombre,dias);
                            Perecedero.add(perecedero);
                            
                            break;
                            
                            
                case 2:     String tipo;
                            System.out.println("Introduzca el nombre: ");
                            nombre = leer.nextLine();
                            System.out.println("Introduzca la descripcion: ");
                            descripcion=leer.nextLine();
                            System.out.println("Introduzca la cantidad: ");
                            cantidad=leer.nextInt();
                            leer.nextLine();
                            System.out.println("Introduzca el precio: ");
                            precio=leer.nextInt();
                            leer.nextLine();
                            System.out.println("Introduzca el tipo: ");
                            tipo = leer.nextLine();
                            
                            NoPerecedero noperecedero = new NoPerecedero(cantidad,precio,descripcion,nombre,tipo);
                            NoPerecedero.add(noperecedero);
                            
                            break;            
            
                            
                            
                            
                            
                case 3:     String categoria;
                            System.out.println("Introduzca el nombre: ");
                            nombre = leer.nextLine();
                            System.out.println("Introduzca la descripcion: ");
                            descripcion=leer.nextLine();
                            
                            System.out.println("Introduzca la cantidad: ");
                            cantidad=leer.nextInt();
                            leer.nextLine();
                            System.out.println("Introduzca el precio: ");
                            precio=leer.nextInt();
                            leer.nextLine();
                            
                            System.out.println("Introduzca la categoria: ");
                            categoria = leer.nextLine();
                            
                            Otro otro = new Otro(cantidad,precio,descripcion,nombre,categoria);
                            Otro.add(otro);
                            
                            break;
        case 4:     for(Perecedero p: Perecedero){
                                p.ver();
                            
                            }
                            break;
                            
                case 5:     for(NoPerecedero nop: NoPerecedero){
                                nop.ver();
                            
                            }
                            break;
                case 6:     for(Otro o: Otro){
                                o.ver();
                            
                            }
                            break;
                
                
                default:    
                            break;
            
            }
            
            
            do{
            System.out.println("Â¿Desea salir? [1]Si\n[2]No\nOpcion: ");
            salir = leer.nextInt();
            } while(salir <=1 && salir>=2);
            
            if(salir == 2){
            n++;
            }
            
            i++;
            
        }

        
        
    }
    }
    

