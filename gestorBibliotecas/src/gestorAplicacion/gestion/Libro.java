package gestorAplicacion.gestion;

import gestorAplicacion.usuario.Lector;

import java.util.ArrayList;
import java.util.List;

import gestorAplicacion.gestion.Biblioteca;

public class Libro {
    private String genero;
    private int id;
    private String titulo;
    private String autor;
    private String editorial;
    private int anioPublicacion;
    private Biblioteca biblioteca;
    private Lector lector;

    public Libro(String genero, int id, String titulo, String autor, String editorial, int anioPublicacion) {
        this.genero = genero;
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.anioPublicacion = anioPublicacion;
    }

    //methods
    public void asignarLibro(Lector lector, Biblioteca biblioteca) {
        Libro libro = this; // O puede pasar el libro como parámetro al método
        ArrayList<Libro> librosDisponibles = biblioteca.getLibrosDisponibles();
        ArrayList<Libro> librosPrestados = lector.getLibrosPrestados();

        for (int i = 0; i < librosDisponibles.size(); i++) {
            if (librosDisponibles.get(i).getId() == libro.getId()) {
                // El libro ha sido encontrado en la lista de libros disponibles
                librosDisponibles.remove(i); // Eliminar el libro de la lista de libros disponibles
                librosPrestados.add(libro); // Agregar el libro a la lista de libros prestados del lector
                break; // Salir del bucle for
            }
        }
        libro.lector = lector;
        libro.biblioteca = biblioteca;
        lector.setLibrosPrestados(librosPrestados);
        biblioteca.setLibrosDisponibles(librosDisponibles);
        
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

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }
}


