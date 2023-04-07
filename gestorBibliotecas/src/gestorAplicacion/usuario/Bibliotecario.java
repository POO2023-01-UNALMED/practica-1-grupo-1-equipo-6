package gestorAplicacion.usuario;

import java.util.ArrayList;
import java.util.List;

import gestorAplicacion.gestion.Biblioteca;

public class Bibliotecario extends Persona {
    private ArrayList<Biblioteca> bibliotecasVinculadas;
    private String horarioLaboral;

    public Bibliotecario(String nombre, String apellido, int edad, String direccion, String tipoId, int Id, ArrayList<Biblioteca> bibliotecasVinculadas, String horarioLaboral) {
        super(nombre, apellido, edad, direccion, tipoId, Id);
        this.bibliotecasVinculadas = bibliotecasVinculadas;
        this.horarioLaboral = horarioLaboral;
    }
    
    // METHODS 
    
    
    // add the logic for returning librarian's schedule (NOT FINISHED)
    public ArrayList<Biblioteca> buscarBiblioteca(){
        ArrayList<Biblioteca> bibliotecasAsignadas = null;
        
        return bibliotecasAsignadas;                            
    }

    
    
    // GETTERS AND SETTERS 
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
}


