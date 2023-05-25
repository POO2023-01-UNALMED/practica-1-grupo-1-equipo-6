package baseDatos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import gestorAplicacion.gestion.Biblioteca;
import gestorAplicacion.gestion.Computador;
import gestorAplicacion.gestion.Laptop;
import gestorAplicacion.gestion.Libro;
import gestorAplicacion.usuario.Bibliotecario;
import gestorAplicacion.usuario.Estudiante;
import gestorAplicacion.usuario.Lector;
import gestorAplicacion.usuario.Profesor;

public class Deserializador {
	public static <E> void deserializador(List<E> list, String className) {
		FileInputStream fileIn;
		try {
			// Creamos una cadena con la ruta del archivo que vamos a cargar
			String path = System.getProperty("user.dir") + "\\src\\baseDatos\\template\\" + className + ".txt";
			System.out.println(path);
			// utilizamos un file para crear este archivo si no existe aun
			File archivo = new File(path);
			archivo.createNewFile(); // Crea un nuevo archivo si no existe

			// usamos un FileInputStream para poder saber de donde cargar el archivo
			fileIn = new FileInputStream(path);

			// Si el archivo esta vacio se lanza un throw EOFException y se muestra como un
			// mensaje de vacio, pero si no se usa el objeto in para leer el sarchivo
			ObjectInputStream in = new ObjectInputStream(fileIn);

			// Lee el listado de elementos
			ArrayList<E> listado = (ArrayList<E>) in.readObject();

			// Recorro el ArrayList
			for (E el : listado) {
				list.add(el);
			}

			in.close();
			fileIn.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Esta vacio");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




public static void deserializarTodo() {
	Deserializador.deserializador(Biblioteca.bibliotecasExistentes, "Bibliotecas");
	Deserializador.deserializador(Bibliotecario.bibliotecariosExistentetes, "Bibliotecarios");
	Deserializador.deserializador(Computador.computadoresExistentes, "Computadores");
	Deserializador.deserializador(Laptop.laptopsExistentes, "Laptops");
	Deserializador.deserializador(Libro.librosExistentes, "Libros");
	Deserializador.deserializador(Estudiante.estudiantesExistentes, "Estudiantes");
	Deserializador.deserializador(Lector.lectoresExistentes, "Lectores");
	Deserializador.deserializador(Profesor.profesoresExistentes, "Profesores");
	
}
}
