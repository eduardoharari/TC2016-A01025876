
/**
 * TestRedes
 */
public class TestRedes 
{
    public static void main(String[]args)   
    {
        Instagram i = new Instagram();
        Facebook f = new Facebook();
        Twitter t = new Twitter();

        User b = new User("Eduardo","contrasena");
        User a = new User("Isaac","ontrasena");
        User c = new User("fer", "1234");

        Latency l = new Latency();
        
          i.addNewUser("Eduardo", "apeido", "edad", "nacimiento"," email", "telefono", "usuario","contrasena"," eduacion", "trabajo");
          i.addUser(b);
          i.logIn(b);
          i.logOut(false);
          //l.simulateLatency(1, 2);
          i.post("Hola buen dia", false);


        f.addNewUser("Isaac","h", "edad", "nacimiento", "email", "telefono", "usuario", "ontrasena", "eduacion", "trabajo");
        f.addUser(a);
        f.logIn(a);
        f.logOut(false);
        //l.simulateLatency(1, 3);
        f.post("Hola buen dia",false);

        t.addNewUser("fer", "apeido", "edad", "nacimiento", "email", "telefono", "usuario", "1234", "eduacion", "trabajo");
        t.addUser(c);
        t.logIn(c);
        t.logOut(false);
        //l.simulateLatency(1, 3);
        t.post("Hola buen Dia", false);

       


    }
}