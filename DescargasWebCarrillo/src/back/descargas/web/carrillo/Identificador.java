package back.descargas.web.carrillo;

public class Identificador {
	
	private String identificador;

	public String getIdentificador() {
		return identificador;
	}

	public Identificador(String identificador) {
		super();
		this.identificador = identificador;
	}

	@Override
	public String toString() {
		return  getIdentificador();
	}
	
	
	

}
