public class Test
{
    public static void main(String[]args)
    {
        Vehicle coche = new Vehicle ("audi","A1",2015,"azul",5,4,235000,70100 );
        Motor motor = new Motor(1234532, "Electrico");
        Ventanas windows = new Ventanas(26, 54, "electricas",4);
        Transmision trans = new Transmision("Electrica");
        Concesionaria c = new Concesionaria("San Juan");
        Conductor cond = new Conductor("Eduardo");
        Mecanico mec = new Mecanico("el Alfred");
        Persona p = new Persona("Eduardo");



        cond.agendarServicio(c);
        c.contratarMecanico(mec);
        c.getConcesionaria();
        motor.getModelNumber();
        motor.getTypeOfMotor();
        coche.vehicleDescripcion();
        coche.getPrice();
        coche.getNewPrice();
        coche.getcarAge();
        coche.getKilometersService();
        coche.getNumberOfPassengers();
        coche.getNumberOfDoors();
        coche.getColor();
        windows.getDimensionX();
        windows.getDimensionY();
        windows.getNumberOfWindows();
        trans.getTransmition();
        p.getNombre();
        



    }
}