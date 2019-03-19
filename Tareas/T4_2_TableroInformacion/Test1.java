public class Test1{
    public static void main(String[] args) {
      Pizarron piz = new Pizarron();
      Alumno a = new Alumno("isaac", "Salto", "a01087654");
      Alumno b = new Alumno("juan", "Santo", "a01087655");
      Alumno c = new Alumno("miguel", "fernandez", "a01087656");
      Alumno d = new Alumno("ruth", "aba", "a01087657");
      Alumno e = new Alumno("abraham", "perez", "a01087658");
      piz.insertarPost("Hoy ceremonia de Graduacion", "18/04/19");
      piz.insertarPost("Se cancela la ceremonia", "03/05/19");
      a.getMessage();
      b.getMessage();
      c.getMessage();
      
      System.out.println(piz.getUltimoPost());
      piz.getPorFecha("12/02/18");
    }
  }
  