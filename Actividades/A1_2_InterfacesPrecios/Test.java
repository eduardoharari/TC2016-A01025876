/**
 * Test
 */
public class Test
{
    public static void main(String[] args) 
    {
        Car carro1 = new Car("advanced");
        Car carro2 = new Car("standar");
        House casa1 = new House(5);
        Hamburguer h1 = new Hamburguer("doble");
        System.out.println(casa1.isMoreExpensive(carro2));
    }

    
}