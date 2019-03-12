public class Post{

    String texto;
    String fecha;
  
    public Post(String texto, String fecha){
      this.texto = texto;
      this.fecha = fecha;
    }
    public String getTexto(){
      return this.texto;
    }
    public String getFecha(){
      return this.fecha;
    }
  }
  