package acing.taller.vehiculos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

import acing.comun.Averia;
import acing.comun.Averiable;
import acing.comun.Taller;

public class TallerImpl implements Taller<Averiable<VehiculoIngresadoImpl>> {

	private Collection<VehiculoIngresadoImpl> vehiculosIngresados = new ArrayList<VehiculoIngresadoImpl>();

	public Collection<VehiculoIngresadoImpl> getVehiculosIngresados() {
		return vehiculosIngresados;
	}

	protected void setVehiculosIngresados(Collection<VehiculoIngresadoImpl> vehiculosIngresados) {
		this.vehiculosIngresados = vehiculosIngresados;
	}

	@Override
	public void ingresar(Averiable<VehiculoIngresadoImpl> vehiculo, Date fechaIngreso) {
		getVehiculosIngresados().add((VehiculoIngresadoImpl) vehiculo);
		((VehiculoIngresadoImpl) vehiculo).setFechaIngreso(fechaIngreso);

	}

	@Override
	public void diagnosticar(Averiable<VehiculoIngresadoImpl> vehiculo) {
		if (((VehiculoIngresadoImpl) vehiculo).getAverias() == null) {
			System.out.println(vehiculo + " no está averiado.\n");
			getVehiculosIngresados().remove(vehiculo);

		} else {
			int horasTotalesReparacion = 0;
			for (Averia<AveriaImpl> averia : ((VehiculoIngresadoImpl) vehiculo).getAverias()) {
				horasTotalesReparacion += averia.getNumeroHoras();
			}
			((VehiculoIngresadoImpl) vehiculo).setTiempoReparación(horasTotalesReparacion);
			System.err.println(vehiculo + " Tiene las siguientes averias: \n"
					+ ((VehiculoIngresadoImpl) vehiculo).getAverias() + "\n");
		}
	}

	public void comprobarPiezasDisponibles(Averiable<VehiculoIngresadoImpl> vehiculo, boolean hayPiezas) {
		((VehiculoIngresadoImpl) vehiculo).setPiezasDisponibles(hayPiezas);
	}



	@Override
	public void reparar(Averiable<VehiculoIngresadoImpl> vehiculo) {
		if (((VehiculoIngresadoImpl) vehiculo).getAverias() != null) {
			((VehiculoIngresadoImpl) vehiculo).setAverias(null);
			System.out.println("Su vehiculo ha sido reparado.\n");
		} else {
			System.out.println("Su vehiculo no necesita ser reparado.\n");
		}

	}

	@Override
	public void egresar(Averiable<VehiculoIngresadoImpl> vehiculo, Date fechaEgreso) {
		if (getVehiculosIngresados().contains(vehiculo)) {
			getVehiculosIngresados().remove(vehiculo);
			((VehiculoIngresadoImpl)vehiculo).setFechaEgreso(fechaEgreso);
		}

	}

	@Override
	public String toString() {
		return "Los vehiculos ingresados en el taller son: \n" + getVehiculosIngresados() + "\n";
	}


}
