/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Paciente> Lista_paciente = new ArrayList();
    static ArrayList<Doctor> Lista_doctor = new ArrayList();
    static ArrayList<Paciente> Lista_asignados = new ArrayList();
   
    public static void main(String[] args) {
        Procesos procesos = new Procesos();
        int opcion;
        do{
        Scanner leer= new Scanner(System.in);
       
        System.out.println("------Menú------");
        System.out.println("1) Alta");
        System.out.println("2) Baja");
        System.out.println("3) Modificar");
        System.out.println("4) Mostrar doctores");
        System.out.println("5) Mostrar pacientes");
        System.out.println("6) Consulta");
        System.out.println("7) Pacientes sin asignar a doctor");
        System.out.println("8) Pacientes con asignacion a doctor");
        System.out.println("9) Desenlazar doctor");
        System.out.println("10)Busqueda por nombre del doctor");
        opcion= leer.nextInt();
        switch(opcion)
        {
            case 1:
                int opc;
                int opcio;
                        
                System.out.println("1) Paciente");
                System.out.println("2) Doctor");
                opc=leer.nextInt();
                switch(opc)
                {
                    case 1:
                        do{
                              procesos.Alta_paciente();
                            System.out.println("Desea agregar otro paciente? 1) si 2) no");
                           opcio = leer.nextInt();
                           
                        }while(opcio!=2);
                        break;
                        
                    case 2:
                        do{
                                procesos.Alta_doctor();
                            System.out.println("Desea agregar otro doctor? 1) si 2) no");
                       opcio= leer.nextInt();
                        }while(opcio!=2);
                        break;
                }
                break;
                
            case 2:
                
                
                System.out.println("1) Baja Doctor:");
                System.out.println("2) Baja paciente");
                opcion= leer.nextInt();
               
                  switch(opcion)
                  { 
                      case 1:
                          procesos.Baja_doctor();
                      case 2:
                          procesos.Baja_paciente();
                          break;
                  }
        
                break;        
            case 3:
                System.out.println("Modificar:");
                System.out.println("1) Paciente:");
                System.out.println("2) Doctor:");
                opcion= leer.nextInt();
                switch(opcion)
                {
                    case 1:
                        procesos.Modifica_Paciente();
                        break; 
                        
                    case 2:
                 procesos.Modifica_doctor();
                        break;
                }
                  break;
                
                case 4:
                  procesos.imprimir_doctor();
                  break;
                
                case 5:
               
                  procesos.imprimir_paciente();
                break;
                
                  case 6:
                int opci;
                  do{      
                  procesos.consulta();
                    System.out.println("Desea hacer otra consulta 1) si 2) no");
                    opci = leer.nextInt();
                    System.out.println("\n");
                    }while(opci!=2);
                break;
            case 7:
                 procesos.pacientes_noAasignados();
                    break;
            case 8:
                
                procesos.pacientes_asignados();
                break;
            case 9 :
                procesos.desenlazar_doctor();
                
                break;
            case 10:
                procesos.busqueda_por_nombre();
                break;
        }
        
       
        }while(opcion!=11);
}
}