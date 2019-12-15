package tienda.carrillo;


public class TiendaPrueba {
	public static void main(String[] args) {
		
		Dependiente lanchas = new Dependiente();
		Cliente antonio = new Cliente();
		Cliente porras = new Cliente();		
		
		antonio.cogerTurno();
		System.out.println(antonio);
		porras.cogerTurno();
		System.out.println(porras);
		antonio.consultarTurnoActual();
		porras.consultarTurnoActual();
		
		lanchas.pasarTurno();
		lanchas.consultaTurnoActual();
		antonio.consultarTurnoActual();
		
		//al cliente porras se le va la olla y empieza a coger turnos
		porras.cogerTurno();
		porras.cogerTurno();
		porras.cogerTurno();
		
		//¿que turno tendrá el gilipollas de porras?
		System.out.println(porras);
		
		//¿Cual será el turno actual?. lo van a comprobar los 3 actores. Deben coincidir...
		porras.consultarTurnoActual();
		antonio.consultarTurnoActual();
		lanchas.consultaTurnoActual();
		
		//lanchas pasa turno dos veces y vuelvo a comprobar el turno actual y que los turnos de los clientes no cambian
		//porque no han cogido mas turnos
		lanchas.pasarTurno();
		lanchas.pasarTurno();
		porras.consultarTurnoActual();
		antonio.consultarTurnoActual();
		lanchas.consultaTurnoActual();
		System.out.println(porras);
		System.out.println(antonio);
		
		
		

		
		
		
		
	}
	
	

	
}
