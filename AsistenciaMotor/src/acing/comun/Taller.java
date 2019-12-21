package acing.comun;

import java.util.Date;

public interface Taller<T> {
	
	void ingresar(T Objeto, Date fechaIngreso);
	
	void diagnosticar(T Objeto);
	
	void reparar(T Objeto, Date fechaReparacion);
	
	
	


	

	
	
	

	
	

}