package gestorAplicacion.usuario;

import java.util.ArrayList;

import gestorAplicacion.gestion.Biblioteca;
import gestorAplicacion.gestion.Computador;
import gestorAplicacion.gestion.Facultad;
import gestorAplicacion.gestion.Laptop;
import gestorAplicacion.gestion.Libro;

public class Estudiante extends Lector {
	
	//--attributes 
    private boolean reporte;
    private Facultad facultad;
    
    //--things to borrow 
    private ArrayList<Libro> librosPrestados  = new ArrayList<>();
    private ArrayList<Computador> computadoresPrestados  = new ArrayList<>();
    private ArrayList<Laptop> laptopsPrestados  = new ArrayList<>();
    
    //constructor
    public Estudiante(String nombre, String apellido, int edad, String direccion, String tipoId, int Id, boolean reporte, Facultad facultad) {
        super(nombre, apellido, edad, direccion, tipoId, Id);
        this.reporte = reporte;
        this.facultad = facultad;
    }
    
    //METHODS
    
    public ArrayList<Biblioteca> buscarBibliotecas(int documento) {
    	ArrayList<Biblioteca> bibliotecasExistentes = new ArrayList<>();
        for (Lector lector : lectoresExistentes) {
            if (lector.getId() == documento && lector instanceof Estudiante) {
            	if ((((Estudiante)lector).getFacultad() == facultad.CIENCIAS) || (((Estudiante)lector).getFacultad() == facultad.ARQUITECTURA)) {
            		for (Biblioteca biblioteca : Biblioteca.bibliotecasExistentetes) {
            			if((biblioteca.getFacultad() == facultad.CIENCIAS) || (biblioteca.getFacultad() == facultad.CIENCIAS_AGRARIAS) || (biblioteca.getFacultad() == facultad.CIENCIAS_HUMANAS_ECONOMIA)|| (biblioteca.getFacultad() == facultad.ARQUITECTURA) || (biblioteca.getFacultad() == facultad.UNIVERSIDAD)){
            				bibliotecasExistentes.add(biblioteca);
            			}
                

            		}
            	}

                
                else if (lector.getId() == documento && lector instanceof Estudiante) {
            	    if ((((Estudiante)lector).getFacultad() == facultad.MINAS) || (((Estudiante)lector).getFacultad() == facultad.ARQUITECTURA)) {
            		   for (Biblioteca biblioteca : Biblioteca.bibliotecasExistentetes) {
            			  if((biblioteca.getFacultad() == facultad.MINAS)  || (biblioteca.getFacultad() == facultad.UNIVERSIDAD)){
            				bibliotecasExistentes.add(biblioteca);
            			   }
                

            		    }
            	    }

                }
            
           }
        }
        return bibliotecasExistentes;
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

	public Facultad getFacultad() {
		return facultad;
	}

	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}


    
}


