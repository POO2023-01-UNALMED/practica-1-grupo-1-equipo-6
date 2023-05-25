package gestorAplicacion.gestion;

import gestorAplicacion.usuario.Bibliotecario;
import gestorAplicacion.usuario.Lector;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import gestorAplicacion.gestion.Biblioteca;

public class Libro implements Serializable {
    private String genero;
    private int id;
    private String titulo;
    private String autor;
    private String editorial;
    private int anioPublicacion;
    private String informe;
    
    public static ArrayList<Libro> librosExistentes = new ArrayList<Libro>();

    public Libro(String genero, int id, String titulo, String autor, String editorial, int anioPublicacion) {
        this.genero = genero;
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.anioPublicacion = anioPublicacion;
        librosExistentes.add(this);
    }

    //methods
    public void asignarLibro(Lector lector, Biblioteca biblioteca, Bibliotecario bibliotecario) {
        Libro libro = this; // 
        ArrayList<Libro> librosDisponibles = biblioteca.getLibrosDisponibles();
        ArrayList<Libro> librosPrestados = lector.getLibrosPrestados();
        
        if(lector != null && biblioteca != null && libro != null) {
        	for (int i = 0; i < librosDisponibles.size(); i++) {
            if (librosDisponibles.get(i).getId() == libro.getId()) {
               
                librosDisponibles.remove(i); 
                libro.setInforme("Libro Prestado por el bibliotecario: " + bibliotecario.getNombre() + "con id: " + bibliotecario.getId());
                librosPrestados.add(libro); 
                
                lector.setInforme(lector.getInforme() + "PRESTAMO LIBRO\n");
                
                break; 
            }
        }

        lector.setLibrosPrestados(librosPrestados);
        biblioteca.setLibrosDisponibles(librosDisponibles);
        
        
        }


    }
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

	public String getInforme() {
		return informe;
	}

	public void setInforme(String informe) {
		this.informe = informe;
	}
    
    
}


