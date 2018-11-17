package clases;

public class Punto0 extends Punto {

	private Integer valor = 0;
	public Punto0() {
		
	}
	
	@Override
	public Punto puntoSiguiente() {
		return new Punto15();
	}
	public Integer valor() {
		return valor;
	}

}
