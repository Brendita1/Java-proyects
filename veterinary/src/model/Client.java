package model;

import data.IdDAO;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author reta
 */
public class Client implements Serializable{
    
    static int ID_COUNTER = IdDAO.readID("clientsID");
    int ID;
    String name;
    Gender gender;
    String addres;
    LocalDate birth;
    List<Pet> pets;
    
    public Client(String name, Gender gender, String addres, LocalDate birth) {
        pets = new ArrayList<>();
        this.ID = ++ID_COUNTER;
        IdDAO.writeID(ID, "clientsID");
        this.name = name;
        this.gender = gender;
        this.addres = addres;
        this.birth = birth;
    }
    
    public boolean addPet(Pet pet){
        if(pets.size() == 2) return false;
        pets.add(pet);
        return true;
    }
    
}
