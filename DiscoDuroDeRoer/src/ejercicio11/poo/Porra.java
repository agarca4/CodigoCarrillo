package ejercicio11.poo;

import java.util.Arrays;

public class Porra {

	private static Jugador[] jugadores;
	private static int bote;
	private static Jornada[] jornadas;

	public static Jugador[] getJugadores() {
		return jugadores;
	}

	public void setJugadores(Jugador[] jugadores) {
		Porra.jugadores = jugadores;
	}

	public static int getBote() {
		return bote;
	}

	public static void setBote(int bote) {
		Porra.bote = bote;
	}

	public static Jornada[] getJornadas() {
		return jornadas;
	}

	public void setJornadas(Jornada[] jornadas) {
		this.jornadas = jornadas;
	}

	public Porra(Jugador[] jugadores) {
		Porra.jugadores = jugadores;
		this.jornadas = new Jornada[38];

		for (int i = 0; i < getJornadas().length; i++) {
			jornadas[i] = new Jornada();
			jornadas[i].setNumeroDeJornada(i + 1);

		}

		for (int j = 0; j < getJornadas().length; j++) {
			for (int i = 0; i < jugadores.length; i++) {
				jugadores[i].apostar(getJornadas()[j]);
			}

		}

	}

	@Override
	public String toString() {
		return "Porra, jugadores: " + Arrays.toString(getJugadores()) + ", Jornadas: " + Arrays.toString(getJornadas())
				+ "Bote acumulado: " + getBote();
	}

}
