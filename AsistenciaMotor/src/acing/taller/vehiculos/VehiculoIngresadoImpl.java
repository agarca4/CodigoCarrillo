package acing.taller.vehiculos;

import java.util.Collection;
import java.util.Date;
import acing.comun.Averia;
import acing.comun.Averiable;
import acing.vehiculos.Vehiculo;

public class VehiculoIngresadoImpl extends Vehiculo implements Averiable {

	private Collection<Averia> averias;
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

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public boolean isPiezasDisponibles() {
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

	protected Collection<Averia> getAverias() {
		return averias;
	}

	protected void setAverias(Collection<Averia> averias) {
		this.averias = averias;
	}

	public VehiculoIngresadoImpl(String modelo, String color) {
		super(modelo, color);
	}

	@Override
	public void averiarse(Collection<Averia> averias) {
		setAverias(averias);
	}

	@Override
	public String toString() {
		return super.toString() + " ,ingresado el " + getFechaIngreso() + ", ¿Piezas disponibles? "
				+ isPiezasDisponibles() + " ,necesita para ser reparado: " + getTiempoReparación() + " horas.\n";
	}

}