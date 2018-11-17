package clases;

public class Punto40 extends Punto {

	private Integer valor = 40;
	
	public Punto40() {
		
	}
	
	@Override
	public Punto puntoSiguiente() {
		return new Punto0();

	}
	public Integer valor() {
		return valor;
	}

}
