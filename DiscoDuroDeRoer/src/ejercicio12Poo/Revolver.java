package ejercicio12Poo;

public class Revolver {


	private int posicionActual;
	private int posicionBala;

	public int getPosicionActual() {
		return posicionActual;
	}

	public int getPosicionBala() {
		return posicionBala;
	}

	public Revolver() {
		this.posicionActual = Metodos.generaNumeroAleatorio(1, 6);
		this.posicionBala = Metodos.generaNumeroAleatorio(1, 6);

	}

	public boolean disparar() {
		boolean dispara = false;
		if (posicionActual == posicionBala) {
			dispara = true;
		}
		siguienteBala();
		return dispara;
		

	}

	public void siguienteBala() {
		if (posicionActual == 6) {
			posicionActual = 1;
		} else {
			posicionActual++;
		}
	}
}
