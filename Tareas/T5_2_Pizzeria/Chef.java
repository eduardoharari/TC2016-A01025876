/**
 * Chef
 */
public class Chef extends Empleado
{
    private String nombre;
    private String cargo;


    public Chef()
    {

    }
    public Chef(String nombre, Sucursal a, String cargo)
    {
        super(nombre, a, cargo);
    }
   
    public void agregarIngredientes()
    {
        System.out.println("Soy el chef y estoy agregando ingredientes la pizza");
    }
    public void hornear()
    {
        System.out.println("Soy el chef y estoy horneando la pizza");
    }
  

    

}