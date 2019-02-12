public class Ventanas
{
    private int dimensionX;
    private int dimensionY;
    private int numberOfWindows;
    private String typeOfWindows;

    public Ventanas()
    {

    }
    public Ventanas(int dimensionX, int dimensionY, String typeOfWindows, int numberOfWindows)
    {
        this.dimensionX = dimensionX;
        this.dimensionY = dimensionY;
        this.typeOfWindows = typeOfWindows;
    }
    public int getDimensionX()
    {
        return dimensionX;
    }
    public int getDimensionY()
    {
        return dimensionY;
    }
    public String getTypeOfWindows()
    {
        return typeOfWindows;
    }
    public int getNumberOfWindows()
    {
        return numberOfWindows;
    }


}