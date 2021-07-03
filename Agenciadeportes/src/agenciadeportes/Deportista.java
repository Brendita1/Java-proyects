
package agenciadeportes;

import java.util.ArrayList;
import java.util.Scanner;

public class Deportista {
    String nombre;
    int edad;
    double pagaBase;
    Scanner sc = new Scanner(System.in);

    public Deportista(String nombre, int edad, double pagaBase) {
        this.nombre = nombre;
        this.edad = edad;
        this.pagaBase = pagaBase;
    }

 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPagaBase() {
        return pagaBase;
    }

    public void setPagaBase(double pagaBase) {
        this.pagaBase = pagaBase;
    }
    
    public String imprimirDeportista(){
        return "Nombre:" + nombre + " edad: "+  edad + " su paga es: " + pagaBase;
    }
    
    public double calcularPaga(){
        return pagaBase;
    }

   
}    