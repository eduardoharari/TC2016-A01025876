/**
 * MatrizFlotantes
 */

import java.util.Scanner;

public class MatrizFlotantes 
{
    Scanner kb = new Scanner(System.in);

    Flotantes[][] matriz;
    //Flotantes numero = 0.0f;
    int x = 0;
    int y = 0;
    float temporal;
    int numeroMatriz = 3;

    public MatrizFlotantes(int numeroMatriz)
    {
        matriz = new Flotantes[numeroMatriz][numeroMatriz];
    }

    public void llenarMatriz(int numeroMatriz)
    {
     
        for (int x=0; x < matriz.length; x++) 
        {
            for (int y=0; y < matriz[x].length; y++) 
            {
              
              System.out.println("Introduzca el elemento [" + x + "," + y + "]");
              temporal = kb.nextFloat();
              matriz[x][y] = new Flotantes(temporal);
             
            }
        }
    
    }
    public void printMatriz()
    {
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
              System.out.println ("[" + x + "," + y + "] = " + matriz[x][y].toString());
            }
          }
    }
    public Flotantes getValue(int x, int y)
    {
        return matriz[x][y];
    }
    public int length()
    {
        int length = numeroMatriz;
        return length;
    }
    
}