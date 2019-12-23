package acing.comun;

import java.util.Collection;
import java.util.Date;

public interface Averiable<T,S> {

	void averiarse(Collection<S> a);

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

	Collection<S> getAverias();

}