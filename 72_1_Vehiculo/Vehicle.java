public class Vehicle
{
    //private String name;
    private String manufacture;
    private String modelName;
    private int year;
    private String color;
    private int passengerNumber;
    private int doorNumber;
    private double price;
    private double kilometers;

    private Vehicle()
    {
        //constructor sin parametros
    }
    public Vehicle(String manufacture, String modelName, int year, String color, int passengerNumber, int doorNumber,double price, double kilometers)
    {
        this.manufacture = manufacture;
        this.modelName = modelName;
        this.year = year;
        this.color = color;
        this.passengerNumber = passengerNumber;
        this.doorNumber = doorNumber;
        this.price = price;
        this.kilometers = kilometers;
    }
    public String getManufacture() //MARCA DEL VEHICULO
    {
        return manufacture;
    }
    public String getModelNameString() // MODELO
    {
        return modelName;
    }
    public int getModelYear() // ANO
    {
        return year;
    }
    public void vehicleDescripcion() //DECRIPCION DEL VEHICULO
    {
        System.out.println(getManufacture() + " " + getModelNameString() + " " + getModelYear());
    }
    public double getPrice()
    {
        return price;
    }
    public void getNewPrice() // PRECIO DEVALUADO
    {
       
        for(int i = 2019; i >= getModelYear(); i--)
        {
         price = getPrice() * 0.80;
        }
        System.out.println("El precio de tu vehiculo con la devaluacion es de " + price + " pesos");
    }
    public int getcarAge() // ANOS DEL COCHE 
    {
        int carAge = 2019 - getModelYear();
        return carAge;
    }
    public double getKilometersService() //  SERVICIO
    {
        if (kilometers <= 10000)  // SERVICIO 10KM BASICO
            System.out.println("te faltan" + " " + (10000 - kilometers) + " " + "para el siguiente servicio 10 mil km (Basico)"); 
        if (kilometers >= 10000 && kilometers <= 20000) //SERVICIO 20KM MEDIO
            System.out.println("te faltan" + " " + (20000 - kilometers) + " " + "para el siguiente servicio 20 mil km(Medio)");
        if (kilometers >= 20000 && kilometers <= 30000) // SERVICIO 30KM BASICO
            System.out.println("te faltan" + " " + (30000 - kilometers) + " " + "para el siguiente servicio 30 mil km (Basico)");
        if (kilometers >= 30000 && kilometers <= 40000) // SERVICIO 40KM COMPLETO
            System.out.println("te faltan" + " " + (40000 - kilometers) + " " + "para el siguiente servicio 40 mil km (Completo)"); 
        if (kilometers >= 40000 && kilometers <= 50000) //SERVICIO 50KM BASICO
            System.out.println("te faltan" + " " + (50000 - kilometers) + " " + "para el siguiente servicio 50 mil km(Basico)");   
        if (kilometers >= 50000 && kilometers <= 60000) //SERVICIO 60KM MEDIO
            System.out.println("te faltan" + " " + (60000 - kilometers) + " " + "para el siguiente servicio 60 mil km (Medio)");
        if (kilometers >= 60000 && kilometers <= 70000) //SERVICIO 70KM BASICO
            System.out.println("te faltan" + " " + (70000 - kilometers) + " " + "para el siguiente servicio 70 mil km(Basico)");
        if (kilometers >= 70000 && kilometers <= 80000) //SERVICIO 80KM COMPLETO
            System.out.println("te faltan" + " " + (80000 - kilometers) + " " + "para el siguiente servicio 80 mil km (Completo)");
        if (kilometers >= 80000 && kilometers <= 90000) //SERVICIO 90KM BASICO
            System.out.println("te faltan" + " " + (100000 - kilometers) + " " + "para el siguiente servicio 90 mil km (Basico)");
        if (kilometers >= 90000 && kilometers <= 100000) //SERVICIO 100KM COMPLETO PLUS
            System.out.println("te faltan" + " " + (100000 - kilometers) + " " + "para el ULTIMO servicio 100 mil km(Completo Plus)");

            return kilometers;
        
    }   
    public String getColor()
    {
        return color;
    }
    public int getNumberOfPassengers()
    {
        return passengerNumber;
    }
    public int getNumberOfDoors()
    {
        return doorNumber;
    }

    




}

   



