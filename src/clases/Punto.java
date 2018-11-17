package clases;

public abstract class Punto {

	private Integer valor;
	
	public abstract Punto puntoSiguiente();
	
	public Integer valor() {
		return valor;
	}
}
