package gestorAplicacion.usuario;

import java.util.ArrayList;
import java.util.Scanner;

import gestorAplicacion.gestion.Facultad;

public class Lector extends Persona {
	static ArrayList<Lector> lectoresExistentes = new ArrayList<>();
	
    public Lector(String nombre, String apellido, int edad, String direccion, String tipoId, int Id) {
        super(nombre, apellido, edad, direccion, tipoId, Id);
        lectoresExistentes.add(this);
    }

    //METHODS 
    
    //SEARCH USERS
    public static Lector buscarLector(int documento) {
        for (Lector lector : lectoresExistentes) {
            if (lector.getId() == documento) {
                return lector;
            }
        }
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Lector no encontrado");
        return null;
    }
    
    //REGISTER USERS 
    public static void registerUser() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del lector:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el apellido del lector:");
        String apellido = sc.nextLine();

        System.out.println("Ingrese la edad del lector:");
        int edad = sc.nextInt();
        sc.nextLine(); // buffer cleaner

        System.out.println("Ingrese la dirección del lector:");
        String direccion = sc.nextLine();

        System.out.println("Ingrese el tipo de identificación del lector:");
        String tipoId = sc.nextLine();

        System.out.println("Ingrese el número de identificación del lector:");
        int id = sc.nextInt();

        System.out.println("Seleccione el tipo de lector a registrar:");
        System.out.println("1. Estudiante");
        System.out.println("2. Profesor");

        int tipoLector = sc.nextInt();
        sc.nextLine(); // buffer cleaner

        if (tipoLector == 1) {
        	System.out.println("-----------------------------------------------------------------");
        	System.out.println("1. Estudiante");
        	System.out.println("-----------------------------------------------------------------");
            System.out.println("Ingrese la facultad del estudiante:");
            System.out.println("");
            System.out.println("Facultades disponibles:");
            for (Facultad fac : Facultad.values()) {
                System.out.println(fac.ordinal() + ". " + fac.getNombre());
            }
            int indexFacultad = sc.nextInt();
            sc.nextLine(); // buffer cleaner
            Facultad facultad = Facultad.values()[indexFacultad];

            // creating student
            Estudiante nuevoEstudiante = new Estudiante(nombre, apellido, edad, direccion, tipoId, id, false, facultad);
            System.out.println("¡Estudiante registrado exitosamente!");
        } else if (tipoLector == 2) {

            // creating professor 
            Profesor nuevoProfesor = new Profesor(nombre, apellido, edad, direccion, tipoId, id, false);
            System.out.println("¡Profesor registrado exitosamente!");
        } else {
            System.out.println("Opción no válida. Intente de nuevo.");
        }
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Para continuar digite el documento nuevamente:");
        
    }

 
    
}
