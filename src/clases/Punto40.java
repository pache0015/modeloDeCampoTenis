package clases;

public class Punto40 extends Punto {

	private String valor = "40";
	
	public Punto40() {
		
	}
	
	@Override
	public Punto puntoSiguiente() {
		return new Punto0();
	}
	public Punto puntoSiguienteDeuce() {
		return new PuntoDeuce();
	}
	public String valor() {
		return valor;
	}

}
