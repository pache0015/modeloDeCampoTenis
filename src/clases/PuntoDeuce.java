package clases;

public class PuntoDeuce extends Punto {

	private String valor = "DEUCE";
	
	public PuntoDeuce() {
	
	}
	@Override
	public Punto puntoSiguiente() {
		return new PuntoAd();
	}
	public String valor() {
		return this.valor;
	}

}
