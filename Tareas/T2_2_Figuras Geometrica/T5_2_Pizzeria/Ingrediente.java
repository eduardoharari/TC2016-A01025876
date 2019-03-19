/**
 * Ingredientes
 */
public class Ingrediente
{
    protected int precio;
    private String nombre;

    public Ingrediente()
    {

    }
    public Ingrediente(String nombre, int precio)
    {
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getNombre()
    {
        return nombre;
    }
    public int getPrecio()
    {
        return precio;
    }

    
}