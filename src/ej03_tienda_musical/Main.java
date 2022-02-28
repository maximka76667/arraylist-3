package ej03_tienda_musical;

public class Main {

	public static void main(String[] args) {

		Guitarra guitarra = new Guitarra(400, 6, 295, 40, 80, 7, true, "Acero");
	
		Funda funda = new Funda(1, "Fender Telecaster", 250, 85, 80, 36, 32, 7, 5);
	
		System.out.println(guitarra.toString());
		System.out.println(funda.toString());
	}

}
