/**
 * Pizza
 */
public class Pizza 
{
    protected String typeOf;
    protected int price;


    public Pizza()
    {

    }
    public Pizza(String typeOf, Sucursal a)
    {
        this.typeOf = typeOf;
           
    }
    public void addIngrediente(Ingrediente a, Ingrediente b)
    {
     
    }
    public String getTypeOf()
    {
        return typeOf;
    }

    public int getPrice(String typeOf)
    {
        if(typeOf.equals("Hawaiana"))
        price = 60;

        if(typeOf.equals("Mexicana"))
        price = 80;

        if(typeOf.equals("Vegetariana"))
        price = 80;

       System.out.println(price);
       return price;
    }
  


    
}