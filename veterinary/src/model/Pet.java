package model;

import data.IdDAO;
import java.io.Serializable;
import java.time.LocalDate;
/**
 *
 * @author reta
 */
public class Pet implements Serializable{
    
    private static int ID_COUNTER = IdDAO.readID("petsID");
    private PetSpecs specs;
    final int ID;
    private LocalDate birth;
    
    Pet( PetSpecs specs, LocalDate birth){
        this.specs = specs;
        this.ID = ++ID_COUNTER;
        IdDAO.writeID(ID, "petsID");
        this.birth = birth;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public PetSpecs getSpecs() {
        return specs;
    }

    public void setSpecs(PetSpecs specs) {
        this.specs = specs;
    }
    
    
    
    
}
