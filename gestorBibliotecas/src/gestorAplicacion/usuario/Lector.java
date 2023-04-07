package gestorAplicacion.usuario;

import java.util.ArrayList;

import gestorAplicacion.gestion.Biblioteca;

public class Lector extends Persona {
    public Lector(String nombre, String apellido, int edad, String direccion, String tipoId, int Id) {
        super(nombre, apellido, edad, direccion, tipoId, Id);
    }
    
    
    //add logic for search libraries (NOT FINISHED)
    public ArrayList<Biblioteca> buscarBiblioteca() {
    	return null;    
    }
}
