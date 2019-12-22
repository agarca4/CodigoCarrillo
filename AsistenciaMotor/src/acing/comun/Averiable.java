package acing.comun;

import java.util.Collection;
import java.util.Date;

public interface Averiable {

	void averiarse(Collection<Averia> a);

	void setFechaIngreso(Date f);

	Date getFechaIngreso();

	void setPresupuesto(double p);

	double getPresupuesto();

	void setPiezasDisponibles(boolean piezasDisponibles);

	boolean isPiezasDisponibles();

	void setTiempoReparación(int t);

	int getTiempoReparación();

	void setFechaEgreso(Date fechaEgreso);

	Date getFechaEgreso();

	Collection<Averia> getAverias();

}