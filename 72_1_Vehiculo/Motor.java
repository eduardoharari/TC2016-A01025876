public class Motor
{
    private int modelNumber;
    private String typeOfMotor;

    private Motor()
    {

    }
    public Motor(int modelNumber, String typeOfMotor)
    {
        this.modelNumber = modelNumber;
        this.typeOfMotor = typeOfMotor;
    }
    public String getTypeOfMotor()
    {
        return typeOfMotor;
    }
    public int getModelNumber()
    {
        return modelNumber;
    }

}