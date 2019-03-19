/**
 * Ayudante
 */
public class Ayudante extends Empleado
{
    protected String nombre;
    protected String cargo;
    protected Sucursal a;

    public Ayudante()
    {

    }
    public Ayudante(String nombre, Sucursal a, String cargo)
    {
        super(nombre, a, cargo);
    }

    public void amasar()
    {
       System.out.println("soy el ayudante y estoy amasando la pizza");
    }
    public void empacar()
    {
        System.out.println("soy el ayudante y estoy empacando la pizza");
 
    }

}