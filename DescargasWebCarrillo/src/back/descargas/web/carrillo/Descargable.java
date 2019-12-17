package back.descargas.web.carrillo;

public interface Descargable extends Comparable<Descargable> {

	public Double getTamano();

	public Contenido getContenido();

	@Override
	public default int compareTo(Descargable arg0) {
		return getContenido().getId().getIdentificador().compareTo(arg0.getContenido().getId().getIdentificador());
	}

}
