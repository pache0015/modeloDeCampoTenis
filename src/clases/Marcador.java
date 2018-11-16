package clases;


public class Marcador {

	private Jugador jugador1;
	private Jugador jugador2;
	private Jugador sacador;
	private Jugador receptor;
	
	public Marcador(Jugador jugador1, Jugador jugador2) {
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
		this.sacador = this.jugador1;
		this.receptor = this.jugador2;
	}

	public void puntoParaElSacador() {
		sacador.sumarPunto();		
	}
	public void puntoParaElReceptor() {
		receptor.sumarPunto();		
	}
	
	
	public Integer puntajeDelSacador() {		
		return sacador.puntaje();
	}
	public Integer puntajeDelReceptor() {
		return receptor.puntaje();
	}

}
