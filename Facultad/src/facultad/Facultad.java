/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facultad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Facultad {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        ArrayList<Persona> CatalogoPersonas = new ArrayList<Persona>();
        
        
        int menu;
        
        do
        {
            System.out.println("Introduzca la opcion deseada: \n[1]Ingresar informacion del alumno\n[2]Ingresar informacion del profesor\n[3]Ingresar la informacion del personal administrativo\n[4]Imprimir los datos");
            menu=leer.nextInt();
            leer.nextLine();
            
            switch(menu){
                
                case 1:     int edad;
                            long matricula,telefono;
                            String nombre,facultad,rol,carrera;
                            System.out.println("Introduzca el nombre: ");
                            nombre = leer.nextLine();
                            System.out.println("Introduzca la edad: ");
                            edad=leer.nextInt();
                            System.out.println("Introduzca la matricula: ");
                            matricula =leer.nextLong();
                            System.out.println("Introduzca el telefono: ");
                            telefono=leer.nextLong();
                            leer.nextLine();
                            System.out.println("Introduzca la carrera: ");
                            carrera = leer.nextLine();
                            Alumno alumno =new Alumno(edad,nombre,telefono,matricula,carrera);
                            CatalogoPersonas.add(alumno);
                            break;
                
                case 2:     
                            
                            String materia,especialidad;
                            System.out.println("Introduzca el nombre: ");
                            nombre=leer.nextLine();
                            System.out.println("Introduzca la edad: ");
                            edad=leer.nextInt();
                            System.out.println("Introduzca el telefono: ");
                            telefono=leer.nextLong();
                            leer.nextLine();
                            System.out.println("Introduzca la materia: ");
                            materia = leer.nextLine();
                            System.out.println("Introduzca la especialidad: ");
                            especialidad =leer.nextLine();
                            
                            Profesor profesor = new Profesor (edad,nombre,telefono,materia,especialidad);
                            CatalogoPersonas.add(profesor);
                            
                            
                            break;
                
                
                case 3:     int clave;
                            String departamento;
                            System.out.println("Introduzca el nombre: ");
                            nombre=leer.nextLine();
                            System.out.println("Introduzca el telefono: ");
                            telefono=leer.nextLong();
                            System.out.println("Introduzca la edad: ");
                            edad=leer.nextInt();
                            System.out.println("Introduzca la clave: ");
                            clave = leer.nextInt();
                            leer.nextLine();
                            System.out.println("Introduzca el departamento: ");
                            departamento = leer.nextLine();
                            Administrativo admin = new Administrativo (clave,edad,nombre, telefono,departamento);
                            CatalogoPersonas.add(admin);
                            break;
                
                
                case 4:     for(Persona persona: CatalogoPersonas){
                                persona.printable();
                                
                            }
                       
                
                            break;
            
                case 5:     
                            break;
                            
                default:    System.out.println("Opcion Equivocada");
                            break;
        
            }
            
            
            
            
            
        } while (menu != 5); 
        
        
        
        
        
    }
    
    
}
