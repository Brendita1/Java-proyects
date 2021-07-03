/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_Animal;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Vista {
    public static void main(String[] args) {
        Controlador_Animal controlador_animal = new Controlador_Animal();
        Scanner leer = new Scanner(System.in);
        int opc;
        System.out.println("Ingrese una opcion");
        opc = leer.nextInt();
        switch(opc )
        {
            case 1:
                controlador_animal.proceso();
                break;
        }
    }
}
