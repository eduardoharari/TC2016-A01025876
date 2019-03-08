/**
 * User
 */
public class User 
{
    protected String nombre;
    protected String contrasena;

    public User()
    {

    }
    public User(String nombre, String contrasena)
    {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }
    public String getNombre()
    {
        return nombre;
    }
    public String getContrasena()
    {
        return contrasena;
    }
    

    
}