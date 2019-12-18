package back.descargas.web.carrillo;

public class Identificador {
	
	private int identificador;

	public int getIdentificador() {
		return identificador;
	}

	public Identificador(int identificador) {
		super();
		this.identificador = identificador;
	}

	@Override
	public String toString() {
		return "Identificador: " + getIdentificador();
	}

	public int compareTo(Identificador id) {
		// TODO Auto-generated method stub
		return this.getIdentificador() - id.getIdentificador();
	}

	
	
	
	

}
