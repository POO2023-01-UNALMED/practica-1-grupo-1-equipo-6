package gestorAplicacion.usuario;

import java.util.ArrayList;
import java.util.List;

import gestorAplicacion.gestion.Biblioteca;

public class Bibliotecario extends Persona {
    private ArrayList<Biblioteca> bibliotecasVinculadas;
    private String horarioLaboral;
    private String facultad;
    

    public Bibliotecario(String nombre, String apellido, int edad, String direccion, String tipoId, int Id, ArrayList<Biblioteca> bibliotecasVinculadas, String horarioLaboral, String facultad) {
        super(nombre, apellido, edad, direccion, tipoId, Id);
        this.bibliotecasVinculadas = bibliotecasVinculadas;
        this.horarioLaboral = horarioLaboral;
        this.facultad = facultad;
    }
    //methods
    
    
    public  ArrayList<Biblioteca> buscarBiblioteca(ArrayList<Biblioteca> bibliotecas, String comuna){
    	ArrayList<Biblioteca> bibliotecasAsignadas = null;
    	return bibliotecasAsignadas;                            // add the logic to return librarian's schedule 
    }
    
    
    
    
    
    
    
    // Getters y Setters
    public List<Biblioteca> getBibliotecasVinculadas() {
        return bibliotecasVinculadas;
    }

    public void setBibliotecasVinculadas(ArrayList<Biblioteca> bibliotecasVinculadas) {
        this.bibliotecasVinculadas = bibliotecasVinculadas;
    }

    public String getHorarioLaboral() {
        return horarioLaboral;
    }

    public void setHorarioLaboral(String horarioLaboral) {
        this.horarioLaboral = horarioLaboral;
    }

	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
    
    
}

