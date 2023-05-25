package uiMain;

import java.util.ArrayList;
import java.util.Scanner;

import baseDatos.Deserializador;
import baseDatos.Serializador;
import gestorAplicacion.gestion.Biblioteca;
import gestorAplicacion.gestion.Computador;
import gestorAplicacion.gestion.Facultad;
import gestorAplicacion.gestion.Laptop;
import gestorAplicacion.gestion.Libro;
import gestorAplicacion.usuario.Bibliotecario;
import gestorAplicacion.usuario.Estudiante;
import gestorAplicacion.usuario.Lector;
import gestorAplicacion.usuario.Persona;
import gestorAplicacion.usuario.Profesor;

public class Main {
	
	
	//--------OBJETOS CREADOS-----------//

    static void serializar(){
        Serializador.serializarTodo();}
    static void deserializar(){
            Deserializador.deserializarTodo();}
	
	
	//----------------------------------//
	static void cargarObjetos() {
		// creating books
		Libro libro1 = new Libro("Ciencia ficción", 1, "Dune", "Frank Herbert", "Ace Books", 1965);
		Libro libro2 = new Libro("Novela histórica", 2, "Los Pilares de la Tierra", "Frank Herbert", "Editorial Planeta",
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
		Estudiante estudiante2 = new Estudiante("Maria", "Gonzalez", 22, "Carrera 10 # 20-30", "TI", 1234567, true,
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
		
		
		
		//COMPUTERS
        Computador computador1 = new Computador("Dell", "Inspiron 2002", 16, 1000, 4);
        Computador computador2 = new Computador("HP", "Pavilion 2005", 8, 500, 5);
        Computador computador3 = new Computador("Lenovo", "ThinkPad 2004", 32, 2000, 6);
        Computador computador4 = new Computador("Apple", "MacBook 2023", 16, 512, 7);
        
		
        Laptop laptop1 = new Laptop("Marca1", "Modelo 2002", 8, 500, 1);
        Laptop laptop2 = new Laptop("Marca2", "Modelo 2020", 16, 1000, 2);
        Laptop laptop3 = new Laptop("Marca3", "Modelo 2023", 32, 2000, 3);
        
        biblioteca1.agregarComputador(computador1);
        biblioteca1.agregarComputador(computador2);
        biblioteca1.agregarComputador(computador3);
        
        
        
        biblioteca1.agregarLaptopDisponible(laptop1);
        biblioteca1.agregarLaptopDisponible(laptop2);
        biblioteca1.agregarLaptopDisponible(laptop3);
	}
	
    public static Computador crearComputadorPorConsola() {
        System.out.println("Ingrese los datos del computador:");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        
        System.out.print("Capacidad de RAM: ");
        int capacidadRAM = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Capacidad de disco duro: ");
        int capacidadDiscoDuro = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        Computador computador = new Computador(marca, modelo, capacidadRAM, capacidadDiscoDuro, id);
        return computador;
    }

    
    //---------------  MAIN --------------------//
    
    
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	    //cargarObjetos();
		crearComputadorPorConsola();
	    deserializar();
	    
	    System.out.println(Computador.computadoresExistentes.get(28).getId());
	    boolean stop = false;
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
	        if ((usuario.equalsIgnoreCase("/salir")) || (usuario.equalsIgnoreCase("/SALIR"))) {
	            System.out.println("CERRANDO EL PROGRAMA");
	            break;
	        }
	        System.out.println("Password: ");
	        contraseña = sc.nextLine();
	        if ((contraseña.equalsIgnoreCase("/salir")) || (contraseña.equalsIgnoreCase("/SALIR"))) {
	            System.out.println("CERRANDO EL PROGRAMA");
	            break;
	        }
	        boolean usuarioEncontrado = false;
	        for (Bibliotecario bibliotecario : Bibliotecario.getBibliotecariosExistentetes()) {
	            if (usuario.equals(bibliotecario.getUsuario()) && contraseña.equals(bibliotecario.getContraseña())) {
	                menuPrincipal(bibliotecario);
	                usuarioEncontrado = true;
	                break;
	            }
	        }
	        if (!usuarioEncontrado) {
	            System.out.println("CONTRASENA O USUARIO INVALIDO");
	        }
	    } while (!stop);
	}

    //------------------------------------------//
	
	//--------MenuPrincipal-----------//
	static int opcionMenuPrincipal = 0; 
	static void menuPrincipal(Bibliotecario bibliotecario) {
	       
	       //----------------------------------------------------------------//
			Scanner sc = new Scanner(System.in);
			
			do {
				System.out.println(" ------ MENU PRINCIPAL------ ");

				System.out.println("1. Prestar");
				System.out.println("2. Informacion Usuario");
				System.out.println("3. GUARDAR");
				System.out.println("4. Crear");
				System.out.println("5. funcionalidad 5");
				System.out.println("6. Salir");
				
				System.out.println("Por favor ingrese su opcion:");
				
				
				if (sc.hasNextInt()) {
					opcionMenuPrincipal = sc.nextInt();
					sc.nextLine(); 
					switch (opcionMenuPrincipal) {
						case 1:
							System.out.println("-----------------------------------------------------------------");
							System.out.println("Prestar");
							System.out.println("-----------------------------------------------------------------");
							menuPrestar(bibliotecario);
							break;
						case 2:
							System.out.println("-----------------------------------------------------------------");
							System.out.println("Informacion Usuario");
							System.out.println("-----------------------------------------------------------------");
							opcionMenuVerInformacionUsuario(bibliotecario);
							break;
						case 3:
							System.out.println("-----------------------------------------------------------------");
							System.out.println("GUARDAR");
							System.out.println("-----------------------------------------------------------------");
							serializar();
							break;
						case 4:
							System.out.println("-----------------------------------------------------------------");
							System.out.println("Crear");
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
						default:
			            	System.out.println("-----------------------------------------------------------------");
							System.out.println("Por favor ingrese una opcion valida");
							System.out.println("-----------------------------------------------------------------"); 
					}
				} else {
					System.out.println("-----------------------------------------------------------------");
					System.out.println("Por favor ingrese una opcion valida"); 
					System.out.println("-----------------------------------------------------------------");
					sc.nextLine();
				}
			} while (opcionMenuPrincipal != 6  );
	}

	//--------------------------------//
	
	//----------------MENUS GENERALES USADOS -----------------//
	    //MenuForm registerUser
	    static void registerUserForm() {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Ingrese el nombre del lector:");
	        String nombre = sc.nextLine();

	        System.out.println("Ingrese el apellido del lector:");
	        String apellido = sc.nextLine();

	        System.out.println("Ingrese la edad del lector:");
	        int edad;
	        while (!sc.hasNextInt()) {
	            System.out.println("Edad inválida. Por favor, ingrese un número válido:");
	            sc.nextLine();
	        }
	        edad = sc.nextInt();
	        sc.nextLine(); // buffer cleaner

	        System.out.println("Ingrese la dirección del lector:");
	        String direccion = sc.nextLine();

	        System.out.println("Ingrese el tipo de identificación del lector:");
	        String tipoId = sc.nextLine();

	        System.out.println("Ingrese el número de identificación del lector:");
	        int id;
	        while (!sc.hasNextInt()) {
	            System.out.println("Número de identificación inválido. Por favor, ingrese un número válido:");
	            sc.nextLine();
	        }
	        id = sc.nextInt();
	        sc.nextLine(); // buffer cleaner

	        System.out.println("Seleccione el tipo de lector a registrar:");
	        System.out.println("1. Estudiante");
	        System.out.println("2. Profesor");

	        int tipoLector;
	        while (!sc.hasNextInt()) {
	            System.out.println("Tipo de lector inválido. Por favor, ingrese un número válido:");
	            sc.nextLine();
	        }
	        tipoLector = sc.nextInt();
	        sc.nextLine(); // buffer cleaner
	        if (tipoLector == 1) {
	            System.out.println("-----------------------------------------------------------------");
	            System.out.println("1. Estudiante");
	            System.out.println("-----------------------------------------------------------------");
	            System.out.println("Ingrese la facultad del estudiante:");
	            System.out.println("");
	            System.out.println("Facultades disponibles:");
	            for (Facultad fac : Facultad.values()) {
	                System.out.println(fac.ordinal() + ". " + fac.getNombre());
	            }
	            int indexFacultad;
	            while (!sc.hasNextInt()) {
	                System.out.println("Facultad inválida. Por favor, ingrese un número válido:");
	                sc.nextLine();
	            }
	            indexFacultad = sc.nextInt();
	            sc.nextLine(); // buffer cleaner
	            Facultad facultad = Facultad.values()[indexFacultad];

	            // creating student
	            Lector.registerUser(nombre, apellido, edad, direccion, tipoId, id, facultad, tipoLector);
	            System.out.println("¡Estudiante registrado exitosamente!");
	        } else if (tipoLector == 2) {

	            // creating professor 
	            Lector.registerUser(nombre, apellido, edad, direccion, tipoId, id, null, tipoLector);
	            System.out.println("¡Profesor registrado exitosamente!");
	        } else {
	            System.out.println("Opción no válida. Intente de nuevo.");
	        }
	        System.out.println("-----------------------------------------------------------------");
	        System.out.println("Para continuar elija de nuevo las opciones que necesita:");
	    }	    
        //menu for searching an user
        static Lector searchUser(){
		Scanner sc = new Scanner(System.in);
		System.out.println("por favor ingrese su documento: ");
		
		int documento = sc.nextInt(); //reader of document
		sc.nextLine(); //buffer cleaner 
		
		Lector lector = Lector.buscarLector(documento);
		if(lector== null) {
	        System.out.println("-----------------------------------------------------------------");
	        System.out.println("Lector no encontrado");
		}
		return lector;
	}
        //menu for getting the user 
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
        //menu for registering a new user
    	static int opcionRegisterUser = 0;
        static void registerUser(){
	Scanner sc = new Scanner(System.in);
	
	do {
		System.out.println("-----------------------------------------------------------------");
		System.out.println("--DESEA REGISTRAR EL USUARIO?");
		System.out.println("");
		System.out.println("1. Registrar");
		System.out.println("2. intentar de nuevo el documento");
		System.out.println("3. regresar al menu anterior");
		System.out.println("4. cerrar el sistema");

        if (sc.hasNextInt()) {
        opcionRegisterUser = sc.nextInt(); //reader of opcion1 type by the user
		sc.nextLine(); //buffer cleaner 
		
        switch (opcionRegisterUser) {
        case 0:

        break;
        case 1:
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Registrar");
            System.out.println("-----------------------------------------------------------------");
            registerUserForm();
            opcionRegisterUser = 3;
            opcionGetUser =1;
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
            System.out.println("-----------------------------------------------------------------");
            opcionGetUser =1;
            
            break;
        case 4:
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Saliendo del sistema");
            opcionGetUser =1;
            opcionMenuPrestar = 5;
            opcionMenuPrincipal = 6;
            System.out.println("-----------------------------------------------------------------");
            break;
         default:
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Por favor ingrese una opcion valida"); 
				System.out.println("-----------------------------------------------------------------");

    }//end of the switch	
		} else {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Por favor ingrese una opcion valida"); 
			System.out.println("-----------------------------------------------------------------"); 
			sc.nextLine(); 
		}

		
	}while(opcionRegisterUser != 3 && opcionRegisterUser != 4 && opcionRegisterUser != 2);
}
        //menu for selecting a library
        static Biblioteca seleccionBiblioteca(Lector user) {
    		
    		ArrayList<Biblioteca> bibliotecasDisponibles = new ArrayList<>();
    		if (user == null) {
    			return null;
    		}else if(user.isReporte() == true){
    			System.out.println("-----------------------------------------------------------------");
    			System.out.println("El usuario tiene un reporte en progreso");
    			System.out.println("-----------------------------------------------------------------");
    		}
    		else {
    		    if(user instanceof Estudiante) {
    		        Estudiante estudiante = (Estudiante) user;

    		        //----------------------HERE IS THE METHOD SEARCHED !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    		        bibliotecasDisponibles = estudiante.buscarBibliotecas(estudiante.getId());
    		        //--------------------------------------------------------------------------
    		    } else if(user instanceof Profesor) {
    		        Profesor profesor = (Profesor) user;
    		      //----------------------HERE IS THE METHOD SEARCHED !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    		        bibliotecasDisponibles = profesor.buscarBibliotecas(profesor.getId());
    		      //--------------------------------------------------------------------------
    		    }
    		    
    		    do {
    		    	System.out.println("-----------------------------------------------------------------");
    		        System.out.println("BIBLIOTECAS DISPONIBLES:");
    		        System.out.println("");
    		        int index = 1;
    		        for (Biblioteca biblioteca : bibliotecasDisponibles) {
    		            System.out.println(index + ". " + biblioteca.getNombre());
    		            index++;
    		        }
    		        
    		        System.out.println(index + ". Regresar al menu anterior");
    		        System.out.print("Seleccione una opcion: ");
    		        if (sc.hasNextInt()) {
    		        	
    		        int opcion = sc.nextInt();
    		        sc.nextLine(); 
    		         System.out.println("-----------------------------------------------------------------");
    		        if (opcion == index) {
    		            break;
    		        } else if (opcion > 0 && opcion < index) {
    		            Biblioteca bibliotecaSeleccionada = bibliotecasDisponibles.get(opcion-1);
    		            System.out.println("BIBLIOTECA SELECCIONADA: " + bibliotecaSeleccionada.getNombre());
    		            System.out.println("-----------------------------------------------------------------");
    		              
    		            return bibliotecaSeleccionada;
    		        } else {

    					System.out.println("Por favor ingrese una opcion valida"); 
    		        }
    				} else {
    					System.out.println("-----------------------------------------------------------------");
    					System.out.println("Por favor ingrese una opcion valida"); 

    					sc.nextLine(); 
    				}

    		    } while (true);
    		}
    		return null;
    		
    	} 
    //--------------------------------------------------------//	
	
	//-----------------------------------------FUNCIONALIDAD 1 (PRESTAR)  --------------------------------// 
	
	    //menu for selecting what is the object to borrow (book, lap top, PC )
	    static int opcionMenuPrestar = 0;
	    static void menuPrestar(Bibliotecario bibliotecario) {
	       
			Scanner sc = new Scanner(System.in);
			
			do {

				System.out.println("1. Libro");
				System.out.println("2. Computadora");
				System.out.println("3. Laptop");
				System.out.println("4. Regresar");
				System.out.println("5. Salir del Sistema");
				System.out.println(" Por favor ingrese su opcion:");
				
				
				if (sc.hasNextInt()) {
					opcionMenuPrestar = sc.nextInt();
					sc.nextLine(); 
					
	            switch (opcionMenuPrestar) {
	                case 0:

	                break;
	                case 1:
	                    System.out.println("-----------------------------------------------------------------");
	    				System.out.println("Libro");	                    
	                    System.out.println("-----------------------------------------------------------------");
	                    
	                    Lector user1 = getUser();
	                    Biblioteca biblioteca1 =seleccionBiblioteca(user1);
	                    Libro libro1 = seleccionTipoBusquedaLibroPrestar(biblioteca1, user1 );
	                    
	                    asignarLibro(user1,biblioteca1,libro1,bibliotecario);
	                    
	                    
	                    break;
	                case 2:
	                    System.out.println("-----------------------------------------------------------------");
	                    System.out.println("Computadora");
	                    System.out.println("-----------------------------------------------------------------");
	                    
	                    Lector user2 = getUser();
	                    Biblioteca biblioteca2 = seleccionBiblioteca(user2);
	                    
	                    Computador computador2 = seleccionComputadora( bibliotecario, user2, biblioteca2); 
	                    
	                    asignarComputador(computador2,bibliotecario,user2,biblioteca2);
	                    break;
	                case 3:
	                    System.out.println("-----------------------------------------------------------------");
	                    System.out.println("Laptop");
	                    System.out.println("-----------------------------------------------------------------");
	                    
	                    Lector user3 = getUser();
	                    Biblioteca biblioteca3 = seleccionBiblioteca(user3);
	                    
	                    menuLaptopTransporte( bibliotecario, user3, biblioteca3); 
	                    
	                    
	                    
	                    break;
	                case 4:
	                    System.out.println("-----------------------------------------------------------------");
	                    System.out.println("Regresando al menu anterior");
	                    break;
	                case 5:
	                    System.out.println("-----------------------------------------------------------------");
	                    System.out.println("Saliendo del sistema");
	                    opcionMenuPrincipal = 6;
	                    System.out.println("-----------------------------------------------------------------");
	                
	                    break;
	                default:
	 	            	System.out.println("-----------------------------------------------------------------");
						System.out.println("Por favor ingrese una opcion valida");
						System.out.println("-----------------------------------------------------------------");
	                }//end of the switch
	            }else {
	            	System.out.println("-----------------------------------------------------------------");
					System.out.println("Por favor ingrese una opcion valida");
					System.out.println("-----------------------------------------------------------------");
					sc.nextLine();
				
			}
			
		}while(opcionMenuPrestar !=4 && opcionMenuPrestar !=5);
	}
	     
            
	                          //==============menus to borrow a book=============//
	//menu prestarLibro
		        //menu for selecting the type of way for searching a book 
		        static int seleccionTipoBusquedaLibro = 0;
		        static Libro seleccionTipoBusquedaLibroPrestar(Biblioteca biblioteca, Lector user) {
			Scanner sc = new Scanner(System.in);
			
			if(biblioteca != null) {
				do {

					System.out.println("1. Genero");
					System.out.println("2. Id del libro");
					System.out.println("3. Titulo y Autor");
					System.out.println("4. Regresar");
					System.out.println("5. Salir del Sistema");
					System.out.println(" Por favor ingrese su opcion:");
					
					
					if (sc.hasNextInt()) {
					seleccionTipoBusquedaLibro = sc.nextInt(); //reader of opcion1 type by the user
					sc.nextLine(); //buffer cleaner 
		            switch (seleccionTipoBusquedaLibro) {
		                case 0:

		                break;
		                case 1:
		                    System.out.println("-----------------------------------------------------------------");
		    				System.out.println("Genero");	                    
		                    System.out.println("-----------------------------------------------------------------");
		                    return filtrarLibros(1,biblioteca);
		                case 2:
		                    System.out.println("-----------------------------------------------------------------");
		                    System.out.println("Id del libro");
		                    System.out.println("-----------------------------------------------------------------");
		                    return filtrarLibros(2,biblioteca);
		                case 3:
		                    System.out.println("-----------------------------------------------------------------");
		                    System.out.println("Titulo y Autor");
		                    System.out.println("-----------------------------------------------------------------");
		                    return filtrarLibros(3,biblioteca);
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
						default:
			            	System.out.println("-----------------------------------------------------------------");
							System.out.println("Por favor ingrese una opcion valida");
							System.out.println("-----------------------------------------------------------------");
		            }//end of the switch
		            
					}else {
						System.out.println("-----------------------------------------------------------------");
						System.out.println("Por favor ingrese una opcion valida"); 
						System.out.println("-----------------------------------------------------------------");
						sc.nextLine();
					}

					
				
				}while(seleccionTipoBusquedaLibro !=4 && seleccionTipoBusquedaLibro !=5);
			}
			return null;
		}
    
                //menu for filter the book that the users is searching	//filter of books

		        static Libro filtrarLibros(int opcion, Biblioteca biblioteca){
		ArrayList<String> generos  = new ArrayList<>();
		ArrayList<Integer> ids  = new ArrayList<>();
		if (opcion == 1) {
		    for(Libro libro : biblioteca.getLibrosDisponibles()) {
		        if (!generos.contains(libro.getGenero())) {
		            generos.add(libro.getGenero());
		        }
		    }
		    
		    do {
		        System.out.println("Generos Disponibles:");
		        System.out.println("");
		        int index = 1;
		        for (String genero : generos) {
		            System.out.println(index + ". " + genero);
		            index++;
		        }
		        System.out.println(index + ". Regresar al menú anterior");
		        System.out.print("Seleccione una opción: ");
		        if (sc.hasNextInt()) {
		        int generoSeleccionadoOpcion = sc.nextInt();
		        sc.nextLine(); 
		        
		        if (generoSeleccionadoOpcion == index) {
		        	System.out.println("-----------------------------------------------------------------");
		            break;
		        } else if (generoSeleccionadoOpcion > 0 && generoSeleccionadoOpcion < index) {
		            String generoSeleccionado = generos.get(generoSeleccionadoOpcion-1);
		            System.out.println("-----------------------------------------------------------------");
		            System.out.println("Genero Seleccionado: " + generoSeleccionado);
		            System.out.println("-----------------------------------------------------------------");
		            
		    	    
		            //---------------------------------------------------------------------------------------//
		            
    		        //----------------------HERE IS THE METHOD SEARCHED !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    		        ArrayList<Libro> librosPorGenero  = biblioteca.LibrosFiltrados(generoSeleccionado);
    		        //--------------------------------------------------------------------------
		            
		            
		    	    do {
		    	        System.out.println("Libros Disponibles:");
		    	        System.out.println("");
		    	        int index2 = 1;
		    	        System.out.printf("%-10s %-10s %-20s %-40s %-15s %-20s %-20s%n"," OPCION", "ID", "Genero", "Titulo", "Autor", "Editorial", "Ano de publicacion");
		    	        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
		    	        for (Libro libro : librosPorGenero) {
		    	        	
		    	        	
		    	            System.out.printf( " %-10s %-5d %-20s %-40s %-20s %-20s %-20d%n",index2, libro.getId(), libro.getGenero(), libro.getTitulo(), libro.getAutor(), libro.getEditorial(), libro.getAnioPublicacion());
		    	            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
		    	            index2++;
		    	        }
		    	        System.out.println(index2 + ". Regresar al menu anterior");
		    	        System.out.print("Seleccione una opcion: ");
	    		        if (sc.hasNextInt()) {
	    		        int libroSeleccionadoOpcion = sc.nextInt();
		    	        sc.nextLine(); 
		    	        
		    	        if (libroSeleccionadoOpcion == index2) {
		    	        	System.out.println("-----------------------------------------------------------------");
		    	            break;
		    	        } else if (libroSeleccionadoOpcion > 0 && libroSeleccionadoOpcion < index2) {
		    	            Libro libroSeleccionado = librosPorGenero.get(libroSeleccionadoOpcion-1);
		    	            System.out.println("-----------------------------------------------------------------");
		    	            System.out.println("Genero Seleccionado: " + libroSeleccionado.getTitulo());
		    	            System.out.println("-----------------------------------------------------------------");
		    	            return libroSeleccionado;
		    	        } else {
	    					System.out.println("-----------------------------------------------------------------");
	    					System.out.println("Por favor ingrese una opcion valida"); 
	    					System.out.println("-----------------------------------------------------------------");
		    	        }
	    		        	
	    				} else {
	    					System.out.println("-----------------------------------------------------------------");
	    					System.out.println("Por favor ingrese una opcion valida"); 
	    					System.out.println("-----------------------------------------------------------------");
	    					sc.nextLine(); 
	    				}

		    	    } while (true);
		            //-----------------------------------------------------------------------------------//
		    	    
		    	    
		        } else {
		            System.out.println("Opción no válida. Intente de nuevo.");
		        }
		        	
				} else {
					System.out.println("-----------------------------------------------------------------");
					System.out.println("Por favor ingrese una opcion valida"); 
					System.out.println("-----------------------------------------------------------------");
					sc.nextLine(); 
				}


		    } while (true);
		}
		
		
		else if (opcion == 2) {
		    for(Libro libro : biblioteca.getLibrosDisponibles()) {
		        if (!ids.contains(libro.getId())) {
		            ids.add(libro.getId());
		        }
		    }
		    

		    
		    
		    
            int libroNoEncontradoOpcion = 0;
            int libroEncontradoOpcion = 0;
		    do {
		    	System.out.println("Ingrese el ID :");
		    	
			    if (sc.hasNextInt()) {
			    	
			    int idSeleccionado = sc.nextInt();
    	        
    	        sc.nextLine(); // buffer cleaner
		    	
    	        if(biblioteca.LibrosFiltrados(idSeleccionado) != null) {
    	        	
    		        //----------------------HERE IS THE METHOD SEARCHED !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    		        Libro libroSeleccionado = biblioteca.LibrosFiltrados(idSeleccionado);
    		        //--------------------------------------------------------------------------
    	        	
   	        	    System.out.println("-----------------------------------------------------------------");
   	        	    System.out.println("Libro  encontrado");
   	        	    System.out.println("-----------------------------------------------------------------");
    	        	System.out.println(" ");
    	        	System.out.printf("%-10s %-20s %-40s %-15s %-20s %-20s%n", "ID", "Genero", "Titulo", "Autor", "Editorial", "Ano de publicacion");
	    	        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
	    	        System.out.printf( "%-5d %-20s %-40s %-20s %-20s %-20d%n",libroSeleccionado.getId(), libroSeleccionado.getGenero(), libroSeleccionado.getTitulo(), libroSeleccionado.getAutor(), libroSeleccionado.getEditorial(), libroSeleccionado.getAnioPublicacion());
    	            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
    	        	System.out.println(" ");
    	        	System.out.println("Es este el libro que busca el lector?");
    	        	do {
    	        		System.out.println("1. Si");
    	        		System.out.println("2. No");
    	        		if (sc.hasNextInt()) {
    	        	    libroEncontradoOpcion = sc.nextInt();
    	    	        
    	    	        sc.nextLine(); // buffer cleaner
    	    	        
    	    	        switch (libroEncontradoOpcion) {
    	    	        case 1:
    	    	        	 System.out.println( "Libro Seleccionado : "+ libroSeleccionado.getTitulo());
    	    	        	 return libroSeleccionado;
    	    	        case 2:
    	    	        	 System.out.println("-----------------------------------------------------------------");
    	    	        	 System.out.println("regresar al menu anterior");
    	    	        	 System.out.println("-----------------------------------------------------------------");
    	    	        }
    	    	        break;
    	        		}else {
    						System.out.println("-----------------------------------------------------------------");
    						System.out.println("Por favor ingrese una opcion valida"); 
    						System.out.println("-----------------------------------------------------------------");
    	        		}

    	        	}while(true);
    	        	break;
    	        }else {
    	        	 System.out.println("-----------------------------------------------------------------");
    	        	 System.out.println("Libro no encontrado");
    	        	 System.out.println("-----------------------------------------------------------------");
    	        	 
    	        	do {
    	        		System.out.println("1. intentar de nuevo el ID");
    	        		System.out.println("2. regresar al menu anterior");
    	        		
    	        		if (sc.hasNextInt()) {
    	        		libroNoEncontradoOpcion = sc.nextInt();
    	    	        
    	    	        sc.nextLine(); // buffer cleaner
    	    	        
    	    	        switch (libroNoEncontradoOpcion) {
    	    	        case 1:
    	    	        	 System.out.println("-----------------------------------------------------------------");
    	    	        	 System.out.println("intentar el ID de nuevo");
    	    	        	 System.out.println("-----------------------------------------------------------------");
    	    	        	 break;
    	    	        case 2:
    	    	        	 System.out.println("-----------------------------------------------------------------");
    	    	        	 System.out.println("regresar al menu anterior");
    	    	        	 System.out.println("-----------------------------------------------------------------");
    	    	        }
    	    	        break;	
    	        			
    	        		}else {
    						System.out.println("-----------------------------------------------------------------");
    						System.out.println("Por favor ingrese una opcion valida"); 
    						System.out.println("-----------------------------------------------------------------");
    	        		}

    	        	}while(true);
    	        	
    	        }
			    	
			    } else {
					System.out.println("-----------------------------------------------------------------");
					System.out.println("Por favor ingrese una opcion valida"); 
					System.out.println("-----------------------------------------------------------------");
			        sc.next();
			    }
			    
			    

    	        
		    }while(libroNoEncontradoOpcion != 2);
		    

		    
		}
		else if (opcion == 3) {
            //---------------------------------------------------------------------------------------//
			
	        //----------------------HERE IS THE METHOD SEARCHED !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	        ArrayList<Libro> librosPosibles  = biblioteca.LibrosFiltrados();
	        //--------------------------------------------------------------------------
            
            
    	    do {
    	        System.out.println("Libros Posibles:");
    	        System.out.println("");
    	        int index3 = 1;
    	        System.out.printf("%-10s %-10s %-20s %-40s %-15s %-20s %-20s%n"," OPCION", "ID", "Genero", "Titulo", "Autor", "Editorial", "Ano de publicacion");
    	        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
    	        for (Libro libro : librosPosibles) {
    	        	
    	        	
    	            System.out.printf( " %-10s %-5d %-20s %-40s %-20s %-20s %-20d%n",index3, libro.getId(), libro.getGenero(), libro.getTitulo(), libro.getAutor(), libro.getEditorial(), libro.getAnioPublicacion());
    	            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
    	            index3++;
    	        }
    	        System.out.println(index3 + ". Regresar al menu anterior");
    	        System.out.print("Seleccione una opcion: ");
    	        
    	        if (sc.hasNextInt()) {
    	        	
    	        int libroSeleccionadoOpcion = sc.nextInt();
    	        sc.nextLine(); 
    	        
    	        if (libroSeleccionadoOpcion == index3) {
    	        	System.out.println("-----------------------------------------------------------------");
    	            break;
    	        } else if (libroSeleccionadoOpcion > 0 && libroSeleccionadoOpcion < index3) {
    	            Libro libroSeleccionado = librosPosibles.get(libroSeleccionadoOpcion-1);
    	            System.out.println("-----------------------------------------------------------------");
    	            System.out.println("Genero Seleccionado: " + libroSeleccionado.getTitulo());
    	            System.out.println("-----------------------------------------------------------------");
    	            return libroSeleccionado;
    	        } else {
					System.out.println("-----------------------------------------------------------------");
					System.out.println("Por favor ingrese una opcion valida"); 
					System.out.println("-----------------------------------------------------------------");
    	        }
    	        }else {
					System.out.println("-----------------------------------------------------------------");
					System.out.println("Por favor ingrese una opcion valida"); 
					System.out.println("-----------------------------------------------------------------");
			        sc.next();
			    }

    	    } while (true);
            //-----------------------------------------------------------------------------------//
			
		}
		return null;
	}
                //menu for assigning the book 
	//assign book
	            static void asignarLibro(Lector user, Biblioteca biblioteca,Libro libro, Bibliotecario bibliotecario){
	            	if(libro != null) {
	            		libro.asignarLibro(user, biblioteca, bibliotecario);
	            		user.hacerReporte();
	            	}
	            	
	            	
	            		
	            	
		        
	             }
                              //==================================================//
	            
                             //==============menus to borrow a computer=============//
	            
	       
	            public static Computador seleccionComputadora(Bibliotecario bibliotecario, Lector user, Biblioteca biblioteca) {
	                if (bibliotecario != null && biblioteca != null && user != null) {
	                    if (biblioteca.getComputadoresDisponibles().isEmpty()) {
	                        System.out.println("No hay computadoras disponibles en esta biblioteca.");
	                        return null;
	                    }

	                    System.out.println("Opciones de computadoras disponibles:");
	                    for (int i = 0; i < biblioteca.getComputadoresDisponibles().size(); i++) {
	                        Computador computadora = biblioteca.getComputadoresDisponibles().get(i);
	                        System.out.println((i + 1) + ". " + computadora.getModelo());
	                    }

	                    System.out.println("Seleccione una opción (1-" + biblioteca.getComputadoresDisponibles().size() + "):");

	                    Scanner scanner = new Scanner(System.in);
	                    int opcion = scanner.nextInt();

	                    if (opcion < 1 || opcion > biblioteca.getComputadoresDisponibles().size()) {
	                        System.out.println("Opción inválida.");
	                        return null;
	                    }

	                    return biblioteca.getComputadoresDisponibles().get(opcion - 1);
	                } else {
	                    return null;
	                }
	            }

	            public static void asignarComputador(Computador computadora, Bibliotecario bibliotecario, Lector user, Biblioteca biblioteca) {
	                if (computadora != null && bibliotecario != null && user != null && biblioteca != null) {
	                    user.agregarComputador(computadora);
	                    biblioteca.getComputadoresDisponibles().remove(computadora);
	                    user.hacerReporte();
	                    user.setInforme(user.getInforme() + "COMPUTADOR PRESTADO\n");
	                }
	            }

	            
	                       //==============menus to borrow a lap top =============//
	            public static void menuLaptopTransporte(Bibliotecario bibliotecario, Lector user, Biblioteca biblioteca) {
	                if (bibliotecario == null || user == null || biblioteca == null) {
	                    return;
	                }

	                Scanner scanner = new Scanner(System.in);

	                System.out.println("Desea transportar la laptop fuera de la universidad? (Ingrese el número correspondiente)");
	                System.out.println("1. Sí");
	                System.out.println("2. No");

	                int respuesta = scanner.nextInt();
	                scanner.nextLine();

	                switch (respuesta) {
	                    case 1:
	                        System.out.println("-----------------------------------------------------------------");
	                        System.out.println("Ha seleccionado transportar la laptop fuera de la universidad.");
	                        System.out.println("-----------------------------------------------------------------");

	                        Laptop laptopSeleccionadaCase1 = seleccionLaptop(bibliotecario, user, biblioteca);

	                        if (laptopSeleccionadaCase1 != null) {
	                            String permisoTransporte1 = bibliotecario.crearPermisoTransporte(user, laptopSeleccionadaCase1);

	                            if (!permisoTransporte1.equals("PERMISO-DENEGADO")) {
	                                System.out.println("Ingrese la fecha de transporte (en formato dd/mm/aaaa):");
	                                String fechaTransporte = scanner.next();
	                                scanner.nextLine();
	                                String permisoTransporte2 = laptopSeleccionadaCase1.transportar(permisoTransporte1, fechaTransporte, user.getDireccion());
	                                user.asignarLaptop(permisoTransporte2, biblioteca);
	                                user.hacerReporte();
	                                user.setInforme(user.getInforme() + "LAPTOP PRESTADA\n");
	                                System.out.println("-----------------------------------------------------------------");
	                                System.out.println("LAPTOP PRESTADA");
	                                System.out.println("-----------------------------------------------------------------");
	                            } else {
	                                System.out.println("-----------------------------------------------------------------");
	                                System.out.println("PERMISO DE PRESTAMO DENEGADO");
	                                System.out.println("-----------------------------------------------------------------");
	                            }
	                        }
	                        break;
	                    case 2:
	                        System.out.println("-----------------------------------------------------------------");
	                        System.out.println("Ha seleccionado no transportar la laptop fuera de la universidad.");
	                        System.out.println("-----------------------------------------------------------------");

	                        Laptop laptopSeleccionadaCase2 = seleccionLaptop(bibliotecario, user, biblioteca);

	                        if (laptopSeleccionadaCase2 != null) {
	                            user.asignarLaptop(user.getTipoId() + '/' + bibliotecario.getId() + '/' + laptopSeleccionadaCase2.getId() + '/', biblioteca);
	                            user.hacerReporte();
	                            user.setInforme(user.getInforme() + "LAPTOP PRESTADA\n");
	                            System.out.println("-----------------------------------------------------------------");
	                            System.out.println("LAPTOP PRESTADA");
	                            System.out.println("-----------------------------------------------------------------");
	                        }
	                        break;
	                    default:
	                        System.out.println("-----------------------------------------------------------------");
	                        System.out.println("Respuesta inválida.");
	                        System.out.println("-----------------------------------------------------------------");
	                        break;
	                }
	            }


	            
	            
	            public static Laptop seleccionLaptop(Bibliotecario bibliotecario, Lector user, Biblioteca biblioteca) {
	                if (bibliotecario != null && user != null && biblioteca != null) {
	                    if (biblioteca.getLaptopsDisponibles().isEmpty()) {
	                        System.out.println("No hay laptops disponibles en esta biblioteca.");
	                        return null;
	                    }

	                    System.out.println("Opciones de laptops disponibles:");
	                    for (int i = 0; i < biblioteca.getLaptopsDisponibles().size(); i++) {
	                        Laptop laptop = biblioteca.getLaptopsDisponibles().get(i);
	                        System.out.println((i + 1) + ". " + laptop.getModelo());
	                    }

	                    System.out.println("Seleccione una opción (1-" + biblioteca.getLaptopsDisponibles().size() + "):");

	                    Scanner scanner = new Scanner(System.in);
	                    int opcion = scanner.nextInt();

	                    if (opcion < 1 || opcion > biblioteca.getLaptopsDisponibles().size()) {
	                        System.out.println("Opción inválida.");
	                        return null;
	                    }

	                    return biblioteca.getLaptopsDisponibles().get(opcion - 1);
	                } else {
	                    return null;
	                }
	            }


	            

	       //GENERAL DESCRIPTION:
	            /* this function is based on three main methods from 3 different objects
	                1. BuscarBiblioteca, actually there are two different methods named the same but
	                with a distinct logic, one for the class LECTOR and one for the class PROFESOR, both return
	                the same type of object ArrayList<Biblioteca> and receive the same parameter an integer which is
	                the document of the user. 
	                 !!this method can be found on the menu seleccionBiblioteca!!
	                
	                2.librosFiltrados, this is found on the class BIBLIOTECA, and there is an over charge,
	                can be executed without a parameter, with a string which is the genre or with an integer which 
	                is the iD, this is returning ArrayList<Libro> or a LIBRO itself.
	                 !!this method can be found on the menu  filtrarLibros 
	                 
	                 
	                3.asignarLibro, this is found in the class LIBRO, and receives as a parameter
	                LECTOR , BIBLITOECA it removes the book selected from the availability and adds the book
	                to the user 
	                         !! this can be found on the menu asignarLibro*/
	            
	                
	 //---------------------------------------------------------------------------------------------------//
	     static int opcionMenuVerInformacionUsuario = 0;
		    static void opcionMenuVerInformacionUsuario(Bibliotecario bibliotecario) {
		       
				Scanner sc = new Scanner(System.in);
				
				do {

					System.out.println("1. Ver Informe Usuario");
					System.out.println("2. Ver Objetos Prestados");
					System.out.println("3. Eliminar un usuario");
					System.out.println("4. Regresar");
					System.out.println("5. Salir del Sistema");
					System.out.println(" Por favor ingrese su opcion:");
					
					
					if (sc.hasNextInt()) {
						opcionMenuVerInformacionUsuario = sc.nextInt();
						sc.nextLine(); 
						
		            switch (opcionMenuVerInformacionUsuario) {
		                case 0:

		                break;
		                case 1:
		                    System.out.println("-----------------------------------------------------------------");
		    				System.out.println("Ver Informe Usuario");	                    
		                    System.out.println("-----------------------------------------------------------------");
		                    
		                    Lector user1 = getUser();
		                    System.out.println("-----------------------------------------------------------------");
		                    System.out.println(user1.getInforme());
		                    System.out.println("-----------------------------------------------------------------");
		                    
		                    break;
		                case 2:
		                    System.out.println("-----------------------------------------------------------------");
		                    System.out.println("Ver Objetos Prestados");
		                    System.out.println("-----------------------------------------------------------------");
		                    MenuObjetosPrestados();
		                    break;
		                case 3:
		                    System.out.println("-----------------------------------------------------------------");
		                    System.out.println("Eliminar un usuario");
		                    System.out.println("-----------------------------------------------------------------");
		                    
		                    Lector user2 = getUser();
		                    
		                    eliminarUser(user2);
		                    
		                    break;
		                case 4:
		                    System.out.println("-----------------------------------------------------------------");
		                    System.out.println("Regresando al menu anterior");
		                    break;
		                case 5:
		                    System.out.println("-----------------------------------------------------------------");
		                    System.out.println("Saliendo del sistema");
		                    opcionMenuPrincipal = 6;
		                    System.out.println("-----------------------------------------------------------------");
		                
		                    break;
		                default:
		 	            	System.out.println("-----------------------------------------------------------------");
							System.out.println("Por favor ingrese una opcion valida");
							System.out.println("-----------------------------------------------------------------");
		                }//end of the switch
		            }else {
		            	System.out.println("-----------------------------------------------------------------");
						System.out.println("Por favor ingrese una opcion valida");
						System.out.println("-----------------------------------------------------------------");
						sc.nextLine();
					
				}
				
			}while(opcionMenuVerInformacionUsuario !=4 && opcionMenuVerInformacionUsuario !=5);
		}
		    
		    
		     static int opcionMenuObjetosPrestados = 0;
			    static void MenuObjetosPrestados() {
			       
					Scanner sc = new Scanner(System.in);
					
					do {

			            System.out.println("1. Todos los objetos Prestados");
			            System.out.println("2. Objetos prestados de un usuario");
			            System.out.println("3. Regresar al menú anterior");
			            System.out.println("4. Cerrar el sistema");
			            System.out.print("Elija una opción: ");
						
						
						if (sc.hasNextInt()) {
							opcionMenuObjetosPrestados = sc.nextInt();
							sc.nextLine(); 
							
			            switch (opcionMenuObjetosPrestados) {
			                case 0:

			                break;
			                case 1:
			                    System.out.println("------------------------------------------------------");
			                    System.out.println("Todos los objetos Prestados");
			                    System.out.println("------------------------------------------------------");
			                    
			                    String todosObjetosPrestados = Lector.ObjetosPrestados();
			                    
			                    System.out.println(todosObjetosPrestados);
			                    
			                    break;
			                case 2:
			                    System.out.println("------------------------------------------------------");
			                    System.out.println("Objetos Prestados por usuario específico");
			                    System.out.println("------------------------------------------------------");
			                    Lector user = getUser();
			                    String objetosPrestados= user.objetosPrestadosPorLector(user);
			                    
			                    System.out.println(objetosPrestados);
			                    break;
			                case 3:
			                    System.out.println("-----------------------------------------------------------------");
			                    System.out.println("Regresar al menú anterior");
			                    System.out.println("-----------------------------------------------------------------");

			                    break;
			                default:
			 	            	System.out.println("-----------------------------------------------------------------");
								System.out.println("Por favor ingrese una opcion valida");
								System.out.println("-----------------------------------------------------------------");
			                }//end of the switch
			            }else {
			            	System.out.println("-----------------------------------------------------------------");
							System.out.println("Por favor ingrese una opcion valida");
							System.out.println("-----------------------------------------------------------------");
							sc.nextLine();
						
					}
					
				}while(opcionMenuObjetosPrestados !=3 );
			}
	            
			    static int opcionEliminarUser = 0;

			    static void eliminarUser(Persona user) {

			        Scanner sc = new Scanner(System.in);

			        do {
			            System.out.println("1. Eliminar Permanentemente");
			            System.out.println("2. Suspender");
			            System.out.println("3. Regresar");
			            System.out.println("Por favor ingrese su opción:");

			            if (sc.hasNextInt()) {
			                opcionEliminarUser = sc.nextInt();
			                sc.nextLine();

			                switch (opcionEliminarUser) {
			                    case 1:
			                        System.out.println("-----------------------------------------------------------------");
			                        System.out.println("Eliminar Permanentemente");
			                        System.out.println("-----------------------------------------------------------------");
			                        
			                        if (user instanceof Lector) {
			                            ((Lector) user).desertar();
			                        }
			                        break;
			                    case 2:
			                        System.out.println("-----------------------------------------------------------------");
			                        System.out.println("Suspender");
			                        System.out.println("-----------------------------------------------------------------");

			                        if (user instanceof Estudiante) {
			                            Estudiante estudiante = (Estudiante) user;
			                            user.desertar();
			                            
			                        } else if (user instanceof Profesor) {
			                            Profesor profesor = (Profesor) user;
			                            user.desertar();
			                        } else {
			                            System.out.println("No se puede suspender este tipo de usuario.");
			                        }

			                        break;
			                    case 3:
			                        System.out.println("-----------------------------------------------------------------");
			                        System.out.println("Regresar");
			                        System.out.println("-----------------------------------------------------------------");

			                        break;

			                    default:
			                        System.out.println("-----------------------------------------------------------------");
			                        System.out.println("Por favor ingrese una opción válida");
			                        System.out.println("-----------------------------------------------------------------");
			                }
			            } else {
			                System.out.println("-----------------------------------------------------------------");
			                System.out.println("Por favor ingrese una opción válida");
			                System.out.println("-----------------------------------------------------------------");
			                sc.nextLine();
			            }

			        } while (opcionEliminarUser != 3);
			    }
			    


		        // Método para serializar un bibliotecario


}

