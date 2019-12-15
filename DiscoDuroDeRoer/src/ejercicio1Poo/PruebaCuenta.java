package ejercicio1Poo;

public class PruebaCuenta {
	public static void main(String[] args) {
		
		Cuenta cuenta1 = new Cuenta("Antonio");
		Cuenta cuenta2 = new Cuenta("Mari Cruz", 1000);
		
		//Pruebo los get y set
		System.out.println(cuenta1.getTitular());
		cuenta2.setCantidad(500); 
		
		//Aquí estamos tirando del metodo toString
		System.out.println(cuenta2);
		
		//pruebo los metodos ingresar y retirar
		cuenta1.ingresar(200);
		cuenta2.retirar(400);
		System.out.println(cuenta1);
		System.out.println(cuenta2);
		
		cuenta1.retirar(400);
		System.out.println(cuenta1);
		
	}

}
