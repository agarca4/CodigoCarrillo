package asistencia.motor;

public class Averia {

	public static final String[] CATALOGO_DE_AVERIAS = { "Motor", "Direccion", "Revision" };

	private int piezasRepuestoNecesarias;
	private int horasTrabajoNecesarias;
	private String tipoDeAveria;
	private int presupuestoAveria;

	public String getTipoDeAveria() {
		return tipoDeAveria;
	}

	public void setTipoDeAveria(String tipoDeAveria) {
		this.tipoDeAveria = tipoDeAveria;
	}

	public int getPresupuestoAveria() {
		return presupuestoAveria;
	}

	public void setPresupuestoAveria(int presupuestoAveria) {
		this.presupuestoAveria = presupuestoAveria;
	}

	public int getPiezasRepuestoNecesarias() {
		return piezasRepuestoNecesarias;
	}

	public void setPiezasRepuestoNecesarias(int piezasRepuestoNecesarias) {
		this.piezasRepuestoNecesarias = piezasRepuestoNecesarias;
	}

	public int getHorasTrabajoNecesarias() {
		return horasTrabajoNecesarias;
	}

	public void setHorasTrabajoNecesarias(int horasTrabajoNecesarias) {
		this.horasTrabajoNecesarias = horasTrabajoNecesarias;
	}

	public Averia(String tipoDeAveria) {

		setTipoDeAveria(tipoDeAveria);

		if (getTipoDeAveria() == CATALOGO_DE_AVERIAS[0]) {
			setHorasTrabajoNecesarias(5);
			setPiezasRepuestoNecesarias(20);
			setPresupuestoAveria(getHorasTrabajoNecesarias() * Taller.PRECIO_POR_HORA_DE_TRABAJO
					+ getHorasTrabajoNecesarias() * Taller.PRECIO_POR_PIEZA_DE_REPUESTO);

		} else if (getTipoDeAveria() == CATALOGO_DE_AVERIAS[1]) {
			setHorasTrabajoNecesarias(2);
			setPiezasRepuestoNecesarias(10);
			setPresupuestoAveria(getHorasTrabajoNecesarias() * Taller.PRECIO_POR_HORA_DE_TRABAJO
					+ getHorasTrabajoNecesarias() * Taller.PRECIO_POR_PIEZA_DE_REPUESTO);

		} else if (getTipoDeAveria() == CATALOGO_DE_AVERIAS[2]) {
			setHorasTrabajoNecesarias(1);
			setPiezasRepuestoNecesarias(5);
			setPresupuestoAveria(getHorasTrabajoNecesarias() * Taller.PRECIO_POR_HORA_DE_TRABAJO
					+ getHorasTrabajoNecesarias() * Taller.PRECIO_POR_PIEZA_DE_REPUESTO);

		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + horasTrabajoNecesarias;
		result = prime * result + piezasRepuestoNecesarias;
		result = prime * result + presupuestoAveria;
		result = prime * result + ((tipoDeAveria == null) ? 0 : tipoDeAveria.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Averia other = (Averia) obj;
		if (horasTrabajoNecesarias != other.horasTrabajoNecesarias)
			return false;
		if (piezasRepuestoNecesarias != other.piezasRepuestoNecesarias)
			return false;
		if (presupuestoAveria != other.presupuestoAveria)
			return false;
		if (tipoDeAveria == null) {
			if (other.tipoDeAveria != null)
				return false;
		} else if (!tipoDeAveria.equals(other.tipoDeAveria))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Averia: " + getTipoDeAveria() + ", piezas necesarias: " + getPiezasRepuestoNecesarias()
				+ ", horas necesarias: " + getHorasTrabajoNecesarias() + "\nPresupuesto: "
				+ getPresupuestoAveria();
	}

}
