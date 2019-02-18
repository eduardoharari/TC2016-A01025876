/**
 * Ojo
 */
public class Ojo 
{
    private int numberOfEyes;
    private String color;
    private Personas a;
    private Personas b;
    
    
    private Ojo()
    {

    }
    public Ojo(int numberOfEyes, String color)
    {
        this.numberOfEyes = numberOfEyes;
    }
    public int getNumberOfEyes()
    {
        return numberOfEyes;
    }
    public String getColor()
    {
        return color;
    }

    public void ver(Personas a, Personas b)
    {
        System.out.println("soy " + b.getName() + " y estoy viendo a " + a.getName());
    }
    public void parpadear(Personas a)
    {
        System.out.println("soy " + a.getName() + " y estoy parpadeando");
    }


    
}