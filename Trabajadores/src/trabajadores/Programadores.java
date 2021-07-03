/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajadores;

/**
 *
 * @author Usuario
 */
public class Programadores extends Trabajadores {
   // public String lenguaje_usado;
//    //public int lineaxhora;

    public Programadores(String lenguaje_usado, int lineaxhora, String nombre, String apellido, int num_empleado, int edad, String fecha_nacimiento, int salario, String area) {
        super(nombre, apellido, num_empleado, edad, fecha_nacimiento, salario, area);
        this.lenguaje_usado = lenguaje_usado;
        this.lineaxhora = lineaxhora;
    }


 
    

  
 
  
    
    
}
