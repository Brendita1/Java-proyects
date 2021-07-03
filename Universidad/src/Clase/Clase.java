/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

/**
 *
 * @author Usuario
 */
public class Clase {
    
    public String nombre;
    public String horario;
    public int valor;
    void imprmir()
    {
        System.out.println("Nombre "+getNombre());
        System.out.println("Horario"+getHorario());
        System.out.println("Valor"+getValor());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
}
