public class Romboide implements FigurasGeometricas
{
    protected double base;
    protected double altura;
    protected double areaR;
    protected double perR;

    public Romboide(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }
    public double getPerimetro()
    {
        perR = (2 * base) + (2 *altura);
        return areaR;
    }
    public double getArea()
    {
        areaR = base * altura;
        return areaR;

    }
    public void print()
    {
        System.out.println("Para el Romboide");
        System.out.println("the area is " + getArea());
        System.out.println("the perimetro is " + getPerimetro());
    }

}