package clases;

public class Jugador {

	private Integer puntaje;
	
	public Jugador() {
		this.puntaje = 0;
	}
	
	public void sumarPunto() {
		this.puntaje += 15;
	}
	public Integer puntaje() {
		return this.puntaje;
	}
}
