package ejercicio4Poo;



public class PruebaElectrodomestico {
	public static void main(String[] args) {

		Electrodomestico[] listaElectrodomesticos = new Electrodomestico[9];

		listaElectrodomesticos[0] = new Electrodomestico();
		listaElectrodomesticos[1] = new Electrodomestico(150, 37);
		listaElectrodomesticos[2] = new Electrodomestico(800, "gris", 'B', 95);
		listaElectrodomesticos[3] = new Lavadora();
		listaElectrodomesticos[4] = new Lavadora(200, 30);
		listaElectrodomesticos[5] = new Lavadora(400, "azul", 'C', 45, 32);
		listaElectrodomesticos[6] = new Television();
		listaElectrodomesticos[7] = new Television(1000, 18);
		listaElectrodomesticos[8] = new Television(1200, "negro", 'A', 18, 1080, true);

		double precioTotalElectrodomesticos = 0;
		double precioTotalLavadoras = 0;
		double precioTotalTelevisiones = 0;

		for (int i = 0; i < listaElectrodomesticos.length; i++) {
			if (listaElectrodomesticos[i] instanceof Lavadora) {
				precioTotalLavadoras += listaElectrodomesticos[i].precioFinal();
			} else if (listaElectrodomesticos[i] instanceof Television) {
				precioTotalTelevisiones += listaElectrodomesticos[i].precioFinal();
			}
			precioTotalElectrodomesticos += listaElectrodomesticos[i].precioFinal();
		}
		
		System.out.println("El precio total de lavadoras es " + precioTotalLavadoras);
		System.out.println("El precio total de televisiones es " + precioTotalTelevisiones);
		System.out.println("El precio total de electrodomesticos es " + precioTotalElectrodomesticos + "\n");
		
		for (int i = 0; i < listaElectrodomesticos.length; i++) {
			System.out.println(listaElectrodomesticos[i]);
			
		}
	}
	
	

}
