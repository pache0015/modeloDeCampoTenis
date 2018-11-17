package clases;

public class Punto30 extends Punto {

	private Integer valor = 30;
	public Punto30() {
		
	}
	
	@Override
	public Punto puntoSiguiente() {
		return new Punto40()
;
	}
	public Integer valor() {
		return valor;
	}

}
