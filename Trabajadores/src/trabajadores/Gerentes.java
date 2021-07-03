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
public class Gerentes extends Trabajadores{
    
   //

    public Gerentes(int num_empleados_responsabilidad, String nombre, String apellido, int num_empleado, int edad, String fecha_nacimiento, int salario, String area) {
        super(nombre, apellido, num_empleado, edad, fecha_nacimiento, salario, area);
        this.num_empleados_responsabilidad = num_empleados_responsabilidad;
    }

    /*public int getNum_empleados_responsabilidad() {
        return num_empleados_responsabilidad;
    }

    public void setNum_empleados_responsabilidad(int num_empleados_responsabilidad) {
        this.num_empleados_responsabilidad = num_empleados_responsabilidad;
    }*/
   
   
}
