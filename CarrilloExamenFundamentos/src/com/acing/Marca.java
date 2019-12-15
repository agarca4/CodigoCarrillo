package com.acing;

public class Marca {
	
	private String marca;

	protected String getMarca() {
		return marca;
	}

	public Marca(String marca) {
		super();
		this.marca = marca;
	}

	@Override
	public String toString() {
		return getMarca();
	}
	
	

}
