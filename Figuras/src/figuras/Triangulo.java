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
public class Triangulo {
    public float lado;

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    public void Dibuja_triangulo()
    {
        for(int i=0;i<lado-1;i++)
                {
                    System.out.print(" ");
                }
                System.out.print("* \n");
                for (int k = 2; k <= lado-1; k++) {
                for (int j = 1; j <= lado-k; j++){
                System.out.print( " " );
              }
                System.out.printf( "*");
                for (int j = 1; j <= 2*k-3; j++) {
                System.out.print( " " );
              }
                System.out.print( "*\n");
              }

                System.out.print("*");
              for (int k=1; k <= lado-1 ; k++) {
                System.out.print (" *");
              }

               System.out.print( "\n");

    }
}
