package app.tienda;

public class Turno {

	private static Turno turnoActual = new Turno();
	private static int contador;
	private int valor;

	public int getValor() {
		return valor;
	}

	private void setValor(int valor) {
		this.valor = valor;
	}

	protected static void pasaTurno() {
		turnoActual.setValor(turnoActual.getValor() + 1);
		System.out.println("info: pasado turno a "
				+ turnoActual.getValor());
	}
	
	public static int verValorActual() {
		return turnoActual.getValor();
	}

	@Override
	public String toString() {
		return "Turno [getValor()=" + getValor() + "]";
	}

	public static Turno cogerTurno() {
		Turno nuevoTurno = new Turno();
		nuevoTurno.setValor(contador++);
		return nuevoTurno;
	}

}
