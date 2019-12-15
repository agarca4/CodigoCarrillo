package ejercicio14Poo;


public class Prueba {
	public static void main(String[] args) {

		Almacen puntalon = new Almacen(2, 3);

		Producto vino = new Producto(45, 1, 2, "Don Simon");
		Producto cerveza = new Producto(30, 1, .50, "Alhambra");
		AguaMineral agua1 = new AguaMineral(50, 1, 2, "FontBella", "Cataluña");
		AguaMineral agua2 = new AguaMineral(25, 5, 2.33, "Lanjaron", "Granada");
		BebidaAzucarada refresco1 = new BebidaAzucarada(55, 2, 3, "Cocacola", 40, true);
		BebidaAzucarada refresco2 = new BebidaAzucarada(60, 2, 2.5, "Casera", 20, false);


		puntalon.agregarProducto(vino);
		puntalon.agregarProducto(refresco2);
		puntalon.mostrarInformacionProductos();
		System.out.println("");
		
		puntalon.eliminarProducto(60);
		puntalon.mostrarInformacionProductos();
		System.out.println("");
		
		puntalon.agregarProducto(refresco1);
		puntalon.agregarProducto(agua1);
		System.out.println(puntalon.calcularPrecioTotalProductos());
		System.out.println("");
		
		System.out.println(puntalon.calcularPrecioTotalMarca("Cocacola"));
		System.out.println("");
		
		
		puntalon.eliminarProducto(45);
		puntalon.eliminarProducto(55);
		puntalon.eliminarProducto(50);
		puntalon.mostrarInformacionProductos();
		
		puntalon.agregarProducto(vino);
		puntalon.agregarProducto(cerveza);
		puntalon.agregarProducto(agua1);
		puntalon.agregarProducto(agua2);
		puntalon.agregarProducto(refresco1);
		puntalon.agregarProducto(refresco2);
		puntalon.mostrarInformacionProductos();
		System.out.println("");
		
		System.out.println(puntalon.calcularPrecioTotalColumna(0));
		System.out.println(puntalon.calcularPrecioTotalMarca("Lanjaron"));
		System.out.println(puntalon.calcularPrecioTotalProductos());


		
		
		
		

		
	}

}
