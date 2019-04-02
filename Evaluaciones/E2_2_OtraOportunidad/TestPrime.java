/**
 * TestPrime
 */
public class TestPrime 
{
    public static void main(String[]args)
    {
       
        Twin b = new Twin();
        Cousins e = new Cousins();
        Palindrome1 r = new Palindrome1();

        r.sPrime("141");
        e.sPrime(3, 7);
        b.sPrime(3,5);

       // b.nPrime(10);

    }

    
}