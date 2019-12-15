package com.app.App;

import java.util.ArrayList;
import java.util.Collection;

import com.acing.Carrito;
import com.acing.Comerciable;
import com.acing.Identificable;
import com.acing.Iproducto;
import com.acing.IproductoExterno;
import com.acing.Marca;

public class App {

	private Carrito carrito;
	private int[] almacen;
	private static final ArrayList<Comerciable> PRODUCTOS = new ArrayList<>();

	protected Carrito getCarrito() {
		return carrito;
	}

	protected int[] getAlmacen() {
		return almacen;
	}

	protected void setAlmacen(int MaxId) {
		almacen = new int[MaxId + 1];
	}

	protected App() {
		this.carrito = new Carrito(PRODUCTOS);

	}

	private static int getMaxId(ArrayList<Identificable> productosAlmacen) {
		int MaxId = 0;

		for (int i = 0; i < productosAlmacen.size(); i++) {

			if (productosAlmacen.get(i).getId() > MaxId) {
				MaxId = productosAlmacen.get(i).getId();

			}

		}

		return MaxId;

	}

	public static void main(String[] args) {

		App app = new App();

		Comerciable p1 = new Iproducto(1, 6.01, "12 latas refresco", new Marca("Coca Cola"));
		Comerciable p2 = new Iproducto(2, 0.72, "Leche Semidesnatada 1 litro", new Marca("President"));
		Comerciable p3 = new Iproducto(5, 1.99, "Dentífrico", new Marca("Oral B"));
		Comerciable p4 = new Iproducto(8, 2.99, "6 botellas 1,5 litro", new Marca("Font Vella"));
		Comerciable p5 = new IproductoExterno("Crime & Punishment", 0.46);

		PRODUCTOS.add(p1);
		PRODUCTOS.add(p2);
		PRODUCTOS.add(p3);
		PRODUCTOS.add(p4);
		PRODUCTOS.add(p5);

		Carrito.getInformeCarrito(app.getCarrito());
		
		
		
		

	}

}
