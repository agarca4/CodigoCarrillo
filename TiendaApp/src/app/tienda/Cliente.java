package app.tienda;

public class Cliente {
	private Turno turno;

	public void pedirTurno() {
		turno = Turno.cogerTurno();
		
		
		
	}

	@Override
	public String toString() {
		return "Cliente [turno=" + turno + "]";
	}
	
	

}
