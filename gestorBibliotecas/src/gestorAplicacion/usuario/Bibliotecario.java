package gestorAplicacion.usuario;

import java.io.Serializable;
import java.util.ArrayList; 
import java.util.List;

import gestorAplicacion.gestion.Biblioteca;
import gestorAplicacion.gestion.Laptop;

public class Bibliotecario extends Persona implements Serializable  {
    
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
    
    
    public void desertar() {
    	bibliotecariosExistentetes.remove(this);
	
    }
    
    public String crearPermisoTransporte(Lector user, Laptop laptop) {
        int anoModelo = 0;
        String modelo = laptop.getModelo();
        String[] palabras = modelo.split(" ");
        
        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            if (palabra.matches("\\d{4}")) {
                anoModelo = Integer.parseInt(palabra);
                break; // Salir del bucle una vez que se haya encontrado el año
            }
        }
        
        if (anoModelo > 2020) {
            return "PERMISO-DENEGADO";
        } else {
            return user.getTipoId() + '/' + this.Id + '/' + laptop.getId() + '/';
        }
    }

    
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


