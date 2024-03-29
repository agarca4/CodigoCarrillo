package acing.taller.vehiculos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import acing.comun.Taller;

public class TallerImpl implements Taller<VehiculoIngresadoImpl> {

	public static final int PRECIO_HORA = 50;
	public static final int PRECIO_PIEZA = 10;
	public static final int ANIOS_GARANTIA = 1;

	private Collection<VehiculoIngresadoImpl> vehiculosIngresados = new ArrayList<>();

	public Collection<VehiculoIngresadoImpl> getVehiculosIngresados() {
		return vehiculosIngresados;
	}

	protected void setVehiculosIngresados(Collection<VehiculoIngresadoImpl> vehiculosIngresados) {
		this.vehiculosIngresados = vehiculosIngresados;
	}

	@Override
	public void ingresar(VehiculoIngresadoImpl vehiculo, Date fechaIngreso) {
		getVehiculosIngresados().add(vehiculo);
		vehiculo.setFechaIngreso(fechaIngreso);
		System.out.println("Su vehiculo ha sido ingresado con fecha " + fechaIngreso + "\n");

	}

	@Override
	public void diagnosticar(VehiculoIngresadoImpl vehiculo) {
		if (vehiculo.getAverias() == null) {
			System.out.println("***************************************************\nDIAGNÓSTICO: " + vehiculo
					+ " no está averiado.\n***************************************************\\n");
			getVehiculosIngresados().remove(vehiculo);

		} else {
			int horasTotalesReparacion = 0;
			for (AveriaImpl averia : vehiculo.getAverias()) {
				horasTotalesReparacion += averia.getNumeroHoras();
			}
			vehiculo.setTiempoReparación(horasTotalesReparacion);
			System.err.println("***************************************************\nDIAGNÓSTICO: " + vehiculo
					+ " Tiene las siguientes averias: \n" + vehiculo.getAverias()
					+ "\n***************************************************\n");
		}
	}

	@Override
	public double calcularPresupuesto(VehiculoIngresadoImpl vehiculo) {
		if (vehiculo.getAverias() != null) {
			double precioPorHorasTrabajadas = 0;
			double precioPorPiezasUsadas = 0;

			for (AveriaImpl averia : vehiculo.getAverias()) {
				precioPorHorasTrabajadas += averia.getNumeroHoras() * PRECIO_HORA;
				precioPorPiezasUsadas += averia.getNumeroPiezas() * PRECIO_PIEZA;
			}
			vehiculo.setPresupuesto(precioPorPiezasUsadas + precioPorHorasTrabajadas);
			System.out.println("***** PRESUPUESTO: " + vehiculo.getPresupuesto() + "€ *****\n");
		} else {
			vehiculo.setPresupuesto(0.0);
			System.out.println("Su vehiculo no necesita ser presupuestado\n");
		}

		return vehiculo.getPresupuesto();
	}

	public <T extends VehiculoIngresadoImpl> void comprobarPiezasDisponibles(T vehiculo, boolean hayPiezas) {
		vehiculo.setPiezasDisponibles(hayPiezas);
	}

	@Override
	public void reparar(VehiculoIngresadoImpl vehiculo, Date fechaReparacion) {
		if (vehiculo.getAverias() != null) {
			vehiculo.averiarse(null);
			System.out.println("Su vehiculo ha sido reparado con fecha " + fechaReparacion + "\n");
		} else {
			System.out.println("Su vehiculo no necesita ser reparado.\n");
		}
		if (getVehiculosIngresados().contains(vehiculo)) {
			getVehiculosIngresados().remove(vehiculo);
			vehiculo.setFechaEgreso(fechaReparacion);
		}

	}

	public boolean comprobarGarantia(VehiculoIngresadoImpl vehiculo, Date fechaReIngreso) {

		boolean isGarantiaVigor = false;

		Calendar firstCal = GregorianCalendar.getInstance();
		Calendar secondCal = GregorianCalendar.getInstance();

		firstCal.setTime(vehiculo.getFechaEgreso());
		secondCal.setTime(fechaReIngreso);

		secondCal.add(Calendar.DAY_OF_YEAR, 1 - firstCal.get(Calendar.DAY_OF_YEAR));

		if (secondCal.get(Calendar.YEAR) - firstCal.get(Calendar.YEAR) <= 1) {
			isGarantiaVigor = true;
			System.out.println("El vehiculo está en garantia.\n");
		} else {
			System.out.println("La garantia del vehiculo ha expirado.\n");
		}

		return isGarantiaVigor;
	}

	@Override
	public String toString() {
		return "Los vehiculos ingresados en el taller son: \n" + getVehiculosIngresados() + "\n";
	}

}
