package asistencia.motor;

public class ClaseDePrueba {

	public static void main(String[] args) {

		Coche coche1 = new Coche("blanco", "mazda", "7572 HCH");
		Moto moto1 = new Moto("negra", "suzuki");
		Vehiculo vehiculo1 = new Vehiculo("azul", "renault");

		Taller.ingresarVehiculo(coche1);
		Taller.ingresarVehiculo(moto1);
		Taller.ingresarVehiculo(vehiculo1);

		Taller.diagnosticar(coche1);
		Taller.diagnosticar(moto1);
		Taller.diagnosticar(vehiculo1);

		Turno.darTurno(Taller.getVehiculosIngresados());

		Turno.verTurnoActual();

		Taller.reparar(coche1);

		Turno.pasarTurno();
		Turno.verTurnoActual();

		Taller.reparar(moto1);

		Turno.pasarTurno();
		Turno.verTurnoActual();

		Taller.reparar(vehiculo1);

		System.out.println(Taller.getVehiculosIngresados());

		Taller.ingresarVehiculo(moto1);
		Taller.diagnosticarDeGarantia(moto1);
		Turno.darTurno(Taller.getVehiculosIngresados());
		Turno.pasarTurno();
		Turno.verTurnoActual();
		Taller.repararConGarantia(moto1);

		System.out.println(Taller.getVehiculosIngresados());

	}

}
