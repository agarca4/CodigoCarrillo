package ejercicio11.poo;

import java.util.Arrays;
import java.util.Objects;

public class Jugador {

	public final static int DINERO_INICIAL = 10;

	private String nombre;
	private int dinero;
	private String[] apuestas;

	public String[] getApuestas() {
		return apuestas;
	}

	public void setApuestas(String[] apuestas) {
		this.apuestas = apuestas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	public Jugador(String nombre) {
		this.nombre = nombre;
		this.dinero = DINERO_INICIAL;
	}

	public void apostar(Jornada jornada) {
		if (tieneParaApostar()) {
			setDinero(getDinero() - 1);
			Porra.setBote(Porra.getBote() + 1);
			setApuestas(new String[jornada.getPartidos().length]);
			for (int i = 0; i < getApuestas().length; i++) {
				int local = MetodosSueltos.generaNumeroAleatorio(0, 5);
				int visitante = MetodosSueltos.generaNumeroAleatorio(0, 5);
				getApuestas()[i] = local + "-" + visitante;
			}
			ganar(jornada);

		} else {
			setDinero(DINERO_INICIAL);
		}

	}

	public boolean tieneParaApostar() {
		return getDinero() >= 1;
	}

	public void ganar(Jornada jornada) {
		
			int contadorAciertos = 0;
			for (int i = 0; i < jornada.getPartidos().length; i++) {
				for (int j = 0; j < getApuestas().length; j++) {
					if (Objects.equals(jornada.getPartidos()[i].getResultado(), getApuestas()[j])) {
						contadorAciertos++;

					}
				}

			}
			if (contadorAciertos >= 2) {
				System.out.println(getNombre() + " Ha ganado en la jornada " + jornada.getNumeroDeJornada());
				setDinero(Porra.getBote() + getDinero());
				Porra.setBote(0);
			}
		}

	

	@Override
	public String toString() {
		return "Jugador " + getNombre() + " tiene " + getDinero();
	}

}
