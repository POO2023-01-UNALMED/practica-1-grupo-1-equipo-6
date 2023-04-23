package gestorAplicacion.usuario;

import java.util.ArrayList; 
import java.util.List;

import gestorAplicacion.gestion.Biblioteca;

public class Bibliotecario extends Persona {
    private ArrayList<Biblioteca> bibliotecasVinculadas = new ArrayList<>();
    private String contraseña;
    private String usuario;

    public Bibliotecario(String nombre, String apellido, int edad, String direccion, String tipoId, int Id, String contraseña,String usuario) {
        super(nombre, apellido, edad, direccion, tipoId, Id);
        this.contraseña = contraseña;
        this.usuario = usuario;
    }
    
    // METHODS 
    
    
    // add the logic for returning librarian's schedule (NOT FINISHED)
    public void buscarBiblioteca(Lector lector){}
    
    
    //add libraries where to work 
    public void AsignarBibliotca(Biblioteca biblioteca) {
        bibliotecasVinculadas.add(biblioteca);
    }
    
    
    // GETTERS AND SETTERS 
    public List<Biblioteca> getBibliotecasVinculadas() {
        return bibliotecasVinculadas;
    }


    public String getHorarioLaboral() {
        return contraseña;
    }

    public void setHorarioLaboral(String horarioLaboral) {
        this.contraseña = horarioLaboral;
    }

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
    
    
}


