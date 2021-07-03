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
public class Rectangulo {
    public float base;
    public float altura;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void Dibuja_Rectangulo()
    {
        for(int col =1; col<=base; col++){
             System.out.print(" *");
            }
             System.out.print("\n");                        
         for (int fila=2; fila<altura; fila++){
             System.out.print(" *");
             for (int col=2; col < base; col++){
             System.out.print("  ");
            }
            System.out.print(" * \n");
            }
         for(int col =1; col<=base; col++)
            {
             System.out.print(" *");
            }
               
    }
}
