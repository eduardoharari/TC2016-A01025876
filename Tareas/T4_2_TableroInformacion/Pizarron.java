import java.util.ArrayList;



	public class Pizarron{
		Post ultimo;
		Post[] posts = new Post[20];
		int contador;
	  
		public Pizarron(){
		  this.ultimo = null;
		  this.contador = 0;
		}
	  
		public void insertarPost(String texto, String fecha){
		  Post post = new Post(texto, fecha);
		  this.ultimo = post;
		  this.posts[contador] = post;
		  this.contador ++;
		}
	  
		public String getUltimoPost(){
		  return this.ultimo.getTexto() + " " + this.ultimo.getFecha();
		}
	  
		public void getPorFecha(String fechaDada){
	  
		  Post[] postsTemporal = new Post[20];
		  int contadorTemporal = 0;
	  
		  for (int i=0;i<this.contador ;i++ ) {
			// System.out.println(this.posts[i].getFecha());
			if (this.posts[i].getFecha().equals(fechaDada)) {
			  postsTemporal[contadorTemporal] = this.posts[i];
			  contadorTemporal ++;
			} // if
		  } // for
	  
		  for (int i=0;i<contadorTemporal ;i++ ) {
			System.out.println(postsTemporal[i].getTexto() + " " + postsTemporal[i].getFecha());
		  } // for
		}
	}


	  
	  