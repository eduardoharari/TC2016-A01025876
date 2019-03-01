/**
 * House
 */
public class House implements PriceRelatable
{
    protected int recamaras;
    public House(int recamaras)
    {
        this.recamaras = recamaras;

    }
    public int getPrice()
    {
        if(recamaras >= 3)
        return 1000000;
        return 500000;
    }
    
}