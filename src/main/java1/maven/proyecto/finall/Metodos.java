package maven.proyecto.finall;

import java.util.Scanner;

public class Metodos {


	private static void mostrarD(Libro[] libros, int i) {// Mostrar Disponibles
		System.out.println("Codigo del libro:" + libros[i].getCodigo() + "\t\t" + "Titulo del libro:"
				+ libros[i].getNombre() + "\t\t" + "Autor:" + libros[i].getAutor() + "\t\t" + "Año de publicacion:"
				+ libros[i].getAnyoPublicacion() + "\t\t" + "Editorial:" + libros[i].getEditorial() + "\t\t"
				+ "Cantidad de paginas:" + libros[i].getCantidadPaginas() + "\t\t" + "precio:" + libros[i].getPrecio()
				+ "\t\t" + "\t\t" + "Codigo de autorizacion:" + libros[i].getCodigoAutorizacion() + "\t\t"
				+ "Tiempo de Lectura:" + libros[i].getTiempoLectura() + "\t\t" + "Índice de libros:" + i + "\t\t"
				+ "Estado actual:" + "Disponible para pedir prestado!" + "\t\t" + "Número de préstamos"
				+ libros[i].getNumeroPrestado());
		System.out.println();
	}

	private static void mostrarR(Libro[] libros, int i) {// Mostrar Resesrvados
		System.out.println("Codigo del libro:" + libros[i].getCodigo() + "\t\t" + "Titulo del libro:"
				+ libros[i].getNombre() + "\t\t" + "Autor:" + libros[i].getAutor() + "\t\t" + "Año de publicacion:"
				+ libros[i].getAnyoPublicacion() + "\t\t" + "Editorial:" + libros[i].getEditorial() + "\t\t"
				+ "Cantidad de paginas:" + libros[i].getCantidadPaginas() + "\t\t" + "precio:" + libros[i].getPrecio()
				+ "\t\t" + "\t\t" + "Índice de libros:" + i + "\t\t" + "Estado actual:" + "Reservado!" + "\t\t"
				+ "Número de préstamos" + libros[i].getNumeroPrestado());
		System.out.println();
	}

	private static void mostrarP(Libro[] libros, int i) {// Mostrar Prestamos
		System.out.println("Codigo del libro:" + libros[i].getCodigo() + "\t\t" + "Titulo del libro:"
				+ libros[i].getNombre() + "\t\t" + "Autor:" + libros[i].getAutor() + "\t\t" + "Año de publicacion:"
				+ libros[i].getAnyoPublicacion() + "\t\t" + "Editorial:" + libros[i].getEditorial() + "\t\t"
				+ "Cantidad de paginas:" + libros[i].getCantidadPaginas() + "\t\t" + "precio:" + libros[i].getPrecio()
				+ "\t\t" + "\t\t" + "Índice de libros:" + i + "\t\t" + "Estado actual:" + "Prestado!" + "\t\t"
				+ "Número de préstamos" + libros[i].getNumeroPrestado());
		System.out.println();
	}

	// Ver todos los libros
	static void mostarLibros(Libro[] libros) {
		for (int i = 0; i < libros.length; i++) {
			if (libros[i].getNombre() != null) {
				System.out.print("Por favor ingrese el codigo o autor del libro a consultar:");
				Scanner sc = new Scanner(System.in);
				String nombredelibro1 = sc.nextLine();
				if (libros[i].getNombre().contains(nombredelibro1) || libros[i].getCodigo().contains(nombredelibro1)) {
					if (libros[i].getEstado() == "Disponible") {
						mostrarD(libros, i);
					} else if (libros[i].getEstado() == "Reservado") {
						mostrarR(libros, i);
					}
					if (libros[i].getEstado() == "Prestado") {
						mostrarP(libros, i);
					}
				}
			}else {System.out.println("no hay libros registrados");}
		}
	}
	
	

	static void agregarLibro(Libro[] libros) {
		// Verifica si hay espacio en la matriz para agregar el libro
		for (int i = 0; i < libros.length; i++) {
			if (libros[i].getNombre() == null) { // Una vez que encuentre que hay espacio para almacenamiento, guárdelo
													// inmediatamente, porque la matriz se almacena secuencialmente,
													// porque
				String ceduala; // está vacía, luego está vacía
				Scanner sc1 = new Scanner(System.in);
				String codigo;
				String nombre;
				String autor;
				int anyoPublicacion;
				String editorial;
				int cantidadPaginas;
				int precio;
				System.out.print("Codigo: ");
				codigo = sc1.nextLine();
				System.out.print("Nombre: ");
				nombre = sc1.nextLine();
				System.out.print("Autor: ");
				autor = sc1.nextLine();
				System.out.print("Editorial: ");
				editorial = sc1.nextLine();
				System.out.print("Año de puiblicacion: ");
				anyoPublicacion = sc1.nextInt();
				System.out.print("Cantidad de paginas: ");
				cantidadPaginas = sc1.nextInt();
				System.out.print("Precio: ");

				precio = sc1.nextInt();
				libros[i].setCodigo(codigo);
				libros[i].setNombre(nombre);
				libros[i].setAutor(autor);
				libros[i].setAnyoPublicacion(anyoPublicacion);
				libros[i].setEditorial(editorial);
				libros[i].setCantidadPaginas(cantidadPaginas);
				libros[i].setPrecio(precio);
				libros[i].setEstado("Disponible");

				System.out.println("1_Libro de trabajpo");
				System.out.println("2:libro de lectura");
				int opcion = sc1.nextInt();
				if (opcion == 1) {
					System.out.println("Digite codigo de autorizacion");
					Scanner sc = new Scanner(System.in);
					libros[i].setCodigoAutorizacion(sc.nextLine());
					System.out.println("¡El libro se ha añadido correctamente a la biblioteca!");

				} else if (opcion == 2) {
					System.out.println("Digite tiempo de lectura");
					Scanner sc = new Scanner(System.in);
					libros[i].setTiempoLectura(sc.nextLine());

				}

				mostrarD(libros, i);
				System.out.println();

				break;
			} else if (libros[libros.length - 1].getNombre() != null) {
				System.out.println("¡La biblioteca está llena de libros, temporalmente no se pueden agregar libros!");
				System.out.println();
				break;
			}
		}
	}

	static void reservarLibros(Libro[] libros) {
		// Verifique si hay libros para tomar prestados en la biblioteca y verifique si
		// están prestados
		System.out.print("Por favor ingrese el título del libro que desea tomar prestado:");
		Scanner sc = new Scanner(System.in);
		String NL = sc.next();

		int i = 0;
		while (i < libros.length) {
			if (libros[i].getNombre() != null) {
				if (libros[i].getNombre().contains(NL) || (libros[i].getCodigo().contains(NL))) { // Existe
																									// este
																									// libro
					if (libros[i].getEstado() == "Disponible") { // Este libro se puede pedir prestado
						System.out.println("¡El libro está en la biblioteca y se puede pedir prestado!");
						mostrarD(libros, i);
						System.out.println();
						System.out.println("1. Pedir prestado el libro");
						System.out.println("2. Volver al menú principal");
						System.out.print("Escoja una opcion:");
						int a = sc.nextInt();
						for (;;) { // bucle
									// infinito
							int c = 0; // Esta C se utiliza para elegir si salta fuera del ciclo de la función de
										// selección. Si ingresa un número que no sea 1, 2 dará como resultado un error.
										// Si necesita volver a ingresar, no saltará fuera del ciclo.
							switch (a) {
							case 1:
								int b = 0; // b se usa para elegir si salta del ciclo de ingreso de la fecha, y el
											// número ingresado no saltará del rango correcto
								do {
									if (b > 0) { // Si la entrada es incorrecta, no salte del bucle, b ++ hace que b sea
													// mayor que 0, luego envíe la siguiente oración
										System.out.println("¡La entrada es incorrecta, vuelva a ingresar!");
									}
									System.out.print("Introduzca la fecha del préstamo:");
									libros[i].setTiempoPrestado(sc.nextInt());

									b++;
								} while (libros[i].getTiempoPrestado() < 1 || libros[i].getTiempoPrestado() > 31);
								libros[i].setEstado("Reservado");
								System.out.println("¡Préstamo exitoso! Recuerde pasar arecojer libro a la biblioteca~");
								System.out.println();
								c++; // Ingrese 1, que es uno de los valores correctos, c ++, puede saltar fuera del
										// ciclo
								break;
							case 2:
								System.out.println();
								c++; // Ingrese 2, que es uno de los valores correctos, c ++, puede saltar fuera del
										// ciclo
								break;
							default:
								System.out.println("¡Cometiste un error, vuelve a entrar!");
								System.out.println("1. Pedir prestado el libro");
								System.out.println("2. Volver al menú principal");
								a = sc.nextInt();
								break; // Si comete un error, no use c ++, continúe con el ciclo
							}
							if (c > 0) { // Determine si salir del bucle en este momento
								break;
							}
						}
						break;
					} else { // Este libro ya ha sido prestado
						System.out.println(
								"El libro está en la biblioteca, pero ya lo han pedido prestado. ¡No puede volver a tomarlo prestado temporalmente!");
						mostrarR(libros, i);
						break;
					}
				}
			}
			if (libros[i].getNombre() == null && i == libros.length - 1) { // No este libro
				System.out.println("No hay tal libro en la biblioteca. ¿Ingresó el libro a mano por error?");
				System.out.println();
				break;
			}
			i++;

		}

	}

	static void PrestarLibros(Libro[] libros) {

		System.out.print("Por favor ingrese el título del libro que desea tomar prestado:");
		Scanner sc = new Scanner(System.in);

		String NL = sc.next();
		int i = 0;
		while (i < libros.length) {
			if (libros[i].getNombre() != null) {
				if (libros[i].getNombre().contains(NL) || (libros[i].getCodigo().contains(NL))) { // Existe
																									// este
																									// libro
					if (libros[i].getEstado() == "Reservado") { // Este libro se puede pedir prestado
						System.out.println("¡El libro se puede prestar!");
						mostrarR(libros, i);
						System.out.println();
						System.out.println("1. Prestar libros");
						System.out.println("2. Volver al menú principal");
						System.out.print("Escoja una opcion:");
						int a = sc.nextInt();
						for (;;) { // Debido a que necesita volver a ingresar si comete un error, use un bucle
									// infinito
							int c = 0; // Esta C se utiliza para elegir si salta fuera del ciclo de la función de
										// selección. Si ingresa un número que no sea 1, 2 dará como resultado un error.
										// Si necesita volver a ingresar, no saltará fuera del ciclo.
							switch (a) {
							case 1:
								int b = 0; // b se usa para elegir si salta del ciclo de ingreso de la fecha, y el
											// número ingresado no saltará del rango correcto
								do {
									if (b > 0) { // Si la entrada es incorrecta, no salte del bucle, b ++ hace que b sea
													// mayor que 0, luego envíe la siguiente oración
										System.out.println("¡La entrada es incorrecta, vuelva a ingresar!");
									}
									System.out.print("Introduzca la fecha del préstamo:");
									libros[i].setTiempoPrestado(sc.nextInt());

									b++;
								} while (libros[i].getTiempoPrestado() < 1 || libros[i].getTiempoPrestado() > 31);
								libros[i].setEstado("Prestado");
								System.out.println("¡Préstamo exitoso! Recuerde pasar arecojer libro a la biblioteca~");
								System.out.println();
								c++; // Ingrese 1, que es uno de los valores correctos, c ++, puede saltar fuera del
										// ciclo
								break;
							case 2:
								System.out.println();
								c++; // fuera del ciclo
								break;
							default:
								System.out.println("¡Cometiste un error, vuelve a entrar!");
								System.out.println("1. Pedir prestado el libro");
								System.out.println("2. Volver al menú principal");
								a = sc.nextInt();
								break; // Si comete un error, no use c ++, continúe con el ciclo
							}
							if (c > 0) { // Determine si salir del bucle en este momento
								break;
							}
						}
						break;
					} else { // Este libro ya ha sido prestado
						System.out.println(
								"El libro está en la biblioteca, pero ya lo han pedido prestado. ¡No puede volver a tomarlo prestado temporalmente!");
						mostrarP(libros, i);
						break;
					}
				}
			}
			if (libros[i].getNombre() == null && i == libros.length - 1) { // No este libro
				System.out.println("No hay tal libro en la biblioteca. ¿Ingresó el libro a mano por error?");
				System.out.println();
				break;
			}
			i++;

		}

	}
}