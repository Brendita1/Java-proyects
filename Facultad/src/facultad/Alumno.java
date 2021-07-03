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
public class Alumno extends Persona{

    
    long matricula;
    String carrera;

    public Alumno(int edad, String nombre, long telefono, long matricula,String carrera){
    
    super(edad,nombre,"Facultad de Ciencias Fisico-Matematicas",telefono,"Estudiante");    
        
    this.matricula=matricula;
    this.carrera=carrera;
    
    }
    
    
    void setmattricula(int matricula){
    
    this.matricula=matricula;
    }

    void setcarrera(String carrera){
    
    this.carrera=carrera;
    }

    long getmatricula(){
    
    return matricula;
    
    }

    String getcarrera(){
    
    return carrera;
    }
    
    
    

    
}

