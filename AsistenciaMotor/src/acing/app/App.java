package acing.app;

import java.util.ArrayList;
import java.util.Collection;

import acing.comun.Averia;
import acing.comun.Averiable;
import acing.taller.vehiculos.AveriaVehiculosImpl;
import acing.taller.vehiculos.PresupuestoVehiculosImpl;
import acing.taller.vehiculos.TallerVehiculosImpl;
import acing.vehiculos.Coche;
import acing.vehiculos.Moto;
import acing.vehiculos.Vehiculo;

public class App {

	public static void main(String[] args) {

		Averiable<Vehiculo, Averia<AveriaVehiculosImpl>> v1 = new Vehiculo("audi", "blanco");
		Averiable<Vehiculo, Averia<AveriaVehiculosImpl>> c1 = new Coche("seat", "azul", "7575ljk");
		Averiable<Vehiculo, Averia<AveriaVehiculosImpl>> m1 = new Moto("yamaha", "roja");

		TallerVehiculosImpl taller = new TallerVehiculosImpl();

		AveriaVehiculosImpl av1 = new AveriaVehiculosImpl("motor", 5, 4);
		AveriaVehiculosImpl av2 = new AveriaVehiculosImpl("direccion", 3, 10);

		Collection<Averia<AveriaVehiculosImpl>> averias = new ArrayList<Averia<AveriaVehiculosImpl>>();
		averias.add(av1);
		averias.add(av2);

		v1.averiarse(averias);

		taller.ingresar(v1);
		taller.ingresar(c1);

		System.out.println(taller);

		taller.diagnosticar(v1);
		taller.diagnosticar(c1);

		PresupuestoVehiculosImpl presupuesto1 = new PresupuestoVehiculosImpl();
		presupuesto1.calcularPresupuesto(v1);
		presupuesto1.calcularPresupuesto(c1);

		taller.reparar(v1);
		taller.reparar(c1);

		taller.egresar(v1);
		taller.egresar(c1);
		taller.egresar(m1);

		System.out.println(taller);

	}

}
