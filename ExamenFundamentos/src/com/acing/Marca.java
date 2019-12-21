package com.acing;

public class Marca {

	private String nombreMarca;

	protected String getNombreMarca() {
		return nombreMarca;
	}

	public Marca() {

	}

	public Marca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}

	@Override
	public String toString() {
		return getNombreMarca();
	}

}
