public class Triangulo implements FigurasGeometricas
{
    protected double lado1;
    protected double lado2;
    protected double lado3;
    protected double altura;
    protected double areaC;
    protected double perC;

    public Triangulo(double lado1, double lado2, double lado3, double altura)
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.altura = altura;
        
    }
    public double getArea()
    {
    areaC = (lado1 * altura) / 2;
    return areaC;
    }
    public double getPerimetro()
    {
    perC = (lado1 + lado2 + lado3);
    return perC;
    }
    public void print()
    {
        System.out.println("Para el Triangulo");
        System.out.println("the area is " + getArea());
        System.out.println("the perimetro is " + getPerimetro());
    }
    

}