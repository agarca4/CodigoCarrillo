package asistencia.motor;

import java.util.Date;

public  class Vehiculo {

	protected String modelo;
	protected String color;
	protected Date fechaDeIngresoEnTaller;
	protected Date fechaUltimaReparacion;
	protected Date fechaExpiracionGarantia;
	protected Averia[] averias;
	protected Averia[] averiasAntiguas;
	protected int valorDelTurnoAsignado;
	protected boolean piezasDisponibles;
	protected int puntosParaTurno;

	public int getPuntosParaTurno() {
		return puntosParaTurno;
	}

	public void setPuntosParaTurno(int puntosParaTurno) {
		this.puntosParaTurno = puntosParaTurno;
	}

	public boolean isPiezasDisponibles() {
		return piezasDisponibles;
	}

	public void setPiezasDisponibles(boolean piezasDisponibles) {
		this.piezasDisponibles = piezasDisponibles;
	}

	public int getValorDelTurnoAsignado() {
		return valorDelTurnoAsignado;
	}

	public void setValorDelTurnoAsignado(int valorDelTurnoAsignado) {
		this.valorDelTurnoAsignado = valorDelTurnoAsignado;
	}

	public Averia[] getAveriasAntiguas() {
		return averiasAntiguas;
	}

	public void setAveriasAntiguas(Averia[] averiasAntiguas) {
		this.averiasAntiguas = averiasAntiguas;
	}

	public Date getFechaExpiracionGarantia() {
		return fechaExpiracionGarantia;
	}

	public void setFechaExpiracionGarantia(Date fechaExpiracionGarantia) {
		this.fechaExpiracionGarantia = fechaExpiracionGarantia;
	}

	public Averia[] getAverias() {
		return averias;
	}

	public void setAverias(Averia[] averias) {
		this.averias = averias;
	}

	public Date getFechaUltimaReparacion() {
		return fechaUltimaReparacion;
	}

	public void setFechaUltimaReparacion(Date fechaReparacion) {
		this.fechaUltimaReparacion = fechaReparacion;
	}

	public Vehiculo() {
	}

	public Vehiculo(String color) {
		setColor(color);
	}

	public Vehiculo(String color, String modelo) {
		this(color);
		this.modelo = modelo;

	}

	public Date getFechaDeIngresoEnTaller() {
		return fechaDeIngresoEnTaller;
	}

	public void setFechaDeIngresoEnTaller(Date fechaDeIngresoEnTaller) {
		this.fechaDeIngresoEnTaller = fechaDeIngresoEnTaller;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}



	@Override
	public String toString() {
		return  modelo + " , " + getColor() + " , fecha de ingreso "
				+ getFechaDeIngresoEnTaller();
	}
	

}