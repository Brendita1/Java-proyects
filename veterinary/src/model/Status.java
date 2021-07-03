package model;

/**
 *
 * @author JoseAlejandroPC
 */
public enum Status {
    
    ADOPTED("Adoptado"), NOT_ADOPTED("Sin Adoptar"); 
    
    String label;
    
    Status(String label){
        this.label = label;
    }
}
