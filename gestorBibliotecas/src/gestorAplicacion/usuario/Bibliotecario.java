package gestorBibliotecas.src.gestorAplicacion.usuario;

import java.util.ArrayList; 
import java.util.List;

import gestorAplicacion.gestion.Biblioteca;

public class Bibliotecario extends Persona {
    
    private String contraseña;
    private String usuario;
    
    // libraries 
    public static ArrayList<Bibliotecario> bibliotecariosExistentetes = new ArrayList<>();
    
    public Bibliotecario(String nombre, String apellido, int edad, String direccion, String tipoId, int Id, String contraseña,String usuario) {
        super(nombre, apellido, edad, direccion, tipoId, Id);
        this.contraseña = contraseña;
        this.usuario = usuario;
        bibliotecariosExistentetes.add(this);
    }

    //METHODS
    
    
    //getters and setters 
	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public static ArrayList<Bibliotecario> getBibliotecariosExistentetes() {
		return bibliotecariosExistentetes;
	}

	public static void setBibliotecariosExistentetes(ArrayList<Bibliotecario> bibliotecariosExistentetes) {
		Bibliotecario.bibliotecariosExistentetes = bibliotecariosExistentetes;
	}
    
    
    
    
    
    
    
    
}


