public class Date
{
    private int day, month, year;

   /* public void setDay(int day)
    {
        this.day = day;
    }
    */
 
    public void setDate(String date)
    {
        if(date.length() != 10)
        {
            System.out.println("Formato incorrecto");
            return;
        }
        String[] stringDate = date.split("/");
        day = Integer.parseInt(stringDate[0]);
        month = Integer.parseInt(stringDate[1]);
        year = Integer.parseInt(stringDate[2]);
    }
    public String getDateString()
    {
        String tempDate = new String("");
        tempDate = tempDate + day + "/" + month + "/" + year;
        return tempDate;
    }


}