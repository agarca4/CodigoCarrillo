package ejercicio5Poo;

public class Serie implements Entregable {

	// Constantes
	public static final int NUMERO_TEMP_DEF = 3;
	public static final boolean ENTREGADO = false;
	public static final int MENOR = -1;
	public static final int IGUAL = 0;
	public static final int MAYOR = 1;

	// Atributos
	private String titulo;
	private int numeroDeTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	// Constructores
	public Serie() {
		this("", NUMERO_TEMP_DEF, "", "");
	}

	public Serie(String titulo, String creador) {
		this(titulo, NUMERO_TEMP_DEF, "", creador);

	}

	public Serie(String titulo, int numeroDeTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numeroDeTemporadas = numeroDeTemporadas;
		this.genero = genero;
		this.creador = creador;
		this.entregado = false;
	}

	// Metodos
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroDeTemporadas() {
		return numeroDeTemporadas;
	}

	public void setNumeroDeTemporadas(int numeroDeTemporadas) {
		this.numeroDeTemporadas = numeroDeTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public void entregar() {
		this.entregado = true;

	}

	@Override
	public void devolver() {
		this.entregado = false;

	}

	@Override
	public boolean isEntregado() {
		return this.entregado;
	}

	@Override
	public int compareTo(Object a) {
		int estado = MENOR;
		Serie ref = (Serie) a;
		if (getNumeroDeTemporadas() > ref.getNumeroDeTemporadas()) {
			estado = MAYOR;
		} else if (getNumeroDeTemporadas() == ref.getNumeroDeTemporadas()) {
			estado = IGUAL;
		}
		return estado;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numeroDeTemporadas=" + numeroDeTemporadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}

}
