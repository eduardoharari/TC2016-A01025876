/**
 * MainEvaluacion
 */
public class MainEvaluacion {

    public static void main(String[] args) 
    {
        Operaciones o = new Operaciones();
        MatrizFlotantes m = new MatrizFlotantes(3);
        m.llenarMatriz(2);
        m.printMatriz();
        o.trans(m);
        
        

       

        

        
        
    }
}