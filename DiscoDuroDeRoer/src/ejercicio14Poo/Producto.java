package ejercicio14Poo;

public class Producto {

	private int id;
	private int cantidadLitros;
	private double precio;
	private String marca;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidadLitros() {
		return cantidadLitros;
	}

	public void setCantidadLitros(int cantidadLitros) {
		this.cantidadLitros = cantidadLitros;
	}

	public double getPrecio() {

		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Producto(int id, int cantidadLitros, double precio, String marca) {
		this.id = id;
		this.cantidadLitros = cantidadLitros;
		this.precio = precio;
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Producto: " + ", getId()=" + getId() + ", getCantidadLitros()=" + getCantidadLitros() + ", getPrecio()="
				+ getPrecio() + ", getMarca()=" + getMarca();
	}

}
