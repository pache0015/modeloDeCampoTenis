package clases;

public class Punto30 extends Punto {

	private String valor = "30";
	public Punto30() {
		
	}
	
	@Override
	public Punto puntoSiguiente() {
		return new Punto40()
;
	}
	public String valor() {
		return valor;
	}

}
