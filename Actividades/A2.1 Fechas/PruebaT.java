<<<<<<< HEAD
public class PruebaT
{
    public static void main(String[]args)
    {
      
        Time otherTime = new Time();
        otherTime.setTime("14/01/20");

        System.out.println(otherTime.getTimeString());

        Time myTime = new Time();
        myTime.setHours(10);
        Time otherTime2 = new Time();
        otherTime2.setMinutes(12);
        Time otherTime1 = new Time();
        otherTime1.setSeconds(12);
        System.out.println(myTime.getHours());
        System.out.println(otherTime2.getMinutes());
        System.out.println(otherTime1.getSeconds());
    }

=======
public class PruebaT
{
    public static void main(String[]args)
    {
      
        Time otherTime = new Time();
        otherTime.setTime("14/01/20");

        System.out.println(otherTime.getTimeString());

        Time myTime = new Time();
        myTime.setHours(10);
        Time otherTime2 = new Time();
        otherTime2.setMinutes(12);
        Time otherTime1 = new Time();
        otherTime1.setSeconds(12);
        System.out.println(myTime.getHours());
        System.out.println(otherTime2.getMinutes());
        System.out.println(otherTime1.getSeconds());
    }

>>>>>>> f9bb418945079b7672cd06b4f62d6c7653dbaf09
}