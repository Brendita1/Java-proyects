package model;

import data.IdDAO;
import java.io.Serializable;

/**
 *
 * @author reta
 */
class Breed implements Serializable{
    static int ID_COUNTER = IdDAO.readID("breedID");
    final int ID;
    Species type;
    String name;
    String description;

    public Breed(Species type, String name, String description) {
        this.ID = ++ID_COUNTER;
        IdDAO.writeID(ID, "breedID");
        this.type = type;
        this.name = name;
        this.description = description;
    }
}
