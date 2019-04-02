
public interface PrimeNumber
{
    public int number = 0;
    

    default void nPrime(int number)
    {
        int count=0;
        boolean isPrime = false;

        for (count = 2; count < number; count++)
        {
            isPrime = true;

            for (int i=2; i <= count/2; i++)
            {
                if ( count % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
 
            if ( isPrime == true )
            {
                System.out.println(count);
                count++;
            }
        }
       
    }

    default void sPrime(int number) //throws NotPrimeNumberException
    {
        boolean isPrime = false;
        for(int counter = 2; counter > number - 1 ; counter++) 
        {
            if (number % counter > 0 ) 
            {
                isPrime = true;
                counter++;
                
            }
           
        }
        
    }

}