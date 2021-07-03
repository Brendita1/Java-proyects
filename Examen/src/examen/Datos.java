/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author Usuario
 */
public class Datos {
    public int edad;
    public String nombre;
    public String fecha_nacimiento;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

   
  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Datos(int edad, String nombre, String fecha_nacimiento) {
        this.edad = edad;
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
    }

   
    
    
}
