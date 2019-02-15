/**
 * Cliente
 */
public class Cliente extends Person
{
    private Cliente(){
        super("sin nombre");
    }
    public Cliente(String nombre)
    {
        super(nombre);
    }
    public void retirar(double cantidad, Sucursal s)
    {
        s.retiro(cantidad, this);
    }

    public static void main(String[]args)
    {
        Sucursal sj = new Sucursal("fray");
        Sucursal sb = new Sucursal("fraya");
        Cliente c = new Cliente("Pedrito");

        c.retirar(10000, sj);
        c.retirar(30000, sb);
    }
}