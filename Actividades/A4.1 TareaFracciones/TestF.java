public class TestF


{
    

    public static void main(String[]args)
    {
        Fraccion a = new Fraccion(9,4);
        Fraccion b = new Fraccion(8,9);
        Fraccion c = new Fraccion();
        //System.out.println(a.getNum() + "/" + a.getDen());
        //System.out.println(b.getNum() + "/" + b.getDen());

        c.getSuma(a, b);
        c.getResta(a, b);
        c.getMultiplicacion(a, b);
        c.getDivision(a, b);
        
    }

}