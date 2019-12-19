package acing.vehiculos;


import java.util.Collection;
import acing.comun.Averiable;
import acing.taller.vehiculos.AveriaVehiculosImpl;

public class Vehiculo implements Averiable<Vehiculo>{

	protected String modelo;
	private String color;
	protected Collection<AveriaVehiculosImpl> averias;
	
	

	public Collection<AveriaVehiculosImpl> getAverias() {
		return averias;
	}

	public void setAverias(Collection<AveriaVehiculosImpl> averias) {
		this.averias = averias;
	}

	public Vehiculo() {
	}

	public Vehiculo(String modelo, String color) {
		this.modelo = modelo;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public void averiarse() {
		setAverias(averias);	
	}

	@Override
	public String toString() {
		return  getModelo() + " de color " + getColor();
	}


}