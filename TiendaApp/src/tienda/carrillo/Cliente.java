package tienda.carrillo;

public class Cliente {
	
	private int turnoAsignado;
	private static int contador;
	

	public int getTurnoAsignado() {
		return turnoAsignado;
	}

	public void setTurnoAsignado(int turnoAsignado) {
		this.turnoAsignado = turnoAsignado;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Cliente.contador = contador;
	}

	public void cogerTurno(){
		contador++;
		setContador(contador);
		setTurnoAsignado(getContador());
		
		
	}
	
	public void consultarTurnoActual() {
		System.out.println("El turno actual es: " 
				+ Dependiente.getTurnoActual());
	}

	@Override
	public String toString() {
		return "Cliente [getTurnoAsignado()=" + getTurnoAsignado() + "]";
	}
	
	
	

}
