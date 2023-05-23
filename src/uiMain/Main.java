package src.uiMain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import baseDatos.*;
import gestorAplicacion.obras.*;
import gestorAplicacion.obras.Libro.tipoLibro;
import gestorAplicacion.personas.*;
import gestorAplicacion.personas.EstudianteProfesor.Rol;


public class Main {
    static Scanner sc = new Scanner(System.in);
    static long readLong() {return sc.nextLong();}
    static String readLn() {return sc.nextLine();}

    public static void main(String[] args) {
        //Inicializadores para algunos atributos
        tipoLibro tipo;
        Autor autor = null;
        Estanteria estanteria;
        ArrayList<Integer> autores_id = new ArrayList<Integer>();
        for(Autor autor1 : Autor.getAutores()) {autores_id.add(autor1.getId());}
        if (autores_id.contains(0) == false) {new Autor();}

        ArrayList<Short> estanterias_numeros = new ArrayList<Short>();
        for(Estanteria estanteria1 : Estanteria.getLista()) {estanterias_numeros.add(estanteria1.getNumero());}
        if (estanterias_numeros.contains((short) 0) == false) {new Estanteria();}
    }