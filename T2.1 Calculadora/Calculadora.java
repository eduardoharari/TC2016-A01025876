/**
 * Calculadora
 */
public class Calculadora 
{
    private int x;
    private int y;
    private double a;
    private double b;

    public Calculadora(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public Calculadora(double a, double b)
    {
        this.a = a;
        this.b = b;

    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public double getA()
    {
        return a;
    }
    public double getB()
    {
        return b;
    }

    public int getSuma()
    {
        int suma = x + y;
        System.out.println(suma);
        return suma;
    }
    public int getResta()
    {
        int resta = x - y;
        System.out.println(resta);
        return resta;
    }
    public int getMultiplicacion()
    {
        int multiplicacion = x * y;
        System.out.println(multiplicacion);
        return multiplicacion;
    }
    public int getDivision()
    {
        int division = x / y;
        System.out.println(division);
        return division;
    }
    public double getRaizA()
    {
        double raiz = Math.sqrt(a) ;
        System.out.println(raiz);
        return raiz;
    }
    public double getRaizB()
    {
        double raiz = Math.sqrt(b) ;
        System.out.println(raiz);
        return raiz;
    }
    public double getPotenciaA()
    {
        double potencia = Math.pow(a,5) ;
        System.out.println(potencia);
        return potencia;
    }
    public double getPotenciaB()
    {
        double potencia = Math.pow(b,5) ;
        System.out.println(potencia);
        return potencia;
    }
    public double getSuma1()
    {
        double suma = a + b;
        System.out.println(suma);
        return suma;
    }
    public double getResta1()
    {
        double resta = a - b;
        System.out.println(resta);
        return resta;
    }
    public double getMultiplicacion1()
    {
        double multiplicacion = a * b;
        System.out.println(multiplicacion);
        return multiplicacion;
    }
    public double getDivision1()
    {
        double division = a / b;
        System.out.println(division);
        return division;
    }

}
