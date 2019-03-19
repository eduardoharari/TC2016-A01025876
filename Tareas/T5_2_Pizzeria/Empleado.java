public class Empleado
{
    protected String nombre;
    protected String cargo;
    protected Sucursal a;

    public Empleado()
    {

    }
    public Empleado(String nombre, Sucursal a, String cargo)
    {
        this.nombre = nombre;
        this.cargo = cargo;
       
    }

    public String getNombre()
    {
        return nombre;
    }
    public String getCargo()
    {
        return cargo;
    }
  
}
