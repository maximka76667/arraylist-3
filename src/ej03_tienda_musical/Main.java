package ej03_tienda_musical;

public class Main {

	public static void main(String[] args) {

		// Primera parte
		Guitarra guitarra = new Guitarra(400, 6, 295, 40, 80, 7, true, "Acero");

		Funda funda = new Funda(1, "Fender Telecaster", 250, 85, 80, 36, 32, 7, 5);

		System.out.println(guitarra.toString());
		System.out.println(funda.toString());

		// Segunda parte
		// 1. Funda y guitarra 400
		System.out.println(funda.esCompatible(guitarra));
		
		// 2. Guitarra oferta
		GuitarraOferta guitarraOferta = new GuitarraOferta(5050, 6, 295, 40, 70, 10, true, "Todos", 20);

		System.out.println(guitarraOferta.toString());

		// 3. Funda y guitarra oferta
		System.out.println(funda.esCompatible(guitarraOferta));

		// Extra: funda y guitarra compatible
		Guitarra guitarraCompatible = new Guitarra(500, 8, 300, 36, 80, 5, false, "Nylon");
		System.out.println(funda.esCompatible(guitarraCompatible));
	}

}
