import java.util.Scanner;
public class Cliente extends Persona
{
    private String nombre;
    private String apeido;
    public String tipoPizza = null;

    public Cliente()
    {

    }
    public Cliente(String nombre, String apeido)
    {
        this.nombre = nombre;
        this.apeido = apeido;
    }
    public void pedirPizza()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("quieres pizza Hawaiana Mexicana Vegetariana o creacion del chef ")
      
        kb = tipoPizza.nextLine();

        if(tipo)
    
    }
    
}