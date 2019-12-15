package app.descargas.web.carrillo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import back.descargas.web.carrillo.Contenido;
import back.descargas.web.carrillo.Descargable;
import back.descargas.web.carrillo.Ifichero;
import back.descargas.web.carrillo.Identificador;

public class App {

	public static void main(String[] args) {

		Contenido pelicula1 = new Contenido(new Identificador("051"), "El Irlandes");
		Contenido cancion1 = new Contenido(new Identificador("001"), "Dilailah");

		ArrayList<Descargable> misDescargas = new ArrayList<Descargable>();
		// Las meto desordenadas, para comprobar que me las ordena luego
		misDescargas.add(new Ifichero(4589.54, pelicula1));
		misDescargas.add(new Ifichero(8.7, cancion1));

		Conexion conexion = new Conexion(2.0);

		descargar(misDescargas, conexion);

	}

	public static void ordenarLista(ArrayList<Descargable> miLista) {
		// He implementado Comparable en Ifichero, con su metodo compareTo
		Collections.sort(miLista);
	}

	public static void descargar(ArrayList<Descargable> misDescargas, Conexion conexion) {
		// antes de descarga, ordeno mi lista para mostrarla ordenanda
		ordenarLista(misDescargas);
		Double tamanoTotal = 0.0;

		for (int i = 0; i < misDescargas.size(); i++) {
			tamanoTotal += misDescargas.get(i).getTamano();
		}

		//casteo el Double a long, xq TimeUnit trabaja con long
		long tiempoTotal = (long) (tamanoTotal / conexion.getVelocidad());

		long horas = TimeUnit.SECONDS.toHours(tiempoTotal);
		long minutos = TimeUnit.SECONDS.toMinutes(tiempoTotal) - TimeUnit.HOURS.toMinutes(horas);
		long segundos = TimeUnit.SECONDS.toSeconds(tiempoTotal) - TimeUnit.HOURS.toSeconds(horas)
				- TimeUnit.MINUTES.toSeconds(minutos);

		System.out.println("Informe: " + misDescargas + "\n");
		System.out.println("Tamaño total de la descarga: " + tamanoTotal + "Mb.\n");
		System.out.println(
				"Con su conexión actual (" + conexion.getVelocidad() + " Mb/s), el tiempo estimado de descarga es: "
						+ horas + " horas, " + minutos + " minutos, " + segundos + " segundos.");

	}

}
