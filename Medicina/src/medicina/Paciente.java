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
public class Paciente extends Datos {
    
    public int id_paciente;
    public String enfermedad;
    public String doctor_asignado=null;
    public String aux;
    static public int incremento = 0;
    
    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public Paciente( String enfermedad, int edad, String nombre, String fecha_nacimiento) {
        super(edad, nombre, fecha_nacimiento);
        this.id_paciente = ++incremento;
        this.enfermedad = enfermedad;
        this.doctor_asignado= aux;
    }

  
    
    public void imprimir_todos()
    {
        System.out.println("\n Nombre: "+getNombre());
        System.out.println("\n Edad: "+getEdad());
        System.out.println("\n Id: "+getId_paciente());
        System.out.println("\n Fecha de nacimiento: "+getFecha_nacimiento());
        System.out.println("\n Enfermedad: "+getEnfermedad());
       
    }
    public void id()
    {
        System.out.println("\n Id: "+getId_paciente());
    }
    public void nombre()
    {
        System.out.println("\n Nombre: "+getNombre());
    }

    public String getDoctor_asignado() {
        return doctor_asignado;
    }

    public void setDoctor_asignado(String doctor_asignado) {
        this.doctor_asignado = doctor_asignado;
    }
    
    
}
