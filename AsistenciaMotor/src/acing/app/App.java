package acing.app;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import acing.comun.Averia;
import acing.comun.Averiable;
import acing.taller.vehiculos.AveriaImpl;
import acing.taller.vehiculos.PresupuestoImpl;
import acing.taller.vehiculos.TallerImpl;
import acing.taller.vehiculos.TurnoImpl;
import acing.taller.vehiculos.VehiculoIngresadoImpl;


public class App {

	public static void main(String[] args) {

		TallerImpl taller = new TallerImpl();

		Averiable<VehiculoIngresadoImpl> vehiculo1 = new VehiculoIngresadoImpl("audi a3", "blanco");
		Averiable<VehiculoIngresadoImpl> vehiculo2 = new VehiculoIngresadoImpl("seat ibiza", "rojo");

		Calendar.getInstance().set(2112, 11, 4);
		taller.ingresar(vehiculo1, new Date());
		taller.ingresar(vehiculo2, new Date());

		Averia<AveriaImpl> averia1 = new AveriaImpl("motor", 5, 4);
		Averia<AveriaImpl> averia2 = new AveriaImpl("direccion", 3, 10);
		Averia<AveriaImpl> averia3 = new AveriaImpl("No arranca", 6, 3);

		Collection<AveriaImpl> averiasVehiculo1 = new ArrayList<AveriaImpl>();
		averiasVehiculo1.add((AveriaImpl) averia1);
		averiasVehiculo1.add((AveriaImpl) averia2);

		Collection<AveriaImpl> averiasVehiculo2 = new ArrayList<AveriaImpl>();
		averiasVehiculo2.add((AveriaImpl) averia3);

		vehiculo1.averiarse(averiasVehiculo1);
		vehiculo2.averiarse(averiasVehiculo2);

		taller.diagnosticar(vehiculo1);
		taller.diagnosticar(vehiculo2);

		taller.comprobarPiezasDisponibles(vehiculo1, true);
		taller.comprobarPiezasDisponibles(vehiculo2, true);

		PresupuestoImpl presupuesto1 = new PresupuestoImpl();
		PresupuestoImpl presupuesto2 = new PresupuestoImpl();

		presupuesto1.calcularPresupuesto(vehiculo1);
		presupuesto2.calcularPresupuesto(vehiculo2);

		TurnoImpl turno = new TurnoImpl();

		System.out.println(taller);
		turno.ordenarParaTurno(taller.getVehiculosIngresados());
		System.out.println("Vehiculos ordenados para asignarles turno " + taller);

//		taller.reparar(vehiculo1);
//		taller.reparar(vehiculo2);
//
//		taller.egresar(vehiculo1);
//		taller.egresar(vehiculo2);
//
//		System.out.println(taller);

	}

}
