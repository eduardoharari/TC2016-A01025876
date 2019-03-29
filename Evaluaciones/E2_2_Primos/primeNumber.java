
public class primeNumber
{
    protected int number = 0;
    protected boolean isPrime = false;

    public primeNumber()
    {

    }
    public primeNumber(int number)
    {
        this.number = number;
    }

    public int getNumber()
    {
        return number;
    }

    public void nPrime(int number)
    {
        int count=0;

        for (int num = 2; count < number; num++)
        {
            boolean isPrime = true;

            for (int i=2; i <= num/2; i++)
            {
                if ( num % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
 
            if ( isPrime == true )
            {
                System.out.println(num);
                count++;
            }
        }
       
    }

    public boolean isPrime(int number) //throws NotPrimeNumberException
    {
        for(int counter = 2; counter > number - 1 ; counter++) 
        {
            if (number % counter > 0 ) 
            {
                isPrime = true; 
                counter++;
            }
           /* else
            {
                throw new NotPrimeNumberException();

            }
            */
                
        }
        return isPrime;
    }

}