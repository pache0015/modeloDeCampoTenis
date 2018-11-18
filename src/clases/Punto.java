package clases;

public abstract class Punto {

	private String valor;
	
	public abstract Punto puntoSiguiente();
	
	public String valor() {
		return valor;
	}
}
