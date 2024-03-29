package ejercicio13Poo;

public class NoPerecedero extends Producto{
	
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public NoPerecedero() {
		super();
	}

	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}
	

	public double calcular(int cantidadDeProductos) {
		return super.calcular(cantidadDeProductos);
	}

	@Override
	public String toString() {
		return "NoPerecedero [getTipo()=" + getTipo() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + "]";
	}

	
}
