package ejercicio5Poo;

public class Videojuego implements Entregable {

	// Constantes
	public static final int HORAS_ESTIMADAS_DEF = 10;
	public static final boolean ENTREGADO = false;
	public static final int MENOR = -1;
	public static final int IGUAL = 0;
	public static final int MAYOR = 1;

	// Atributos
	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String genero;
	private String compañia;

	// Constructores
	public Videojuego() {
		this("", HORAS_ESTIMADAS_DEF, "", "");
	}

	public Videojuego(String titulo, String compañia) {
		this(titulo, HORAS_ESTIMADAS_DEF, "", compañia);
	}

	public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.compañia = compañia;
		this.genero = genero;
		this.entregado = false;
	}

	// Metodos
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	@Override
	public void devolver() {
		this.entregado = false;

	}

	@Override
	public void entregar() {
		this.entregado = true;
	}

	@Override
	public boolean isEntregado() {
		return this.entregado;
	}

	@Override
	public int compareTo(Object a) {
		int estado = MENOR;
		Videojuego ref = (Videojuego) a;
		if (getHorasEstimadas() > ref.getHorasEstimadas()) {
			estado = MAYOR;
		} else if (getHorasEstimadas() == ref.getHorasEstimadas()) {
			estado = IGUAL;
		}
		return estado;
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compañia=" + compañia + "]";
	}

}
