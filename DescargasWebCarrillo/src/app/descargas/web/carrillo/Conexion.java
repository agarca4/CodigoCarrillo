package app.descargas.web.carrillo;

public class Conexion implements Conexionable{
	
	private Double velocidadMegasSegun;
	
	

	protected Conexion(Double velocidad) {
		super();
		this.velocidadMegasSegun = velocidad;
	}



	@Override
	public Double getVelocidad() {
		return velocidadMegasSegun;
	}
	
	

}
