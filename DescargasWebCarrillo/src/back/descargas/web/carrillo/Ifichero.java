package back.descargas.web.carrillo;

public class Ifichero implements Descargable{

	private Double tamano;
	private Contenido contenido;

	public Ifichero(Double tamano, Contenido contenido) {
		super();
		this.tamano = tamano;
		this.contenido = contenido;

	}

	@Override
	public Double getTamano() {
		return tamano;
	}

	@Override
	public Contenido getContenido() {
		return contenido;
	}
	
	@Override
	public int compareTo(Descargable arg0) {
		return getContenido().getId().getIdentificador().compareTo(arg0.getContenido().getId().getIdentificador());
	}

	@Override
	public String toString() {
		return "Fichero con tamaño: " + getTamano() + " Mg, " + getContenido();
	}

	

	
	

}
