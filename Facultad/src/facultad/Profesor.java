/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facultad;

/**
 *
 * @author Usuario
 */
public class Profesor extends Persona{

    String materia;
    String especialidad;

    public Profesor(int edad, String nombre, long telefono,String materia,String especialidad){
    
    super(edad,nombre,"Facultad de Ciencias Fisico-Matematicas",telefono,"Catedratico");    
        
    this.materia=materia;
    this.especialidad=especialidad;
    
    }
    
    
    
    void setmateria(String materia){
    
    this.materia=materia;
    }

    void setespecialidad(String especialidad){
    
    this.especialidad=especialidad;
    }

    String getmateria(){
    
    return materia;
    
    }

    
    String getespecialidad(){
    
    return especialidad;
    }
    
    
    
}

