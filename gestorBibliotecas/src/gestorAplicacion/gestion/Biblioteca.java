package gestorAplicacion.gestion;

import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private int computadoresMesa;
    private int laptops;
    private ArrayList<Libro> librosDisponibles;
    private String direccion;
    private String facultad;
    private ArrayList<String> generosDisponibles;

    public Biblioteca(String nombre, int computadoresMesa, int laptops, ArrayList<Libro> librosDisponibles, String direccion, String facultad, ArrayList<String> generosDisponibles) {
        this.nombre = nombre;
        this.computadoresMesa = computadoresMesa;
        this.laptops = laptops;
        this.librosDisponibles = librosDisponibles;
        this.direccion = direccion;
        this.facultad = facultad;
        this.generosDisponibles = generosDisponibles;
    }
    
    
    // Método para buscar libros por género
    public ArrayList<Libro> buscarLibrosPorGenero(String genero) {
        ArrayList<Libro> librosPorGenero = new ArrayList<>();
        for (Libro libro : librosDisponibles) {
            if (libro.getGenero().equals(genero)) {
                librosPorGenero.add(libro);
            }
        }
        return librosPorGenero;
    }
    
    
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getComputadoresMesa() {
        return computadoresMesa;
    }

    public void setComputadoresMesa(int computadoresMesa) {
        this.computadoresMesa = computadoresMesa;
    }

    public int getLaptops() {
        return laptops;
    }

    public void setLaptops(int laptops) {
        this.laptops = laptops;
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

    public void setGenerosDisponibles(ArrayList<String> generosDisponibles) {
        this.generosDisponibles = generosDisponibles;
    }
    

}
