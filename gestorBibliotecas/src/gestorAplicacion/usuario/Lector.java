package gestorAplicacion.usuario;

import gestorAplicacion.gestion.Biblioteca;

public class Lector extends Persona {
    public Lector(String nombre, String apellido, int edad, String direccion, String tipoId, int Id) {
        super(nombre, apellido, edad, direccion, tipoId, Id);
    }
    
    
    //add logic for search libraries (NOT FINISHED)
    public void buscarBiblioteca() {
        System.out.println("Bibliotecas disponibles:");
        for (Biblioteca biblioteca : Biblioteca.bibliotecasExistentetes) {
            System.out.println("- " + biblioteca.getNombre());
        }
    }
}
