/**
 * Sucursales
 */
public class Sucursal
{
    protected String nombre;
    String[][] ingredientesSfe = new String[8][1];
    String[][] ingredientesPol = new String[1][1];
    
    public Sucursal()
    {

    }

    public Sucursal(String nombre)
    {
        
        this.nombre = nombre;
        if(nombre.equals("Santa Fe") || nombre.equals("Polanco"))
        {
            //System.out.println("Estas en sucursal " + nombre); 
        }
        else
        {
            System.out.println("Sucursal Invalida");
        }
        String[][] ingredientesSfe = new String[8][1];
        String[][] ingredientesPol = new String[1][1];

    }
    public String getNombre()
    {
        return nombre;
    }
    public void getIngredientes()
    {
        if(this.nombre.equals("Santa Fe"))
        {
            ingredientesSfe[0][0] = "Queso";
            ingredientesSfe[0][1] = "50";
            ingredientesSfe[1][0] = "Frijoles";
            ingredientesSfe[1][1] = "30";
            ingredientesSfe[2][0] = "Pina";
            ingredientesSfe[2][1] = "10";
            ingredientesSfe[3][0] = "Chorizo";
            ingredientesSfe[3][1] = "40";
               
        }
        if(this.nombre.equals("Polanco"))
        {
            ingredientesPol[0][0] = "Vegetales";
            ingredientesPol[0][1] = "15";
            ingredientesPol[1][0] = "Queso bajo en grasa";
            ingredientesPol[0][1] = "60";
            
        }
    }
    
}