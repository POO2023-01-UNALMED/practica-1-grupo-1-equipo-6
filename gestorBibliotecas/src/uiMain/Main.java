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
		Scanner sc = new Scanner(System.in);

		int opcion1;
		do {
		    System.out.println(" ------ MENU PRINCIPAL------ ");

		    System.out.println("1. Prestar");
		    System.out.println("2. Salir");

		    System.out.println("Por favor ingrese su opcion:");

		    opcion1 = sc.nextInt();
		    sc.nextLine();

		    switch(opcion1) {
		    
		    case 1: // PRESTAR (MENU PRINCIPAL)
		        int opcion2;
		        do {
		            System.out.println(" ------ PRESTAR----- ");

		            System.out.println("1. Libro");
		            System.out.println("2. Regresar");

		            System.out.println("Por favor ingrese su opcion:");

		            opcion2 = sc.nextInt();
		            sc.nextLine();

		            switch(opcion2) {
		            case 1: // LIBRO (PRESTAR)
		            	 int documento = 0;
		            	do {
		            		System.out.println(" ------ PRESTAR / LIBRO----- ");
		            		System.out.println("Por favor ingrese su documento / pulse 1 para regresar:");
		            	   
		            	    documento = sc.nextInt();
				            sc.nextLine();
				            
				            if (documento ==1) {
				            	break;
				            }

			            int opcion4 = Lector.buscarLector(documento);
			            //BUSCANDO DOCUMENTO
			            	switch(opcion4) {
			            	case 1: // LECTOR ENCONTRADO
			            		System.out.println(" ------ PRESTAR / LIBRO / LECTOR ENCONTRADO ----- ");
			            		
			            		System.out.println("Usuario: "+ Lector.getLector(documento).getNombre() + " " + Lector.getLector(documento).getApellido());
			            		
			            		break;
			            	case 2: // LECTOR NO ENCONTRADO
			            		int opcion5;
			            		do {
			            			System.out.println(" ------ PRESTAR / LIBRO / LECTOR NO ENCONTRADO ----- ");
			            			
			    		            System.out.println("1. Registrar");
			    		            System.out.println("2. Regresar");
			    		            
			    		            System.out.println("Por favor ingrese su opcion:");
			    		            
			    		            opcion5 = sc.nextInt();
			    		            sc.nextLine();
			    		            
			    		            switch(opcion5) {
			    		            case 1:// REGISTRAR (PRESTAR / LIBRO / LECTOR NO ENCONTRADO)
			    		            	System.out.println(" ------ PRESTAR / LIBRO / LECTOR NO ENCONTRADO /REGISTRO ----- ");
			    		            	
			    		            	System.out.println("por favor ingrese su nombre: ");
			    		            	System.out.println("envie 1 para regresar ");
			    		            	String nombre = "0";
			    		            	do {
					    		            nombre = sc.next();
					    		            sc.nextLine();
					    		            if (nombre.equals("1")){break;}
				    		            	System.out.println("por favor ingrese su apellido: ");
				    		            	System.out.println("envie 1 para regresar ");
				    		            	String apellido = "0";
				    		            	do {
				    		            		apellido = sc.next();
						    		            sc.nextLine();
						    		            if (apellido.equals("1")){break;}
					    		            	System.out.println("por favor ingrese su edad: ");
					    		            	System.out.println("envie 1 para regresar ");
					    		            	int edad = 0;
					    		            	do {
					    		            		edad = sc.nextInt();
							    		            sc.nextLine();
							    		            if (edad==1){break;}
						    		            	System.out.println("por favor ingrese su direccion: ");
						    		            	System.out.println("envie 1 para regresar ");
						    		            	String direccion = "0";
						    		            	do {
						    		            		direccion = sc.next();
								    		            sc.nextLine();
								    		            if (direccion.equals("1")){break;}
								    		            break;//not finish
						    		            	}while(!direccion.equals("1"));
					    		            	}while(edad!=1);
				    		            	}while(!apellido.equals("1"));
					    		            
			    		            	}while(!nombre.equals("1"));
			    		            	
			    		            	break;
			    		            case 2:// REGRESAR  (PRESTAR / LIBRO / LECTOR NO ENCONTRADO)
			    		            	System.out.println("regresando al menu anterior ");
			    		            	documento = 0;
			    		            	break;
			    		            }
			            		}while(opcion5 != 2);

			            	}
		                
		                }while(documento == 0);
		            case 2: // REGRESAR (PRESTAR)
		                System.out.println("Regresando al menu anterior:");
		                break;
		            }
		        } while (opcion2 != 2);
		        break;
		        
		    case 2: // SALIR (MENU PRINCIPAL)
		        System.out.println("Saliendo del Sistema");
		        break;
		    }
		} while(opcion1 !=2);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// -------------------------------------------------------------------------//
		
		
		

	}
}
