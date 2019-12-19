package acing.taller.vehiculos;

import java.util.ArrayList;
import java.util.Collection;

import acing.comun.Averiable;
import acing.comun.Taller;
import acing.vehiculos.Vehiculo;

public class TallerVehiculosImpl implements Taller<Averiable<Vehiculo>> {

	private Collection<Vehiculo> vehiculosIngresados;

	protected Collection<Vehiculo> getVehiculosIngresados() {
		return vehiculosIngresados;
	}

	public TallerVehiculosImpl() {
		this.vehiculosIngresados = new ArrayList<Vehiculo>();
	}

	@Override
	public void ingresar(Averiable<Vehiculo> vehiculo) {
		vehiculosIngresados.add((Vehiculo) vehiculo);

	}

	@Override
	public void diagnosticar(Averiable<Vehiculo> vehiculo) {
		if (((Vehiculo) vehiculo).getAverias() == null) {
			System.out.println(vehiculo + " no está averiado.\n");
		} else {
			System.err.println(
					vehiculo + " tiene las siguientes averias: \n" + ((Vehiculo) vehiculo).getAverias() + "\n");
		}

	}

	@Override
	public void reparar(Averiable<Vehiculo> vehiculo) {
		if (((Vehiculo) vehiculo).getAverias() != null) {
			((Vehiculo) vehiculo).setAverias(null);
			System.out.println(vehiculo + " ha sido reparado.\n");
		} else {
			System.out.println(vehiculo + " no necesita ser reparado.\n");
		}

	}

	@Override
	public void egresar(Averiable<Vehiculo> vehiculo) {
		if (getVehiculosIngresados().contains(vehiculo)) {
			getVehiculosIngresados().remove(vehiculo);
		}

	}

	@Override
	public String toString() {
		return "Los vehiculos ingresados en el taller son: \n" + getVehiculosIngresados() + "\n";
	}

}
