package data;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import model.Species;

/**
 *
 * @author JoseAlejandroPC
 */
public class BreedDAO {
    
    
    //TODO: Get all breeds from species parameter
    public void getBreedsForSpecies(Species species){
        try(ObjectInputStream os = new ObjectInputStream(new FileInputStream("breed.bin"))){
            
        }
        catch(IOException ioe)  {
            System.out.println("Error en la escritura de archivo");
        }
    }
}
