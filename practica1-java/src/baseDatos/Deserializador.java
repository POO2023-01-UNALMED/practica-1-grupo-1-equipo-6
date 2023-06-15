package baseDatos;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.util.ArrayList;

import gestorAplicacion.obras.*;
import gestorAplicacion.personas.*;
import gestorAplicacion.prestamo.Prestamo;

public class Deserializador {
	private static File rutaTemp = new File("src\\baseDatos\\temp");
	
	// M�todo para deserializar todas las publicaciones creadas
	public static void deserializarPublicaciones() {
		FileInputStream fis;
		ObjectInputStream ois;
		
		try {
			fis = new FileInputStream(rutaTemp + "\\publicaciones.txt");
			ois = new ObjectInputStream(fis);
			
			ArrayList<Publicacion> listado =  new ArrayList<>();
			
			try {
				Object obj = ois.readObject();
	
				while(obj != null) {
					listado.add((Publicacion)obj);
					
					obj = ois.readObject();
				}
			} catch (EOFException e) {
				// TODO Auto-generated catch block
			}
			
			
			Publicacion.setLista(listado);
			
	        ois.close();
	        fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// M�todo para deserializar todas las personas creadas
	private static void deserializarPersonas() {
		FileInputStream fis;
		ObjectInputStream ois;
		
		try {
			fis = new FileInputStream(rutaTemp + "\\personas.txt");
			ois = new ObjectInputStream(fis);
			
			ArrayList<Persona> listado =  new ArrayList<>();
			
			try {
				Object obj = ois.readObject();
				
				while(obj != null) {
					listado.add((Persona)obj);
					obj = ois.readObject();
				}
			} catch (EOFException e) {
				// TODO Auto-generated catch block
			}
			
			Persona.setLista(listado);
			
	        ois.close();
	        fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	// M�todo para deserializar todas las estanterias creadas
	private static void deserializarEstanterias() {
		FileInputStream fis;
		ObjectInputStream ois;
		
		try {
			fis = new FileInputStream(rutaTemp + "\\estanterias.txt");
			ois = new ObjectInputStream(fis);
			
			ArrayList<Estanteria> listado =  new ArrayList<>();
			
			try {
				Object obj = ois.readObject();
				
				while(obj != null) {
					listado.add((Estanteria)obj);
					obj = ois.readObject();
				}
			} catch (EOFException e) {
				// TODO Auto-generated catch block
			}
			
			Estanteria.setLista(listado);
			
	        ois.close();
	        fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// M�todo para deserializar todas los prestamos creados
	private static void deserializarPrestamos() {
		FileInputStream fis;
		ObjectInputStream ois;
		
		try {
			fis = new FileInputStream(rutaTemp + "\\prestamos.txt");
			ois = new ObjectInputStream(fis);
			
			ArrayList<Prestamo> listado =  new ArrayList<>();
			
			try {
				Object obj = ois.readObject();
				
				while(obj != null) {
					listado.add((Prestamo)obj);
					obj = ois.readObject();
				}
			} catch (EOFException e) {
				// TODO Auto-generated catch block
			}
			
			Prestamo.setLista(listado);
			
	        ois.close();
	        fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	// M�todo para cargar en memoria ram todos los objetos almacenados en los archivos anteriores
	public static void deserializar() {
		deserializarPublicaciones();
		deserializarPersonas();
		deserializarEstanterias();
		deserializarPrestamos();
	}
	
	
	// M�todo para borrar todos los objetos de la ram y usar solo los almacenados en archivos
	public static void resetarMemoria() {
		Estanteria.getLista().clear();;
		Folleto.getFolletos().clear();
		Libro.getLibros().clear();;
		Publicacion.getLista().clear();
		Revista.getRevistas().clear();
		
		Autor.getAutores().clear();
		EstudianteProfesor.getEstudiantesyprofesores().clear();
		Externo.getUsuariosExternos().clear();
		Persona.getLista().clear();
		

		Persona.getLista().clear();
		
	}
	
	
	
}

