package com.acing;

import com.examen.Product3rdParty;

public class IproductoExterno extends Product3rdParty implements Comerciable {

	public IproductoExterno(String description, double price) {
		super(description, price);
	}

	@Override
	public int compareTo(Comerciable arg0) {
		return getPrecio().compareTo(arg0.getPrecio());	}

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
		return "Producto Externo " + super.toString();
	}



}
