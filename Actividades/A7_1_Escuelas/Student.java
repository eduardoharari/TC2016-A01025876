public class Student extends Person
{
    int studentId;

    public Student(String name, int studentId)
    {
        super(name);
        this.studentId = studentId;
        
    }

    public void print()
    {
        System.out.println("estuadiante " + getName() + "id " + studentId);
    }



    
}