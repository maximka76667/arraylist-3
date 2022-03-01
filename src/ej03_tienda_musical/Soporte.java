package ej03_tienda_musical;

public class Soporte extends Accesorio {

	public Soporte(double anchuraGuitarraMaxima, double anchuraGuitarraMinima) {
		super(anchuraGuitarraMaxima, anchuraGuitarraMinima);
	}

	public double getAnchuraGuitarraMaxima() {
		return super.anchuraGuitarraMaxima;
	}

	public void setAnchuraGuitarraMaxima(double anchuraGuitarraMaxima) {
		super.setAnchuraGuitarraMaxima(anchuraGuitarraMaxima);
	}

	public double getAnchuraGuitarraMinima() {
		return super.anchuraGuitarraMinima;
	}

	public void setAnchuraGuitarraMinima(double anchuraGuitarraMinima) {
		super.setAnchuraGuitarraMinima(anchuraGuitarraMinima);
	}

}
