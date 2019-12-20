package acing.vehiculos;

import java.util.Collection;
import acing.comun.Averia;
import acing.comun.Averiable;
import acing.taller.vehiculos.AveriaVehiculosImpl;

public class Vehiculo implements Averiable<Vehiculo, Averia<AveriaVehiculosImpl>> {

	protected String modelo;
	private String color;
	protected Collection<Averia<AveriaVehiculosImpl>> averias;

	public Collection<Averia<AveriaVehiculosImpl>> getAverias() {
		return averias;
	}

	public void setAverias(Collection<Averia<AveriaVehiculosImpl>> averias) {
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
	public void averiarse(Collection<Averia<AveriaVehiculosImpl>> averias) {
		setAverias(averias);
	}

	@Override
	public String toString() {
		return getModelo() + " de color " + getColor();
	}

}