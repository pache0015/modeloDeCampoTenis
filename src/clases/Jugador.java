package clases;

public class Jugador {

	private Punto puntaje;
	
	public Jugador() {
		this.puntaje = new Punto0();
	}
	
	public void sumarPunto(Punto punto) {
		this.puntaje = punto;
	}
	
	public String valorPuntaje() {
		return puntaje.valor();
	}
	public Punto puntaje() {
		return puntaje;
	}
}
