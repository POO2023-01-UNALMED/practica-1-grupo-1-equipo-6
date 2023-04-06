package gestorAplicacion.usuario;

import java.util.ArrayList;

import gestorAplicacion.gestion.Biblioteca;

public class Lector extends Persona {
    private String tipoPersona;                                   // Estudiante, Profesor , Ninguno

    public Lector(String nombre, String apellido, int edad, String direccion, String tipoId, int Id, String tipoPersona) {
        super(nombre, apellido, edad, direccion, tipoId, Id);
        this.tipoPersona = tipoPersona;
    }

    // Getters y Setters
    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

	public ArrayList<Biblioteca> buscarBiblioteca(ArrayList<Biblioteca> bibliotecas, String comuna) {
    	ArrayList<Biblioteca> bibliotecasDisponibles = null;
    	return bibliotecasDisponibles;                            // add the logic to return the libraries available
	}
}