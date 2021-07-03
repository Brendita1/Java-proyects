/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicina;

/**
 *
 * @author Usuario
 */
public class Doctor extends Datos{
    public int num_empleado;
    public String especialidad;
   public static int autoincrement = 0;
    public Doctor( String especialidad, int edad, String nombre, String fecha_nacimiento) {
        super(edad, nombre, fecha_nacimiento);
        this.num_empleado = ++autoincrement;
        this.especialidad = especialidad;
    }

    public int getNum_empleado() {
        return num_empleado;
    }

    public void setNum_empleado(int num_empleado) {
        this.num_empleado = num_empleado;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public void imprimir_doctor()
    {
        System.out.println("\n Nombre: "+getNombre());
        System.out.println("\n Edad: "+getEdad());
        System.out.println("\n Fecha de nacimiento: "+getFecha_nacimiento());
        System.out.println("\n\n Numero de empleado:"+getNum_empleado());
        System.out.println("\n\n Especialidad:"+getEspecialidad());
        
    }
    public void imprimirId()
    {
        System.out.println("\nId:"+getNum_empleado());
    }
    public void Nombre()
    {
        System.out.println("\n Nombre: "+getNombre());
    }
}