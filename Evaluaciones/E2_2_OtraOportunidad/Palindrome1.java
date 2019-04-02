public class Palindrome1
{
    public Palindrome1()
    {

    }
            
    public boolean sPrime(String number) //throws NotPrimeNumberException
    {
           String backwardsText = "";
           int count=0;
           boolean isPrime = false;
           int numberNew=0;
           
            for(int counter = 2; counter <= 100000 ; counter++) 
            {
              for(count = number.length()-1; count >= 0; count--)
             {
                backwardsText += number.charAt(count);

                numberNew=Integer.parseInt(number);

                if(backwardsText.equals(number) && numberNew % counter > 0)
                {
                    isPrime = true;
                    counter++;
                    System.out.println("that is a palindrome and is a prime number");

                }
             }
            }
            return isPrime;
    }
        
    
}// end class