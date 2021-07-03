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
public class Persona implements IPrintable {

    int id=0;
    String nombre;
    String facultad;
    long telefono;
    int edad;
    String rol; 

    
    @Override
    public void printable(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Facultad: "+facultad);
        System.out.println("Telefono: "+telefono);
        System.out.println("Edad: "+edad);
        System.out.println("Rol: "+rol);
        
        
    }
    
    
    
    public Persona(int edad, String nombre, String facultad, long telefono, String rol){
        this.id=++id;
        
        
        this.edad=edad;
        this.nombre=nombre;
        this.facultad=facultad;
        this.telefono=telefono;
        this.rol=rol;
        
    }
    
    
    
    void setid(int id){
    
    this.id=id;
    }

    void setnombre(String nombre){
    
    this.nombre=nombre;
    }
    
    void setfacultad(String facultad){
    
    this.facultad=facultad;
    }
    
    void settelefono(long telefono){
    
    this.telefono=telefono;
    }
    
    void setedad(int edad){
    
    this.edad=edad;
    }
    
    void setrol(String rol){
    
    this.rol=rol;
    }

    
    int getid(){
    
    return id;
    
    }

    String getnombre(){
    
    return nombre;
    }
    
    
    String getfacultad(){
    
    return facultad;
    }
    
    long gettelefono(){
    
    return telefono;
    }
    
    int getedad(){
    
    return edad;
    }
    
    String getrol(){
    
    return rol;
    }
    
    
    
}