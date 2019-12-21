package com.acing;

public class ProductoImpl implements Comerciable, Identificable {

	private Marca marca;
	private String descripcion;
	private int id;
	private Double precio;

	protected Marca getMarca() {
		return marca;
	}

	protected void setPrecio(Double precio) {
		this.precio = precio;
	}

	public ProductoImpl() {
		this.marca = new Marca("Sin marca");
		this.descripcion = "Sin descripcion";
		this.id = -1;
		this.precio = 0.0;
	}

	public ProductoImpl(Marca marca, String descripcion, Double precio) {
		this.marca = marca;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public ProductoImpl(Marca marca, String descripcion, int id, Double precio) {
		this(marca, descripcion, precio);
		this.id = id;
	}

	@Override
	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public Double getPrecio() {
		return precio;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return getDescripcion() + " - " + getMarca();
	}

}
