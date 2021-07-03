/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import static examen.Examen.Lista_asignados;
import static examen.Examen.Lista_doctor;
import java.util.ArrayList;
import java.util.Scanner;
 
/**
 *
 * @author Usuario
 */
public class Procesos extends Examen{

    Scanner leer = new Scanner(System.in);
    
    public void Alta_paciente()
    {
          leer.nextLine();
          System.out.println("Ingrese su nombre");
          String nombre= leer.nextLine();
          System.out.println("Ingrese su edad");
          int edad = leer.nextInt();
          leer.nextLine();
          System.out.println("Ingrese su fecha de nacimiento");
          String fecha_nac= leer.nextLine();
          System.out.println("Ingrese la enfermedad");
          String enfermedad= leer.nextLine();
                      
          Paciente paciente = new Paciente(  enfermedad, edad,nombre,fecha_nac);
                        
          Lista_paciente.add(paciente);
    }
    
    public void Alta_doctor()
    {
          leer.nextLine();
          System.out.println("Ingrese su nombre");
          String nombre_doc= leer.nextLine();
          System.out.println("Ingrese su edad");
          int edad_doc = leer.nextInt();
          leer.nextLine();
          System.out.println("Ingrese su fecha de nacimiento");
          String fecha_nac_doc= leer.nextLine();
          System.out.println("Ingrese su especialidad");
          String especialidad= leer.nextLine();
          Doctor doctor = new Doctor( especialidad, edad_doc, nombre_doc, fecha_nac_doc);
          Lista_doctor.add(doctor);
    }
    public void Baja_doctor()
    {
          int baja;
          System.out.println("Ingresa el numero de empleado del Doctor");
          baja = leer.nextInt();
          for(Doctor doct : Lista_doctor)
          {
            if(doct.num_empleado == baja)
            {
            Lista_doctor.remove(doct);
            doct.edad= 0;
            doct.especialidad= null;
            doct.fecha_nacimiento= null;
            doct.nombre= null;
            doct.num_empleado=0;
            Lista_doctor.add(doct);
            }
          }
                          
    }
    
    public void Baja_paciente()
    {
            System.out.println("Ingresa el ID del paciente");
            int baja = leer.nextInt();
            for(Paciente paciente : Lista_paciente)
            {
             if(paciente.id_paciente == baja)
              {
             Lista_doctor.remove(paciente);
             paciente.edad= 0;
             paciente.enfermedad=null;
             paciente.fecha_nacimiento= null;
             paciente.nombre= null;
             paciente.id_paciente=0;
                                          
             Lista_paciente.add(paciente);
              }
            }
    }
    public void Modifica_Paciente()
    {
            int modificar;
            System.out.println("Ingresa el id del paciente");
            modificar = leer.nextInt();
            for(Paciente paciente : Lista_paciente)
            {
              if(paciente.id_paciente == modificar)
             {
              Lista_paciente.remove(paciente);
              System.out.println("Ingrese su nueva edad:");
              paciente.edad = leer.nextInt();
              System.out.println("Ingrese la enfermedad:");
              paciente.enfermedad= leer.nextLine();
              System.out.println("Ingrese su fecha de nacimiento");
              paciente.fecha_nacimiento= leer.nextLine();
              System.out.println("Ingrese su nombre");
              paciente.nombre= leer.nextLine();

              Lista_paciente.add(paciente);
              }
             }
    }
   
    public void Modifica_doctor()
    {
                                   
              System.out.println("Ingresa el numero de empleado del Doctor");
              int modificar = leer.nextInt();
              for(Doctor doct : Lista_doctor)
              {
                if(doct.num_empleado == modificar)
                {
                 Lista_doctor.remove(doct);
                 System.out.println("Ingrese su edad:");
                 doct.edad = leer.nextInt();
                 System.out.println("Ingrese su especialidad:");
                 doct.especialidad= leer.nextLine();
                 System.out.println("Ingrese su fecha de nacimiento");
                 doct.fecha_nacimiento= leer.nextLine();
                 System.out.println("Ingrese su nombre");
                 doct.nombre= leer.nextLine();

                 Lista_doctor.add(doct);
                }
              }
                          
        
    }
    public void consulta()
    {
               int tamanio = Lista_asignados.size();
               int id_consulta;
               System.out.println("Ingrese su id");
               int busqueda = leer.nextInt();
              
               for(Paciente paciente : Lista_paciente)
                {
                 if(paciente.id_paciente == busqueda)
                   {
                    System.out.println("Lista de doctores:");
                    System.out.println("Elige al doctor de tu preferencia \n");
                for(Doctor doc : Lista_doctor)
                {
                    doc.imprimir_doctor();

                }
                    System.out.println("Introduce su id");
                    id_consulta = leer.nextInt();
                for(Doctor doctor : Lista_doctor)
                {
                  if(doctor.num_empleado== id_consulta)
                    {
                    if(tamanio<=10)
                    {
                    paciente.doctor_asignado = doctor.nombre;
                    System.out.println(""+paciente.doctor_asignado);
                    System.out.println("\n\n");
                    System.out.println("El doctor :\t "+doctor.nombre+ "\t ha sido asignado a\t :"+ paciente.getNombre());
                    }
                    }
                    else
                    {
                    System.out.println("Este doctor ya tiene los 10 pacientes permitidos");
                    }

                    }
                    Lista_asignados.add(paciente);   
                    }
                   }
       }
    public void pacientes_noAasignados()
    {                               
                    System.out.println("Pacientes no asignados a un doctor");
                    for(Paciente paciente : Lista_asignados)
                    {
                     for(Paciente pac : Lista_paciente)
                     {
                       if(paciente.id_paciente != pac.id_paciente)
                       {
                        pac.imprimir_todos();
                       }
                     }   
                     }     
    }
    public void pacientes_asignados ()
    {
                System.out.println("Pacientes asignados a un doctor:");
                for(Paciente paciente : Lista_asignados)
                {
                    paciente.imprimir_todos();
                }
    }
    
    public void imprimir_doctor()
    {

                int opc;
                System.out.println("1) Mostrar todo");
                System.out.println("2) Mostrar por nombre");
                System.out.println("3) Mostrar por ID");
                opc= leer.nextInt();
                switch(opc)
                {
                    case 1:
                 for(Doctor doctor :Lista_doctor)
                {
                 doctor.imprimir_doctor();
                }
                   break;
                    case 2:
                 for(Doctor doctor :Lista_doctor)
                {
                 doctor.Nombre();
                }      
                   break;
                  
                    case 3:
                 for(Doctor doctor :Lista_doctor)
                {
                 doctor.imprimirId();
                }
                }
    }            
              
       public void imprimir_paciente()
       {
                          int opc;
                System.out.println("1) Mostrar todo");
                System.out.println("2) Mostrar por nombre");
                System.out.println("3) Mostrar por ID");
                opc= leer.nextInt();
                switch(opc)
                {
                    case 1:
                 for(Paciente paciente :Lista_paciente)
                {
                 paciente.imprimir_todos();
                }
                   break;
                    case 2:
                 for(Paciente paciente : Lista_paciente)
                {
                 paciente.nombre();
                }      
                   break;
                  
                    case 3:
                 for(Paciente paciente :Lista_paciente)
                {
                 paciente.id();
                }
                }
       }
       public void desenlazar_doctor()
       {
                int id;
                System.out.println("Desenlazar doctor");
                System.out.println("Ingrese su ID");
                id = leer.nextInt();
                
                for(Paciente paciente : Lista_asignados)
                { 
                    if(id == paciente.id_paciente)
                    {
                        Lista_asignados.remove(paciente);
                        paciente.edad=0;
                        paciente.enfermedad=null;
                        paciente.fecha_nacimiento=null;
                        paciente.id_paciente=0;
                        paciente.nombre=null;
                     
                    }
                }
       }
     public void busqueda_por_nombre()
     {
                String nombre_buscar;
                System.out.println("Desenlazar doctor");
                System.out.println("Ingresar el nombre");
                nombre_buscar = leer.nextLine();
                leer.nextLine();

                 for(Paciente paciente : Lista_asignados)
                 {
                     if(nombre_buscar.equals(paciente.doctor_asignado))
                     {
                         Lista_asignados.remove(paciente);
                         paciente.edad=0;
                         paciente.enfermedad= null;
                         paciente.fecha_nacimiento= null;
                         paciente.id_paciente=0;
                         paciente.nombre= null;
                     }
                 }      
            }
}
