package tienda.carrillo;

public class Dependiente {
	
	private static int turnoActual;




	public static int getTurnoActual() {
		return turnoActual;
	}



	public static void setTurnoActual(int turnoActual) {
		Dependiente.turnoActual = turnoActual;
	}



	public void pasarTurno() {
		turnoActual++;
	}
	
	public void consultaTurnoActual() {
		System.out.println("El turno actual es: " + getTurnoActual());
	}




	

}
