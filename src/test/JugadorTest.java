package test;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import clases.Campo;
import clases.Jugador;
import clases.Marcador;


class JugadorTest {

	//private Campo campo;
	
	private Jugador jugador1;
	private Jugador jugador2;
	
	private Marcador marcador;
	
	@BeforeEach
	public void setUp() {
		 		 
		 jugador1 = new Jugador(); // == SACADOR
		 jugador2 = new Jugador(); // == RECEPTOR
		 
		 marcador = new Marcador(jugador1, jugador2);
		 
		 //campo = new Campo(marcador);
	}
	
	@Test 
	void UnjugadorComienzaCon0Puntos() {
		assertEquals((String)"0", jugador1.valorPuntaje());
	}
	
	@Test
	void SacadorLeHacePuntoAReceptor() {
		marcador.puntoParaElSacador();
		assertEquals((String)"15", jugador1.valorPuntaje());
	}
	
	@Test
	void ReceptorYSacadorVan15Iguales() {
		marcador.puntoParaElSacador();
		marcador.puntoParaElReceptor();
		
		assertEquals((String)"15", jugador1.valorPuntaje());
		assertEquals((String)"15", jugador2.valorPuntaje());
	}
	@Test
	void DosJugadoresVan40Iguales() {
		
		marcador.puntoParaElSacador();
		marcador.puntoParaElReceptor();
		
		marcador.puntoParaElSacador();
		marcador.puntoParaElReceptor();
		
		marcador.puntoParaElSacador();
		marcador.puntoParaElReceptor();
			
			//PROXIMAMENTE DEUCE
		
		assertEquals((String)"DEUCE", jugador1.valorPuntaje());
		assertEquals((String)"DEUCE", jugador2.valorPuntaje());
	}

}
