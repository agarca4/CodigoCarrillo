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

		Contenido pelicula1 = new Contenido(new Identificador(51), "El Irlandes");
		Contenido cancion1 = new Contenido(new Identificador(1), "Dilailah");
		Contenido cancion2 = new Contenido(new Identificador(27), "Como el agua");
		Contenido cancion3 = new Contenido(new Identificador(14), "Linda");
		Contenido cancion4 = new Contenido(new Identificador(114), "si tu me dices ven");
		Contenido pelicula2 = new Contenido(new Identificador(78), "Star wars");

		ArrayList<Descargable> misDescargas = new ArrayList<Descargable>();
		// Las meto desordenadas, para comprobar que me las ordena luego
		misDescargas.add(new Ifichero(4589.54, pelicula1));
		misDescargas.add(new Ifichero(8.7, cancion1));
		misDescargas.add(new Ifichero(12.5, cancion2));
		misDescargas.add(new Ifichero(5.3, cancion3));
		misDescargas.add(new Ifichero(2.8, cancion4));
		misDescargas.add(new Ifichero(3256.89, pelicula2));
		

		Conexion conexion = new Conexion(2.0);

		descargar(misDescargas, conexion);

	}

	//OJO! el metodo sort, lo tienen la clase CollectionS cuando trabajamos con colecciones, y la clase Arrays, si vamos 
	//a trabajar con arrays. Ese metodo sort va a tirar y utilizar el metodo comareTo o el compare, segun hayamos 
	//implementado la Interfaz Comparable o Comparator. De hecho, el metodo sort esta sobrecargado y te permite 1 o 2
	//argumentos. 1 si usas comparable (pasandole solo la lista que quieras ordenar, con respecto al criterio que 
	//hayas establecido en el compareTo de Comparable),
	//y 2 argumentos si vas a usar el comparator, puesto que uno será la propia lista, y el otro el objeto comparador que
	//funcionará segun hayas implementado el metodo compare de la interfaz comarator
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
