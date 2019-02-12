public class Conductor extends Persona
{

    public Conductor()
    {

    }
    public void agendarServicio(Concesionaria c)

    {


        System.out.println("conductor: quiero un servicio en " + c.getConcesionaria());

        c.agendarServicio(this);

    }

    public Conductor(String nombre)

    {

        super(nombre);

    }

}

   