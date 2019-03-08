import java.util.Scanner;
/**
 * Facebook
 */
public class Facebook 
{
    private String nombre;
    private String password;
    private String apeido;
    private String edad;
    private String nacimiento;
    private String email;
    private String telefono;
    private String usuario;
    private String contrasena;
    private String eduacion;
    private String trabajo;

    String newUser[] = new String [10];
    
    public Facebook()
    {
    
    }
    
    public void addNewUser(String nombre,String apeido,String edad,String nacimiento,String email,String telefono,String usuario,String contrasena,String eduacion,String trabajo)
    {
        this.nombre = nombre;
        this.apeido = apeido;
        this.edad = edad;
        this.nacimiento = nacimiento;
        this.email = email;
        this.telefono = telefono;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.eduacion = eduacion;
        this.trabajo = trabajo;

        newUser[0] = nombre;
        newUser[1] = apeido;
        newUser[2] = edad;
        newUser[3] = nacimiento;
        newUser[4] = email;
        newUser[5] = telefono;
        newUser[6] = usuario;
        newUser[7] = contrasena;
        newUser[8] = eduacion;
        newUser[9] = trabajo;
        
    }
    public void equals(User a)
    {
        if(newUser[0].equals(a.getNombre()) && newUser[7].equals(a.getContrasena()))
        {
            System.out.println("Ingreso a Facebook correcto");
        }
    }
    public void logIn(User a)
    {
        if(newUser[0].equals(a.getNombre()) && newUser[7].equals(a.getContrasena()))
        {
            System.out.println("haz hecho log in en Facebook ya puedes hacer tu post");
        }
        else
        {
            System.out.println("Tu usuario no existe en esta plataforma o tu contrasena es incorrecta, vuelve a intentarlo");
        }
       
       
    } 
  
    public void addUser(User a)
    {
        
    }
    public boolean logOut(boolean ad)
    {
        if(ad == true)
        {
            System.out.println("Has hecho log out en Facebook, Gracias, ya no puedes postear mas mensajes");
        }
        else
        {
            ad = false;;
        }
        
        return ad;
        
       
        
        
    }
 
    public void post(String message,boolean ad)
    {

        if(ad == true)
        {
            System.out.println("Has hecho log out en Facebook, Gracias, ya no puedes postear mas mensajesss");
           
        }
        else
        {
        
            System.out.println("...............Facebook.............");
            System.out.println(".                                  .");
            System.out.println(".          "+ message + "          .");
            System.out.println(".                                  .");
            System.out.println("...................................."); 
        }
        
    }
            

    
}