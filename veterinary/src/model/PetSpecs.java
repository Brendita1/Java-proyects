package model;

import java.io.Serializable;

/**
 *
 * @author reta
 */
public class PetSpecs implements Serializable{
    
    private Breed breed;
    private Species species;
    private String name;
    private Status status;
    
    public boolean matches(PetSpecs specs){
        if((specs.getBreed() != null) && specs.getBreed().ID != this.breed.ID)
            return false;
        if((specs.getSpecies() != null) && specs.getSpecies().ID != this.species.ID)
            return false;
        if((specs.getName() != null) && !specs.getName().equals(this.name))
            return false;
        if((specs.getStatus() != null) && !specs.getStatus().equals(this.status))
            return false;
        
        return true;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    
}
