package back.descargas.web.carrillo;

public class Contenido {

	private Identificador id;
	private String titulo;

	public Identificador getId() {
		return id;
	}

	protected String getTitulo() {
		return titulo;
	}

	public Contenido(Identificador id, String titulo) {
		super();
		this.id = id;
		this.titulo = titulo;

	}

	@Override
	public String toString() {
		return "titulo: " + getTitulo() + " ,Id: " + getId();
	}

}
