package acing.taller.vehiculos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;


import acing.comun.Averiable;
import acing.vehiculos.Vehiculo;

public class VehiculoIngresadoImpl extends Vehiculo implements Averiable<VehiculoIngresadoImpl> {

	private Collection<AveriaImpl> averias;
	private Date fechaIngreso;
	private Date fechaEgreso;
	private boolean piezasDisponibles;
	private int tiempoReparación;

	public Date getFechaEgreso() {
		return fechaEgreso;
	}

	public void setFechaEgreso(Date fechaEgreso) {
		this.fechaEgreso = fechaEgreso;
	}

	protected Date getFechaIngreso() {
		return fechaIngreso;
	}

	protected void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	protected boolean isPiezasDisponibles() {
		return piezasDisponibles;
	}

	protected void setPiezasDisponibles(boolean piezasDisponibles) {
		this.piezasDisponibles = piezasDisponibles;
	}

	public void setTiempoReparación(int tiempoReparación) {
		this.tiempoReparación = tiempoReparación;
	}

	public int getTiempoReparación() {
		return tiempoReparación;
	}

	public Collection<AveriaImpl> getAverias() {
		return averias;
	}

	public void setAverias(Collection<AveriaImpl> averias) {
		this.averias = averias;
	}

	public VehiculoIngresadoImpl(String modelo, String color) {
		super(modelo, color);
	}

	@Override
	public void averiarse(Object averias) {
		setAverias((Collection<AveriaImpl>) averias);
	}

	@Override
	public String toString() {
		return super.toString() + " ,ingresado el " + getFechaIngreso() + ", ¿Piezas disponibles? " + isPiezasDisponibles()
				+ " ,necesita para ser reparado: " + getTiempoReparación() + " horas.\n";
	}
}