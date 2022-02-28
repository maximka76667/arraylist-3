package ej03_tienda_musical;

public class Guitarra {

//	Un identificador numérico.
//	Un precio (en euros, es decir, debe admitir decimales)
//	Su anchura en centímetros.
//	Su longitud en centímetros.
//	Su fondo en centímetros.
//	Si se le pueden poner o no pastillas.
//  El tipo de cuerdas que puede llevar: NYLON, ACERO,….
//	El número de cuerdas. 

	int id, numeroCuerdas;
	double precio, anchura, longitud, fondo;
	boolean esPastillable;
	String tipoCuerdas;

	public Guitarra(int id, int numeroCuerdas, double precio, double anchura, double longitud, double fondo,
			boolean esPastillable, String tipoCuerdas) {
		super();
		this.id = id;
		this.numeroCuerdas = numeroCuerdas;
		this.precio = precio;
		this.anchura = anchura;
		this.longitud = longitud;
		this.fondo = fondo;
		this.esPastillable = esPastillable;
		this.tipoCuerdas = tipoCuerdas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumeroCuerdas() {
		return numeroCuerdas;
	}

	public void setNumeroCuerdas(int numeroCuerdas) {
		this.numeroCuerdas = numeroCuerdas;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getAnchura() {
		return anchura;
	}

	public void setAnchura(double anchura) {
		this.anchura = anchura;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public double getFondo() {
		return fondo;
	}

	public void setFondo(double fondo) {
		this.fondo = fondo;
	}

	public boolean isEsPastillable() {
		return esPastillable;
	}

	public void setEsPastillable(boolean esPastillable) {
		this.esPastillable = esPastillable;
	}

	public String getTipoCuerdas() {
		return tipoCuerdas;
	}

	public void setTipoCuerdas(String tipoCuerdas) {
		this.tipoCuerdas = tipoCuerdas;
	}

	// "La guitarra con identificador [identificador] se corresponde con una
	// guitarra de [número de cuerdas] cuerdas y tiene un precio de [precio] euros".
	@Override
	public String toString() {
		return "La guitarra con identificador " + id + ", se corresponde con una guitarra de " + numeroCuerdas
				+ " cuerdas y tiene un precio de " + precio + " euros";
	}

}
