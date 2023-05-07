package gestorAplicacion.usuario;

import java.util.ArrayList;

import gestorAplicacion.gestion.Biblioteca;
import gestorAplicacion.gestion.Computador;
import gestorAplicacion.gestion.Laptop;
import gestorAplicacion.gestion.Libro;

public class Profesor extends Lector {
	
	//--attributes 
    private boolean reporte;
 
    
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

  


    
    
    
    // GETTERS AND SETTERS
 	public boolean isReporte() {
		return reporte;
	}


}

