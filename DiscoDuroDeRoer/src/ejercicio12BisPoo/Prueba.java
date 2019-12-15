package ejercicio12BisPoo;



public class Prueba {
	public static void main(String[] args) {
		
		Comercial c1 = new Comercial("Juan", 38, 1000, 500);
		Comercial c2 = new Comercial("Pepe", 29, 1000, 300);
		
		Repartidor r1 = new Repartidor("Antonio", 22, 450, "zona 3");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(r1);
		
		
		c1.plus();
		c2.plus();
		r1.plus();
		
		
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(r1);
		
	}

}
