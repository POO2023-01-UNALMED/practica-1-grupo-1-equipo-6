package gestorAplicacion.usuario;

import java.util.ArrayList; 
import java.util.List;

import gestorAplicacion.gestion.Biblioteca;

public class Bibliotecario extends Persona {
    private ArrayList<Biblioteca> bibliotecasVinculadas;
    private String horarioLaboral;

    public Bibliotecario(String nombre, String apellido, int edad, String direccion, String tipoId, int Id, String horarioLaboral) {
        super(nombre, apellido, edad, direccion, tipoId, Id);
        this.horarioLaboral = horarioLaboral;
    }
    
    // METHODS 
    
    
    // add the logic for returning librarian's schedule (NOT FINISHED)
    public void buscarBiblioteca(){}
    
    
    //add libraries where to work 
    public void AsignarBibliotca(Biblioteca biblioteca) {
        bibliotecasVinculadas.add(biblioteca);
    }
    
    
    // GETTERS AND SETTERS 
    public List<Biblioteca> getBibliotecasVinculadas() {
        return bibliotecasVinculadas;
    }


    public String getHorarioLaboral() {
        return horarioLaboral;
    }

    public void setHorarioLaboral(String horarioLaboral) {
        this.horarioLaboral = horarioLaboral;
    }
}


