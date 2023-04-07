package gestorAplicacion.usuario;

import java.util.ArrayList;

import gestorAplicacion.gestion.Computador;
import gestorAplicacion.gestion.Laptop;
import gestorAplicacion.gestion.Libro;

public class Profesor extends Lector {
    private boolean reporte;
    private ArrayList<Libro> librosPrestados  = new ArrayList<>();
    private ArrayList<Computador> computadoresPrestados  = new ArrayList<>();
    private ArrayList<Laptop> laptopsPrestados  = new ArrayList<>();

    public Profesor(String nombre, String apellido, int edad, String direccion, String tipoId, int Id, boolean reporte) {
        super(nombre, apellido, edad, direccion, tipoId, Id);
        this.reporte = reporte;
    }

    // Getters y Setters
    public boolean tieneReporte() {
        return reporte;
    }

    public void setReporte(boolean reporte) {
        this.reporte = reporte;
    }

    // Métodos para agregar/quitar libros, computadores, laptops prestados
    public void agregarLibro(Libro libro) {
        librosPrestados.add(libro);
    }

    public void quitarLibro(Libro libro) {
        librosPrestados.remove(libro);
    }

    public void agregarComputador(Computador computador) {
        computadoresPrestados.add(computador);
    }

    public void quitarComputador(Computador computador) {
        computadoresPrestados.remove(computador);
    }

    public void agregarLaptop(Laptop laptop) {
        laptopsPrestados.add(laptop);
    }

    public void quitarLaptop(Laptop laptop) {
        laptopsPrestados.remove(laptop);
    }

    // Métodos para obtener la cantidad de libros, computadores y laptops prestados
    public int getCantidadLibrosPrestados() {
        return librosPrestados.size();
    }

    public int getCantidadComputadoresPrestados() {
        return computadoresPrestados.size();
    }

    public int getCantidadLaptopsPrestados() {
        return laptopsPrestados.size();
    }

    // Getters y Setters para los libros, computadores y laptops prestados
    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(ArrayList<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public ArrayList<Computador> getComputadoresPrestados() {
        return computadoresPrestados;
    }

    public void setComputadoresPrestados(ArrayList<Computador> computadoresPrestados) {
        this.computadoresPrestados = computadoresPrestados;
    }

    public ArrayList<Laptop> getLaptopsPrestados() {
        return laptopsPrestados;
    }

    public void setLaptopsPrestados(ArrayList<Laptop> laptopsPrestados) {
        this.laptopsPrestados = laptopsPrestados;
    }
}

