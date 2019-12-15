package ejercicio13Poo;


public class Prueba {
	public static void main(String[] args) {

		Producto listaDeProductos[] = new Producto[5];

		listaDeProductos[0] = new Producto("Papel Higienico", 2);
		listaDeProductos[1] = new Perecedero("Huevos", 5, 1);
		listaDeProductos[2] = new Perecedero("Pescado", 20, 2);
		listaDeProductos[3] = new Perecedero("Carne", 30, 5);
		listaDeProductos[4] = new NoPerecedero("Sal", 1, "Condimento");
		
		
		double precioTotal = 0.0;
		for (int i = 0; i < listaDeProductos.length; i++) {
			precioTotal += listaDeProductos[i].calcular(5);
		}
		System.out.println(precioTotal);
		
		
		

	}
}
