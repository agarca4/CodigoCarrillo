package app.tienda;

public class Tienda {

	public static void main(String[] args) {

		Turno.pasaTurno();
		// System.out.println(Turno.);
		Turno miTurno = Turno.cogerTurno();
		System.out.println(miTurno);
		miTurno = Turno.cogerTurno();
		System.out.println(miTurno);
		miTurno.pasaTurno();
		System.out.println("El turno actual es: " 
				+ miTurno.verValorActual());
		Cliente cliente = new Cliente();
		cliente.pedirTurno();
//		System.out.println("El turno del cliente es: "
//				+ cliente.);

	}

}
