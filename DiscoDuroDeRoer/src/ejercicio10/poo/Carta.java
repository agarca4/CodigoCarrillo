package ejercicio10.poo;

public class Carta {
	
	public static final int[] NUMEROS = {1,2,3,4,5,6,7,10,11,12};
	public static final String[] PALOS = {"espadas", "bastos", "oros", "copas"};
	
	private int numero;
	private String palo;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	
	public Carta() {
		
	}
	
	public Carta(int numero, String palo) {
		this.numero = numero;
		this.palo = palo;
		
		
	}
	@Override
	public String toString() {
		return  getNumero() + " de " + getPalo();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		result = prime * result + ((palo == null) ? 0 : palo.hashCode());
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
		Carta other = (Carta) obj;
		if (numero != other.numero)
			return false;
		if (palo == null) {
			if (other.palo != null)
				return false;
		} else if (!palo.equals(other.palo))
			return false;
		return true;
	}
	
	

}
