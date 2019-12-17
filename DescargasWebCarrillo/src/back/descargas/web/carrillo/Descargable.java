package back.descargas.web.carrillo;

public interface Descargable extends Comparable<Descargable> {

	public Double getTamano();

	public Contenido getContenido();

	@Override
	public default int compareTo(Descargable arg0) {
		int resultado;
		if (this.getContenido().getId().getIdentificador() < arg0.getContenido().getId().getIdentificador()) {
			resultado = -1;
		} else if (this.getContenido().getId().getIdentificador() > arg0.getContenido().getId().getIdentificador()) {
			resultado = 1;
		} else {
			resultado = 0;
		}

		return resultado;

	}

}
