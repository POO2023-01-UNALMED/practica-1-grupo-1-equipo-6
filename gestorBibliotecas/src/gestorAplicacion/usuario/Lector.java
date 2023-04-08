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
    
    
    //add logic for search libraries 
    public void buscarBiblioteca(Lector lector) {
    	ArrayList<Biblioteca> bibliotecasDisponibles = new ArrayList<>();
    	if (lector instanceof Estudiante) {
    		Estudiante estudiante = (Estudiante) lector;
    		if (estudiante.getFacultad() == Facultad.MINAS) {
    			for (Biblioteca biblioteca : Biblioteca.bibliotecasExistentetes) {
    				if(biblioteca.getFacultad()== Facultad.MINAS) {
    					bibliotecasDisponibles.add(biblioteca);
    				}
    			}
    		}else if (estudiante.getFacultad() != Facultad.MINAS) {
    			for(Biblioteca biblioteca : Biblioteca.bibliotecasExistentetes) {
    				if(biblioteca.getFacultad() != Facultad.MINAS) {
    					bibliotecasDisponibles.add(biblioteca);
    				}
    			}
    		}
    
    	}else if (lector instanceof Profesor)
    	{for(Biblioteca biblioteca : Biblioteca.bibliotecasExistentetes) {
    		bibliotecasDisponibles.add(biblioteca);
    	}}
    	for (int i = 0; i < bibliotecasDisponibles.size(); i++) {
    		System.out.println((i + 1) + ". " +  bibliotecasDisponibles.get(i).getNombre());
    	}
    }
    
    public static int buscarLector(int documento) {
    	for (Lector lector : lectoresExistentes) {
    		if (lector.getId()==documento) {
    			return 1;
    		}
    	}
		return 2;
    }
    
    public static void registrarLector(String nombre,String apellido, int edad, String direccion,String tipoId, int Id,boolean reporte,Facultad facultad,  int tipoPersona) {
    	//Student == 1, Teacher == 2
    	if (tipoPersona == 1) {
    		
    		Lector.lectoresExistentes.add(new Estudiante(nombre, apellido, edad, direccion, tipoId, Id, false, facultad));
    	}else if(tipoPersona ==2){
    		Lector.lectoresExistentes.add(new Profesor(nombre, apellido, edad, direccion, tipoId, Id, reporte));
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
