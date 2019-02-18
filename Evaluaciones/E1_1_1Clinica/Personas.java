public class Personas
{

 protected String name;
 public Personas(){}
 boolean permiso = false;
 
 public Personas(String name)
 {
    this.name = name;
    Cabeza cabeza = new Cabeza("si", "si");
 }
  public String getName()
 {
    return name;
 }
  public boolean getPermiso(boolean permiso, Personas a,Personas b, Personas c)
  {
     if (permiso == true)
     {
         System.out.println("Soy " + b.getName() + " y estoy besando a " + a.getName());
     }
     if (permiso == false)
     {
         System.out.println("Soy " + a.getName() + " y no le doy permiso a " + c.getName() + " que me bese");
     }
     return permiso;

  }



}