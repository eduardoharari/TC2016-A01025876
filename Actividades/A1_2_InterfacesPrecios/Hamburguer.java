/**
 * Hamburguer
 */
public class Hamburguer implements PriceRelatable
{
    String size;
    public Hamburguer(String size)
    {
        this.size = size;
    }

    public int getPrice()
    {
        if (size.equals("doble"))
        return 100;
        return 25;
    }

    
}