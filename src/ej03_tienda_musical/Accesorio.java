package ej03_tienda_musical;

public class Accesorio {

	double anchuraGuitarraMaxima, anchuraGuitarraMinima;

	public Accesorio(double anchuraGuitarraMaxima, double anchuraGuitarraMinima) {
		super();
		this.anchuraGuitarraMaxima = anchuraGuitarraMaxima;
		this.anchuraGuitarraMinima = anchuraGuitarraMinima;
	}

	public double getAnchuraGuitarraMaxima() {
		return anchuraGuitarraMaxima;
	}

	public void setAnchuraGuitarraMaxima(double anchuraGuitarraMaxima) {
		this.anchuraGuitarraMaxima = anchuraGuitarraMaxima;
	}

	public double getAnchuraGuitarraMinima() {
		return anchuraGuitarraMinima;
	}

	public void setAnchuraGuitarraMinima(double anchuraGuitarraMinima) {
		this.anchuraGuitarraMinima = anchuraGuitarraMinima;
	}

}
