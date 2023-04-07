package gestorAplicacion.usuario;

import java.util.ArrayList;

import gestorAplicacion.gestion.Computador;
import gestorAplicacion.gestion.Facultad;
import gestorAplicacion.gestion.Laptop;
import gestorAplicacion.gestion.Libro;

public class Estudiante extends Lector {
    private boolean reporte;
    private ArrayList<Libro> librosPrestados;
    private ArrayList<Computador> computadoresPrestados;
    private ArrayList<Laptop> laptopsPrestados;
    private Facultad facultad;

    public Estudiante(String nombre, String apellido, int edad, String direccion, String tipoId, int Id, boolean reporte, Facultad facultad) {
        super(nombre, apellido, edad, direccion, tipoId, Id);
        this.reporte = reporte;
        this.facultad = facultad;
    }
    //METHODS
    
    
    //from super apply buscarBiblioteca 
    
    
    
    
    //add book, lap top, computer borrowed 
    public void agregarLibro(Libro libro) {
        librosPrestados.add(libro);
    }

    public void agregarComputador(Computador computador) {
        computadoresPrestados.add(computador);
    }

    public void agregarLaptop(Laptop laptop) {
        laptopsPrestados.add(laptop);
    }
    
  //get number of  book, lap top, computer borrowed     
    public int getCantidadLibrosPrestados() {
        return librosPrestados.size();
    }

    public int getCantidadComputadoresPrestados() {
        return computadoresPrestados.size();
    }

    public int getCantidadLaptopsPrestados() {
        return laptopsPrestados.size();
    }
    
    
    
    // GETTERS AND SETTERS
 	public boolean isReporte() {
		return reporte;
	}
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

	public Facultad getFacultad() {
		return facultad;
	}

	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}


    
}


