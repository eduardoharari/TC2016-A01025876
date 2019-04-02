/**
 * Cousins
 */
public class Cousins 
{
    public Cousins()
    {
         
    }

    public boolean sPrime(int a, int b)
    {
        boolean isPrime = false;
        TuplaP <Integer, Integer> integerInteger = new TuplaP<Integer, Integer>(a, b);

        TuplaP[] arr = new TuplaP[3];

        arr[0] = integerInteger;
       // System.out.println(integerInteger);
        
        
        for(int counter = 2; counter < integerInteger.getB() - 1; counter++) 
        {
            if (integerInteger.getB() % counter > 0 && integerInteger.getA() % counter > 0 && integerInteger.getB() - integerInteger.getA() == 4)
            {
                isPrime = true; 
                counter++;
                System.out.println("its A cousin Prime Number");
            
                return isPrime;
            }
            else
            {
                isPrime = false;
                System.out.println("no es primo");
                break;
            }
       
        }  
        return isPrime;
        
    }


    
}