package gui;

import tools.Lector;

/**
 * 
 * @author Alvaro y Ioan
 *
 */

public class Gui {

	/**
	 * Creacion menu con sus opciones
	 */

	public Gui() {
		menu();
	}

	public static void menu() {

		boolean sigo = true;
		do {
			sigo = elegirOpcion(Lector.leerInt(pantalla()));
		} while (sigo);
	}

	private static boolean elegirOpcion(int opcion) {
		boolean sigo = true;
		switch (opcion) {
		case 0:
			String resp = Lector.leerString("Estas seguro que quieres salir? Si-No");
			if (resp.equalsIgnoreCase("si")) {
				System.out.println("Hasta pronto");
				sigo = false;
			}

			break;
		case 1:
			System.out.println("Dar alta videojuegos");
			break;
		case 2:
			System.out.println("Mostrar listado de videojuegos");
			break;

		default:
			System.err.println("La opción " + opcion + " es incorrecta");
			break;
		}

		return sigo;
	}

	private static String pantalla() {
		return "\n----------\nOpciones\n0- Salir\n1-Obtener listado de juegos\n2-Mostrar listado videojuegos";
	}

}
