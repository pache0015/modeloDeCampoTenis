package clases;

public class Campo {

	private Marcador marcador;
	
	public Campo(Marcador marcador) {
		this.marcador = marcador;
	}

	public void puntoParaElSacador() {
		marcador.puntoParaElSacador();
	}

	public void puntoParaElReceptor() {
		marcador.puntoParaElReceptor();
	}

	

}
