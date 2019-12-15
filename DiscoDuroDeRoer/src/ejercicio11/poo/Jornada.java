package ejercicio11.poo;

import java.util.Arrays;
import java.util.Objects;

public class Jornada {

	private int numeroDeJornada;
	private Partido[] partidos;

	public int getNumeroDeJornada() {
		return numeroDeJornada;
	}

	public void setNumeroDeJornada(int numeroDeJornada) {
		this.numeroDeJornada = numeroDeJornada;
	}

	public Partido[] getPartidos() {
		return partidos;
	}

	public void setPartidos(Partido[] partidos) {
		this.partidos = partidos;
	}

	public Jornada() {
		int numeroDePartidos = MetodosSueltos.generaNumeroAleatorio(6, 6);
		this.partidos = new Partido[numeroDePartidos];

		do {
			for (int i = 0; i < getPartidos().length; i++) {
				getPartidos()[i] = new Partido();
			}
		} while (Partido.repiteEquipo(getPartidos()));
		

	}

	@Override
	public String toString() {
		return "Jornada nº" + getNumeroDeJornada() + ", partidos: " + Arrays.toString(getPartidos());
	}

}
