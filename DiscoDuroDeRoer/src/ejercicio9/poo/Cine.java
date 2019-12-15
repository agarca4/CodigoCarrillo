package ejercicio9.poo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Cine {

	private Pelicula pelicula;
	private static double precio;
	private Asiento[][] asientos;

	public Asiento[][] getAsientos() {
		return asientos;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public static double getPrecio() {
		return precio;
	}

	public static void setPrecio(double precio) {
		Cine.precio = precio;
	}

	public Cine(Pelicula pelicula, double precio, int filas, int columnas) {
		this.pelicula = pelicula;
		Cine.precio = precio;
		this.asientos = new Asiento[filas][columnas];
		int fila = asientos.length;
		for (int i = 0; i < asientos.length; i++) {
			for (int j = 0; j < asientos[0].length; j++) {
				asientos[i][j] = new Asiento(fila, (char) ('A' + j));
			}
			fila--;
		}

	}

	public static boolean estaLleno(Cine cine) {
		boolean isLleno = true;
		for (int i = 0; i < cine.getAsientos().length; i++) {
			for (int j = 0; j < cine.getAsientos()[0].length; j++) {
				if (Objects.deepEquals(cine.getAsientos()[i][j].getEspectador(), null)) {
					isLleno = false;
					break;
				}

			}

		}

		return isLleno;
	}

	public static void sentarEspectadores(ArrayList<Espectador> espectadores, Cine cine) {
		int contadorNoSentables = 0;
		for (int i = 0; i < espectadores.size(); i++) {
			while (espectadores.get(i).tieneDineroSuficiente()
					&& espectadores.get(i).tieneLaEdadSuficiente(cine.getPelicula()) && !(estaLleno(cine))
					&& espectadores.get(i).isSentado() == false) {

				int filaAsentar = MetodosSueltos.generaNumeroAleatorio(0, cine.getAsientos().length - 1);
				int columnaAsentar = MetodosSueltos.generaNumeroAleatorio(0, cine.getAsientos()[0].length - 1);

				if (!(cine.getAsientos()[filaAsentar][columnaAsentar].isOcupado())) {
					cine.getAsientos()[filaAsentar][columnaAsentar].setEspectador(espectadores.get(i));
					cine.getAsientos()[filaAsentar][columnaAsentar].setOcupado(true);
					espectadores.get(i).setSentado(true);

				} 
			}
			if (!(espectadores.get(i).isSentado())) {
				contadorNoSentables++;
			}

		}
		System.out.println(contadorNoSentables + " espectadores no se puede sentar");
		System.out.println("La sala queda así: " + cine);
	}

	@Override
	public String toString() {
		return "ASIENTOS: " + Arrays.deepToString(getAsientos()) + ", PELICULA: " + getPelicula() + " PRECIO: "
				+ getPrecio();
	}

}
