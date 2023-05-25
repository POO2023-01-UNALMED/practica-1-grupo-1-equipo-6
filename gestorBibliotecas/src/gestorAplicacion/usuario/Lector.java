package gestorAplicacion.usuario;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

import gestorAplicacion.gestion.Biblioteca;
import gestorAplicacion.gestion.Computador;
import gestorAplicacion.gestion.Facultad;
import gestorAplicacion.gestion.Laptop;
import gestorAplicacion.gestion.Libro;

public class Lector extends Persona implements Serializable {
	public static ArrayList<Lector> lectoresExistentes = new ArrayList<>();
	private boolean reporte = false;
	private String informe;
	
    //--things to borrow 
    private ArrayList<Libro> librosPrestados  = new ArrayList<>();
    private ArrayList<Computador> computadoresPrestados  = new ArrayList<>();
    private ArrayList<Laptop> laptopsPrestados  = new ArrayList<>();
	
    public Lector(String nombre, String apellido, int edad, String direccion, String tipoId, int Id,boolean reporte) {
        super(nombre, apellido, edad, direccion, tipoId, Id);
        lectoresExistentes.add(this);
        this.reporte = reporte;
        crearInforme();
    }

    //METHODS 
    
    public String objetosPrestadosPorLector(Lector lector) {
        StringBuilder result = new StringBuilder();
        
        if (!lector.librosPrestados.isEmpty() || !lector.computadoresPrestados.isEmpty() || !lector.laptopsPrestados.isEmpty()) {
            result.append("Lector: ").append(lector.getNombre()).append(" ").append(lector.getApellido()).append("\n");

            if (!lector.librosPrestados.isEmpty()) {
                result.append("Libros prestados:\n");
                for (Libro libro : lector.librosPrestados) {
                    result.append("- ").append(libro.getTitulo()).append("\n");
                }
            }

            if (!lector.computadoresPrestados.isEmpty()) {
                result.append("Computadores prestados:\n");
                for (Computador computador : lector.computadoresPrestados) {
                    result.append("- ").append(computador.getModelo()).append("\n");
                }
            }

            if (!lector.laptopsPrestados.isEmpty()) {
                result.append("Laptops prestados:\n");
                for (Laptop laptop : lector.laptopsPrestados) {
                    result.append("- ").append(laptop.getModelo()).append("\n");
                }
            }

            result.append("--------------------------------------\n");
        }
        
        return result.toString();
    }

    
    public static String ObjetosPrestados() {
        StringBuilder result = new StringBuilder();
        for (Lector lector : lectoresExistentes) {
            if (!lector.librosPrestados.isEmpty() || !lector.computadoresPrestados.isEmpty() || !lector.laptopsPrestados.isEmpty()) {
                result.append("Lector: ").append(lector.getNombre()).append(" ").append(lector.getApellido()).append("\n");
                
                if (!lector.librosPrestados.isEmpty()) {
                    result.append("Libros prestados:\n");
                    for (Libro libro : lector.librosPrestados) {
                        result.append("- ").append(libro.getTitulo()).append("\n");
                    }
                }
                
                if (!lector.computadoresPrestados.isEmpty()) {
                    result.append("Computadores prestados:\n");
                    for (Computador computador : lector.computadoresPrestados) {
                        result.append("- ").append(computador.getModelo()).append("\n");
                    }
                }
                
                if (!lector.laptopsPrestados.isEmpty()) {
                    result.append("Laptops prestados:\n");
                    for (Laptop laptop : lector.laptopsPrestados) {
                        result.append("- ").append(laptop.getModelo()).append("\n");
                    }
                }
                
                result.append("--------------------------------------\n");
            }
        }
        return result.toString();
    }


    
    private void crearInforme() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(getNombre()).append("\n");
        sb.append("Apellido: ").append(getApellido()).append("\n");
        sb.append("Edad: ").append(getEdad()).append("\n");
        sb.append("Dirección: ").append(getDireccion()).append("\n");
        sb.append("Tipo de ID: ").append(getTipoId()).append("\n");
        sb.append("ID: ").append(getId()).append("\n");
        sb.append("\n");
        informe = sb.toString();
    }
    public void desertar() {
    	lectoresExistentes.remove(this);
    }
    
    
    public void asignarLaptop(String permisoDeTransporte, Biblioteca biblioteca) {
        String[] componentesPermiso = permisoDeTransporte.split("/");
        List<Laptop> laptopsDisponibles = biblioteca.getLaptopsDisponibles();
        
        for (Laptop laptop : new ArrayList<>(laptopsDisponibles)) {
            if (laptop.getId() == Integer.parseInt(componentesPermiso[2])) {
                this.agregarLaptop(laptop);
                laptopsDisponibles.remove(laptop);
            }
        }
    }


    
    
    
    //MAKE REPORT 
    public void hacerReporte() {
        int numObjetosPrestados = librosPrestados.size() + computadoresPrestados.size() + laptopsPrestados.size();
        if (numObjetosPrestados > 5) {
            reporte = true;
            this.setInforme(this.getInforme() + "PROCESO POR EXCEDER CANTIDAD DE PRESTAMOS\n");
        } else {
            reporte = false;
        }
    }
    //SEARCH USERS
    public static Lector buscarLector(int documento) {
        for (Lector lector : lectoresExistentes) {
            if (lector.getId() == documento) {
                return lector;
            }
        }

        return null;
    }
    
    //REGISTER USERS 
    public static void registerUser(String nombre, String apellido, int edad, String direccion, String tipoId, int id,Facultad facultad, int tipoLector) {
        if(tipoLector == 1) {
    	    Estudiante nuevoEstudiante = new Estudiante(nombre, apellido, edad, direccion, tipoId, id, false, facultad);
        }else if(tipoLector == 2) {
        	Profesor nuevoProfesor = new Profesor(nombre, apellido, edad, direccion, tipoId, id, false);
        }

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

	public boolean isReporte() {
		return reporte;
	}

	public void setReporte(boolean reporte) {
		this.reporte = reporte;
	}

	public String getInforme() {
		return informe;
	}

	public void setInforme(String informe) {
		this.informe = informe;
	}
    
    
    
}
