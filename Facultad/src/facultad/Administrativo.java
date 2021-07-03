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
public class Administrativo extends Persona{
    
    int clave;
    String departamento;
    
     public Administrativo(int clave,int edad, String nombre, long telefono, String departamento){
    
    super(edad,nombre,"Facultad de Ciencias Fisico-Matematicas",telefono,"Personal");    
        
    this.clave=clave;
    this.departamento=departamento;
    
    }
    
     
    void setclave(int clave){
    this.clave=clave;
    } 
     
    void setdepartamento(String departamento){
    this.departamento=departamento;
    } 
}