/**
 * Twin
 */
public class Twin implements PrimeNumber
{
    public Twin()
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
            if (integerInteger.getB() % counter > 0 && integerInteger.getA() % counter > 0 && integerInteger.getB() - integerInteger.getA() == 2)
            {
                isPrime = true; 
                counter++;
                System.out.println("Its A twin prime number");
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

    public void nPrime(int a)
    {
        int count=0;
        boolean isPrime = false;
        int x=0;
        int y=0;
       
        TuplaP[] arr1 = new TuplaP[3];
    
        for (count = 2; count < a; count++)
        {                
         isPrime = true;

         for(int i=2; i <= count/2; i++)
         {
            if(count % i == 0)
            {
                isPrime = false;
                break;
            }
         }
         for(int i=2; i <= 1000/2; i++)
         {
           for(x = 3; x < 1000; x++)
         {
            for(y = 5; y < 1000; y++)
            {
                if(x % i == 0 && y % i == 0)
               {
                isPrime = false;
                TuplaP <Integer, Integer> integerInteger = new TuplaP<Integer, Integer>(x,y);
                arr1[0] = integerInteger;
               }
            }
         }
            
         }
         
         
    

         if ( isPrime == true && y % count > 0 && x % count > 0)
         {
        
          System.out.println(count);
          count++;
            
         }
        }
        
    }
    
}