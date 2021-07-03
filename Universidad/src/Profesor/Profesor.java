/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profesor;

import Clase.Clase;

/**
 *
 * @author Usuario
 */
abstract public class Profesor {
 
    String nombre;
    String direccion;
    String telefono;
    double sueldo;
    abstract void imprimir();
    abstract double calcularSueldo();
    abstract void agregarClase(Clase c);
    
}
