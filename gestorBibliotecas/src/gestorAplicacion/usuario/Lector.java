package gestorAplicacion.usuario;

import java.util.ArrayList;

import gestorAplicacion.gestion.Biblioteca;
import gestorAplicacion.gestion.Facultad;

public class Lector extends Persona {
	static ArrayList<Lector> lectoresExistentes = new ArrayList<>();
	
    public Lector(String nombre, String apellido, int edad, String direccion, String tipoId, int Id) {
        super(nombre, apellido, edad, direccion, tipoId, Id);
        lectoresExistentes.add(this);
    }
    
    
    //add logic for search libraries (NOT FINISHED)
    public void buscarBiblioteca() {
        System.out.println("Bibliotecas disponibles:");
        for (Biblioteca biblioteca : Biblioteca.bibliotecasExistentetes) {
            System.out.println("- " + biblioteca.getNombre());
        }
    }
    
    public static int buscarLector(int documento) {
    	for (Lector lector : lectoresExistentes) {
    		if (lector.getId()==documento) {
    			return 1;
    		}
    	}
		return 0;
    }
    
    public static void registrarLector(String nombre,String apellido, int edad, String direccion,String tipoId, int Id,boolean reporte,Facultad facultad,  int tipoPersona) {
    	//Estudiante == 1, Profesor == 2
    	if (tipoPersona == 1) {
    		new Estudiante(nombre, apellido, edad, direccion, tipoId, Id, false, facultad);
    	}

    }
    
    public static Lector getLector(int documento) {
    	for (Lector lector : lectoresExistentes) {
    		if (lector.getId()==documento) {
    			return lector;
    		}
    	}
		return null;
    	
    }
    
}
