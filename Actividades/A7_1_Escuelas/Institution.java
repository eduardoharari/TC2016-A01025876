public class Institution 
{
    private String name;
    private Student[]studentsList;
    private Teacher[]teachersList;
    private int contTeachers;
    private int contStudents;


    public Institution()
    {
        this.name = "School with no name";
        contTeachers = 0;
        contStudents = 0;
        studentsList = new Student[100];
        teachersList = new Teacher[100];

    }

    public Institution(String name)
    {
        this.name = name;
        contTeachers = 0;
        contStudents = 0;
        studentsList = new Student[100];
        teachersList = new Teacher[100];
    }

    //aqui hay asociacion con visitor
    public void receivesVisits(Visitor visitor)
    {
        visitor.visit();

    }
    public void print()
    {
        // detalles de la institucion

    }
    // hay agregacion con teacher
    // teacher se guarda pero no se crea

    public void hiresTeacher(Teacher theTeacher)
    {
        if(contTeachers < 100)
        teacherList[contTeachers++]= theTeacher;
        else
        System.out.println("Ya no hay espacio");

    }
    public int getNumberOfTeachers()
    {
        return contTeachers - 1;

    }
    public void enrollStudent(Student theStudent)
    {
        if(contStudents < 100)
          studentsList[contStudents++] = theStudent;
          else
          System.out.println("Ya no hay espacio");

    }
    public int getNumberOfFullTimeTeachers(int workHours)
    {
        int fullTimeTeachers = 0;
        if(contTeachers < 100 && workHours >= 8)
        {
            teachersList[contTeachers++] = fullTimeTeachers;
        }
        return fullTimeTeachers;

    }
    public int getNumberOfPartialTimeTeachers(int workHours)
    {
        int partialTimeTeachers = 0;
        if(contTeachers < 100 && workHours < 8)
        {
            teachersList[contTeachers++] = fullTimeTeachers;
        }
        return partialTimeTeachers;
        
    }
    
    
}