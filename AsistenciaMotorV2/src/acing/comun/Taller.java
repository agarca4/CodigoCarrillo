package acing.comun;

import java.util.Date;

public interface Taller {

	<T extends Averiable> void ingresar(T Objeto, Date fechaIngreso);

	<T extends Averiable> void diagnosticar(T Objeto);

	<T extends Averiable> double calcularPresupuesto(T Objeto);

	<T extends Averiable> void reparar(T Objeto, Date fechaReparacion);

}