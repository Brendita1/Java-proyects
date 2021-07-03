/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Controlador.Controlador_Animal;
import Controlador.MostraraAnimal;
/**
 *
 * @author Usuario
 */
public class ModeloAnimal extends MostraraAnimal {
    public  int id_Animal;
    public String Tipo_Animal;
    public String Descripcion_Animal;

    public int getId_Animal() {
        return id_Animal;
    }

    public void setId_Animal(int id_Animal) {
        this.id_Animal = ++id_Animal;
    }

    public String getTipo_Animal() {
        return Tipo_Animal;
    }

    public void setTipo_Animal(String Tipo_Animal) {
        this.Tipo_Animal = Tipo_Animal;
    }

    public String getDescripcion_Animal() {
        return Descripcion_Animal;
    }

    public void setDescripcion_Animal(String Descripcion_Animal) {
        this.Descripcion_Animal = Descripcion_Animal;
    }

    public ModeloAnimal(int id_Animal, String Tipo_Animal, String Descripcion_Animal) {
        this.id_Animal = id_Animal;
        this.Tipo_Animal = Tipo_Animal;
        this.Descripcion_Animal = Descripcion_Animal;
    }

   
    
}
