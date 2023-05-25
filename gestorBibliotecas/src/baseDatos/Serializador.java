package baseDatos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import gestorAplicacion.gestion.Biblioteca;
import gestorAplicacion.gestion.Computador;
import gestorAplicacion.gestion.Laptop;
import gestorAplicacion.gestion.Libro;
import gestorAplicacion.usuario.Bibliotecario;
import gestorAplicacion.usuario.Estudiante;
import gestorAplicacion.usuario.Lector;
import gestorAplicacion.usuario.Profesor;

public class Serializador {
	public static <E> void serializar(List<E> lista, String className) {
		
		FileOutputStream fileOut;
		
		
		
		try {
			String path = System.getProperty("user.dir") + "\\src\\baseDatos\\template\\" + className + ".txt";
			
			fileOut = new FileOutputStream(path);
			
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			
			out.writeObject(lista);
			out.close();
			fileOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	public static void serializarTodo() {
	    Serializador.serializar(Biblioteca.bibliotecasExistentes, "Bibliotecas");
	    Serializador.serializar(Bibliotecario.bibliotecariosExistentetes, "Bibliotecarios");
	    Serializador.serializar(Computador.computadoresExistentes, "Computadores");
	    Serializador.serializar(Laptop.laptopsExistentes, "Laptops");
	    Serializador.serializar(Libro.librosExistentes, "Libros");
	    Serializador.serializar(Estudiante.estudiantesExistentes, "Estudiantes");
	    Serializador.serializar(Lector.lectoresExistentes, "Lectores");
	    Serializador.serializar(Profesor.profesoresExistentes, "Profesores");
	}


}
