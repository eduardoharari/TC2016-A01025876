public class TestFraction
{
    public static void main(String[]args)
    {
        Fraction f1 = new Fraction (30,18);
        Fraction f2 = new Fraction(15,2);

        Fraction f3 = f1.multiply(f2);
        f1.simplify();
        f1.print();
        f3.print();
        
    }
}