/**
 * Alumno
 */
public class Alumno 
{
    private String nombre;
    private String apeido;
    private String matricula;

    public Alumno()
    {

    }
    public Alumno(String nombre, String apeido, String matricula)
    {
        this.nombre = nombre;
        this.apeido = apeido;
        this.matricula = matricula;
    }
    public String getNombre()
    {
        return nombre;
    }
    public String getApeido()
    {
        return apeido;
    }
    public String getMatricula()
    {
        return matricula;
    }
    public void getMessage()
    {
        System.out.println("Has recibido el mensaje");
    }


    
}