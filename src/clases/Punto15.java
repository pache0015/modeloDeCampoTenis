package clases;

public class Punto15 extends Punto {

	private String valor = "15";
	
	public Punto15() {
		
	}
	
	@Override
	public Punto puntoSiguiente() {
		return new Punto30();
	}

	public String valor() {
		return valor;
	}
}
