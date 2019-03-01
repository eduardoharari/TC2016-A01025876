public class Rectangulo implements FigurasGeometricas
{
    protected double lado1;
    protected double lado2;
    protected double areaC;
    protected double perC;

    public Rectangulo(double lado1, double lado2)
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
        
    }
    public double getArea()
    {
    areaC = lado1 * lado2;
    return areaC;
    }
    public double getPerimetro()
    {
    perC = ((lado1 * 2) + (lado2 * 2));
    return perC;
    }
    public void print()
    {
        System.out.println("Para el Rectangulo");
        System.out.println("the area is " + getArea());
        System.out.println("the perimetro is " + getPerimetro());
    }
    

}