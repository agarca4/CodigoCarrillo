package ejercicio14Poo;



public class Almacen {

	private Producto[][] estanteria;

	public Producto[][] getEstanteria() {
		return estanteria;
	}

	public void setEstanteria(Producto[][] estanteria) {
		this.estanteria = estanteria;
	}

	public Almacen(int filas, int columnas) {
		estanteria = new Producto[filas][columnas];
	}

	public double calcularPrecioTotalProductos() {
		double precioTotalProductos = 0.0;
		for (int i = 0; i < estanteria.length; i++) {
			for (int j = 0; j < estanteria[0].length; j++) {
				if (estanteria[i][j] != null) {
					precioTotalProductos += estanteria[i][j].getPrecio();
				}

			}
		}
		return precioTotalProductos;
	}

	public double calcularPrecioTotalMarca(String marca) {
		double precioTotalMarca = 0.0;
		for (int i = 0; i < estanteria.length; i++) {
			for (int j = 0; j < estanteria[0].length; j++) {
				if (estanteria[i][j] != null) {
					if (estanteria[i][j].getMarca() == marca) {
						precioTotalMarca += estanteria[i][j].getPrecio();

					}

				}
			}
		}
		return precioTotalMarca;
	}

	public double calcularPrecioTotalColumna(int columna) {
		double precioTotalColumna = 0.0;
		for (int i = 0; i < estanteria.length; i++) {
			for (int j = 0; j < estanteria[0].length; j++) {
				if (j == columna) {
					precioTotalColumna += estanteria[i][j].getPrecio();
				}
			}
		}
		return precioTotalColumna;
	}

	public void agregarProducto(Producto p) {
		boolean encontrado = false;
		for (int i = 0; i < estanteria.length && !encontrado; i++) {
			for (int j = 0; j < estanteria[0].length && !encontrado; j++) {
				if (estanteria[i][j] != null) {
					if (estanteria[i][j].getId() == p.getId()) {
						encontrado = true;
					}
				} else {
					if (estanteria[i][j] == null) {
						estanteria[i][j] = p;
						encontrado = true;

					}

				}
			}

		}
	}

	public void eliminarProducto(int ID) {
		for (int i = 0; i < estanteria.length; i++) {
			for (int j = 0; j < estanteria[0].length; j++) {
				if (estanteria[i][j] != null && estanteria[i][j].getId() == ID) {
					estanteria[i][j] = null;
				}
			}
		}
	}

	public void mostrarInformacionProductos() {
		for (int i = 0; i < estanteria.length; i++) {
			for (int j = 0; j < estanteria[0].length; j++) {
				if (estanteria[i][j] != null) {
					System.out.println(
							"En la fila " + i + " y columna " + j + " tenemos: " + estanteria[i][j].toString());
				}

			}
		}

	}

}
