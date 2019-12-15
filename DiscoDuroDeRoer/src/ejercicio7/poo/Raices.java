package ejercicio7.poo;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class Raices {

	private double a;
	private double b;
	private double c;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void obtenerRaices() {
		if (getDiscriminante() < 0) {
			System.out.println("Esta ecuacion no tiene raices reales");

		} else {
			double x1 = (-getB() + Math.sqrt(getDiscriminante())) / 2 * getA();
			double x2 = (-getB() - Math.sqrt(getDiscriminante())) / 2 * getA();

			System.out.println("La primera raiz es x1= " + x1 + " y la segunda es x2= " + x2);
		}

	}

	public void obtenerRaiz() {
		double x = -getB() / 2 * getA();
		System.out.println(x);
	}

	public double getDiscriminante() {
		
		 double discriminante = (Math.pow(getB(), 2) - 4 * getA() * getC());
		 return discriminante;
			 
		}

	

	public boolean tieneRaices() {
		return getDiscriminante() > 0;

	}

	public boolean tieneRaiz() {
		return getDiscriminante() == 0;

	}

}
