/**
 * Oreja
 */
public class Oreja 
{
    private int numberOfEars;
    private String color;
    
    private Oreja()
    {

    }
    public Oreja(int numberOfEars, String color)
    {
        this.numberOfEars = numberOfEars;
    }
    public int getNumberOfEars()
    {
        return numberOfEars;
    }
    public String getColor()
    {
        return color;
    }
    public void escuchar(Personas a, Personas b)
    {
        System.out.println(b.getName() + " escucha a  " + a.getName());
    }

    
}