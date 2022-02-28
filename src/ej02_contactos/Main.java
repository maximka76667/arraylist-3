package ej02_contactos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Contacto> contactos = new ArrayList<Contacto>();

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
			
			System.out.print("Un contacto más? (y/n): ");
			esLeyendo = entrada.nextLine().startsWith("y");
		}

		// 1. Pedir el DNI de un contacto e indicar si está en la lista de contactos, si
		// es así muestra los datos de dicho contacto por pantalla.
		
		System.out.println("\n1. Buscar por DNI\n");

		int index = pedirDniParaBuscar(contactos);
		if (index >= 0) {
			System.out.println();
			contactos.get(index).verDatos();
			System.out.println();
		} else {
			System.out.println("Contacto no ha encontrado");
		}

		// 2. Pedir el Nombre de un contacto e indicar si está en la lista, si es así
		// muestra los datos del contacto por pantalla.
		
		System.out.println("\n2. Buscar por nombre\n");

		// Pedir el nombre
		System.out.print("Nombre buscado: ");
		String nombreBuscado = entrada.nextLine();

		// Buscar el nombre
		buscarContactoPorNombre(contactos, nombreBuscado);

		// 3. Permitir que se puedan modificar los datos de un contacto.
		
		System.out.println("\n3. Modificar un contacto");

		// Mostrar todos los contactos
		mostrarContactos(contactos);

		int indexParaModificar = pedirDniParaBuscar(contactos);

		if (indexParaModificar >= 0) {
			Contacto contactoParaModificar = contactos.get(indexParaModificar);

			// Pedir nuevos datos
			System.out.print("Nuevo nombre: ");
			String nombre = entrada.nextLine();

			System.out.print("Nuevos apellidos: ");
			String apellidos = entrada.nextLine();

			System.out.print("Nuevo telefono: ");
			String telefono = entrada.nextLine();

			// Aplicar nuevos datos
			contactoParaModificar.setNombre(nombre);
			contactoParaModificar.setApellidos(apellidos);
			contactoParaModificar.setTelefono(telefono);

			System.out.println("\nNuevo contacto:");
			contactoParaModificar.verDatos();
		} else {
			System.out.println("Contacto no ha encontrado");
		}
		
		// 4. Borrar un contacto
		
		System.out.println("\n4. Borrar un contacto");
		
		// Mostrar todos los contactos
		mostrarContactos(contactos);

		int indexParaBorrar = pedirDniParaBuscar(contactos);
		
		if (indexParaBorrar >= 0) {
			contactos.remove(indexParaBorrar);
			System.out.println("Contacto ha borrado");
			mostrarContactos(contactos);
		} else {
			System.out.println("Contacto no ha encontrado");
		}

		entrada.close();
	}

	public static int buscarContactoPorDni(ArrayList<Contacto> contactos, String dniContactoBuscado) {
		for (int i = 0; i < contactos.size(); i++) {
			Contacto contacto = contactos.get(i);
			if (contacto.getDni().equals(dniContactoBuscado)) {
				return i;
			}
		}
		return -1;
	}

	public static int pedirDniParaBuscar(ArrayList<Contacto> contactos) {
		// Pedir el DNI
		System.out.print("DNI buscado: ");
		String dniBuscado = entrada.nextLine();

		// Buscar el DNI
		int index = buscarContactoPorDni(contactos, dniBuscado);
		return index;
	}

	public static void buscarContactoPorNombre(ArrayList<Contacto> contactos, String nombreContactoBuscado) {
		for (int i = 0; i < contactos.size(); i++) {
			Contacto contacto = contactos.get(i);
			if (contacto.getNombre().equals(nombreContactoBuscado)) {
				contacto.verDatos();
				return;
			}
		}
		System.out.println("Contacto no ha encontrado");
	}

	public static void mostrarContactos(ArrayList<Contacto> contactos) {
		System.out.println();
		System.out.println("Todos los contactos:");
		for (Contacto contacto : contactos) {
			contacto.verDatos();
			System.out.println();
		}
	}
}
