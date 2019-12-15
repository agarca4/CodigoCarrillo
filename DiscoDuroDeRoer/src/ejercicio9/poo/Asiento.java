package ejercicio9.poo;

public class Asiento {

	private boolean ocupado;
	private int fila;
	private char columna;
	private Espectador espectador;
	
	
	

	public Espectador getEspectador() {
		return espectador;
	}

	public void setEspectador(Espectador espectador) {
		this.espectador = espectador;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public char getColumna() {
		return columna;
	}

	public void setColumna(char columna) {
		this.columna = columna;
	}

	public Asiento(int fila, char columna) {
		setEspectador(null);
		setOcupado(false);
		this.fila = fila;
		this.columna = columna;

	}
	


	@Override
	public String toString() {
		return "Asiento " + getFila() + getColumna() + " : " + getEspectador();
	}
	
	

}
