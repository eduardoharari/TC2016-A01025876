public class Cuadrado implements FigurasGeometricas
{
    protected double lado1;
    protected double areaC;
    protected double perC;

    public Cuadrado(double lado1)
    {
        this.lado1 = lado1;
        
    }
    public double getArea()
    {
    areaC = lado1 * 2;
    return areaC;
    }
    public double getPerimetro()
    {
    perC = lado1 * 4;
    return perC;
    }
    public void print()
    {
        System.out.println("Para el Cuadrado");
        System.out.println("the area is " + getArea());
        System.out.println("the perimetro is " + getPerimetro());
    }
    

}