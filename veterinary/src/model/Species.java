package model;

import data.IdDAO;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author reta
 */
public class Species implements Serializable{
    static int ID_COUNTER = IdDAO.readID("speciesID");
    final int ID;
    String name;
    String description;
    List<Breed> breeds;

    public Species(int ID, String name, String description, List<Breed> breeds) {
        this.ID = ++ID_COUNTER;
        IdDAO.writeID(ID, "speciesID");
        this.name = name;
        this.description = description;
        this.breeds = breeds;
    }
}
