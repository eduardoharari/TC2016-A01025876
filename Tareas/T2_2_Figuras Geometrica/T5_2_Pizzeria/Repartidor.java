/**
 * Repartidor
 */
public class Repartidor extends Empleado
{
    protected String nombre;
    protected String cargo;
    protected Sucursal a;

    public Repartidor()
    {

    }
    public Repartidor(String nombre, Sucursal a, String cargo)
    {
        super(nombre, a, cargo);
    }
    public void repartirPizzas()
    {
        System.out.println(" soy el repartidor y estoy repartiendo la pizza");
    }

   
}