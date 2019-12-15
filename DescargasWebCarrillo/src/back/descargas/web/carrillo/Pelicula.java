package back.descargas.web.carrillo;

import java.util.Arrays;

public class Pelicula extends Contenido {
	
	private Profesional[] actores;
	private Profesional director;

	

	protected Profesional[] getActores() {
		return actores;
	}

	protected Profesional getDirector() {
		return director;
	}

	

	protected Pelicula(Identificador id, String titulo, Profesional[] actores, Profesional director) {
		super(id, titulo);
		this.actores = actores;
		this.director = director;
		
	}

	@Override
	public String toString() {
		return "Pelicula: " + super.toString() + ", director: " + getDirector() + ", actores: " 
	+ Arrays.toString(getActores());
	}

}
