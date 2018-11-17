package test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.IntStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import clases.Campo;
import clases.Jugador;
import clases.Marcador;


class CampoDeJuego {

	private Campo campo;
	
	private Jugador jugador1;
	private Jugador jugador2;
	
	private Marcador marcador;
	
	@BeforeEach
	public void setUp() {
		 		 
		 jugador1 = new Jugador();
		 jugador2 = new Jugador();
		 
		 marcador = new Marcador(jugador1, jugador2);
		 
		 campo = new Campo(marcador);
	}
	
	@Test 
	void UnjugadorComienzaCon0Puntos() {
		assertEquals((Integer)0, marcador.puntajeDelSacador());
	}
	
	
	
	@Test
	void SacadorLeHacePuntoAReceptor() {
		jugador1.sumarPunto();
		assertEquals((Integer)15, jugador1.puntaje());
	}
	@Test
	void ReceptorLeHacePuntoASacador() {
		campo.puntoParaElReceptor();
		assertEquals((Integer)15, marcador.puntajeDelReceptor());
	}
	@Test
	void ReceptorYSacadorVan15Iguales() {
		campo.puntoParaElSacador();
		campo.puntoParaElReceptor();
		
		assertEquals((Integer)15, marcador.puntajeDelSacador());
		assertEquals((Integer)15, marcador.puntajeDelReceptor());
	}
	@Test
	void DosJugadoresVan40Iguales() {
		
			campo.puntoParaElSacador();
			campo.puntoParaElReceptor();
			campo.puntoParaElSacador();
			campo.puntoParaElReceptor();
			campo.puntoParaElSacador();
			campo.puntoParaElReceptor();
			
			
			//PROXIMAMENTE DEUCE
		
		assertEquals((Integer)40, marcador.puntajeDelSacador());
		assertEquals((Integer)40, marcador.puntajeDelReceptor());
	}

}
