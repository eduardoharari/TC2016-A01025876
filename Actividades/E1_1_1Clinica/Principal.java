public class Principal
{
    public static void main(String[]args)
    {
        Personas a = new Personas("Mariana");
        Personas b = new Personas("Juanito");
        Personas c = new Personas("Alejandra");

        Cabeza hh = new Cabeza("tiene barba", "tiene Cabello");
        Ojo o = new Ojo(5, "azul");
        Boca boca = new Boca("roja");

        o.ver(a,b);
        boca.besar(a, b);



    }

}