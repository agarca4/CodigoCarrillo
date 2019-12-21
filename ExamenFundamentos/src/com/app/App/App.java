package com.app.App;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.acing.Carrito;
import com.acing.Comerciable;
import com.acing.Identificable;
import com.acing.Marca;
import com.acing.ProductoExternoImpl;
import com.acing.ProductoImpl;

public class App {

	private Carrito miCarrito;
	private static final Collection<ProductoImpl> PRODUCTOS = new ArrayList<>();
	private int[] almacen;

	protected int[] getAlmacen() {
		return almacen;
	}

	protected Carrito getMiCarrito() {
		return miCarrito;
	}

	public App() {
		miCarrito = new Carrito();
	}

	private void setAlmacenTamannoAdecuado(int idMax) {
		this.almacen = new int[idMax + 1];
	}

	private static int getMaximoId(Collection<? extends Identificable> identificables) {

		Comparator<Identificable> COMPARADOR_POR_ID = (o1, o2) -> -Integer.compare(o1.getId(), o2.getId());
		Collections.sort(((List<? extends Identificable>) identificables), COMPARADOR_POR_ID);
		int maxId = ((List<? extends Identificable>) identificables).get(0).getId();
		return maxId;

	}

	public static void main(String[] args) {

		App miApp = new App();

		ProductoImpl p1 = new ProductoImpl(new Marca("Coca Cola"), "12 latas Refresco", 1, 6.01);
		ProductoImpl p2 = new ProductoImpl(new Marca("President"), "Leche Semidesnatada 1 litro", 2, 0.72);
		ProductoImpl p3 = new ProductoImpl(new Marca("Oral B"), "Dentifrico", 5, 1.99);
		Comerciable p4 = new ProductoExternoImpl("Crime & Punishment", 0.46);
		ProductoImpl p5 = new ProductoImpl(new Marca("Font Vella"), "6 botellas 1,5 litro", 8, 2.99);

		miApp.getMiCarrito().addProducto(p1);
		miApp.getMiCarrito().addProducto(p2);
		miApp.getMiCarrito().addProducto(p3);
		miApp.getMiCarrito().addProducto(p4);

		miApp.getMiCarrito().getInformeCarrito();

		PRODUCTOS.add(p1);
		PRODUCTOS.add(p2);
		PRODUCTOS.add(p3);
		PRODUCTOS.add(p5);

		miApp.setAlmacenTamannoAdecuado(getMaximoId(PRODUCTOS));

		miApp.getAlmacen()[1] = 8;
		miApp.getAlmacen()[2] = 3;
		miApp.getAlmacen()[5] = 0;
		miApp.getAlmacen()[8] = 1;
		
		System.out.println(Arrays.toString(miApp.getAlmacen()));

	}

}
