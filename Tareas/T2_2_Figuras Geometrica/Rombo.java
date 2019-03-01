public class Rombo implements FigurasGeometricas
{
    protected double lado1;
    protected double diagonalMenor;
    protected double diagonalMayor;
    protected double areaR;
    protected double perR;
    
    public Rombo(double lado1, double diagonalMenor, double diagonalMayor) 
    {
        this.lado1 = lado1;
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }
    public double getArea()
    {
        areaR = (diagonalMayor *diagonalMenor) / 2;
        return areaR;
    }
    public double getPerimetro()
    {
        perR = (lado1 * 4);
        return perR;
    }
    public void print()
    {
        System.out.println("Para el Rombo");
        System.out.println("the area is " + getArea());
        System.out.println("the perimetro is " + getPerimetro());
    }
}