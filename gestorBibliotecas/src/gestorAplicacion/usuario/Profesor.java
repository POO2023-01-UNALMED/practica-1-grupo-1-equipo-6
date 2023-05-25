package gestorAplicacion.usuario;

import java.io.Serializable;
import java.util.ArrayList;

import gestorAplicacion.gestion.Biblioteca;
import gestorAplicacion.gestion.Computador;
import gestorAplicacion.gestion.Laptop;
import gestorAplicacion.gestion.Libro;

public class Profesor extends Lector implements Serializable {
	
	//--attributes
	public static ArrayList<Profesor> profesoresExistentes = new ArrayList<Profesor>();
    
    //constructor
    public Profesor(String nombre, String apellido, int edad, String direccion, String tipoId, int Id, boolean reporte) {
        super(nombre, apellido, edad, direccion, tipoId, Id,reporte);
        profesoresExistentes.add(this);
    }
    
    
    //METHODS
    @Override
    public void desertar() {
    	this.setReporte(true);
    	this.setInforme( this.getInforme() + "RENUNCIA" + "\n");
        	
    }
    

    
    
    public ArrayList<Biblioteca> buscarBibliotecas(int documento) {
        for (Lector lector : lectoresExistentes) {
            if (lector.getId() == documento && lector instanceof Profesor) {
                return Biblioteca.bibliotecasExistentes;
            }
        }
        return new ArrayList<Biblioteca>();
    }

  


    
    
    
    // GETTERS AND SETTERS


}

