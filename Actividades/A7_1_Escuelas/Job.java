import java.util.date;

public class Job 
{
    private int jobId;
    private int salary;
    //HAY AGREGACION PORQUE SE GUARDA EL ATRIBUTO DE TIPO DATE
    Date startDate;
    Date endDate;

    private job()
    {

    }

    public Job(int jobId, int salary, Date startDate)
    {
        this.jobId = jobId;
        this.salary = salary;
        this.startDate = startDate;
 
    }
    public void doTheJob()
    {
        System.out.println("Doing the job");

    }
}