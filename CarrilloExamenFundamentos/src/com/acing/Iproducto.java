package com.acing;

public class Iproducto implements Comerciable, Identificable {

	private int id;
	private Double precio;
	private String descripcion;
	private Marca marca;

	public int getId() {
		return id;
	}

	protected Marca getMarca() {
		return marca;
	}

	public Iproducto() {

	}

	public Iproducto(Double precio, String descripcion, Marca marca) {
		super();
		this.precio = precio;
		this.descripcion = descripcion;
		this.marca = marca;
	}

	public Iproducto(int id, Double precio, String descripcion, Marca marca) {
		this(precio, descripcion, marca);
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
	public int compareTo(Comerciable arg0) {

		return getPrecio().compareTo(arg0.getPrecio());
	}

	@Override
	public String toString() {
		return getDescripcion() + " - " + getMarca();
	}

}
