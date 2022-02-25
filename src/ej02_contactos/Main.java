package ej02_contactos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<Contacto> contactos = new ArrayList<Contacto>();

		Scanner entrada = new Scanner(System.in);

		boolean esLeyendo = true;

		while (esLeyendo) {
			System.out.print("DNI: ");
			String dni = entrada.nextLine();

			System.out.print("Nombre: ");
			String nombre = entrada.nextLine();

			System.out.print("Apellidos: ");
			String apellidos = entrada.nextLine();

			System.out.print("Telefono: ");
			String telefono = entrada.nextLine();

			Contacto nuevoContacto = new Contacto(dni, nombre, apellidos, telefono);

			contactos.add(nuevoContacto);

			esLeyendo = false;
		}

		entrada.close();
	}

}
