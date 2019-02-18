public class Principal
{
    public static void main(String[]args)
    {
        Personas a = new Personas("Mariana");
        Personas b = new Personas("Juanito");
        Personas c = new Personas("Alejandra");

      
        Ojo ojo = new Ojo(5, "azul");
        Boca boca = new Boca("roja");
       

        ojo.ver(a,b);
        boca.besar(a, b);
        a.getPermiso(false,a,b,c);
     



    }

}