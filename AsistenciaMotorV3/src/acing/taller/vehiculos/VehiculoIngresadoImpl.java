package acing.taller.vehiculos;

import java.util.Collection;
import java.util.Date;
import acing.comun.Averia;
import acing.comun.Averiable;
import acing.vehiculos.Vehiculo;

public class VehiculoIngresadoImpl extends Vehiculo implements Averiable<VehiculoIngresadoImpl,AveriaImpl> {

	private Collection<AveriaImpl> averias;
	private Date fechaIngreso;
	private Date fechaEgreso;
	private boolean piezasDisponibles;
	private int tiempoReparación;
	private double presupuesto;

	public VehiculoIngresadoImpl(String modelo, String color) {
		super(modelo, color);
	}

	@Override
	public double getPresupuesto() {
		return presupuesto;
	}

	@Override
	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}

	@Override
	public Date getFechaEgreso() {
		return fechaEgreso;
	}

	@Override
	public void setFechaEgreso(Date fechaEgreso) {
		this.fechaEgreso = fechaEgreso;
	}

	@Override
	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	@Override
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public boolean isPiezasDisponibles() {
		return piezasDisponibles;
	}

	@Override
	public void setPiezasDisponibles(boolean piezasDisponibles) {
		this.piezasDisponibles = piezasDisponibles;
	}

	@Override
	public void setTiempoReparación(int tiempoReparación) {
		this.tiempoReparación = tiempoReparación;
	}

	@Override
	public int getTiempoReparación() {
		return tiempoReparación;
	}

	@Override
	public Collection<AveriaImpl> getAverias() {
		return averias;
	}

	@Override
	public void averiarse(Collection<AveriaImpl> averias) {
		this.averias = averias;
	}

	@Override
	public String toString() {
		return super.toString() + " ,ingresado el " + getFechaIngreso() + ", ¿Piezas disponibles? "
				+ isPiezasDisponibles() + " ,necesita para ser reparado: " + getTiempoReparación() + " horas.\n";
	}

}