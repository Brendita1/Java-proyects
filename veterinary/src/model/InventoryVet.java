package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author reta
 */
public class InventoryVet implements Serializable{
    List<Pet> pets;
    List<Client> clients;

    public InventoryVet(List<Pet> pets, List<Client> clients) {
        this.pets = pets;
        this.clients = clients;
    }    
    
    public List search(PetSpecs searchSpecs){
        List matchingPets = new ArrayList<>();
        for(Pet pet : pets){
            if(pet.getSpecs().matches(searchSpecs)) matchingPets.add(pet);
        }
        return matchingPets;
    }
}
