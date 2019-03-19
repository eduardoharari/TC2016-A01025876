/**
 * Principal
 */
public class Principal 
{
    public static void main(String[] args) 
    {
        Sucursal a = new Sucursal("Santa Fe");
        Sucursal b = new Sucursal("Polanco");
        Chef chefSfe = new Chef("nombre", a, "cargo");
       Chef chefPol = new Chef("nombre", b, "cargo");
        Cajero cajero = new Cajero("Jose", a, "cajero");
        Ayudante ayudante = new Ayudante("Pancho", a, "Ayudante");
        Ayudante ayudanteb = new Ayudante("Pancho", b, "Ayudante");
        Repartidor repartidor = new Repartidor("Pancho", a, "Repartidor");
       Repartidor repartidorb = new Repartidor("Pancho", b,"Repartidor");
       // Empleado gerente = new Gerente("Pancho", a, "Gerente");
       // Empleado gerenteb = new Gerente("Pancho", b,"Gerente");

        Ingrediente pina = new Ingrediente("pina", 10);
        Ingrediente vegetales = new Ingrediente("vegetales", 20);
        Ingrediente frijoles = new Ingrediente("Frijoles", 30);
        Ingrediente chorizo = new Ingrediente("Chorizo", 40);
        Ingrediente queso = new Ingrediente("Queso", 50);
        Ingrediente lowCheese = new Ingrediente("LowCheese", 60);

        Pizza hawaiana = new Pizza("Hawaiana", a);
        hawaiana.addIngrediente(pina, queso);
        //hawaiana.getPrice("Hawaiana");

        Pizza mexicana = new Pizza("Mexicana", a);
        mexicana.addIngrediente(queso, frijoles);
        //mexicana.getPrice("Mexicana");

        Pizza vegetariana = new Pizza("Vegetariana", b);
        vegetariana.addIngrediente(vegetales, lowCheese);
        //vegetariana.getPrice("Vegetariana");

        cajero.recibirOrden("Hawaiana", a);
        cajero.darOrdenChef("Hawaiana", chefSfe);
        chefSfe.hornear();
        ayudante.empacar();
        repartidor.repartirPizzas();


        


       










        
    }

    
}