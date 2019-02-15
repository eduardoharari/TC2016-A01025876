public class Fraccion 
{
    private int num, den; 
   

    public void setFraccion(int x, int y )
    {
       x=num;
       y=den;
    }

    public void getSuma(Fraccion a, Fraccion b)
    {
        Fraccion c=new Fraccion();
        c.num=a.num*b.den+b.num*a.den;
        c.den=a.den*b.den;
        ; 
    }


}
