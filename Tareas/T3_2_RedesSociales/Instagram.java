import java.util.Scanner;
/**
 * Instagram
 */
public class Instagram 
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

    String newUserI[] = new String [10];
    
    public Instagram()
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
        
        newUserI[0] = nombre;
        newUserI[1] = apeido;
        newUserI[2] = edad;
        newUserI[3] = nacimiento;
        newUserI[4] = email;
        newUserI[5] = telefono;
        newUserI[6] = usuario;
        newUserI[7] = contrasena;
        newUserI[8] = eduacion;
        newUserI[9] = trabajo;
        
    }
    public void equals(User b)
    {
        if(newUserI[0].equals(b.getNombre()) && newUserI[7].equals(b.getContrasena()))
        {
            System.out.println("Ingreso a Instagram correcto");
        }
        else
        {
            System.out.println("Tu usuario no existe en esta plataforma o tu contrasena es incorrecta, vuelve a intentarlo");
        }
        
    }
    public void logIn(User b)
    {
        if(newUserI[0].equals(b.getNombre()) && newUserI[7].equals(b.getContrasena()))
        {
            System.out.println("haz hecho log in en Instagram ya puedes hacer tu post");
        }
        else
        {
            System.out.println("Tu usuario no existe en esta plataforma o tu contrasena es incorrecta, vuelve a intentarlo");
        }
       
    } 
    public void addUser(User b)
    {
        
    }
    public boolean logOut(boolean ad)
    {
        if(ad == true)
        {
            System.out.println("Has hecho log out en Instagram, Gracias, ya no puedes postear mas mensajes");
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
            System.out.println("Has hecho log out en Instagram, Gracias, ya no puedes postear mas mensajesss");
           
        }
        else
        {
        
            System.out.println("..............Instagram.............");
            System.out.println(".                                  .");
            System.out.println(".          "+ message + "          .");
            System.out.println(".                                  .");
            System.out.println("...................................."); 
        }
        
    }
            

   /* public String sendData(byte message)
    {
        return message;
        
    } 
    */

    
}