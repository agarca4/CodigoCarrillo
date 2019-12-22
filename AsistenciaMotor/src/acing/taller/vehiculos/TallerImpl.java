package acing.taller.vehiculos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import acing.comun.Averia;
import acing.comun.Averiable;
import acing.comun.Taller;

public class TallerImpl implements Taller {

	public static final int PRECIO_HORA = 50;
	public static final int PRECIO_PIEZA = 10;

	private double precioTotal;

	protected double getPrecioTotal() {
		return precioTotal;
	}

	protected void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	private Collection<VehiculoIngresadoImpl> vehiculosIngresados = new ArrayList<>();

	public Collection<VehiculoIngresadoImpl> getVehiculosIngresados() {
		return vehiculosIngresados;
	}

	protected void setVehiculosIngresados(Collection<VehiculoIngresadoImpl> vehiculosIngresados) {
		this.vehiculosIngresados = vehiculosIngresados;
	}

	@Override
	public <T extends Averiable> void ingresar(T vehiculo, Date fechaIngreso) {
		getVehiculosIngresados().add((VehiculoIngresadoImpl) vehiculo);
		((VehiculoIngresadoImpl) vehiculo).setFechaIngreso(fechaIngreso);
		System.out.println("Su vehiculo ha sido ingresado con fecha " + fechaIngreso + "\n");

	}

	@Override
	public <T extends Averiable> void diagnosticar(T vehiculo) {
		if (((VehiculoIngresadoImpl) vehiculo).getAverias() == null) {
			System.out.println("DIAGNÓSTICO: " + vehiculo + " no está averiado.\n");
			getVehiculosIngresados().remove(vehiculo);

		} else {
			int horasTotalesReparacion = 0;
			for (Averia averia : (((VehiculoIngresadoImpl) vehiculo).getAverias())) {
				horasTotalesReparacion += averia.getNumeroHoras();
			}
			((VehiculoIngresadoImpl) vehiculo).setTiempoReparación(horasTotalesReparacion);
			System.err.println("DIAGNÓSTICO: " + vehiculo + " Tiene las siguientes averias: \n"
					+ ((VehiculoIngresadoImpl) vehiculo).getAverias() + "\n");
		}
	}

	@Override
	public double calcularPresupuesto(Averiable Objeto) {
		if (((VehiculoIngresadoImpl) Objeto).getAverias() != null) {
			double precioPorHorasTrabajadas = 0;
			double precioPorPiezasUsadas = 0;

			for (Averia averia : ((VehiculoIngresadoImpl) Objeto).getAverias()) {
				precioPorHorasTrabajadas += averia.getNumeroHoras() * PRECIO_HORA;
				precioPorPiezasUsadas += averia.getNumeroPiezas() * PRECIO_PIEZA;
			}
			setPrecioTotal(precioPorPiezasUsadas + precioPorHorasTrabajadas);
			System.err.println("PRESUPUESTO: " + getPrecioTotal() + "€ \n");
		} else {
			setPrecioTotal(0.0);
			System.out.println("Su vehiculo no necesita ser presupuestado\n");
		}

		return getPrecioTotal();
	}

	public <T extends Averiable> void comprobarPiezasDisponibles(T vehiculo, boolean hayPiezas) {
		((VehiculoIngresadoImpl) vehiculo).setPiezasDisponibles(hayPiezas);
	}

	@Override
	public <T extends Averiable> void reparar(T vehiculo, Date fechaReparacion) {
		if (((VehiculoIngresadoImpl) vehiculo).getAverias() != null) {
			((VehiculoIngresadoImpl) vehiculo).setAverias(null);
			System.out.println("Su vehiculo ha sido reparado con fecha " + fechaReparacion + "\n");
		} else {
			System.out.println("Su vehiculo no necesita ser reparado.\n");
		}
		if (getVehiculosIngresados().contains(vehiculo)) {
			getVehiculosIngresados().remove(vehiculo);
			((VehiculoIngresadoImpl) vehiculo).setFechaEgreso(fechaReparacion);
		}

	}

	@Override
	public String toString() {
		return "Los vehiculos ingresados en el taller son: \n" + getVehiculosIngresados() + "\n";
	}

}
