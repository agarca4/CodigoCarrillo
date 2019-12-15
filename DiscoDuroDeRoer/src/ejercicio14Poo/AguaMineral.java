package ejercicio14Poo;

public class AguaMineral extends Producto{
	
	private String origen;

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public AguaMineral(int id, int cantidadLitros, double precio, String marca, String origen) {
		super(id, cantidadLitros, precio, marca);
		this.origen = origen;
	}

	@Override
	public String toString() {
		return "AguaMineral [getOrigen()=" + getOrigen() + ", toString()=" + super.toString();
	}
	
	
	
	

}
