package uiMain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import baseDatos.*; 
import gestorAplicacion.obras.*;
import gestorAplicacion.obras.Libro.tipoLibro;
import gestorAplicacion.personas.*;
import gestorAplicacion.personas.EstudianteProfesor.Rol;


public class Bibliotecario {
	static Scanner sc = new Scanner(System.in);
	static long readLong() {return sc.nextLong();}
	static String readLn() {return sc.nextLine();}



	public static void main(String[] args) {
		//Inicializadores para algunos atributos
		tipoLibro tipo;
		Autor autor = null;
		Estanteria estanteria;
		String[] l1 = new String[2];

		Random random = new Random();
		short numerorando = (short) (random.nextInt(100) + 1);  // Genera un n�mero aleatorio entre 1 y 100
		short piso12 = (short) (random.nextInt(10) + 1);     // Genera un n�mero aleatorio entre 1 y 10
		String[] limites = new String[2];
		limites[0] = "L�mite inferior aleatorio";
		limites[1] = "L�mite superior aleatorio";

		// Se eliminan todos los objetos creados para trabajar solamente con los de los archivos almacenados
		//Deserializador.resetarMemoria();
		Deserializador.deserializar();


		// Crear autor an�nimo y estanter�a vac�a si no oest�n ya creados
		
		ArrayList<Integer> autores_id = new ArrayList<Integer>();
		for(Autor autor1 : Autor.getAutores()) {autores_id.add(autor1.getId());}
		if (!autores_id.contains(0)) {new Autor();}
		
		ArrayList<Short> estanterias_numeros = new ArrayList<Short>();
		for(Estanteria estanteria1 : Estanteria.getLista()) {estanterias_numeros.add(estanteria1.getNumero());}
		if (!estanterias_numeros.contains((short) 0)) {new Estanteria();}
		/*
		ArrayList<Short> persona_numeros = new ArrayList<Short>();
		for(EstudianteProfesor Estudiante1 : EstudianteProfesor.getLista()) {persona_numeros.add(Estudiante1.getNumero());}
		if (!persona_numeros.contains((short) 0)) {new EstudianteProfesor();}
		*/

		Estanteria estanteria3 = new Estanteria((short)19, (short)5, limites);
		Estanteria estanteria4 = new Estanteria((short) 18, (short)6, limites);
		Estanteria estanteria5 = new Estanteria((short) 1, (short) 2, limites);
		Estanteria estanteria6 = new Estanteria((short) 2, (short) 2, limites);
		Estanteria estanteria7 = new Estanteria((short) 3, (short) 1, limites);
		Estanteria estanteria8 = new Estanteria((short) 4, (short) 1, limites);
		Estanteria estanteria9 = new Estanteria((short) 5, (short) 3, limites);
		Estanteria estanteria10 = new Estanteria((short) 6, (short) 4, limites);
		Estanteria estanteria11 = new Estanteria((short)7, (short) 6, limites);
		Estanteria estanteria12 = new Estanteria((short)9, (short) 5, limites);



		//Creaci�n de objetos revistas

		Revista revista3= new Revista((int)1,(String)"Nature",(short) 2000,(short) 1, (short) 103, Revista.Meses.AGOSTO,(String)"primera",estanteria3);
		Revista revista4= new Revista((int)2,(String)"An�lisis Pol�tico",(short) 2023,(short) 10, (short) 104, Revista.Meses.AGOSTO,(String)"primera",estanteria4);
		Revista revista5= new Revista((int)3,(String)"Forbes",(short) 2001,(short) 101, (short) 105, Revista.Meses.OCTUBRE,(String)"segunda",estanteria5);
		Revista revista6= new Revista((int)4,(String)"Rolling Stones",(short) 2003,(short) 123, (short) 100, Revista.Meses.DICIEMBRE,(String)"tercera",estanteria6);
		Revista revista7= new Revista((int)5,(String)"Semana",(short) 2002,(short) 12, (short) 106, Revista.Meses.ENERO,(String)"primera",estanteria7);
		Revista revista8= new Revista((int)6,(String)"Science",(short) 2004,(short) 13, (short) 108, Revista.Meses.FEBRERO,(String)"tercera",estanteria8);
		Revista revista10= new Revista((int)7,(String)"Cell",(short) 2005,(short) 16, (short) 178, Revista.Meses.ABRIL,(String)"primera",estanteria9);



	//Creaci�n de objetos folletos

		Folleto folleto3= new Folleto((int)8,(String) "Pool",(short) 2017,(short)29, (String)"Arte",estanteria10);
		Folleto folleto4= new Folleto((int)9,(String) "Pin",(short) 2016,(short)100, (String)"Biolog�a",estanteria11);
		Folleto folleto7= new Folleto((int)10,(String) "Bed",(short) 2019,(short)290, (String)"Arte",estanteria12);
		Folleto folleto8= new Folleto((int)11,(String) "Amstel",(short) 2014,(short)279, (String)"pol�tica",estanteria3);
		Folleto folleto9= new Folleto((int)12,(String) "Bwin",(short) 2013,(short)39, (String)"Ciencia",estanteria4);

		//Creaci�n de objetos libros
		Autor josepo =new Autor((int)1,(String) "josepo",LocalDate.parse((String)"2000-01-01"),(String)"Col");
		Autor jorge =new Autor((int)2,(String) "Jorge",LocalDate.parse((String)"2000-02-01"),(String)"Col");
		Autor maria =new Autor((int)3,(String) "maria antonia",LocalDate.parse((String)"2001-02-01"),(String)"Col");
		Autor hector =new Autor((int)4,(String) "maria antonia",LocalDate.parse((String)"2001-02-01"),(String)"Col");

		//creacion de libros
		Libro libro3= new Libro((int)13,(String)"Acer",(short)1999,(short)1000,maria,tipoLibro.COLECCION_GENERAL,(String) "medicina",(short) 1,estanteria5);
		Libro libro4= new Libro((int)14,(String)"Acero",(short)1999,(short)1000,jorge,tipoLibro.TESIS,(String) "medicina",(short) 1,estanteria6);
		Libro libro5= new Libro((int)15,(String)"metal",(short)1999,(short)1000,josepo,tipoLibro.INVESTIGACION,(String) "medicina",(short) 1,estanteria7);
		Libro libro6= new Libro((int)16,(String)"haceb",(short)1999,(short)1000,hector,tipoLibro.SEMINARIO,(String) "medicina",(short) 1,estanteria8);
		//creacion de EstudianteProfesor
		EstudianteProfesor juan= new EstudianteProfesor((String)"juan", (int)5,Rol.ESTUDIANTE, (String) "@gmail.com",(int) 312,(String) "cra",LocalDate.parse((String)"2000-01-01"),(String)"Col");
		EstudianteProfesor marco= new EstudianteProfesor((String)"marco", (int)6,Rol.PROFESOR, (String) "1@gmail.com",(int) 311,(String) "cra",LocalDate.parse((String)"2000-01-01"),(String)"Col");
		EstudianteProfesor fidel= new EstudianteProfesor((String)"fidel", (int)7,Rol.ESTUDIANTE, (String) "2@gmail.com",(int) 310,(String) "cra",LocalDate.parse((String)"2000-01-01"),(String)"Col");
		EstudianteProfesor castro= new EstudianteProfesor((String)"castro", (int)8,Rol.PROFESOR, (String) "3@gmail.com",(int) 300,(String) "cra",LocalDate.parse((String)"2000-01-01"),(String)"Col");
		//creacion externo
		Externo armando= new Externo((String)"Armando casas", (int)9, (String) "3@gmail.com",(int) 300,(String) "cra",LocalDate.parse((String)"2000-01-01") ,(String)"Col");
		Externo lusia= new Externo((String)"lusia", (int)10, (String) "3@gmail.com",(int) 300,(String) "cra",LocalDate.parse((String)"2000-01-01") ,(String)"Col");


		///////////////////////////
		 /// INICIO DEL SISTEMA ////
		///////////////////////////
		System.out.println("Hola!\nBienvenido al Sistema de Gesti�n de la Biblioteca");
		
		// Men� de opciones principal
		int opcion;
		do {
			
			
			System.out.println("\nMEN� PRINCIPAL: ");
			System.out.println("-------------------------");
			System.out.println(" 1. A�adir Registros");
			System.out.println(" 2. Mostrar registros");
			System.out.println(" 3. Eliminar registros");
			System.out.println(" 4. Realizar Pr�stamos");
			System.out.println(" 5. Realizar una Renovaci�n");
			System.out.println(" 6. Guardar datos y salir del sistema");
			System.out.println("-------------------------");
		
			System.out.println("Teclee la opci�n(N): ");
			opcion = (int) readLong();readLn();
			
			switch(opcion) {
			
			

			
			
			//////////
			///////
			/// Men� de opciones para registrar 
			///////
			//////////		
			case 1: 
			do {
				System.out.println("\nREGISTRO DE DATOS");
				System.out.println("�Qu� desea registrar?");
				System.out.println("-------------------------");
				System.out.println("Men� de opciones: ");
				System.out.println(" 1. Estanter�a");
				System.out.println(" 2. Publicaci�n");
				System.out.println(" 3. Usuario");
				System.out.println(" 4. Volver al men� principal");
				System.out.println("-------------------------");
				
				System.out.println("Teclee la opci�n(N): ");
				opcion = (int) readLong();readLn();
				
				switch(opcion) {
					case 1: System.out.println("Ingrese los datos de la Estanter�a:");
					
					System.out.println("N�mero (N):"); short n = (short) readLong();
					System.out.println("Piso (N):"); short p = (short) readLong();readLn();
					System.out.println("L�mite inferior (S):");
					String li = readLn();
					System.out.println("L�mite superior (S):"); 
					String ls = readLn();
					String[] l = new String[]{li,ls};

					new Estanteria(n, p, l);
					System.out.println("Estanteria registrada con �xito");
					break;
					
					case 2:// Men� de opciones para publicacion
						System.out.println("-------------------------");
						System.out.println("Tipo de publicacion: ");
						System.out.println(" 1. Libro");
						System.out.println(" 2. Revista");
						System.out.println(" 3. Folleto");
						System.out.println("-------------------------");
						
						System.out.println("Teclee la opci�n (N): ");
						int opcion3;
						opcion3 = (int) readLong();
						
						switch (opcion3) {
						
						// Registro de libro
						case 1: 
						int opcion2;
						tipo = null;						
						do {
						System.out.println("Ingrese los datos del Libro");

						System.out.println("-------------------------");
						System.out.println("Tipo de libro: ");
						System.out.println(" 1. Coleccion General");
						System.out.println(" 2. Reserva");
						System.out.println(" 3. Investigacion");
						System.out.println(" 4. Seminario");
						System.out.println(" 5. Tesis");
						System.out.println("-------------------------");
						System.out.println("Teclee la opci�n (N): ");
						opcion2 = (int) readLong();
						
						switch(opcion2) {
						case 1: tipo = tipoLibro.COLECCION_GENERAL;break;
						case 2: tipo = tipoLibro.RESERVA;break;
						case 3: tipo = tipoLibro.INVESTIGACION;break;
						case 4: tipo = tipoLibro.SEMINARIO;break;
						case 5: tipo = tipoLibro.TESIS;break;
						case 6: break;
						default:
							System.out.println("Tipo de libro inv�lido");break;
						}}while(opcion2 !=1 & opcion2 != 2 & opcion2 != 3 & opcion2 != 4 & opcion2 != 5);

						System.out.println("C�digo (N):"); int cod = (int) readLong();readLn();
						System.out.println("Nombre (S):"); String nombre2 = readLn();
						System.out.println("A�o: (N)"); short aa = (short) readLong();
						System.out.println("Ejemplar (N):"); short ejemplar = (short) readLong();readLn();
						System.out.println("Referencia (S):"); String ref= readLn();
						System.out.println("Volumen (N):"); short vol = (short) readLong();
						
						ArrayList<Integer> id_autores = new ArrayList<Integer>();
						//Almaceno una lista con todos los id de autores
						for(Autor autor1: Autor.getAutores()) {id_autores.add(autor1.getId());}
						int idautor;
						boolean puedo_salir;
						boolean vivo = true;
						int asignar_autor_existente = 0;
						do {
						System.out.println("ID del autor (N):"); idautor = (int) readLong();readLn();
						puedo_salir = true;
						//Comprobaci�n si autor ya est� registrado
						Autor autor2 = null; // autor que tiene el mismo id que el digitado
						if(id_autores.contains(idautor)) {
							puedo_salir = false;
							System.out.println("Ya existe un autor con este c�digo");
							//Buscamos quien es el autor con ese c�digo
							for(Autor autor1 : Autor.getAutores()) {
								if(autor1.getId() == idautor)  {
									autor2 = autor1;
								}
							}
							// Informaci�n del autor que encontramos
							System.out.println(autor2.infoPersonal());
							do {
							System.out.println("�Desea asignar este autor al libro que est� registrando?");
							System.out.println("-------------------------");
							System.out.println(" 1. Si");
							System.out.println(" 2. No");
							System.out.println("-------------------------");
							System.out.println("Teclee la opci�n (N): ");
							asignar_autor_existente = (int) readLong();readLn();
							
							switch(asignar_autor_existente){
							case 1:autor = autor2;break;//Asignacion de autor existente
							case 2: System.out.println("Ingrese un c�digo diferente");
							default: System.out.println("Opci�n no v�lida\nIntente otra vez");
							}
							}while(asignar_autor_existente != 1 & asignar_autor_existente != 2);

							}
						}while(asignar_autor_existente == 2 & !puedo_salir);
		
						int v = 0;
						if (asignar_autor_existente != 1) {
						//CREacion de un autor         -----------------------------------
						vivo = true;
						do {	
							System.out.println("\nIngrese los datos del autor");	
							System.out.println("�Est� vivo el autor?:");
							System.out.println("-------------------------");
							System.out.println(" 1. Si");
							System.out.println(" 2. No");
							System.out.println(" 3. Volver al Men� de Registro");
							System.out.println("-------------------------");
							System.out.println("Teclee la opci�n (N): ");
							v = (int) readLong();readLn();
							
							// Se asigna a la variable vivo un booleano
							switch(v){
							case 1: break;
							case 2: vivo = false; break;
							case 3: break;
							default: System.out.println("Opci�n no v�lida\nIntente otra vez");break;
							}
							
							} while (v !=1 & v !=2 & v !=3);
						}
						
						if(v != 3 & asignar_autor_existente != 1) {
							
							System.out.println("Nombre (S):"); String nautor = readLn();
							System.out.println("Fecha de nacimiento en formato AAAA-MM-DD (S)"); String nacimiento = readLn();
							System.out.println("Pa�s de Origen (S)"); String pais = readLn();
			
							new Autor (idautor, nautor,LocalDate.parse(nacimiento), pais,vivo);
							 
							 System.out.println("Autor registrado con �xito");
						//Fin creacion de un autor          -----------------------------------
						
						
						
						}
						//Inicio de instrucciones sin autor
						
						
						if(v != 3) {
							System.out.println("N�mero de Estanter�a (N):"); short nes = (short) readLong();readLn();
							estanteria = null;
							for (Estanteria e: Estanteria.getLista()) {
								if (e.getNumero() == nes) {estanteria = e;}
							}
							
							new Libro (cod,nombre2,aa,ejemplar,autor,tipo,ref,vol,estanteria);
				
							 System.out.println("Libro registrado con �xito");
							
							
							} // hasta aqui se salta a menu de registro desde vivo autor
						
						break; // cierre de creacion de libro
						
						case 2: System.out.println("Ingrese los datos de la Revista");
						
						// Valores del enumerado Meses en una lista de Strings
						ArrayList<String> list = new ArrayList<String>();
						for (Revista.Meses mes : Revista.Meses.values()) {
							String m = mes.toString();
							list.add(m);}
						readLn();
						System.out.println("Mes en espa�ol y en May�sculas (N):"); String m = readLn();
						if (!list.contains(m)) {System.out.println("Mes inv�lido");
						System.out.println("De vuelta al Men� de Registro de Datos");break;}
						Revista.Meses mes = Revista.Meses.valueOf(m);
						System.out.println("C�digo (N):"); int cod2 = (int) readLong();readLn();
						System.out.println("Nombre (S):"); String nombre3 = readLn();
						System.out.println("A�o (N):");short aa4 = (short) readLong();
						System.out.println("Ejemplar (N):"); short ejemplar1 = (short) readLong();
						System.out.println("N�mero (N):"); short numero = (short) readLong();readLn();
						System.out.println("Temporada (S):"); String temporada = readLn();
						System.out.println("N�mero de Estanter�a (N):");  short es = (short) readLong();readLn();
						estanteria = null;
						for (Estanteria e: Estanteria.getLista()) {
							if (e.getNumero() == es) {estanteria = e;}}
						new Revista (cod2,nombre3,aa4,ejemplar1,numero,mes,temporada,estanteria);
						 System.out.println("Revista registrada con �xito");
						break;
						
						case 3: System.out.println("Ingrese los datos del Folleto");
						
						readLn();
						System.out.println("C�digo (N):"); cod = (int) readLong();readLn();
						System.out.println("Nombre (S):"); nombre2 = readLn();
						System.out.println("A�o (N):"); aa = (short) readLong();
						System.out.println("Ejemplar (N):"); ejemplar = (short) readLong();readLn();
						System.out.println("Referencia (S):"); String ref2 = readLn();
						System.out.println("N�mero de Estanter�a (N):");  short nes = (short) readLong();
						estanteria = null;
						for (Estanteria e: Estanteria.getLista()) {
							if (e.getNumero() == nes) {estanteria = e;}
							}
						new Folleto (cod,nombre2,aa,ejemplar,ref2,estanteria);
						 System.out.println("Folleto registrado con �xito");
						break;
						
						default: 
							System.out.println("Opci�n no v�lida\nDevuelta al Men� de Registro");break;
						} // cierre del switch de registrar publicacion

					break;
					
					
					case 3: // Men� de opciones para usuario
						System.out.println("-------------------------");
						System.out.println("Tipo de usuario: ");
						System.out.println(" 1. Estudiante/profesor");
						System.out.println(" 2. Externo");
						System.out.println(" 3. Volver al Men� de Registro");
						System.out.println("-------------------------");
						System.out.println("Teclee la opci�n (N): ");
						int opcion4;
						opcion4 = (int) readLong();readLn();
						
						switch (opcion4) {
						case 1:
						
						int opcion_rol;
						Rol rol = null;					
						do {
						System.out.println("Ingrese los datos del estudiante/profesor");

						System.out.println("-------------------------");
						System.out.println("Rol: ");
						System.out.println(" 1. Estudiante");
						System.out.println(" 2. Profesor");
						System.out.println(" 3. Otro");
						System.out.println(" 4. Volver al Men� de Registro");
						System.out.println("-------------------------");
						System.out.println("Teclee la opci�n (N): ");
						opcion_rol = (int) readLong();readLn();
						
						switch(opcion_rol) {
						case 1: rol = Rol.ESTUDIANTE;break;
						case 2: rol = Rol.PROFESOR;break;
						case 3: rol = Rol.OTRO;break;
						case 4: break;
						default:
							System.out.println("Tipo de libro inv�lido");break;
						}}while(opcion_rol !=1 & opcion_rol != 2 & opcion_rol != 3 & opcion_rol != 4);
						
						
						if (opcion_rol !=4) {
						System.out.println("Nombre (S):"); String nombre = readLn();
						System.out.println("Id (N):"); int id = (int) readLong();readLn();
						System.out.println("Correo (S):"); String correo = readLn();
						System.out.println("Telefono (N):"); int tel = (int) readLong();readLn();
						System.out.println("Direccion (S):"); String direccion = readLn();
						System.out.println("Fecha de nacimiento en formato AAAA-MM-DD (S):"); String nac = readLn();
						System.out.println("Pa�s de Origen (S):"); String origen = readLn();
						
						new EstudianteProfesor(nombre,id,rol,correo,tel,direccion, LocalDate.parse(nac), origen);
						System.out.println("Estudiante o Profesor registrado con �xito!");
						}
						break;
						
						case 2: System.out.println("Ingrese los datos del usuario externo");
							int u;
							do {
							System.out.println("�Pertenece a alguna Universidad?");
							System.out.println("-------------------------");
							System.out.println(" 1. Si");
							System.out.println(" 2. No");
							System.out.println(" 3. Volver al Men� de Registro");
							System.out.println("-------------------------");
							System.out.println("Teclee la opci�n (N): ");
							u = (int) readLong();readLn();
							switch(u){
							case 1: 
							//CONSTRUCTOR CON UNI
							System.out.println("Universidad (S)"); String uni = readLn();
							System.out.println("Nombre (S):"); String nombre2 =  readLn();
							System.out.println("Id (N):"); int id2 = (int) readLong();readLn();
							System.out.println("Correo (S):"); String correo2 = readLn();
							System.out.println("Telefono (N):"); int tel2 = (int) readLong();readLn();
							System.out.println("Direccion (S):"); String direccion2 = readLn();
							System.out.println("Fecha de nacimiento en formato AAAA-MM-DD (S):"); String nac2 = readLn();
							System.out.println("Pa�s de Origen (S):"); String origen2 = readLn();
							
							new Externo(nombre2,id2,correo2,tel2,direccion2, LocalDate.parse(nac2), origen2,uni);
							System.out.println("Usuario Externo registrado con �xito!");
							break;

							case 2: 
							// CONTRUCTOR SIN UNI
							System.out.println("Nombre (S):"); nombre2 =  readLn();
							System.out.println("Id (N):"); id2 = (int) readLong();readLn();
							System.out.println("Correo (S):");correo2 = readLn();
							System.out.println("Telefono (N):"); tel2 = (int) readLong();readLn();
							System.out.println("Direccion (S):"); direccion2 = readLn();
							System.out.println("Fecha de nacimiento en formato AAAA-MM-DD (S):"); nac2 = readLn();
							System.out.println("Pa�s de Origen (S):"); origen2 = readLn();
							
							new Externo(nombre2,id2,correo2,tel2,direccion2, LocalDate.parse(nac2), origen2);
							System.out.println("Usuario Externo registrado con �xito!");
							break;

							case 3: break;
							default: 
							System.out.println("Opci�n no v�lida\nIntente otra vez\n");break;
							} // cierre switch - pertenece uni
							} while (u !=1 & u !=2 & u !=3); // cierre do- pertenece uni
						
						
						case 3: break;

						default:
							System.out.println("Opci�n no v�lida\nDevuelta al Men� de Registro");break;
						} // cierre de switch - casos usuario
						
						
					break;
					
					
	
					case 4: break;
				} // cierre switch - registro de datos
			} while (opcion !=4);
			break;

			case 2:do { 
			System.out.println("\nMUESTRA DE DATOS");
			System.out.println("�A cu�les registros desea acceder?");
			System.out.println("-------------------------");
			System.out.println("Men� de opciones: ");
			System.out.println(" 1. Estanter�as");
			System.out.println(" 2. Publicaciones");
			System.out.println(" 3. Personas");
			System.out.println(" 4. Volver al men� principal");
			System.out.println("-------------------------");
			System.out.println("Teclee la opci�n(N): ");
			opcion = (int) readLong();readLn();
			
			
			switch(opcion) {
			case 1: System.out.println(Estanteria.mostrarRegistros()); break;
			case 2: System.out.println(Publicacion.mostrarRegistros()); break;
			case 3: System.out.println(Persona.mostrarRegistros()); break;
			case 4: break;
			default: System.out.println("\nOpci�n no v�lida\nIntente otra vez");
			}}while (opcion != 1 & opcion != 2 & opcion != 3 & opcion != 4);
			
			break;
		      //////////
	            ///////
	                /// 
	            ///////
	         //////////
			
			
			
			
			
			
			
			
			
			
			//////////
			///////
			/// Men� de opciones para eliminar
			///////
			//////////
			case 3: do { 
				System.out.println("\nBORRADO DE DATOS");
				System.out.println("�Qu� tipo de dato desea eliminar?");
				System.out.println("-------------------------");
				System.out.println("Men� de opciones: ");
				System.out.println(" 1. Estanter�as");
				System.out.println(" 2. Publicaciones");
				System.out.println(" 3. Personas");
				System.out.println(" 4. Volver al men� principal");
				System.out.println("-------------------------");
				System.out.println("Teclee la opci�n(N): ");
				opcion = (int) readLong();readLn();
				
				
				switch(opcion) {
				case 1:do {
					System.out.println("\nBORRADO DE ESTANTERIAS");
					System.out.println("-------------------------");
					System.out.println("Men� de opciones: ");
					System.out.println(" 1. Mostrar registros");
					System.out.println(" 2. Tengo el n�mero de la estanteria");
					System.out.println(" 3. Volver al men� principal");
					System.out.println("-------------------------");
					System.out.println("Teclee la opci�n (N): ");
					opcion = (int) readLong();readLn();
					switch (opcion){
					case 1: System.out.println(Estanteria.mostrarRegistros()); break;
					case 2: 
						System.out.println("Ingrese el n�mero de la estanteria (N):");
						int registro_es = (int) readLong();readLn();
						for (Estanteria es : Estanteria.getLista()) {
							if (es.getNumero() == registro_es) {Estanteria.eliminarEstanteria(es);
							System.out.println("Estanter�a Eliminada !!");}
						} break;
						
					case 3: break;
					}}while (opcion != 2 & opcion != 3);
					
					break;
					
				case 2: do {
					System.out.println("\nBORRADO DE PUBLICACIONES");
					System.out.println("-------------------------");
					System.out.println("Men� de opciones: ");
					System.out.println(" 1. Mostrar registros");
					System.out.println(" 2. Tengo el codigo de la publicacion");
					System.out.println(" 3. Volver al men� principal");
					System.out.println("-------------------------");
					System.out.println("Teclee la opci�n (N): ");
					opcion = (int) readLong();readLn();
					switch (opcion){
					case 1: System.out.println(Publicacion.mostrarRegistros()); break;
					case 2: 
						System.out.println("Ingrese el codigo de la publicacion (N):");
						int registro_publi = (int) readLong();readLn();
						for (Publicacion publi : Publicacion.getLista()) {
							if (publi.getCodigo() == registro_publi) {Publicacion.eliminarPublicacion(publi);
							System.out.println("Publicaci�n Eliminada !!");}
						} break;
						
					case 3: break;
					}}while (opcion != 2 & opcion != 3);

					break;
					
				case 3: do {
					System.out.println("\nBORRADO DE PERSONAS");
					System.out.println("-------------------------");
					System.out.println("Men� de opciones: ");
					System.out.println(" 1. Mostrar registros");
					System.out.println(" 2. Tengo el ID de la persona");
					System.out.println(" 3. Volver al men� principal");
					System.out.println("-------------------------");
					System.out.println("Teclee la opci�n (N): ");
					opcion = (int) readLong();readLn();
					switch (opcion){
					case 1: System.out.println(Persona.mostrarRegistros()); break;
					case 2: 
						System.out.println("Ingrese el ID de la persona (N):");
						int registro_per = (int) readLong();readLn();
						for (Persona per : Persona.getLista()) {
							if (per.getId() == registro_per) {Persona.eliminarPersona(per);
							System.out.println("Persona Eliminada !!");}
						} break;
						
					case 3: break;
					}}while (opcion != 2 & opcion != 3);
					
					break;
					
				case 4: break;
				default: System.out.println("\nOpci�n no v�lida\nIntente otra vez");
				}}while (opcion != 1 & opcion != 2 & opcion != 3 & opcion != 4);
			
			break;
		     //////////
               ///////
                   /// 
              ///////
           //////////
			
			
			
			
			
			//////////
			///////
			/// Men� de opciones para A
			///////
			//////////
			case 4: 
				
				
				//LocalDate.parse(nacimiento)
				//System.out.println("Fecha de nacimiento en formato AAAA-MM-DD (S):"); String nac = readLn();
				int nprestamos = 3;
				do {
				System.out.println("MEN� DE PRESTAMOS");
				System.out.println("-------------------------");
				System.out.println("�Qu� tipo de usuario realizar� el pr�stamo?: ");
				System.out.println(" 1. De la comunidad Univesitaria");
				System.out.println(" 2. Externo");
				System.out.println(" 3. Volver al men� principal");
				System.out.println("-------------------------");
				System.out.println("Teclee la opci�n (N): ");
				opcion = (int) readLong();
				
				if(opcion != 3) {
				System.out.println("�Cu�ntos pr�stamos desea realizar?");
				nprestamos = (int) readLong();readLn();
				}
				int codigo;
				int idprestamo;
				String fecha;
				int idusuario;
				EstudianteProfesor interno = null;
				Externo externo = null;
				switch (opcion){
				
				case 1:  
					System.out.println("ID del usuario que desea prestar (N)");idusuario =(int) readLong();readLn();
					for(EstudianteProfesor inter: EstudianteProfesor.getEstudiantesyprofesores()) {
						if (inter.getId() == idusuario) {interno = inter;}
					}
					
					
					for (int i =0 ; i < nprestamos; i++) {
						Publicacion pp = null; // Publicaci�n a prestar
						System.out.println("\n--------------------------\nPrestamo "+(i+1)+" :");
						System.out.println("C�digo de la publicaci�n (N):"); codigo =(int) readLong();readLn();
						System.out.println("ID del pr�stamo (N):"); idprestamo =(int) readLong();readLn();
						System.out.println("Fecha en formato AAAA-MM-DD (S):"); fecha = readLn();
						
						
						for (Publicacion ppp : Publicacion.getLista()) {
							if (ppp.getCodigo() == codigo) {pp = ppp;}
						}
						// Se ejecuta el m�todo
						interno.prestar(pp, idprestamo, LocalDate.parse(fecha));
						
					}// Para el numero de prestamos que se quieran

					break;
				
				case 2:  
					System.out.println("ID del usuario que desea prestar (N)");idusuario =(int) readLong();readLn();
					for(Externo exter: Externo.getUsuariosExternos()) {
						if (exter.getId() == idusuario) {externo = exter;}
					}
					
					
					for (int i =0 ; i < nprestamos; i++) {
						Publicacion pp = null; // Publicaci�n a prestar
						System.out.println("\n--------------------------\nPrestamo "+(i+1)+" :");
						System.out.println("C�digo de la publicaci�n (N):"); codigo =(int) readLong();readLn();
						System.out.println("ID del pr�stamo (N):"); idprestamo =(int) readLong();readLn();
						System.out.println("Fecha en formato AAAA-MM-DD (S):"); fecha = readLn();
						
						
						for (Publicacion ppp : Publicacion.getLista()) {
							if (ppp.getCodigo() == codigo) {pp = ppp;}
						}
						// Se ejecuta el m�todo
						externo.prestar(pp, idprestamo, LocalDate.parse(fecha));
						
					}// Para el numero de prestamos que se quieran

					
					break;
					
				default: break;
				}
				}while (nprestamos != 1 & nprestamos != 2 & nprestamos !=3);
				
				break;
		     //////////
            ///////
                /// 
           ///////
        //////////
			
			
			
			
			
			
			
			//////////
			///////
			/// Men� de opciones para B
			///////
			//////////
			case 5: 
			int opcion_renovacion;
			int idprestamo;
			int u_renovar;
			EstudianteProfesor interno_r = null;
			Externo externo_r = null;
			do {
			System.out.println("MEN� DE RENOVACIONES");
			System.out.println("-------------------------");
			System.out.println("�Qu� tipo de usuario realizar� la renovaci�n?: ");
			System.out.println(" 1. De la comunidad Univesitaria");
			System.out.println(" 2. Externo");
			System.out.println(" 3. Volver al men� principal");
			System.out.println("-------------------------");
			System.out.println("Teclee la opci�n (N): ");
			opcion_renovacion = (int) readLong();
			}while(opcion_renovacion !=1 & opcion_renovacion !=2 & opcion_renovacion !=3);
			
			if(opcion != 3) {

			}

			switch(opcion_renovacion) {
			case 1:
				System.out.println("\nRenovando Interno");
				
				System.out.println("Ingrese el ID del usuario (N):");
				u_renovar = (int) readLong();readLn();
				// Enlazar el usuario con uno registrado
				for(EstudianteProfesor item : EstudianteProfesor.getEstudiantesyprofesores() ) {
					if (item.getId() == u_renovar) {interno_r = item;}
				}
				System.out.println("Ingrese el c�digo de pr�stamo a renovar (N):");
				idprestamo = (int) readLong();readLn();
				System.out.println(interno_r.renovar(idprestamo));
				
				break;
				
			case 2: 
				System.out.println("\nRenovando Externo");
				
				System.out.println("Ingrese el ID del usuario (N):");
				u_renovar = (int) readLong();readLn();
				// Enlazar el usuario con uno registrado
				for(Externo item : Externo.getUsuariosExternos() ) {
					if (item.getId() == u_renovar) {externo_r = item;}
				}
				System.out.println("Ingrese el c�digo de pr�stamo a renovar (N):");
				idprestamo = (int) readLong();readLn();
				System.out.println(externo_r.renovar(idprestamo));
				
				break;
			default: break;
			}
			
			
			break;
			
		     //////////
            ///////
                /// 
           ///////
        //////////
			
			
			
			

			case 6: break;


			} //cierre del switch - men� principal
		
		
		} while (opcion !=6); // cierre del do - men� principal

	
		
		
	Serializador.serializar();
	} // cierre del m�todo main

	
	
	
	
	
	
	
	
	
	
	
} // cierre de la clase bibliotecario
