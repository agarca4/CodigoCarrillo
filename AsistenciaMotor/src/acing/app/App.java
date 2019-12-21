package acing.app;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import acing.comun.Averia;
import acing.comun.Averiable;
import acing.taller.vehiculos.AveriaImpl;
import acing.taller.vehiculos.PresupuestoImpl;
import acing.taller.vehiculos.TallerImpl;
import acing.taller.vehiculos.Turno;
import acing.taller.vehiculos.VehiculoIngresadoImpl;

public class App {

	
	
	public static void main(String[] args) {

		TallerImpl taller = new TallerImpl();

		Averiable<VehiculoIngresadoImpl> vehiculo1 = new VehiculoIngresadoImpl("audi a3", "blanco");
		Averiable<VehiculoIngresadoImpl> vehiculo2 = new VehiculoIngresadoImpl("seat ibiza", "rojo");
		Averiable<VehiculoIngresadoImpl> vehiculo3 = new VehiculoIngresadoImpl("mercedes slk", "negro");

		taller.ingresar(vehiculo1, "2019-10-08");
		taller.ingresar(vehiculo2, "2019-10-08");
		taller.ingresar(vehiculo3, "2019-10-07");

		Averia<AveriaImpl> averia1 = new AveriaImpl("motor", 2, 4);
		Averia<AveriaImpl> averia2 = new AveriaImpl("direccion", 3, 10);
		Averia<AveriaImpl> averia3 = new AveriaImpl("No arranca", 4, 3);
		Averia<AveriaImpl> averia4 = new AveriaImpl("Trocolas", 15, 3);

		Collection<AveriaImpl> averiasVehiculo1 = new ArrayList<AveriaImpl>();
		averiasVehiculo1.add((AveriaImpl) averia1);
		averiasVehiculo1.add((AveriaImpl) averia2);

		Collection<AveriaImpl> averiasVehiculo2 = new ArrayList<AveriaImpl>();
		averiasVehiculo2.add((AveriaImpl) averia3);

		Collection<AveriaImpl> averiasVehiculo3 = new ArrayList<AveriaImpl>();
		averiasVehiculo3.add((AveriaImpl) averia4);

		vehiculo1.averiarse(averiasVehiculo1);
		vehiculo2.averiarse(averiasVehiculo2);
		vehiculo3.averiarse(averiasVehiculo3);

		taller.diagnosticar(vehiculo1);
		taller.diagnosticar(vehiculo2);
		taller.diagnosticar(vehiculo3);

		taller.comprobarPiezasDisponibles(vehiculo1, false);
		taller.comprobarPiezasDisponibles(vehiculo2, true);
		taller.comprobarPiezasDisponibles(vehiculo3, false);

		PresupuestoImpl presupuesto1 = new PresupuestoImpl();
		PresupuestoImpl presupuesto2 = new PresupuestoImpl();
		PresupuestoImpl presupuesto3 = new PresupuestoImpl();

		presupuesto1.calcularPresupuesto(vehiculo1);
		presupuesto2.calcularPresupuesto(vehiculo2);
		presupuesto3.calcularPresupuesto(vehiculo3);


		System.out.println(taller);
		Turno.ordenarVehiculosIngresados((List<VehiculoIngresadoImpl>)taller.getVehiculosIngresados());
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
