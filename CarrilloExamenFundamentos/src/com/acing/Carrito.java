package com.acing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Carrito {

	private ArrayList<Comerciable> productos = new ArrayList<>();

	protected ArrayList<Comerciable> getProductos() {
		return productos;
	}

	public Carrito(ArrayList<Comerciable> productos) {
		super();
		this.productos = productos;
	}

	public boolean addProducto(Comerciable producto) {
		return getProductos().add((Iproducto) producto);
	}

	public static boolean consultarProducto(Carrito carrito, Comerciable productoAbuscar) {
		return carrito.productos.contains(productoAbuscar);
	}

	public static void getValorCarrito(Carrito carrito) {
		Double valorCarrito = 0.0;

		for (int i = 0; i < carrito.getProductos().size(); i++) {
			valorCarrito += carrito.getProductos().get(i).getPrecio();
		}
		System.out.println("El valor del carrito es: " + valorCarrito + "€");
	}

	public static String getInformeCarrito(Carrito carrito) {

		String informe = "";

		Collections.sort(carrito.getProductos());
		for (int i = 0; i < carrito.getProductos().size(); i++) {

			informe += carrito.getProductos().get(i).getDescripcion() + " - "
					+ carrito.getProductos().get(i).getPrecio() + "\n";

		}

		System.out.println(informe);
		System.out.print("\t");
		getValorCarrito(carrito);
		return informe;

	}

	@Override
	public String toString() {
		return "Carrito: " + getProductos();
	}

}
