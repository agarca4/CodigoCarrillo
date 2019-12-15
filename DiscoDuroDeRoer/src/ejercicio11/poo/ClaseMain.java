package ejercicio11.poo;


public class ClaseMain {
	public static void main(String[] args) {
		
		Jugador j1 = new Jugador("Laura");
		Jugador j2 = new Jugador("Belen");
		Jugador j3 = new Jugador("Vicky");
		Jugador j4 = new Jugador("Antonio Coito");
		
		
		Jugador[] jugadores = {j1,j2,j3,j4};
		
		Porra porra = new Porra(jugadores);
		System.out.println(porra);
	
		
		
		
		
		
		
	
		
		

	}

}
