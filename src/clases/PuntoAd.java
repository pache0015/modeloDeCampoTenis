package clases;

public class PuntoAd extends Punto {

	private String valor = "AD";
	
	public PuntoAd() {
		
	}
	@Override
	public Punto puntoSiguiente() {
		return new Punto0();
	}
	public Punto puntoSiguienteDeuce() {
		return new PuntoDeuce();
	}

	public String valor() {
		return this.valor;
	}
}
