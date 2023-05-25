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


public class bibliotecario {
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
		short numerorando = (short) (random.nextInt(100) + 1);  // Genera un número aleatorio entre 1 y 100
		short piso12 = (short) (random.nextInt(10) + 1);     // Genera un número aleatorio entre 1 y 10
		String[] limites = new String[2];
		limites[0] = "Límite inferior aleatorio";
		limites[1] = "Límite superior aleatorio";

		// Se eliminan todos los objetos creados para trabajar solamente con los de los archivos almacenados
		//Deserializador.resetarMemoria();
		Deserializador.deserializar();


		// Crear autor anónimo y estantería vacía si no oestán ya creados
		
		ArrayList<Integer> autores_id = new ArrayList<Integer>();
		for(Autor autor1 : Autor.getAutores()) {autores_id.add(autor1.getId());}
		if (!autores_id.contains(0)) {new Autor();}
		
		ArrayList<Short> estanterias_numeros = new ArrayList<Short>();
		for(Estanteria estanteria1 : Estanteria.getLista()) {estanterias_numeros.add(estanteria1.getNumero());}
		if (!estanterias_numeros.contains((short) 0)) {new Estanteria();}


		//Creación de objetos estanterías

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
		Estanteria estanteria13 = new Estanteria((short)10, (short)2, limites);
		Estanteria estanteria14 = new Estanteria((short)11,(short) 3, limites);
		Estanteria estanteria15 = new Estanteria((short)12, (short) 1, limites);
		Estanteria estanteria16 = new Estanteria((short)13, (short)6, limites);
		Estanteria estanteria17 = new Estanteria((short)14, (short)4, limites);
		Estanteria estanteria18 = new Estanteria((short)15, (short)1, limites);
		Estanteria estanteria19 = new Estanteria((short)16, (short)3, limites);
		Estanteria estanteria20 = new Estanteria((short)17, (short)2, limites);


		//Creación de objetos revistas

		Revista revista3= new Revista((int)1,(String)"Nature",(short) 2000,(short) 1, (short) 103, Revista.Meses.AGOSTO,(String)"primera",estanteria7);
		Revista revista4= new Revista((int)2,(String)"Análisis Político",(short) 2023,(short) 10, (short) 104, Revista.Meses.AGOSTO,(String)"primera",estanteria12);
		Revista revista5= new Revista((int)3,(String)"Forbes",(short) 2001,(short) 101, (short) 105, Revista.Meses.OCTUBRE,(String)"segunda",estanteria13);
		Revista revista6= new Revista((int)4,(String)"Rolling Stones",(short) 2003,(short) 123, (short) 100, Revista.Meses.DICIEMBRE,(String)"tercera",estanteria11);
		Revista revista7= new Revista((int)5,(String)"Semana",(short) 2002,(short) 12, (short) 106, Revista.Meses.ENERO,(String)"primera",estanteria4);
		Revista revista8= new Revista((int)6,(String)"Science",(short) 2004,(short) 13, (short) 108, Revista.Meses.FEBRERO,(String)"tercera",estanteria3);
		Revista revista9= new Revista((int)7,(String)"Blood",(short) 2006,(short) 15, (short) 1, Revista.Meses.MARZO,(String)"segunda",estanteria20);
		Revista revista10= new Revista((int)8,(String)"Cell",(short) 2005,(short) 16, (short) 178, Revista.Meses.ABRIL,(String)"primera",estanteria6);
		Revista Revista11= new Revista((int)9,(String)"Apple",(short) 2007,(short) 17, (short) 156, Revista.Meses.MAYO,(String)"tercera",estanteria12);
		Revista Revista12= new Revista((int)10,(String)"City",(short) 2009,(short) 18, (short) 187, Revista.Meses.JUNIO,(String)"segunda",estanteria11);
		Revista Revista13= new Revista((int)11,(String)"London",(short) 2008,(short) 19, (short) 146, Revista.Meses.JULIO,(String)"cuarta",estanteria10);
		Revista Revista14= new Revista((int)12,(String)"Berlín",(short) 2009,(short) 20, (short) 147, Revista.Meses.NOVIEMBRE,(String)"primera",estanteria9);
		Revista Revista15= new Revista((int)13,(String)"Berry",(short) 2002,(short) 21, (short) 158, Revista.Meses.SEPTIEMBRE,(String)"segunda",estanteria19);
		Revista Revista16= new Revista((int)14,(String)"Assist",(short) 1999,(short) 22, (short) 125, Revista.Meses.DICIEMBRE,(String)"tercera",estanteria13);
		Revista Revista17= new Revista((int)15,(String)"Boss",(short) 2022,(short) 23, (short) 10, Revista.Meses.ENERO,(String)"cuarta",estanteria17);
		Revista Revista18= new Revista((int)16,(String)"Scoope",(short) 2003,(short) 24, (short) 105, Revista.Meses.ABRIL,(String)"primera",estanteria8);
		Revista Revista19= new Revista((int)17,(String)"Jenos",(short) 2004,(short) 25, (short) 7, Revista.Meses.JULIO,(String)"primera",estanteria16);
		Revista Revista20= new Revista((int)18,(String)"World",(short) 1998,(short) 26, (short) 78, Revista.Meses.MAYO,(String)"cuarta",estanteria15);
		Revista Revista21= new Revista((int)19,(String)"Casio",(short) 2015,(short) 27, (short) 63, Revista.Meses.NOVIEMBRE,(String)"tercera",estanteria14);
		Revista Revista22= new Revista((int)20,(String)"Rex",(short) 2018,(short) 28, (short) 19, Revista.Meses.OCTUBRE,(String)"cuarta",estanteria18);


	//Creación de objetos folletos

		Folleto folleto3= new Folleto((int)21,(String) "Pool",(short) 2017,(short)29, (String)"Arte",estanteria14);
		Folleto folleto4= new Folleto((int)22,(String) "Pin",(short) 2016,(short)100, (String)"Biología",estanteria15);
		Folleto folleto5= new Folleto((int)23,(String) "Land",(short) 2012,(short)220, (String)"Comercio",estanteria16);
		Folleto folleto6= new Folleto((int)24,(String) "Sand",(short) 2010,(short)286, (String)"Salud",estanteria17);
		Folleto folleto7= new Folleto((int)25,(String) "Bed",(short) 2019,(short)290, (String)"Arte",estanteria10);
		Folleto folleto8= new Folleto((int)26,(String) "Amstel",(short) 2014,(short)279, (String)"política",estanteria4);
		Folleto folleto9= new Folleto((int)27,(String) "Bwin",(short) 2013,(short)39, (String)"Ciencia",estanteria13);
		Folleto folleto10= new Folleto((int)28,(String) "Crypto",(short) 2011,(short)59, (String)"Medicina",estanteria12);
		Folleto folleto11= new Folleto((int)29,(String) "Food",(short) 2001,(short)69, (String)"Comida",estanteria4);
		Folleto folleto12= new Folleto((int)30,(String) "Feet",(short) 2008,(short)79, (String)"Deporte",estanteria11);
		Folleto folleto13= new Folleto((int)31,(String) "Felt",(short) 2017,(short)80, (String)"Derecho",estanteria5);
		Folleto folleto14= new Folleto((int)32,(String) "Door",(short) 2021,(short)68, (String)"Académica",estanteria6);
		Folleto folleto15= new Folleto((int)33,(String) "Ask",(short) 2020,(short)78, (String)"Informativa",estanteria7);
		Folleto folleto16= new Folleto((int)34,(String) "Fast",(short) 2022,(short)299, (String)"Publicidad",estanteria7);
		Folleto folleto22= new Folleto((int)35,(String) "Push",(short) 2002,(short)185, (String)"Arquitectura",estanteria8);
		Folleto folleto17= new Folleto((int)36,(String) "Trick",(short) 2000,(short)199, (String)"Salud",estanteria6);
		Folleto folleto18= new Folleto((int)37,(String) "O'neill",(short) 2009,(short)300, (String)"Deporte",estanteria18);
		Folleto folleto19= new Folleto((int)38,(String) "Less",(short) 2006,(short)86, (String)"Derecho",estanteria19);
		Folleto folleto20= new Folleto((int)39,(String) "Price",(short) 2007,(short)99, (String)"Biología",estanteria20);
		Folleto folleto21= new Folleto((int)40,(String) "Link",(short) 2013,(short)3, (String)"Medicina",estanteria3);



		///////////////////////////
		 /// INICIO DEL SISTEMA ////
		///////////////////////////
		System.out.println("Hola!\nBienvenido al Sistema de Gestión de la Biblioteca");
		
		// Menú de opciones principal
		int opcion;
		do {
			
			
			System.out.println("\nMENÚ PRINCIPAL: ");
			System.out.println("-------------------------");
			System.out.println(" 1. Añadir Registros");
			System.out.println(" 2. Mostrar registros");
			System.out.println(" 3. Eliminar registros");
			System.out.println(" 4. Realizar Préstamos");
			System.out.println(" 5. Realizar una Renovación");
			System.out.println(" 6. Guardar datos y salir del sistema");
			System.out.println("-------------------------");
		
			System.out.println("Teclee la opción(N): ");
			opcion = (int) readLong();readLn();
			
			switch(opcion) {
			
			

			
			
			//////////
			///////
			/// Menú de opciones para registrar 
			///////
			//////////		
			case 1: 
			do {
				System.out.println("\nREGISTRO DE DATOS");
				System.out.println("¿Qué desea registrar?");
				System.out.println("-------------------------");
				System.out.println("Menú de opciones: ");
				System.out.println(" 1. Estantería");
				System.out.println(" 2. Publicación");
				System.out.println(" 3. Usuario");
				System.out.println(" 4. Volver al menú principal");
				System.out.println("-------------------------");
				
				System.out.println("Teclee la opción(N): ");
				opcion = (int) readLong();readLn();
				
				switch(opcion) {
					case 1: System.out.println("Ingrese los datos de la Estantería:");
					
					System.out.println("Número (N):"); short n = (short) readLong();
					System.out.println("Piso (N):"); short p = (short) readLong();readLn();
					System.out.println("Límite inferior (S):");
					String li = readLn();
					System.out.println("Límite superior (S):"); 
					String ls = readLn();
					String[] l = new String[]{li,ls};

					new Estanteria(n, p, l);
					System.out.println("Estanteria registrada con éxito");
					break;
					
					case 2:// Menú de opciones para publicacion
						System.out.println("-------------------------");
						System.out.println("Tipo de publicacion: ");
						System.out.println(" 1. Libro");
						System.out.println(" 2. Revista");
						System.out.println(" 3. Folleto");
						System.out.println("-------------------------");
						
						System.out.println("Teclee la opción (N): ");
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
						System.out.println("Teclee la opción (N): ");
						opcion2 = (int) readLong();
						
						switch(opcion2) {
						case 1: tipo = tipoLibro.COLECCION_GENERAL;break;
						case 2: tipo = tipoLibro.RESERVA;break;
						case 3: tipo = tipoLibro.INVESTIGACION;break;
						case 4: tipo = tipoLibro.SEMINARIO;break;
						case 5: tipo = tipoLibro.TESIS;break;
						case 6: break;
						default:
							System.out.println("Tipo de libro inválido");break;
						}}while(opcion2 !=1 & opcion2 != 2 & opcion2 != 3 & opcion2 != 4 & opcion2 != 5);

						System.out.println("Código (N):"); int cod = (int) readLong();readLn();
						System.out.println("Nombre (S):"); String nombre2 = readLn();
						System.out.println("Año: (N)"); short aa = (short) readLong();
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
						//Comprobación si autor ya está registrado
						Autor autor2 = null; // autor que tiene el mismo id que el digitado
						if(id_autores.contains(idautor)) {
							puedo_salir = false;
							System.out.println("Ya existe un autor con este código");
							//Buscamos quien es el autor con ese código
							for(Autor autor1 : Autor.getAutores()) {
								if(autor1.getId() == idautor)  {
									autor2 = autor1;
								}
							}
							// Información del autor que encontramos
							System.out.println(autor2.infoPersonal());
							do {
							System.out.println("¿Desea asignar este autor al libro que está registrando?");
							System.out.println("-------------------------");
							System.out.println(" 1. Si");
							System.out.println(" 2. No");
							System.out.println("-------------------------");
							System.out.println("Teclee la opción (N): ");
							asignar_autor_existente = (int) readLong();readLn();
							
							switch(asignar_autor_existente){
							case 1:autor = autor2;break;//Asignacion de autor existente
							case 2: System.out.println("Ingrese un código diferente");
							default: System.out.println("Opción no válida\nIntente otra vez");
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
							System.out.println("¿Está vivo el autor?:");
							System.out.println("-------------------------");
							System.out.println(" 1. Si");
							System.out.println(" 2. No");
							System.out.println(" 3. Volver al Menú de Registro");
							System.out.println("-------------------------");
							System.out.println("Teclee la opción (N): ");
							v = (int) readLong();readLn();
							
							// Se asigna a la variable vivo un booleano
							switch(v){
							case 1: break;
							case 2: vivo = false; break;
							case 3: break;
							default: System.out.println("Opción no válida\nIntente otra vez");break;
							}
							
							} while (v !=1 & v !=2 & v !=3);
						}
						
						if(v != 3 & asignar_autor_existente != 1) {
							
							System.out.println("Nombre (S):"); String nautor = readLn();
							System.out.println("Fecha de nacimiento en formato AAAA-MM-DD (S)"); String nacimiento = readLn();
							System.out.println("País de Origen (S)"); String pais = readLn();
			
							new Autor (idautor, nautor,LocalDate.parse(nacimiento), pais,vivo);
							 
							 System.out.println("Autor registrado con éxito");
						//Fin creacion de un autor          -----------------------------------
						
						
						
						}
						//Inicio de instrucciones sin autor
						
						
						if(v != 3) {
							System.out.println("Número de Estantería (N):"); short nes = (short) readLong();readLn();
							estanteria = null;
							for (Estanteria e: Estanteria.getLista()) {
								if (e.getNumero() == nes) {estanteria = e;}
							}
							
							new Libro (cod,nombre2,aa,ejemplar,autor,tipo,ref,vol,estanteria);
				
							 System.out.println("Libro registrado con éxito");
							
							
							} // hasta aqui se salta a menu de registro desde vivo autor
						
						break; // cierre de creacion de libro
						
						case 2: System.out.println("Ingrese los datos de la Revista");
						
						// Valores del enumerado Meses en una lista de Strings
						ArrayList<String> list = new ArrayList<String>();
						for (Revista.Meses mes : Revista.Meses.values()) {
							String m = mes.toString();
							list.add(m);}
						readLn();
						System.out.println("Mes en español y en Mayúsculas (N):"); String m = readLn();
						if (!list.contains(m)) {System.out.println("Mes inválido");
						System.out.println("De vuelta al Menú de Registro de Datos");break;}
						Revista.Meses mes = Revista.Meses.valueOf(m);
						System.out.println("Código (N):"); int cod2 = (int) readLong();readLn();
						System.out.println("Nombre (S):"); String nombre3 = readLn();
						System.out.println("Año (N):");short aa4 = (short) readLong();
						System.out.println("Ejemplar (N):"); short ejemplar1 = (short) readLong();
						System.out.println("Número (N):"); short numero = (short) readLong();readLn();
						System.out.println("Temporada (S):"); String temporada = readLn();
						System.out.println("Número de Estantería (N):");  short es = (short) readLong();readLn();
						estanteria = null;
						for (Estanteria e: Estanteria.getLista()) {
							if (e.getNumero() == es) {estanteria = e;}}
						new Revista (cod2,nombre3,aa4,ejemplar1,numero,mes,temporada,estanteria);
						 System.out.println("Revista registrada con éxito");
						break;
						
						case 3: System.out.println("Ingrese los datos del Folleto");
						
						readLn();
						System.out.println("Código (N):"); cod = (int) readLong();readLn();
						System.out.println("Nombre (S):"); nombre2 = readLn();
						System.out.println("Año (N):"); aa = (short) readLong();
						System.out.println("Ejemplar (N):"); ejemplar = (short) readLong();readLn();
						System.out.println("Referencia (S):"); String ref2 = readLn();
						System.out.println("Número de Estantería (N):");  short nes = (short) readLong();
						estanteria = null;
						for (Estanteria e: Estanteria.getLista()) {
							if (e.getNumero() == nes) {estanteria = e;}
							}
						new Folleto (cod,nombre2,aa,ejemplar,ref2,estanteria);
						 System.out.println("Folleto registrado con éxito");
						break;
						
						default: 
							System.out.println("Opción no válida\nDevuelta al Menú de Registro");break;
						} // cierre del switch de registrar publicacion

					break;
					
					
					case 3: // Menú de opciones para usuario
						System.out.println("-------------------------");
						System.out.println("Tipo de usuario: ");
						System.out.println(" 1. Estudiante/profesor");
						System.out.println(" 2. Externo");
						System.out.println(" 3. Volver al Menú de Registro");
						System.out.println("-------------------------");
						System.out.println("Teclee la opción (N): ");
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
						System.out.println(" 4. Volver al Menú de Registro");
						System.out.println("-------------------------");
						System.out.println("Teclee la opción (N): ");
						opcion_rol = (int) readLong();readLn();
						
						switch(opcion_rol) {
						case 1: rol = Rol.ESTUDIANTE;break;
						case 2: rol = Rol.PROFESOR;break;
						case 3: rol = Rol.OTRO;break;
						case 4: break;
						default:
							System.out.println("Tipo de libro inválido");break;
						}}while(opcion_rol !=1 & opcion_rol != 2 & opcion_rol != 3 & opcion_rol != 4);
						
						
						if (opcion_rol !=4) {
						System.out.println("Nombre (S):"); String nombre = readLn();
						System.out.println("Id (N):"); int id = (int) readLong();readLn();
						System.out.println("Correo (S):"); String correo = readLn();
						System.out.println("Telefono (N):"); int tel = (int) readLong();readLn();
						System.out.println("Direccion (S):"); String direccion = readLn();
						System.out.println("Fecha de nacimiento en formato AAAA-MM-DD (S):"); String nac = readLn();
						System.out.println("País de Origen (S):"); String origen = readLn();
						
						new EstudianteProfesor(nombre,id,rol,correo,tel,direccion, LocalDate.parse(nac), origen);
						System.out.println("Estudiante o Profesor registrado con éxito!");
						}
						break;
						
						case 2: System.out.println("Ingrese los datos del usuario externo");
							int u;
							do {
							System.out.println("¿Pertenece a alguna Universidad?");
							System.out.println("-------------------------");
							System.out.println(" 1. Si");
							System.out.println(" 2. No");
							System.out.println(" 3. Volver al Menú de Registro");
							System.out.println("-------------------------");
							System.out.println("Teclee la opción (N): ");
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
							System.out.println("País de Origen (S):"); String origen2 = readLn();
							
							new Externo(nombre2,id2,correo2,tel2,direccion2, LocalDate.parse(nac2), origen2,uni);
							System.out.println("Usuario Externo registrado con éxito!");
							break;

							case 2: 
							// CONTRUCTOR SIN UNI
							System.out.println("Nombre (S):"); nombre2 =  readLn();
							System.out.println("Id (N):"); id2 = (int) readLong();readLn();
							System.out.println("Correo (S):");correo2 = readLn();
							System.out.println("Telefono (N):"); tel2 = (int) readLong();readLn();
							System.out.println("Direccion (S):"); direccion2 = readLn();
							System.out.println("Fecha de nacimiento en formato AAAA-MM-DD (S):"); nac2 = readLn();
							System.out.println("País de Origen (S):"); origen2 = readLn();
							
							new Externo(nombre2,id2,correo2,tel2,direccion2, LocalDate.parse(nac2), origen2);
							System.out.println("Usuario Externo registrado con éxito!");
							break;

							case 3: break;
							default: 
							System.out.println("Opción no válida\nIntente otra vez\n");break;
							} // cierre switch - pertenece uni
							} while (u !=1 & u !=2 & u !=3); // cierre do- pertenece uni
						
						
						case 3: break;

						default:
							System.out.println("Opción no válida\nDevuelta al Menú de Registro");break;
						} // cierre de switch - casos usuario
						
						
					break;
					
					
	
					case 4: break;
				} // cierre switch - registro de datos
			} while (opcion !=4);
			break;

			case 2:do { 
			System.out.println("\nMUESTRA DE DATOS");
			System.out.println("¿A cuáles registros desea acceder?");
			System.out.println("-------------------------");
			System.out.println("Menú de opciones: ");
			System.out.println(" 1. Estanterías");
			System.out.println(" 2. Publicaciones");
			System.out.println(" 3. Personas");
			System.out.println(" 4. Volver al menú principal");
			System.out.println("-------------------------");
			System.out.println("Teclee la opción(N): ");
			opcion = (int) readLong();readLn();
			
			
			switch(opcion) {
			case 1: System.out.println(Estanteria.mostrarRegistros()); break;
			case 2: System.out.println(Publicacion.mostrarRegistros()); break;
			case 3: System.out.println(Persona.mostrarRegistros()); break;
			case 4: break;
			default: System.out.println("\nOpción no válida\nIntente otra vez");
			}}while (opcion != 1 & opcion != 2 & opcion != 3 & opcion != 4);
			
			break;
		      //////////
	            ///////
	                /// 
	            ///////
	         //////////
			
			
			
			
			
			
			
			
			
			
			//////////
			///////
			/// Menú de opciones para eliminar
			///////
			//////////
			case 3: do { 
				System.out.println("\nBORRADO DE DATOS");
				System.out.println("¿Qué tipo de dato desea eliminar?");
				System.out.println("-------------------------");
				System.out.println("Menú de opciones: ");
				System.out.println(" 1. Estanterías");
				System.out.println(" 2. Publicaciones");
				System.out.println(" 3. Personas");
				System.out.println(" 4. Volver al menú principal");
				System.out.println("-------------------------");
				System.out.println("Teclee la opción(N): ");
				opcion = (int) readLong();readLn();
				
				
				switch(opcion) {
				case 1:do {
					System.out.println("\nBORRADO DE ESTANTERIAS");
					System.out.println("-------------------------");
					System.out.println("Menú de opciones: ");
					System.out.println(" 1. Mostrar registros");
					System.out.println(" 2. Tengo el número de la estanteria");
					System.out.println(" 3. Volver al menú principal");
					System.out.println("-------------------------");
					System.out.println("Teclee la opción (N): ");
					opcion = (int) readLong();readLn();
					switch (opcion){
					case 1: System.out.println(Estanteria.mostrarRegistros()); break;
					case 2: 
						System.out.println("Ingrese el número de la estanteria (N):");
						int registro_es = (int) readLong();readLn();
						for (Estanteria es : Estanteria.getLista()) {
							if (es.getNumero() == registro_es) {Estanteria.eliminarEstanteria(es);
							System.out.println("Estantería Eliminada !!");}
						} break;
						
					case 3: break;
					}}while (opcion != 2 & opcion != 3);
					
					break;
					
				case 2: do {
					System.out.println("\nBORRADO DE PUBLICACIONES");
					System.out.println("-------------------------");
					System.out.println("Menú de opciones: ");
					System.out.println(" 1. Mostrar registros");
					System.out.println(" 2. Tengo el codigo de la publicacion");
					System.out.println(" 3. Volver al menú principal");
					System.out.println("-------------------------");
					System.out.println("Teclee la opción (N): ");
					opcion = (int) readLong();readLn();
					switch (opcion){
					case 1: System.out.println(Publicacion.mostrarRegistros()); break;
					case 2: 
						System.out.println("Ingrese el codigo de la publicacion (N):");
						int registro_publi = (int) readLong();readLn();
						for (Publicacion publi : Publicacion.getLista()) {
							if (publi.getCodigo() == registro_publi) {Publicacion.eliminarPublicacion(publi);
							System.out.println("Publicación Eliminada !!");}
						} break;
						
					case 3: break;
					}}while (opcion != 2 & opcion != 3);

					break;
					
				case 3: do {
					System.out.println("\nBORRADO DE PERSONAS");
					System.out.println("-------------------------");
					System.out.println("Menú de opciones: ");
					System.out.println(" 1. Mostrar registros");
					System.out.println(" 2. Tengo el ID de la persona");
					System.out.println(" 3. Volver al menú principal");
					System.out.println("-------------------------");
					System.out.println("Teclee la opción (N): ");
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
				default: System.out.println("\nOpción no válida\nIntente otra vez");
				}}while (opcion != 1 & opcion != 2 & opcion != 3 & opcion != 4);
			
			break;
		     //////////
               ///////
                   /// 
              ///////
           //////////
			
			
			
			
			
			//////////
			///////
			/// Menú de opciones para A
			///////
			//////////
			case 4: 
				
				
				//LocalDate.parse(nacimiento)
				//System.out.println("Fecha de nacimiento en formato AAAA-MM-DD (S):"); String nac = readLn();
				int nprestamos = 3;
				do {
				System.out.println("MENÚ DE PRESTAMOS");
				System.out.println("-------------------------");
				System.out.println("¿Qué tipo de usuario realizará el préstamo?: ");
				System.out.println(" 1. De la comunidad Univesitaria");
				System.out.println(" 2. Externo");
				System.out.println(" 3. Volver al menú principal");
				System.out.println("-------------------------");
				System.out.println("Teclee la opción (N): ");
				opcion = (int) readLong();
				
				if(opcion != 3) {
				System.out.println("¿Cuántos préstamos desea realizar?");
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
						Publicacion pp = null; // Publicación a prestar
						System.out.println("\n--------------------------\nPrestamo "+(i+1)+" :");
						System.out.println("Código de a publicación (N):"); codigo =(int) readLong();readLn();
						System.out.println("ID del préstamo (N):"); idprestamo =(int) readLong();readLn();
						System.out.println("Fecha en formato AAAA-MM-DD (S):"); fecha = readLn();
						
						
						for (Publicacion ppp : Publicacion.getLista()) {
							if (ppp.getCodigo() == codigo) {pp = ppp;}
						}
						// Se ejecuta el método
						interno.prestar(pp, idprestamo, LocalDate.parse(fecha));
						
					}// Para el numero de prestamos que se quieran

					
					break;
				
				case 2:  
					System.out.println("ID del usuario que desea prestar (N)");idusuario =(int) readLong();readLn();
					for(Externo exter: Externo.getUsuariosExternos()) {
						if (exter.getId() == idusuario) {externo = exter;}
					}
					
					
					for (int i =0 ; i < nprestamos; i++) {
						Publicacion pp = null; // Publicación a prestar
						System.out.println("\n--------------------------\nPrestamo "+(i+1)+" :");
						System.out.println("Código de a publicación (N):"); codigo =(int) readLong();readLn();
						System.out.println("ID del préstamo (N):"); idprestamo =(int) readLong();readLn();
						System.out.println("Fecha en formato AAAA-MM-DD (S):"); fecha = readLn();
						
						
						for (Publicacion ppp : Publicacion.getLista()) {
							if (ppp.getCodigo() == codigo) {pp = ppp;}
						}
						// Se ejecuta el método
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
			/// Menú de opciones para B
			///////
			//////////
			case 5: 
			int opcion_renovacion;
			int idprestamo;
			int u_renovar;
			EstudianteProfesor interno_r = null;
			Externo externo_r = null;
			do {
			System.out.println("MENÚ DE RENOVACIONES");
			System.out.println("-------------------------");
			System.out.println("¿Qué tipo de usuario realizará la renovación?: ");
			System.out.println(" 1. De la comunidad Univesitaria");
			System.out.println(" 2. Externo");
			System.out.println(" 3. Volver al menú principal");
			System.out.println("-------------------------");
			System.out.println("Teclee la opción (N): ");
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
				System.out.println("Ingrese el código de préstamo a renovar (N):");
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
				System.out.println("Ingrese el código de préstamo a renovar (N):");
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


			} //cierre del switch - menú principal
		
		
		} while (opcion !=6); // cierre del do - menú principal

	
		
		
	Serializador.serializar();
	} // cierre del método main

	
	
	
	
	
	
	
	
	
	
	
} // cierre de la clase bibliotecario
