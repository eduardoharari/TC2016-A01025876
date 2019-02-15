/**
 * Sucursal
 */
public class Sucursal 
{
    private String nombre;

    public Sucursal(String nombre)
    {
        this.nombre = nombre;
    }
    public void retiro(double cantidad, Cliente c)
    {
        System.out.println("Sucursal " + nombre + " dando dinero " + cantidad + " a " + c.getName());

    }

    
}