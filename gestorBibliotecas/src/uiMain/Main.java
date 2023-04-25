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
	
	//Main trigger
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	    cargarObjetos();
	    String usuario;
	    String contraseña;
	    do {
	        System.out.println("Hola, bienvenido al sistema de gestion de Bibliotecas de la Universidad Nacional de Colombia");
	        System.out.println("--------------------------------------------------------------------------------------------");
	        System.out.println("Recuerda que este sistema solo puede ser utilizado por un usuario habilidado");
	        System.out.println("");
	        System.out.println("Por favor, Bibliotecario, ingrese su Usuario y Password para continuar: ");
	        System.out.println("");
	        System.out.println("BIBLIOTECARIO POR DEFECTO: USUARIODEFECTO@UNAL.EDU.CO ---- Password : ADMIN123");	
	        System.out.println("");
	        System.out.println("--------------------------------------------------------------------------------------------");
	        System.out.println("PARA SALIR DEL PROGRAMA INGRESE /SALIR EN CUALQUIER MOMENTO");
	        System.out.println("--------------------------------------------------------------------------------------------");
	        System.out.println("Usuario: ");
	        usuario = sc.nextLine();
	        if ((usuario.equalsIgnoreCase("/salir")) ||(usuario.equalsIgnoreCase("/SALIR"))) {
	        	System.out.println("CERRANDO EL PROGRAMA");
	            break; 
	        }
	        System.out.println("Password: ");
	        contraseña = sc.nextLine();
	        if ((contraseña.equalsIgnoreCase("/salir")) ||(contraseña.equalsIgnoreCase("/SALIR"))) {
	        	System.out.println("CERRANDO EL PROGRAMA");
	            break;
	        }
	        
	        if (usuario.equals("USUARIODEFECTO@UNAL.EDU.CO") && contraseña.equals("ADMIN123")){
	        	menuPrincipal();
	        }else {System.out.println("USUARIO O password INVALIDA");}
	        System.out.println("--------------------------------------------------------------------------------------------");
	    } while (true);

	}

	
	//MenuPrincipal
	static int opcionMenuPrincipal = 0; // ONLY STATIC OPCION
	static void menuPrincipal() {
       
       //----------------------------------------------------------------//
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println(" ------ MENU PRINCIPAL------ ");

			System.out.println("1. Prestar");
			System.out.println("2. Devolver");
			System.out.println("3. funcionalidad 3");
			System.out.println("4. funcionalidad 4");
			System.out.println("5. funcionalidad 5");
			System.out.println("6. Salir");
			
			System.out.println("Por favor ingrese su opcion:");
			
			opcionMenuPrincipal = sc.nextInt(); //reader of opcion1 type by the user
			sc.nextLine(); //buffer cleaner 
            switch (opcionMenuPrincipal) {
                case 0:

                break;
                case 1:
                    System.out.println("-----------------------------------------------------------------");
                    menuPrestar();
                    System.out.println("-----------------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("Lo siento, aun no se ha creado esta funcionalidad :(");
                    System.out.println("-----------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("Lo siento, aun no se ha creado esta funcionalidad :(");
                    System.out.println("-----------------------------------------------------------------");
                    break;
                case 4:
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("Lo siento, aun no se ha creado esta funcionalidad :(");
                    System.out.println("-----------------------------------------------------------------");
                    break;
                case 5:
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("Lo siento, aun no se ha creado esta funcionalidad :(");
                    System.out.println("-----------------------------------------------------------------");
                 
                    break;
                case 6:
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("Cerrando El Sistema");        
                    System.out.println("-----------------------------------------------------------------");
                    break;

            }//end of the switch
            System.out.println("--------------------------------------------------------------------------------------------");
		
		}while(opcionMenuPrincipal !=6);
		//----------------------------------------------------------------//

	}
	
	//first menu of function 1
	static int opcionMenuPrestar = 0;
	static void menuPrestar() {

		
	       //----------------------------------------------------------------//
			Scanner sc = new Scanner(System.in);
			
			do {
				System.out.println(" ------ PRESTAR------ ");

				System.out.println("1. Libro");
				System.out.println("2. Computadora");
				System.out.println("3. Laptop");
				System.out.println("4. Regresar");
				System.out.println("5. Salir del Sistema");
				System.out.println(" Por favor ingrese su opcion:");
				
				opcionMenuPrestar = sc.nextInt(); //reader of opcion1 type by the user
				sc.nextLine(); //buffer cleaner 
	            switch (opcionMenuPrestar) {
	                case 0:

	                break;
	                case 1:
	                    System.out.println("-----------------------------------------------------------------");
	                    Lector lector = getUser();
	                    
	                    System.out.println("-----------------------------------------------------------------");
	                    break;
	                case 2:
	                    System.out.println("-----------------------------------------------------------------");
	                    System.out.println("Lo siento, aun no se ha creado esta Opcion :(");
	                    System.out.println("-----------------------------------------------------------------");
	                    break;
	                case 3:
	                    System.out.println("-----------------------------------------------------------------");
	                    System.out.println("Lo siento, aun no se ha creado esta Opcion :(");
	                    System.out.println("-----------------------------------------------------------------");
	                    break;
	                case 4:
	                    System.out.println("-----------------------------------------------------------------");
	                    System.out.println("Regresando al menu anterior");
	                    System.out.println("-----------------------------------------------------------------");
	                    break;
	                case 5:
	                    System.out.println("-----------------------------------------------------------------");
	                    System.out.println("Saliendo del sistema");
	                    opcionMenuPrincipal = 6;
	                    System.out.println("-----------------------------------------------------------------");
	                 
	                    break;

	            }//end of the switch
				
			
			}while(opcionMenuPrestar !=4 && opcionMenuPrestar !=5);
	}
	//upload temporary objects  
	
    //upload temporary objects
	static void cargarObjetos() {
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
		Libro libro19 = new Libro("Ciencia ficción", 19, "Dune", "Frank Herbert", "Chilton Books", 1965);
		Libro libro20 = new Libro("Novela histórica", 20, "Yo, Claudio", "Robert Graves", "Penguin Books", 1934);
		Libro libro21 = new Libro("Fantasía", 21, "El señor de los anillos", "J.R.R. Tolkien", "George Allen & Unwin", 1954);
		Libro libro22 = new Libro("Ciencia ficción", 22, "El fin de la eternidad", "Isaac Asimov", "Doubleday", 1955);
		Libro libro23 = new Libro("Novela histórica", 23, "Los pilares de la Tierra", "Ken Follett", "William Morrow and Company", 1989);
		Libro libro24 = new Libro("Fantasía", 24, "Harry Potter y la piedra filosofal", "J.K. Rowling", "Bloomsbury", 1997);
		Libro libro25 = new Libro("Ciencia ficción", 25, "La mano izquierda de la oscuridad", "Ursula K. Le Guin", "Ace Books", 1969);

		// creating libraries
		Biblioteca biblioteca1 = new Biblioteca("Carrera 7 # 32-10", Facultad.MINAS, "Hernan Garces Gonzalez");
		Biblioteca biblioteca2 = new Biblioteca("59A No. 63-20", Facultad.UNIVERSIDAD, "Efe Gomez");
		Biblioteca biblioteca3 = new Biblioteca("59A No. 63-20", Facultad.CIENCIAS, "El Rio");

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
		// adding books to biblioteca3
		biblioteca3.agregarLibro(libro19);
		biblioteca3.agregarLibro(libro20);
		biblioteca3.agregarLibro(libro21);
		biblioteca3.agregarLibro(libro22);
		biblioteca3.agregarLibro(libro23);
		biblioteca3.agregarLibro(libro24);
		biblioteca3.agregarLibro(libro25);

		// creating students
		Estudiante estudiante1 = new Estudiante("Juan", "Perez", 20, "Carrera 12 # 34-56", "CC", 123456, false,
				Facultad.MINAS);
		Estudiante estudiante2 = new Estudiante("Maria", "Gonzalez", 22, "Carrera 10 # 20-30", "TI", 654321, true,
				Facultad.CIENCIAS);
		Estudiante estudiante3 = new Estudiante("Pedro", "Garcia", 19, "Carrera 8 # 12-34", "CC", 987654, false,
				Facultad.CIENCIAS_AGRARIAS);

		// creating librarians

		Bibliotecario bibliotecario1 = new Bibliotecario("BIBLIOTECARIO", "DEFECTO", 18, "DIRECCION NO APLICA", "TIPO DE DOCUMENTO NO APLICA", 00000000,
				"ADMIN123", "USUARIODEFECTO@UNAL.EDU.CO");
		Bibliotecario bibliotecario2 = new Bibliotecario("Estiven", "Ospina Jaramillo", 19, "Calle 45 # 20-2", "CC", 623253344,
				"admin123", "eospinaj@unal.edu.co");
		Bibliotecario bibliotecario3 = new Bibliotecario("snoopy", "alfonso", 21, "Calle 23 # 1-40", "CC", 423223344,
				"admin123", "admin123@unal.edu.co");

		// adding librarians to libraries
		biblioteca1.agregarBibliotecario(bibliotecario1);
		biblioteca2.agregarBibliotecario(bibliotecario1);
		biblioteca3.agregarBibliotecario(bibliotecario1);
		
		biblioteca1.agregarBibliotecario(bibliotecario2);
		biblioteca3.agregarBibliotecario(bibliotecario3);
		
		
	}
   
	//menu register user
	static int opcionRegisterUser = 0;
	static void registerUser(){
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("--DESEA REGISTRAR EL USUARIO?");

			System.out.println("1. Registrar");
			System.out.println("2. intentar de nuevo el documento");
			System.out.println("3. regresar al menu anterior");
			System.out.println("4. cerrar el sistema");

			
			opcionRegisterUser = sc.nextInt(); //reader of opcion1 type by the user
			sc.nextLine(); //buffer cleaner 
			
            switch (opcionRegisterUser) {
            case 0:

            break;
            case 1:
                System.out.println("-----------------------------------------------------------------");
                System.out.println("Registrar");
                System.out.println("-----------------------------------------------------------------");
                Lector.registerUser();
                System.out.println("-----------------------------------------------------------------");
                break;
            case 2:
                System.out.println("-----------------------------------------------------------------");
                System.out.println("intentar el documento de nuevo");
                opcionGetUser = 0;
                System.out.println("-----------------------------------------------------------------");
                break;
            case 3:
                System.out.println("-----------------------------------------------------------------");
                System.out.println("regresar al menu anterior");
                opcionGetUser =1;
                System.out.println("-----------------------------------------------------------------");
                break;
            case 4:
                System.out.println("-----------------------------------------------------------------");
                System.out.println("Saliendo del sistema");
                opcionGetUser =1;
                opcionMenuPrestar = 5;
                opcionMenuPrincipal = 6;
                System.out.println("-----------------------------------------------------------------");
                break;


        }//end of the switch
			
		}while(opcionRegisterUser != 3 && opcionRegisterUser != 4 && opcionRegisterUser != 2);
	}

    //menu SearchUser
	static Lector searchUser(){
		Scanner sc = new Scanner(System.in);
		System.out.println("por favor ingrese su documento: ");
		
		int documento = sc.nextInt(); //reader of document
		sc.nextLine(); //buffer cleaner 
		
		return Lector.buscarLector(documento);
		
	}

    //menu getUser
	static int opcionGetUser = 0;
	static Lector getUser() {
		Lector user = null;
		do {
			user = searchUser();
			if (user == null) {
			    registerUser();
			}else {opcionGetUser =1;}
			
		}while(opcionGetUser != 1);
		
		return user;
		   
	}

}

