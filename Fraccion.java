public class Fraccion
{
    private int num, den;

    public Fraccion()
    {
        System.out.println("constructor sin parametros");
    }
    public Fraccion(int num, int den)
    {
        this.num = num;
        this.den = den;
    }

    public int getNum()
    {
        return num;
    }
    public int getDen()
    {
        return den;
    }
    public void getSuma(Fraccion a, Fraccion b)
    {
        int numC = 0;
        int denC = 0;

        numC = (a.getNum() * b.getDen()) + (a.getDen() * b.getNum());
        denC = (a.getDen() * b.getDen());
           
          
        Integer.toString(numC);
        Integer.toString(denC);

        String suma = numC + "/" + denC;
        System.out.println(suma);
        
    }
    public void getResta(Fraccion a, Fraccion b)
    {
        int numC = 0;
        int denC = 0;

        numC = (a.getNum() * b.getDen()) - (a.getDen() * b.getNum());
        denC = (a.getDen() * b.getDen());
           
          
        Integer.toString(numC);
        Integer.toString(denC);

        String resta = numC + "/" + denC;
        System.out.println(resta);
    }
    public void getMultiplicacion(Fraccion a, Fraccion b)
    {
        int numC = 0;
        int denC = 0;

        numC = (a.getNum() * b.getNum());
        denC = (a.getDen() * b.getDen());
           
          
        Integer.toString(numC);
        Integer.toString(denC);

        String multiplicacion = numC + "/" + denC;
        System.out.println(multiplicacion);
    }
    public void getDivision(Fraccion a, Fraccion b)
    {
        int numC = 0;
        int denC = 0;

        numC = (a.getNum() * b.getDen());
        denC = (b.getNum() * a.getDen());
           
          
        Integer.toString(numC);
        Integer.toString(denC);

        String multiplicacion = numC + "/" + denC;
        System.out.println(multiplicacion);
    }
    public void getSimplificacion(Fraccion a, Fraccion b)
    {
        int numC = 0;
        int denC = 0;

        numC = (a.getNum() * b.getDen());
        denC = (b.getNum() * a.getDen());
           
          
        Integer.toString(numC);
        Integer.toString(denC);

        String multiplicacion = numC + "/" + denC;
        System.out.println(multiplicacion);
    }



}

