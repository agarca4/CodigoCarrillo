package asistencia.motor;

import java.util.Calendar;
import java.util.Date;

public class Reparación {

	private Date fechaDeReparacion;
	private Date fechaFinGarantia;

	public Date getFechaDeReparacion() {
		return fechaDeReparacion;
	}

	public void setFechaDeReparacion(Date fechaDeReparacion) {
		this.fechaDeReparacion = fechaDeReparacion;
	}

	public Date getFechaFinGarantia() {
		return fechaFinGarantia;
	}

	public void setFechaFinGarantia(Date fechaFinGarantia) {
		this.fechaFinGarantia = fechaFinGarantia;
	}

	public Reparación() {
		Calendar calendar = Calendar.getInstance();
		setFechaDeReparacion(calendar.getTime());
		calendar.setTime(getFechaDeReparacion());
		calendar.add(Calendar.YEAR, 1);
		setFechaFinGarantia(calendar.getTime());

	}

	@Override
	public String toString() {
		return "Fecha De Reparacion: " + getFechaDeReparacion() + ", Fecha Fin De Garantia: " + getFechaFinGarantia();
	}

}
