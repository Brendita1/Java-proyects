/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author Usuario
 */
public class Cuadrado {
    public float lado;

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    public void Dibuja_cuadrado()
    {
    
           for(int col =1; col<=lado; col++)
           {
             System.out.print(" *");
           }
             System.out.print("\n");                        
         for (int fila=2; fila<lado; fila++)
           {
             System.out.print(" *");
             for (int col=2; col < lado; col++)
             {
             System.out.print("  ");
             }
            System.out.print(" * \n");
           }
         for(int col =1; col<=lado; col++)
            {
             System.out.print(" *");
            }
    }
}
