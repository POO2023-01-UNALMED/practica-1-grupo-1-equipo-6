package uiMain;

import java.util.ArrayList;
import java.util.Scanner;

import gestorAplicacion.gestion.Biblioteca;
import gestorAplicacion.gestion.Computador;
import gestorAplicacion.gestion.Facultad;
import gestorAplicacion.gestion.Laptop;
import gestorAplicacion.gestion.Libro;
import gestorAplicacion.usuario.Bibliotecario;
import gestorAplicacion.usuario.Estudiante;
import gestorAplicacion.usuario.Lector;

public class Main {
	public static void main(String[] args) {

		// creating books
		Libro libro1 = new Libro("Ciencia ficción", 1, "Dune", "Frank Herbert", "Ace Books", 1965);
		Libro libro2 = new Libro("Novela histórica", 2, "Los Pilares de la Tierra", "Ken Follett", "Editorial Planeta",
				1989);
		Libro libro3 = new Libro("Fantasía", 3, "El Señor de los Anillos", "J.R.R. Tolkien", "George Allen & Unwin",
				1954);
		Libro libro4 = new Libro("Ciencia ficción", 4, "Fundación", "Isaac Asimov", "Gnome Press", 1951);
		Libro libro5 = new Libro("Novela histórica", 5, "El médico", "Noah Gordon", "Ediciones B", 1986);
		Libro libro6 = new Libro("Fantasía", 6, "Harry Potter y la Piedra Filosofal", "J.K. Rowling", "Bloomsbury",
				1997);
		Libro libro7 = new Libro("Ciencia ficción", 7, "Neuromante", "William Gibson", "Ace Books", 1984);
		Libro libro8 = new Libro("Novela histórica", 8, "Los Reyes Malditos", "Maurice Druon", "Gallimard", 1955);
		Libro libro9 = new Libro("Fantasía", 9, "Las crónicas de Narnia", "C.S. Lewis", "Geoffrey Bles", 1950);
		Libro libro10 = new Libro("Ciencia ficción", 10, "Un mundo feliz", "Aldous Huxley", "Chatto & Windus", 1932);
		Libro libro11 = new Libro("Novela histórica", 11, "La sombra del viento", "Carlos Ruiz Zafón", "Planeta", 2001);
		Libro libro12 = new Libro("Fantasía", 12, "El nombre del viento", "Patrick Rothfuss", "DAW Books", 2007);
		Libro libro13 = new Libro("Ciencia ficción", 13, "1984", "George Orwell", "Secker & Warburg", 1949);
		Libro libro14 = new Libro("Novela histórica", 14, "La catedral del mar", "Ildefonso Falcones", "Grijalbo",
				2006);
		Libro libro15 = new Libro("Fantasía", 15, "El hobbit", "J.R.R. Tolkien", "George Allen & Unwin", 1937);
		Libro libro16 = new Libro("Ciencia ficción", 16, "Hyperion", "Dan Simmons", "Doubleday", 1989);
		Libro libro17 = new Libro("Novela histórica", 17, "El guerrero a la sombra del cerezo", "David B. Gil",
				"Suma de Letras", 2019);
		Libro libro18 = new Libro("Fantasía", 18, "El alquimista", "Paulo Coelho", "Editora Rocco", 1988);

		// creating libraries
		Biblioteca biblioteca1 = new Biblioteca("Carrera 7 # 32-10", Facultad.MINAS, "Hernan Garces Gonzalez");
		Biblioteca biblioteca2 = new Biblioteca("59A No. 63-20", Facultad.CIENCIAS_HUMANAS_ECONOMIA, "Efe Gomez");

		// adding books to biblioteca1
		biblioteca1.agregarLibro(libro1);
		biblioteca1.agregarLibro(libro2);
		biblioteca1.agregarLibro(libro3);
		biblioteca1.agregarLibro(libro4);
		biblioteca1.agregarLibro(libro5);
		biblioteca1.agregarLibro(libro6);
		biblioteca1.agregarLibro(libro7);
		biblioteca1.agregarLibro(libro8);
		biblioteca1.agregarLibro(libro9);
		biblioteca1.agregarLibro(libro10);
		// adding books to biblioteca2
		biblioteca2.agregarLibro(libro11);
		biblioteca2.agregarLibro(libro12);
		biblioteca2.agregarLibro(libro13);
		biblioteca2.agregarLibro(libro14);
		biblioteca2.agregarLibro(libro15);
		biblioteca2.agregarLibro(libro16);
		biblioteca2.agregarLibro(libro17);
		biblioteca2.agregarLibro(libro18);

		// creating students
		Estudiante estudiante1 = new Estudiante("Juan", "Perez", 20, "Carrera 12 # 34-56", "CC", 123456, false,
				Facultad.MINAS);
		Estudiante estudiante2 = new Estudiante("Maria", "Gonzalez", 22, "Carrera 10 # 20-30", "TI", 654321, true,
				Facultad.CIENCIAS);
		Estudiante estudiante3 = new Estudiante("Pedro", "Garcia", 19, "Carrera 8 # 12-34", "CC", 987654, false,
				Facultad.CIENCIAS_AGRARIAS);

		// creating librarians

		Bibliotecario bibliotecario1 = new Bibliotecario("Ana", "García", 28, "Calle 70 # 10-20", "CC", 11223344,
				"8:00-17:00");
		Bibliotecario bibliotecario2 = new Bibliotecario("Juan", "Pérez", 35, "Carrera 45 # 32-10", "TI", 44556677,
				"9:00-18:00");
		Bibliotecario bibliotecario3 = new Bibliotecario("María", "Rodríguez", 42, "Calle 100 # 15-25", "CC", 99887766,
				"11:00-20:00");

		// adding librarians to libraries
		biblioteca1.agregarBibliotecario(bibliotecario1);
		biblioteca1.agregarBibliotecario(bibliotecario2);
		biblioteca2.agregarBibliotecario(bibliotecario1);

		// -------------------------------------------------------------------------//
		// -------------------------------------------------------------------------//
		
		
		
		Scanner sc = new Scanner(System.in);
		int opcion1; // PRESTAR O SALIR

		do {
			System.out.println(" ------ MENU PRINCIPAL---- ");
			System.out.println("1. Prestar");
			System.out.println("2. Salir");
			System.out.println("Por favor ingrese su opcion:");

			opcion1 = sc.nextInt();
			sc.nextLine();
			System.out.println("   ");
			System.out.println("   ");
			switch (opcion1) {
			case 1:
				int opcion2; // LIBRO O REGRESAR
				do {
					System.out.println(" ------ PRESTAR----- ");
					System.out.println("1. Libro");
					System.out.println("2. Regresar");
					System.out.println("Por favor ingrese su opcion:");

					opcion2 = sc.nextInt();
					sc.nextLine();
					System.out.println("   ");
					System.out.println("   ");

					int documento;

					switch (opcion2) {

					case 1:
						// INT OPCION3 SERIA LECTOR.BUSCAR(DOCUMENTO)

						System.out.println(" ------ PRESTAR LIBRO----- ");
						System.out.println("Introduzca su documento:");
						documento = sc.nextInt();
						sc.nextLine();
						System.out.println("   ");
						System.out.println("   ");

						switch (Lector.buscarLector(documento)) {
						case 1:
							System.out.println(" ------ PRESTAR LIBRO----- ");
							System.out.println("Usuario: "+ Lector.getLector(documento).getNombre() + " "
									+ Lector.getLector(documento).getApellido());
							System.out.println(" ");
							System.out.println(" ------ SELECCIONAR BIBLIOTECA----- ");
							Lector.getLector(documento).buscarBiblioteca(Lector.getLector(documento));
							
							int opcion4;
							opcion4 = sc.nextInt();
							sc.nextLine();
							switch(opcion4) {
							case 1:
								System.out.println("Ha seleccionado la biblioteca 1");
							case 2: 
								System.out.println("Ha seleccionado la biblioteca 2");
							}
			
							
							
							break;
							

						case 0:

							System.out.println(" ------ LECTOR NO ENCONTRADO----- ");
							System.out.println("1.Registrase");
							System.out.println("2.Regresar");

							int opcion3 = sc.nextInt();
							sc.nextLine();

							switch (opcion3) {
							case 1:
								do {
									System.out.println("introduzca su nombre:");
									String nombre = sc.toString();
									sc.nextLine();

									System.out.println("introduzca su apellido: ");
									String apellido = sc.toString();
									sc.nextLine();

									System.out.println("introduzca su edad:");
									int edad = sc.nextInt();
									sc.nextLine();

									System.out.println(" introduzca su dirrecion:");
									String direccion = sc.toString();
									sc.nextLine();

									System.out.println(" Seleccione su tipo de documento:");
									System.out.println("1.CC ");
									System.out.println("2.TI");
									int tipoIdOption = sc.nextInt();
									String tipoId = null;

									switch (tipoIdOption) {
									case 1:
										tipoId = "CC";
										break;
									case 2:
										tipoId = "TI";
										break;
									}

									int Id = documento;
									System.out.println("Seleccione tipo de lector:  ");
									System.out.println("1.ESTUDIANTE");
									System.out.println("2.PROFESOR ");
									int tipoPersona = sc.nextInt();

									switch (tipoPersona) {
									case 1:

										System.out.println(" Seleccione su facultad:");
										System.out.println("1.Ciencias");
										System.out.println("2.Ciencias Humanas y Economia");
										System.out.println("3.Ciencias Agrarias");
										System.out.println("4.Minas");
										System.out.println("5.Arquitectura");
										int facultadOption = sc.nextInt();
										Facultad facultad = null;

										switch (facultadOption) {
										case 1:
											facultad = Facultad.CIENCIAS;
											break;
										case 2:
											facultad = Facultad.CIENCIAS_HUMANAS_ECONOMIA;
											break;
										case 3:
											facultad = Facultad.CIENCIAS_AGRARIAS;
											break;
										case 4:
											facultad = Facultad.MINAS;
											break;
										case 5:
											facultad = Facultad.ARQUITECTURA;
											break;

										}
										Lector.registrarLector(nombre, apellido, edad, direccion, tipoId, Id, false,
												facultad, tipoPersona);
									case 2:
										Lector.registrarLector(nombre, apellido, edad, direccion, tipoId, Id, false,
												  null, tipoPersona);
									}

									break;
								} while (opcion3 != 2);

							case 2:
								System.out.println("Regresando al menu anterior...");
								break;
							}

						}
						break;
					case 2:
						System.out.println("Regresando al menu anterior...");
						break;
					default:
						System.out.println("Opcion invalida");
						break;
					}
				} while (opcion2 != 2);
				break;
			case 2:
				System.out.println("Sistema Cerrado");
				break;
			default:
				System.out.println("Opcion invalida");
				break;
			}
		} while (opcion1 != 2);

		sc.close();
	}

}
