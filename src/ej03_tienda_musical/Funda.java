package ej03_tienda_musical;

public class Funda {

//	Un identificador num�rico.
//	Un nombre.
//	Un precio en euros (con decimales).
//	La longitud m�nima y m�xima de guitarra permitida en cent�metros.
//	La anchura m�nima y m�xima de guitarra permitida en cent�metros.
//	El fondo de guitarra m�nimo y m�ximo permitido en cent�metros.

	int id;
	String nombre;
	double precio, longitudGuitarraMaxima, longitudGuitarraMinima, anchuraGuitarraMaxima, anchuraGuitarraMinima,
			fondoGuitarraMaxima, fondoGuitarraMinima;

	public Funda(int id, String nombre, double precio, double longitudGuitarraMaxima, double longitudGuitarraMinima,
			double anchuraGuitarraMaxima, double anchuraGuitarraMinima, double fondoGuitarraMaxima,
			double fondoGuitarraMinima) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.longitudGuitarraMaxima = longitudGuitarraMaxima;
		this.longitudGuitarraMinima = longitudGuitarraMinima;
		this.anchuraGuitarraMaxima = anchuraGuitarraMaxima;
		this.anchuraGuitarraMinima = anchuraGuitarraMinima;
		this.fondoGuitarraMaxima = fondoGuitarraMaxima;
		this.fondoGuitarraMinima = fondoGuitarraMinima;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getLongitudGuitarraMaxima() {
		return longitudGuitarraMaxima;
	}

	public void setLongitudGuitarraMaxima(double longitudGuitarraMaxima) {
		this.longitudGuitarraMaxima = longitudGuitarraMaxima;
	}

	public double getLongitudGuitarraMinima() {
		return longitudGuitarraMinima;
	}

	public void setLongitudGuitarraMinima(double longitudGuitarraMinima) {
		this.longitudGuitarraMinima = longitudGuitarraMinima;
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

	public double getFondoGuitarraMaxima() {
		return fondoGuitarraMaxima;
	}

	public void setFondoGuitarraMaxima(double fondoGuitarraMaxima) {
		this.fondoGuitarraMaxima = fondoGuitarraMaxima;
	}

	public double getFondoGuitarraMinima() {
		return fondoGuitarraMinima;
	}

	public void setFondoGuitarraMinima(double fondoGuitarraMinima) {
		this.fondoGuitarraMinima = fondoGuitarraMinima;
	}

	// "La funda [nombre de la funda] con identificador [identificador] puede usarse
	// con guitarras de longitud entre [longitud m�nima de guitarra permitida] y
	// [longitud m�xima de guitarra permitida] cm, anchura entre [anchura m�nima
	// de guitarra permitida] y [anchura m�xima de guitarra permitida] y fondo entre
	// [fondo m�nimo de guitarra permitida] y [fondo m�ximo de guitarra permitida]
	@Override
	public String toString() {
		return "La funda " + nombre + " con identificador " + id + " puede usarse con guitarras de longitud entre " + longitudGuitarraMinima + " y " +
				longitudGuitarraMaxima + "cm, anchura entre " + anchuraGuitarraMinima +
				" y " + anchuraGuitarraMaxima + " y fondo entre " +
				fondoGuitarraMinima + " y " + fondoGuitarraMaxima;
	}
}
