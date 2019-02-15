import java.util.Date;

public class Employee //extends Person
{
    private Job hisJob;

    // aqui hay composicion con job
    public Employee (String name, int jobId, int salary)
    {
        super(name)
        hisJob = new Job(1, 1000, new Date());
    }
    public void print()
    {

    }

    
}