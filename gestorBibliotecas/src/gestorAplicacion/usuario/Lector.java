package gestorAplicacion.usuario;

import java.util.ArrayList;
import java.util.Scanner;

import gestorAplicacion.gestion.Biblioteca;
import gestorAplicacion.gestion.Facultad;

public class Lector extends Persona {
	static ArrayList<Lector> lectoresExistentes = new ArrayList<>();
	
    public Lector(String nombre, String apellido, int edad, String direccion, String tipoId, int Id) {
        super(nombre, apellido, edad, direccion, tipoId, Id);
        lectoresExistentes.add(this);
    }

    
    public static Lector buscarLector(int documento) {
        for (Lector lector : lectoresExistentes) {
            if (lector.getId() == documento) {
                return lector;
            }
        }
        System.out.println("Lector no encontrado");
        return null;
    }

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
        int Id = sc.nextInt();

        //new LectorUser
        Lector nuevoLector = new Lector(nombre, apellido, edad, direccion, tipoId, Id);
        System.out.println("¡Lector registrado exitosamente!");
    }
    
}
