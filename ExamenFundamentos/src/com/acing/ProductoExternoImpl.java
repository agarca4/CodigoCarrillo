package com.acing;

import com.examen.Product3rdParty;

public class ProductoExternoImpl extends Product3rdParty implements Comerciable {

	public ProductoExternoImpl(String description, double price) {
		super(description, price);

	}

	@Override
	public String getDescripcion() {
		return getDescription();
	}

	@Override
	public Double getPrecio() {
		return getPrice();
	}

	@Override
	public String toString() {
		return "PRODUCTO EXTERNO: " + getDescripcion();
	}

}
