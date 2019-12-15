package ejercicio6Poo;

public class Libro {
	
	
	
	private long ISBN;
	private String titulo;
	private String autor;
	private int numeroDePaginas;
	
	
	public long getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}
	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}
	
	public Libro(int ISBN, String titulo, String autor, int numeroDePaginas) {
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroDePaginas = numeroDePaginas;
	}
	
	
	
	//“El libro con ISBN creado por el autor tiene páginas”
	@Override
	public String toString() {
		return "El libro con ISBN " + getISBN() + " creado por " + getAutor()
				+ " tiene " + getNumeroDePaginas() + " paginas";
	}
	
	
	
	

}
