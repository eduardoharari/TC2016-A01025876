public class Trapecio implements FigurasGeometricas
{
    protected double lado1;
    protected double lado2;
    protected double lado3;
    protected double lado4;
    protected double baseMenor;
    protected double baseMayor;
    protected double altura;
    protected double areaT;
    protected double perT;

    public Trapecio(double altura, double baseMenor, double baseMayor) // Constructor para el area
    {
        this.altura = altura;
        this.baseMenor = baseMenor;
        this.baseMayor = baseMayor;
    }
    public Trapecio(double lado1, double lado2, double lado3, double lado4) //c= constructor para perimetro
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }
    public double getArea()
    {
        areaT = (altura * (baseMayor * baseMenor) / 2);
        return areaT;

    }
    public double getPerimetro()
    {
        perT = lado1 + lado2 + lado3 + lado4;
        return perT;
    }
    public void printA()
    {
        System.out.println("Para el Trapecio");
        System.out.println("the area is " + getArea());
    }
       public void printP()
    {
        System.out.println("the perimetro is " + getPerimetro());
    }


    
}