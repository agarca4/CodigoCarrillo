package acing.app;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import acing.comun.Averia;
import acing.comun.Averiable;
import acing.taller.vehiculos.AveriaImpl;
import acing.taller.vehiculos.TallerImpl;
import acing.taller.vehiculos.Turno;
import acing.taller.vehiculos.VehiculoIngresadoImpl;

public class App {

	public static void main(String[] args) {

		TallerImpl taller = new TallerImpl();

		Averiable vehiculo1 = new VehiculoIngresadoImpl<Averiable>("audi a3", "blanco");
		Averiable vehiculo2 = new VehiculoIngresadoImpl<Averiable>("seat ibiza", "rojo");
		Averiable vehiculo3 = new VehiculoIngresadoImpl<Averiable>("mercedes slk", "negro");

		taller.ingresar(vehiculo1, Calendar.getInstance().getTime());
		taller.ingresar(vehiculo2, Calendar.getInstance().getTime());
		taller.ingresar(vehiculo3, Calendar.getInstance().getTime());

		Averia averia1 = new AveriaImpl<Averia>("motor", 2, 4);
		Averia averia2 = new AveriaImpl<Averia>("direccion", 3, 10);
		Averia averia3 = new AveriaImpl<Averia>("No arranca", 4, 3);
		Averia averia4 = new AveriaImpl<Averia>("Trocolas", 15, 3);

		Collection<Averia> averiasVehiculo1 = new ArrayList<Averia>();
		averiasVehiculo1.add(averia1);
		averiasVehiculo1.add(averia2);

		Collection<Averia> averiasVehiculo2 = new ArrayList<Averia>();
		averiasVehiculo2.add(averia3);

		Collection<Averia> averiasVehiculo3 = new ArrayList<Averia>();
		averiasVehiculo3.add(averia4);

		vehiculo1.averiarse(averiasVehiculo1);
		vehiculo2.averiarse(averiasVehiculo2);
		vehiculo3.averiarse(averiasVehiculo3);

		taller.diagnosticar(vehiculo1);
		taller.diagnosticar(vehiculo2);
		taller.diagnosticar(vehiculo3);

		taller.comprobarPiezasDisponibles(vehiculo1, false);
		taller.comprobarPiezasDisponibles(vehiculo2, true);
		taller.comprobarPiezasDisponibles(vehiculo3, false);

		taller.calcularPresupuesto(vehiculo1);
		taller.calcularPresupuesto(vehiculo2);
		taller.calcularPresupuesto(vehiculo3);

		System.out.println(taller);
		Turno.ordenarVehiculosIngresados((List<Averiable>) taller.getVehiculosIngresados());
		System.out.println("Ya ordenados: " + taller);

		taller.reparar(vehiculo2, Calendar.getInstance().getTime());

		System.out.println(taller);

	}

}
