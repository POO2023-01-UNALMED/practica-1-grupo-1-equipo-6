package gestorAplicacion.usuario;

import java.util.ArrayList;

import gestorAplicacion.gestion.Biblioteca;
import gestorAplicacion.gestion.Computador;
import gestorAplicacion.gestion.Laptop;
import gestorAplicacion.gestion.Libro;

public class Profesor extends Lector {
	
	//--attributes 
    private boolean reporte;
    
    //--things to borrow 
    private ArrayList<Libro> librosPrestados  = new ArrayList<>();
    private ArrayList<Computador> computadoresPrestados  = new ArrayList<>();
    private ArrayList<Laptop> laptopsPrestados  = new ArrayList<>();
    
    //constructor
    public Profesor(String nombre, String apellido, int edad, String direccion, String tipoId, int Id, boolean reporte) {
        super(nombre, apellido, edad, direccion, tipoId, Id);
        this.reporte = reporte;
    }
    
    
    //METHODS
    public ArrayList<Biblioteca> buscarBibliotecas(int documento) {
        for (Lector lector : lectoresExistentes) {
            if (lector.getId() == documento && lector instanceof Profesor) {
                return Biblioteca.bibliotecasExistentetes;
            }
        }
        return new ArrayList<Biblioteca>();
    }

  

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


}

