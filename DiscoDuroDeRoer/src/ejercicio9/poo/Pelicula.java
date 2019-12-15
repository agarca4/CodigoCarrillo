package ejercicio9.poo;

public class Pelicula {

	private String titulo;
	private double duracion;
	private String director;
	private int edadMinima;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getEdadMinima() {
		return edadMinima;
	}

	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}

	public Pelicula(String titulo, double duracion, String director, int edadMinima) {

		this.titulo = titulo;
		this.duracion = duracion;
		this.director = director;
		this.edadMinima = edadMinima;
	}

	@Override
	public String toString() {
		return " Titulo: " + getTitulo() + " Duracion: " + getDuracion() + " Director: "
				+ getDirector() + " Edad Minima: " + getEdadMinima();
	}
	
	

}
