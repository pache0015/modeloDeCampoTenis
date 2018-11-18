package clases;


public class Marcador {

	private Jugador jugador1; // == Sacador
	private Jugador jugador2; // == Receptor
	//private Jugador sacador;
	//private Jugador receptor;
	
	public Marcador(Jugador jugador1, Jugador jugador2) {
		this.jugador1 = jugador1;
		this.jugador2 = jugador2;
	}

	public void puntoParaElSacador() {
		Punto puntaje = jugador1.puntaje();
		if ((jugador1.valorPuntaje()== "30" && jugador2.valorPuntaje() == "40") 
				|| 
			(jugador1.valorPuntaje() == "DEUCE" && jugador2.valorPuntaje() == "AD")) {
			
			jugador1.sumarPunto(new PuntoDeuce());
		}else {
		jugador1.sumarPunto(puntaje.puntoSiguiente());
		}
	}
	public void puntoParaElReceptor() {
		Punto puntaje = jugador2.puntaje();
		if ((jugador2.valorPuntaje()== "30" && jugador1.valorPuntaje() == "40") 
				|| 
			(jugador2.valorPuntaje() == "DEUCE" && jugador1.valorPuntaje() == "AD")) {
			
			jugador2.sumarPunto(new PuntoDeuce());
		}else {
		jugador2.sumarPunto(puntaje.puntoSiguiente());
		}
	}
	
	
	public String puntajeDelSacador() {		
		return jugador1.valorPuntaje();
	}
	public String puntajeDelReceptor() {
		return jugador2.valorPuntaje();
	}

}
