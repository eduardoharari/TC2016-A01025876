public class Tuple <A, B>
{
    protected A a;
    protected B b;
    protected String name;

    public Tuple(A a, B b)
    {
        this.a = a;
        this.b = b;
        name = "Tupla";
    }
    public A getA()
    {
        return a;
    }
    public Bear getB()
    {
        return b;
    }
    public String toString()
    {
        return "( " + a + ", " + b + " )";
    }