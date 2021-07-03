/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.io.*;       // Librerias para archivos de texto
import java.util.*;
// Este programa lee palabras de un archivo de texto llamado palabras.txt

public class Ahorcado {

        public static void Leer_palabras() throws FileNotFoundException, IOException {
        FileInputStream Archivo = new FileInputStream("palabras.txt"); // Esta funcion es para leer un archivo te texto
        BufferedReader Mi_archivo = new BufferedReader(new InputStreamReader(Archivo));// Lee las palabras de palabras.txt
        String Espacio;
        
        while((Espacio = Mi_archivo.readLine()) != null) {
            Palabras.addElement(Espacio);
        }
        Mi_archivo.close();
    }

    public static boolean Acertado(String Palabra, String Palabras_aciertos) { // Esta furncion estatica permite contar
        int i = 0;
        while(i < Palabra.length()) {
            if(Palabras_aciertos.indexOf(Palabra.charAt(i)) == -1) {
                return false;
            }
            i++;
        }
        return true;
    }
    
    public static void EscribirPalabra(String Palabra, String Palabras_aciertos) {
        String Espacio = "";              // Esta funcion es para escribir los espacion de la palabra sacando el tamaño para saber cuantos guiones se dibujaran
        
        for(int i = 0; i < Palabra.length(); i++) {
            if(Palabras_aciertos.indexOf(Palabra.charAt(i)) == -1) {  
                Espacio += "-";
            }
            else {
                Espacio += String.valueOf(Palabra.charAt(i));
            }
        }
        System.out.println("  Palabra: [" + Espacio + "] ");
        System.out.println(" Letras que elegiste: " + Palabras_aciertos + "");
    }
    
    public static void Monitos(int opcion) {
        switch(opcion) {
        case 1:
            System.out.println("");
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
            System.out.println("");
            System.out.println("");
            break;

        case 2:
            System.out.println("");
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
            System.out.println("");
            System.out.println("");
            break;

        case 3:
            System.out.println("");
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / |   ");
                System.out.println(" |                 /   |   ");
                System.out.println(" |                /    |   ");
                System.out.println(" |                     |   ");
            System.out.println("");
            System.out.println("");
            break;

        case 4:
            System.out.println("");
               System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
            System.out.println("");
            System.out.println("");
            break;

        case 5:
            System.out.println("");
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
                System.out.println(" |                    /  ");
                System.out.println(" |                   /      ");
                System.out.println(" |                  /       ");
            System.out.println("");
            System.out.println("");
            break;

        case 6:
            System.out.println("");
               System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | X  X  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
                System.out.println(" |                    / \\");
                System.out.println(" |                   /   \\  ");
                System.out.println(" |                  /     \\ ");
                System.out.println("GAME OVER");
            System.out.println("");
            System.out.println("");
        }
    }
      private static Vector Palabras = new Vector();

    public static void main(String args[]) throws IOException {
        boolean GameOver = false;
        int Contador = 1;
     
        DataInputStream Leyendo = new DataInputStream(System.in);
        char auxiliar;
        
        String Palabras_aciertos = "";
        Leer_palabras();
        String Palabra = (String)Palabras.elementAt((int)Math.round(Math.random() * (Palabras.size() - 1))); // Esta linea es para elegir palabras al azar
        while(!GameOver) {
            Monitos(Contador); // Dibujar los monitos segun el contador si indica cuantas veces ha perdido
            EscribirPalabra(Palabra, Palabras_aciertos);
            if(Contador == 6 || Acertado(Palabra, Palabras_aciertos)) { // Cuando el contador de las palabras llega a 6 (intentos limita) el juego terminara
                GameOver = true;
            }
            else {
                do {
                    auxiliar = (char) Leyendo.readByte(); // Pero si no , entonces el juego continuara 
                }while(auxiliar == '\n' || auxiliar == '\r');
                if(Palabra.indexOf(auxiliar) == -1 || Palabras_aciertos.indexOf(auxiliar) != -1) { // condiciona saber la posicion en la que esta cada letra de la palabra y la de los aciertos
                    Contador++;   
                }
                if(Palabras_aciertos.indexOf(auxiliar) == -1) {
                    Palabras_aciertos += String.valueOf(auxiliar);
                }
            }
        }
        if(Contador < 6) {
            Monitos(Contador); // Si ya no quedan mas letras(osea que el contador no llego a su maximo grado) entonces significa que la palabra se adivino
            EscribirPalabra(Palabra, Palabras_aciertos);
            System.out.println("\n Adivinaste la palabra ! \n");
        }
        else {
            System.out.println("\nPerdiste, la palabra era: [" + Palabra + "]\n");
        } // por el contrario si gasto todos los intentos entonces significa que ya perdió
    }
    
}
    
   

    