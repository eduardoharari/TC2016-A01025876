<<<<<<< HEAD
public class Time
{
    private int hours, minutes, seconds;

    public void setHours(int hours)
    {
        this.hours = hours;
    }
    public void setMinutes(int minutes)
    {
        this.minutes = minutes;
    }
    public void setSeconds(int seconds)
    {
        this.seconds = seconds;
    }

    public int getHours()
    {
        return hours;
    }
    public int getMinutes()
    {
        return minutes;
    }
    public int getSeconds()
    {
        return seconds;
    }

    public void setTime(String time)
    {
        if(time.length() != 8)
        {
            System.out.println("Formato incorrecto");
            return;
        }
        String[] stringTime = time.split("/");
        hours = Integer.parseInt(stringTime[0]);
        minutes = Integer.parseInt(stringTime[1]);
        seconds = Integer.parseInt(stringTime[2]);
    }
    public String getTimeString()
    {
        String tempDate = new String("");
        tempDate = tempDate + hours + "/" + minutes + "/" + seconds;
        return tempDate;
    }




=======
public class Time
{
    private int hours, minutes, seconds;

    public void setHours(int hours)
    {
        this.hours = hours;
    }
    public void setMinutes(int minutes)
    {
        this.minutes = minutes;
    }
    public void setSeconds(int seconds)
    {
        this.seconds = seconds;
    }

    public int getHours()
    {
        return hours;
    }
    public int getMinutes()
    {
        return minutes;
    }
    public int getSeconds()
    {
        return seconds;
    }

    public void setTime(String time)
    {
        if(time.length() != 8)
        {
            System.out.println("Formato incorrecto");
            return;
        }
        String[] stringTime = time.split("/");
        hours = Integer.parseInt(stringTime[0]);
        minutes = Integer.parseInt(stringTime[1]);
        seconds = Integer.parseInt(stringTime[2]);
    }
    public String getTimeString()
    {
        String tempDate = new String("");
        tempDate = tempDate + hours + "/" + minutes + "/" + seconds;
        return tempDate;
    }




>>>>>>> f9bb418945079b7672cd06b4f62d6c7653dbaf09
}