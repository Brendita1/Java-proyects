package data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.InventoryVet;

/**
 *
 * @author JoseAlejandroPC
 */
public class InvDAO {
    public void write(InventoryVet inventory){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("inventory.bin"))){
            out.writeObject(inventory);
        }catch(IOException ex){
            System.out.println("Error de escritura en archivo inventory.bin");
        }
    }
    
    public InventoryVet read(){
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("inventory.bin"))){
            return (InventoryVet) in.readObject();
        }catch(IOException ex){
            System.out.println("Error de lectura en archivo inventory.bin");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InvDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
