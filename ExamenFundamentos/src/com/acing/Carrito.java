package com.acing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Carrito {

	private Collection<Comerciable> productosEnCarrito;

	protected Collection<Comerciable> getProductosEnCarrito() {
		return productosEnCarrito;
	}

	public Carrito() {
		this.productosEnCarrito = new ArrayList<Comerciable>();
	}

	public boolean addProducto(Comerciable producto) {
		return getProductosEnCarrito().add(producto);
	}

	public Double getValorCarrito() {
		Double precioTotalCarrito = 0.0;
		for (Comerciable comerciable : getProductosEnCarrito()) {
			precioTotalCarrito += comerciable.getPrecio();
		}
		return precioTotalCarrito;
	}

	public String getInformeCarrito() {

		String informe = "";
		Comparator<Comerciable> COMPARADOR_PRECIO = (o1, o2) -> o1.getPrecio().compareTo(o2.getPrecio());
		((List<Comerciable>) getProductosEnCarrito()).sort(COMPARADOR_PRECIO);
		for (Comerciable comerciable : getProductosEnCarrito()) {
			informe += comerciable.toString() + " " + comerciable.getPrecio() + "€\n";
		}
		informe = informe + "\tPrecio total del carrito " + this.getValorCarrito() + " €\n";
		System.out.println(informe);
		return informe;

	}

	@Override
	public String toString() {
		return "El carrito contiene " + getProductosEnCarrito();
	}

}
