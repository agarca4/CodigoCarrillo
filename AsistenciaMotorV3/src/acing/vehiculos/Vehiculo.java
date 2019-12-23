package acing.vehiculos;


public class Vehiculo{

	protected String modelo;
	private String color;
	

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
	public String toString() {
		return getModelo().toUpperCase() + " de color " + getColor();
	}

}