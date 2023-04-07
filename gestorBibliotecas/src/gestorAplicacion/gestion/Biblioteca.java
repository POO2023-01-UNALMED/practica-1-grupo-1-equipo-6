package gestorAplicacion.gestion;

import java.util.ArrayList;

import gestorAplicacion.usuario.Bibliotecario;

public class Biblioteca {
    private String direccion;
    private String facultad;
    private String nombre;
    private ArrayList<String> computadoresMesaDisponibles;
    private ArrayList<String> laptopsDisponibles;
    private ArrayList<Libro> librosDisponibles;
    private ArrayList<String> generosDisponibles;
    private ArrayList<Bibliotecario> bibliotecarios;

    public Biblioteca(String nombre, ArrayList<String> computadoresMesaDisponibles, ArrayList<String> laptopsDisponibles,
                      ArrayList<Libro> librosDisponibles, String direccion, String facultad,
                      ArrayList<String> generosDisponibles, ArrayList<Bibliotecario> bibliotecarios) {
        this.nombre = nombre;
        this.computadoresMesaDisponibles = computadoresMesaDisponibles;
        this.laptopsDisponibles = laptopsDisponibles;
        this.librosDisponibles = librosDisponibles;
        this.direccion = direccion;
        this.facultad = facultad;
        this.generosDisponibles = generosDisponibles;
        this.bibliotecarios = bibliotecarios;
    }

    // METHODS
    // this method sets the genre of books according to the list
    public void setGenerosDisponibles() {
        generosDisponibles = new ArrayList<>();
        for (Libro libro : librosDisponibles) {
            if (!generosDisponibles.contains(libro.getGenero())) {
                generosDisponibles.add(libro.getGenero());
            }
        }
    }    
    
    //add librarian to the library
    public void agregarBibliotecario(Bibliotecario bibliotecario) {
        bibliotecarios.add(bibliotecario);
    }

    // GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getComputadoresMesaDisponibles() {
        return computadoresMesaDisponibles;
    }

    public void setComputadoresMesaDisponibles(ArrayList<String> computadoresMesaDisponibles) {
        this.computadoresMesaDisponibles = computadoresMesaDisponibles;
    }

    public ArrayList<String> getLaptopsDisponibles() {
        return laptopsDisponibles;
    }

    public void setLaptopsDisponibles(ArrayList<String> laptopsDisponibles) {
        this.laptopsDisponibles = laptopsDisponibles;
    }

    public ArrayList<Libro> getLibrosDisponibles() {
        return librosDisponibles;
    }

    public void setLibrosDisponibles(ArrayList<Libro> librosDisponibles) {
        this.librosDisponibles = librosDisponibles;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String comuna) {
        this.facultad = comuna;
    }

    public ArrayList<String> getGenerosDisponibles() {
        return generosDisponibles;
    }

    public ArrayList<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }


}


