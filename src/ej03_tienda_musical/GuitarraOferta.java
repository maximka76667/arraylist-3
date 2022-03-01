package ej03_tienda_musical;

public class GuitarraOferta extends Guitarra {

	double descuento;

	public GuitarraOferta(int id, int numeroCuerdas, double precio, double anchura, double longitud, double fondo,
			boolean esPastillable, String tipoCuerdas, double descuento) {
		super(id, numeroCuerdas, precio, anchura, longitud, fondo, esPastillable, tipoCuerdas);
		setDescuento(descuento);
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		if (descuento > 0 && descuento < 100) {
			this.descuento = descuento;
			super.setPrecio(super.getPrecio() * (1 - descuento / 100));
		}
	}

}
