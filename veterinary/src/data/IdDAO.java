package data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author JoseAlejandroPC
 */
public class IdDAO {
    public static int readID(String filepath) {
        int nextID = -1;
        try(DataInputStream in= new DataInputStream(new FileInputStream(filepath)))   {
            nextID = in.readInt();
            in.close();
            return nextID;
        }
        catch(FileNotFoundException fnfe)   {
            nextID = 000;
            System.out.println("Archivo no encontrado. Regresado ID: 000");
            return nextID;
        }
        catch(EOFException eofe){
            System.out.println("End of file");
        }
        catch(IOException ioe){
            System.out.println("Problema al escribir en el archivo");
        }
        return nextID;
    }
    
    public static void writeID(int nextID, String filePath)    {
        try(DataOutputStream ut= new DataOutputStream(new FileOutputStream(filePath))){
            ut.writeInt(nextID);
        }
        catch(IOException ioe)  {
            System.out.println("Problema al escribir en el archivo");
        }
    }
}
