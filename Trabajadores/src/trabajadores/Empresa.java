/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajadores;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Empresa {
    
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        
        ArrayList<Trabajadores> Empleados = new ArrayList<>();
        ArrayList<Programadores> Lista = new ArrayList<>();
        ArrayList<Soporte_Tecnico> Lista_soporte = new ArrayList<>();
        ArrayList<Gerentes> Lista_Gerente= new ArrayList<>();
        int opcion;
         int opc;
          do{
       System.out.println("Ingrese una opcion:");
       System.out.println("1) Alta:");
       System.out.println("2) Editar:");
       System.out.println("3) Eliminar");
       System.out.println("4) Mostrar info:");
        System.out.println("5) salir:");
       opc= leer.nextInt();
      
       switch(opc)
       {
           case 1:
               
               int opc2;
               System.out.println("Ingrese la opcion que desea dar de alta:");
               System.out.println("1) Programadores:");
               System.out.println("2) Soporte Tecnico:");
               System.out.println("3) Gerentes");
       
               opc2=leer.nextInt();
               switch(opc2)
               {
                   case 1:
       
           int opc3;
           do{
               
               int lineaxhora,salario;
                int num_empleado;
               Scanner entrada= new Scanner(System.in);
               System.out.println("Ingrese su Nombre");
               String nombre = entrada.nextLine();
               entrada.skip("\n");
               System.out.println("Ingrese su Fecha De Nacimiento");
               String fecha_nacimiento= entrada.nextLine();
               entrada.skip("\n");
               System.out.println("Como programadores ingrese las lineas x hora");
               lineaxhora=leer.nextInt();
               entrada.skip("\n");
                System.out.println("Ingrese su salario");
                salario= entrada.nextInt();
                entrada.skip("\n");
               System.out.println("Ingrese su Numero De Empleado");
                num_empleado= entrada.nextInt();
                entrada.skip("\n");             
               System.out.println("Ingrese su edad");
               int edad= entrada.nextInt();
               entrada.skip("\n");
               System.out.println("Ingrese su area");
              String  area= entrada.nextLine();
              entrada.skip("\n");
               System.out.println("Ingrese sus Apellidos");
               String apellido= entrada.nextLine();
               entrada.skip("\n");
            System.out.println("Introduzca el lenguaje que usa");
            String lenguaje_usado = entrada.nextLine();
            entrada.skip("\n");
               Programadores programadores = new Programadores( lenguaje_usado,  lineaxhora, nombre, apellido,  num_empleado, edad,  fecha_nacimiento, salario, area);
               Empleados.add(programadores);
               Lista.add(programadores);
               System.out.println("Desea agregar otro? 1) Si 2) No");
               opc3 = leer.nextInt();
           } while(opc3==1);
       
                  break;
                       
                       case 2:
                            int opcion1;
                            do{
                    int insidencias_resueltas;
                    String area_responsabilidad;
                     System.out.println("Ingrese su Numero De Empleado");
                    int num_empleado= leer.nextInt();
                    leer.skip("\n");
                   System.out.println("Ingrese su Fecha De Nacimiento");
                    String fecha_nacimiento= leer.nextLine();
                    leer.skip("\n");
                    System.out.println("Ingrese su Nombre");
                   String nombre = leer.nextLine();
                    leer.skip("\n");
                   System.out.println("Ingrese sus Apellidos");
                    String  apellido= leer.nextLine();
                    leer.skip("\n");
                    System.out.println("Ingrese su edad");
                   
                    int  edad= leer.nextInt();
                     leer.skip("\n");
                    System.out.println("Ingrese su salario");
                   int  salario= leer.nextInt();
                    leer.skip("\n");
                   System.out.println("Ingrese su area");
                    String area= leer.nextLine();
                    leer.skip("\n");
                    System.out.println("Como soporte tecnico ingrese las insidencias resueltas");
                    insidencias_resueltas= leer.nextInt();
                     leer.skip("\n");
                    System.out.println("Como soporte tecnico"
                            + "Ingrese su area de responsanilidad");
                    area_responsabilidad= leer.nextLine();
                     leer.skip("\n");
                    Soporte_Tecnico soporte_tecnico= new Soporte_Tecnico( insidencias_resueltas,  area_responsabilidad,  nombre,apellido,  num_empleado, edad, fecha_nacimiento, salario, area);
                    Empleados.add(soporte_tecnico);
                    Lista_soporte.add(soporte_tecnico);
                    System.out.println("Desea agregar otro 1) si 2) no");
                    opcion1= leer.nextInt();
                            }while(opcion1==1);
                    break;
                   case 3:
                       int opc_3;
                       do{
                      int num_empleados_responsabilidad;
                      int edad=0;
                      System.out.println("Ingrese su edad");
                         edad= leer.nextInt();
                         leer.skip("\n");
                        System.out.println("Ingrese sus Apellidos");
                        String apellido= leer.nextLine();
                     leer.skip("\n");
                        System.out.println("Ingrese su Nombre");
                        String nombre = leer.nextLine();
                     leer.skip("\n");
                        System.out.println("Ingrese su Numero De Empleado");
                         int num_empleado= leer.nextInt();
                        leer.skip("\n");
                         System.out.println("Ingrese su Fecha De Nacimiento");
                        String fecha_nacimiento= leer.nextLine();
                         leer.skip("\n");
                        System.out.println("Ingrese su salario");
                       int  salario= leer.nextInt();
                        leer.skip("\n");
                       System.out.println("Ingrese su area");
                         String area= leer.nextLine();
                        leer.skip("\n");
                         System.out.println("Como gerente ingrese el numero de empleados de responsabilidad"); 
                         num_empleados_responsabilidad= leer.nextInt();
                          leer.skip("\n");
                         Gerentes gerentes = new Gerentes( num_empleados_responsabilidad,  nombre, apellido,  num_empleado, edad, fecha_nacimiento, salario, area);
                         Empleados.add(gerentes);
                         Lista_Gerente.add(gerentes);
                         System.out.println("Desea agregar otro? 1) si 2) no");
                         opc_3 = leer.nextInt();
                       }while(opc_3==1);
                     break;
    
               }
    
               break;
           case 2:
               int op;
               
               System.out.println("Editar");
               System.out.println("Seleccione el area");
               System.out.println("1) Programador");
               System.out.println("2) Soporte tecnico");
               System.out.println("3) Gerente");
               switch(opc)
               {
                   case 1:
                       int nuevo_dato;
                       String nuevoDato;
                       
                       break;
                   case 2:
                       
                       break;
                   case 3:
                       
                       break;
                              
               }
               break;
           case 3:
               int elemento_eliminar;
               String elementoEliminar;
     

               break;

           case 4:
                  System.out.println("Mostrar Lista:");
               Empleados.forEach((trabajadores) -> {
                   trabajadores.printable();
                              
       });
           System.out.println("------------------");    
               
              Lista.forEach((programadores) -> {
                  programadores.printable_p();
                   
       });
              System.out.println("------------------");     
               Lista_soporte.forEach((soporte_tecnico) -> {
                   soporte_tecnico.printable_soporte();
                   
       });
                   System.out.println("------------------"); 
              Lista_Gerente.forEach((gerentes) -> {
                  gerentes.printable_gerente();
                   
       });
                      System.out.println("------------------"); 
               
               break;
              
       }
       }while(opc!=5); 
    
    }     
    }
