package entidades;

public class Libro {
	
	
	private int id;
	
	private String tituloLibro = "aaaaaaaaaaa";
	 
	private String autor = "aaaaaaaaaa";
	
	private int numEjemplares = 0;
	
	private int numEjemplaresPrestados = 0;

	
	//getters y setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTituloLibro() {
		return tituloLibro;
	}

	public void setTituloLibro(String tituloLibro) {
		this.tituloLibro = tituloLibro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumEjemplares() {
		return numEjemplares;
	}

	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}

	public int getNumEjemplaresPrestados() {
		return numEjemplaresPrestados;
	}

	public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
		this.numEjemplaresPrestados = numEjemplaresPrestados;
	}
	
	
	// to string
	@Override
	public String toString() {
		return "Libro [id=" + id + ", tituloLibro=" + tituloLibro + ", autor=" + autor + ", numEjemplares="
				+ numEjemplares + ", numEjemplaresPrestados=" + numEjemplaresPrestados + "]";
	}
	
	
	
}
