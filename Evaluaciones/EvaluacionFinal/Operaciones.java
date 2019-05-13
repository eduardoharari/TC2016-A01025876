/**
 * Operaciones
 */
public class Operaciones 
{
    MatrizFlotantes m;

    public Operaciones()
    {
        
    }

    public void trans(MatrizFlotantes m)
    {
        System.out.println("\n");
        for(int x = 0; x < m.length(); x++)
        {
            for(int y = 0; y < m.length(); y++)
            {
                System.out.println ("[" + y + "," + x + "] = " + m.getValue(y,x).toString());   
            }
        }
    }
    public void superior(MatrizFlotantes m)
    {
        System.out.println("\n");
        for(int x = 0; x < m.length(); x++)
        {
            for(int y = 0; y < m.length(); y++)
            {
                while
                
                    (m.getValue(x, y) != 0,1
                
                     System.out.println ("[" + x + "," + y + "] = " + m.getValue(y,x).toString());  
                }

            }
        }


    }

    
}