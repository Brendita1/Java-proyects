/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.Scanner;
import Modelo.ModeloAnimal;
/**
 *
 * @author Usuario
 */
public class Controlador_Animal {
    public static void main(String[] args) {
        
       proceso();
        
    }
    public static void proceso()
    {
         Scanner leer = new Scanner(System.in);
      //  ModeloAnimal modelo_animal = new ModeloAnimal();
        
        System.out.println("Ingrese  la descripcion");
        modelo_animal.Descripcion_Animal = leer.nextLine();
        
        System.out.println("Ingrese el tipo de animal");
        modelo_animal.Tipo_Animal = leer.nextLine();
    }
    
}
