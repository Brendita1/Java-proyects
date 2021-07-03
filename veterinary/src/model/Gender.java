package model;

/**
 *
 * @author reta
 */
public enum Gender {
    OTHER("Otro"),
    MALE("Hombre"),
    FEMALE("Mujer");
    
    String label;
    
    Gender(String label){
        this.label = label;
    }
}
