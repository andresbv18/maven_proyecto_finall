package maven.proyecto.finall;

import java.util.Scanner;

public class MainBiblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crea una matriz que puede contener seis libros
		Libro[] libros = new Libro[6];
		for (int i = 0; i < libros.length; i++) { // inicialización
			libros[i] = new Libro();
		}
		Scanner entrada = new Scanner(System.in);

		String opcion;

		do {

			System.out.println("Bienbenido al sistema bibliotecario UCE\n");
			System.out.println("Seleccione una opcion");
			System.out.println("1_Estudiante");
			System.out.println("2_Bibliotecario");
			System.out.println("3_Salir");
			opcion = entrada.nextLine();
			switch (opcion) {

			case "1":// Caso1P
				String opcion1;

				do {

					System.out.println("1_Consultar libros");
					System.out.println("2_reservar libros");
					System.out.println("3-Salir");
					opcion1 = entrada.nextLine();
					switch (opcion1) {

					case "1":
				Metodos.mostarLibros(libros);
						break;
					case "2":
					Metodos.reservarLibros(libros);
						break;

					case "3":

						System.out.println("Saliendo");
						break;
					default:
						System.out.println("opcion incorrecta");
						break;

					}

				} while (!opcion1.equals("3"));

				break;
			case "2":// Caso2 P
				String opcion2;

				do {

					System.out.println("1_Ingresar un libro");
					System.out.println("2_Prestar un libro");
					System.out.println("3_Aplazar fecha de netrega");
					System.out.println("4-Salir");
					opcion2 = entrada.nextLine();
					switch (opcion2) {

					case "1":
						Metodos.agregarLibro(libros);

//						
						break;

					case "2":

					Metodos.PrestarLibros(libros);
						break;

					case "3":

						System.out.println("Saliendo");
						break;
					default:
						System.out.println("opcion incorrecta\n");
						break;

					}

				} while (!opcion2.equals("4"));

				break;
			case "3":

				System.out.println("Saliendo");
				break;
			default:
				System.out.println("opcion incorrecta");
				break;

			}
		} while (!opcion.equals("3"));

	}
}