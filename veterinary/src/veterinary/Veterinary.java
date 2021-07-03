/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinary;

import data.InvDAO;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.InventoryVet;

/**
 *
 * @author reta
 */
public class Veterinary extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        
        Scene scene = new Scene(root);
        
        //Guarden de esta forma la informacion en 
        //Inicializar clientes y pets en algun lado
        InventoryVet inv = new InventoryVet(null, null);
        InvDAO invDAO = new InvDAO();
        invDAO.write(inv); // Asi se guarda/actualiza el inventario
        inv = invDAO.read(); // Asi se lee del archivo de inventario
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
