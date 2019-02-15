/**
 * Boca
 */
public class Boca 
{
    private String color;
    private Personas a;
    private Personas b;

        
    private Boca()
    {

    }
    public Boca(String color)
    {
        this.color = color;
    }
   
    public String getColor()
    {
        return color;
    }

    public void besar(Personas a, Personas b)
    {
        System.out.println(b.getName() + " dice: " + a.getName() + " Me das un beso");
    }

    
}