package ejercicio12Poo;

public class Juego {

	public static final int NUM_MAX_JUGADORES = 6;
	public static final int NUM_MIN_JUGADORES = 2;

	private Jugador[] jugadores;
	private Revolver revolver;

	public Juego() {
		jugadores = new Jugador[Metodos.generaNumeroAleatorio(NUM_MIN_JUGADORES, NUM_MAX_JUGADORES)];
		crearJugadores();
		this.revolver = new Revolver();

	}

	public void crearJugadores() { 
		for (int i = 0; i < jugadores.length ; i++) {
			jugadores[i] = new Jugador(i + 1);
		}
	}

	public boolean finDelJuego() {
		for (int i = 0; i < jugadores.length; i++) {
			if (!jugadores[i].isVivo()) {
				return true;
			}
		}
		return false;
	}
	
	public void ronda() {
		for (int i = 0; i < jugadores.length && jugadores[i].isVivo(); i++) {
			jugadores[i].disparar(this.revolver);
			if (!jugadores[i].isVivo()) {
				System.out.println("Fin del juego");
				break;
			}else {
				System.out.println("El juego continua");
				
			}
		}
	}

}
