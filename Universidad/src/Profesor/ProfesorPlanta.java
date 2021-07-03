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
public class ProfesorPlanta extends Profesor{
    
    String horario;
    Clase  clases ;
    int cantidadClases=0;
    final int maxClases=5;
    
    
    @Override
    void imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    double calcularSueldo() {
        return sueldo; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void agregarClase(Clase c) {
              
    }
    
    public ProfesorPlanta()
    {
        super.nombre="Patricia";
        super.direccion="Lomas residencial";
        super.telefono="88 61 27 50";
        super.sueldo= 100.00;
        horario="11:00";
         
    }
}
