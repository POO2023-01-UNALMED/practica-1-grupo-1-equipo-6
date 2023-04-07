package gestorAplicacion.gestion;

import java.util.ArrayList;

import gestorAplicacion.usuario.Bibliotecario;

public class Biblioteca {
    private String direccion;
    private Facultad facultad;
    private String nombre;
    private ArrayList<String> computadoresMesaDisponibles= new ArrayList<>();
    private ArrayList<String> laptopsDisponibles= new ArrayList<>();
    private ArrayList<Libro> librosDisponibles = new ArrayList<>();
    private ArrayList<String> generosDisponibles = new ArrayList<>();
    private ArrayList<Bibliotecario> bibliotecarios = new ArrayList<>();
    
    public static ArrayList<Biblioteca> bibliotecasExistentetes = new ArrayList<>();

    public Biblioteca(String direccion, Facultad facultad, String nombre) {
        this.direccion = direccion;
        this.facultad = facultad;
        this.nombre = nombre;
        bibliotecasExistentetes.add(this);
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

    // adders (like a setter) for librarians, books, computers, lap tops, 
    public void agregarLibro(Libro libro) {
        librosDisponibles.add(libro);
    }
    
    public void agregarLibro(Bibliotecario bibliotecario) {
        bibliotecarios.add(bibliotecario);
    }
    
    public void agregarBibliotecario(Bibliotecario bibliotecario) {
        bibliotecarios.add(bibliotecario);
    }
    public void agregarComputadorMesaDisponible(String computadorMesa) {
        computadoresMesaDisponibles.add(computadorMesa);
    }

    public void agregarLaptopDisponible(String laptop) {
        laptopsDisponibles.add(laptop);
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

    public ArrayList<String> getLaptopsDisponibles() {
        return laptopsDisponibles;
    }


    public ArrayList<Libro> getLibrosDisponibles() {
        return librosDisponibles;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public ArrayList<String> getGenerosDisponibles() {
        return generosDisponibles;
    }

    public ArrayList<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }
}

