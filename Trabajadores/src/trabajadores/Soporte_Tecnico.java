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
public class Soporte_Tecnico extends Trabajadores{
 
   // public int insidencias_resueltas;
    //public String area_responsabilidad;

    public Soporte_Tecnico(int insidencias_resueltas, String area_responsabilidad, String nombre, String apellido, int num_empleado, int edad, String fecha_nacimiento, int salario, String area) {
        super(nombre, apellido, num_empleado, edad, fecha_nacimiento, salario, area);
        this.insidencias_resueltas = insidencias_resueltas;
        this.area_responsabilidad = area_responsabilidad;
    }

   /* public int getInsidencias_resueltas() {
        return insidencias_resueltas;
    }

    public void setInsidencias_resueltas(int insidencias_resueltas) {
        this.insidencias_resueltas = insidencias_resueltas;
    }

    public String getArea_responsabilidad() {
        return area_responsabilidad;
    }

    public void setArea_responsabilidad(String area_responsabilidad) {
        this.area_responsabilidad = area_responsabilidad;
    }
    */
    
}
