package back.descargas.web.carrillo;

import java.util.Arrays;

public class Musica extends Contenido {

	private Profesional[] artistas;

	protected Profesional[] getArtistas() {
		return artistas;
	}

	protected Musica(Identificador id, String titulo, Profesional[] artistas) {
		super(id, titulo);
		this.artistas = artistas;
	}

	@Override
	public String toString() {
		return "Musica: " + super.toString() + ", artistas: " + Arrays.toString(getArtistas());
	}

	

}
