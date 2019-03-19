/**
 * Cajero
 */
public class Cajero extends Empleado
{
    protected String nombre;
    protected String cargo;
    protected String typeOf;


    public Cajero()
    {

    }
    public Cajero(String nombre, Sucursal a, String cargo)
    {
        super(nombre, a, cargo);
    }

    public void recibirOrden(String typeOf, Sucursal e)
    {
        if(typeOf.equals("Hawaiana"))
        {
        Pizza hawaiana = new Pizza("Hawaiana", a);
        System.out.println("He recibido su orden. El precio es de " + hawaiana.getPrice("Hawaiana"));
        //hawaiana.addIngrediente(pina, queso);
        }

        if(typeOf.equals("Mexicana"))
        {
        Pizza mexicana = new Pizza("Mexicana", a);
        System.out.println("He recibido su orden. El precio es de " + mexicana.getPrice("Mexicana"));
        }

        if(typeOf.equals("Mexicana"))
        {
            Pizza vegetariana = new Pizza("Vegetariana", a);
            System.out.println("He recibido su orden. El precio es de " + vegetariana.getPrice("Vegetariana"));
            
        }

    
    }
    public void darOrdenChef(String typeOf, Chef a)
    {
        if(typeOf.equals("Hawaiana") || typeOf.equals("Mexicana") ||  typeOf.equals("Mexicana"))
        {
            System.out.println("Chef haz la pizza " + typeOf);
        }
    }
   
        
}