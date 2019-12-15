package back.descargas.web.carrillo;

public class Profesional {

	private String[] profesion;
	private String nombre;

	protected String[] getProfesion() {
		return profesion;
	}

	protected void setProfesion(String[] profesion) {
		this.profesion = profesion;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected Profesional(String[] profesion, String nombre) {
		super();
		this.profesion = profesion;
		this.nombre = nombre;
	}

}
