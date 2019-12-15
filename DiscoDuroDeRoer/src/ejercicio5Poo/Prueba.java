package ejercicio5Poo;

import java.util.Arrays;

public class Prueba {
	public static void main(String[] args) {
		Serie[] listaSeries = new Serie[4];
		Videojuego[] listaVideojuegos = new Videojuego[4];

		listaSeries[0] = new Serie("Breaking Bad", 5, "drama", "abc");
		listaSeries[1] = new Serie("Vikingos", "Netflix");
		listaSeries[2] = new Serie("Dexter", 7, "crimen", "HBO");
		listaSeries[3] = new Serie("Mi polla", 69, "porno", "torbe");

		listaVideojuegos[0] = new Videojuego("Fallout", 30, "rol", "Interplay");
		listaVideojuegos[1] = new Videojuego("Resident Evil", 54, "survivol", "capcom");
		listaVideojuegos[2] = new Videojuego("Beholder", 15, "estrategia", "porras&cia");
		listaVideojuegos[3] = new Videojuego("Commandos", 100, "estrategia", "pyrostudios");

		System.out.println(listaSeries[0]);
		listaSeries[0].entregar();
		System.out.println(listaSeries[0]);
		listaSeries[0].devolver();
		System.out.println(listaSeries[0]);
		listaSeries[3].entregar();
		listaSeries[1].entregar();

		listaVideojuegos[0].entregar();
		listaVideojuegos[1].entregar();
		System.out.println(listaVideojuegos[0]);
		System.out.println(listaVideojuegos[1]);

		int contadorVideojuegosEntregados = 0;
		for (int i = 0; i < listaVideojuegos.length; i++) {
			if (listaVideojuegos[i].isEntregado()) {
				contadorVideojuegosEntregados++;
			}
		}
		System.out.println(contadorVideojuegosEntregados);

		int contadorPeliculasEntregadas = 0;
		for (int i = 0; i < listaSeries.length; i++) {
			if (listaSeries[i].isEntregado()) {
				contadorPeliculasEntregadas++;
			}
		}
		System.out.println(contadorPeliculasEntregadas);

		// Creamos dos objetos con la primera posicion de cada array
		Serie serieMayor = listaSeries[0];
		Videojuego videojuegoMayor = listaVideojuegos[0];

		// Recorremos el array desde la posicion 1 (no 0), comparando el mayor con las
		// posiciones del array
		for (int i = 1; i < listaSeries.length; i++) {
			if (listaSeries[i].compareTo(serieMayor) == Serie.MAYOR) {
				serieMayor = listaSeries[i];
			}
			if (listaVideojuegos[i].compareTo(videojuegoMayor) == Videojuego.MAYOR) {
				videojuegoMayor = listaVideojuegos[i];
			}

		}

		System.out.println(serieMayor);
		System.out.println(videojuegoMayor);

	}

}
