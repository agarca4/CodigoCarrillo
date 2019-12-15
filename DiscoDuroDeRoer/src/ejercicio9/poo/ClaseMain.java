package ejercicio9.poo;

import java.util.ArrayList;

public class ClaseMain {
	public static void main(String[] args) {
		
		
		Pelicula pelicula = new Pelicula("StarWars", 2.2, "George Lucas", 12);
		Cine cine = new Cine(pelicula, 7.5, 3, 3);
		System.out.println(cine);
		
		Espectador espectador1 = new Espectador("Juan", 20, 15);
		Espectador espectador2 = new Espectador("Pepe", 20, 18);
		Espectador espectador3 = new Espectador("Sofia", 30, 25);
		Espectador espectador4 = new Espectador("Pilar", 42, 40);
		
		ArrayList<Espectador> espectadores = new ArrayList<Espectador>();
		espectadores.add(espectador1);
		espectadores.add(espectador2);
		espectadores.add(espectador3);
		espectadores.add(espectador4);
		
		Cine.sentarEspectadores(espectadores, cine);
		
		System.out.println(Cine.estaLleno(cine));
		
		
		
	}

}
