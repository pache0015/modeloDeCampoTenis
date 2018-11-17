package clases;

public class Jugador {

	private Punto puntaje;
	
	public Jugador() {
		this.puntaje = new Punto0();
	}
	
	public void sumarPunto() {
		this.puntaje = puntaje.puntoSiguiente();
	}
	
	public Integer puntaje() {
		return puntaje.valor();
	}
}
