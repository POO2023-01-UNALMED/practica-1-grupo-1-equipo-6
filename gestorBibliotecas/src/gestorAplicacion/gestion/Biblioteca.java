package gestorAplicacion.gestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import gestorAplicacion.usuario.Bibliotecario;

public class Biblioteca {
	
	
	// attributes
    private String direccion;
    private Facultad facultad;
    private String nombre;
    
    
    //things to borrow
    private ArrayList<String> computadoresMesaDisponibles= new ArrayList<>();
    private ArrayList<String> laptopsDisponibles= new ArrayList<>();
    private ArrayList<Libro> librosDisponibles = new ArrayList<>();
    private ArrayList<String> generosDisponibles = new ArrayList<>();
    private ArrayList<Bibliotecario> bibliotecarios = new ArrayList<>();
    
    
    // libraries 
    public static ArrayList<Biblioteca> bibliotecasExistentetes = new ArrayList<>();
    
    //constructor
    public Biblioteca(String direccion, Facultad facultad, String nombre) {
        this.direccion = direccion;
        this.facultad = facultad;
        this.nombre = nombre;
        bibliotecasExistentetes.add(this);
    }

    // METHODS
    
    //over charge 
    
    //filter books by genre
    public ArrayList<Libro> LibrosFiltrados(String genero) {
        ArrayList<Libro> librosPorGenero = new ArrayList<>();
        for(Libro libro : librosDisponibles) {
            if (libro.getGenero().equals(genero)) {
                librosPorGenero.add(libro);
            }
        }
        return librosPorGenero;
    }

    //filter books by id
    public Libro LibrosFiltrados(int id) {
        for (Libro libro : librosDisponibles) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }
    
    //filter books by authors or titles 
    public ArrayList<Libro> LibrosFiltrados() {
        // taking only the titles and authors from the librosDisponible
		List<String> books = new ArrayList<String>();
		for(Libro libro :getLibrosDisponibles()) {
		books.add(libro.getId() + "-" + libro.getTitulo().toLowerCase()  + " - " + libro.getAutor().toLowerCase());
		}

        // taking the string provided by the user
        System.out.println("Ingrese el título o autor del libro que busca: ");
        System.out.print(" ");
        Scanner scanner = new Scanner(System.in);
        String searchQuery = scanner.nextLine();

        // split the search in individual words
        List<String> searchTerms = Arrays.asList(searchQuery.split("\\s+"));

        // searching the results that coincide with the search 
        List<String> results = new ArrayList<>();
        for (String book : books) {
            boolean matches = true;
            for (String term : searchTerms) {
                if (!book.toLowerCase().contains(term.toLowerCase())) {
                    matches = false;
                    break;
                }
            }
            if (matches) {
                results.add(book);  
            }
        }
        
        List<Integer> idsLibrosPosibles = new ArrayList<>();
        for (String elemento : results) {
        	String[] IdTituloAutorDividido = elemento.split("\\-");
        	int idPosible = Integer.parseInt(IdTituloAutorDividido[0].trim());
        	idsLibrosPosibles.add(idPosible);
        }
        
        ArrayList<Libro> librosPosibles = new ArrayList<>();
        for(int idPosible : idsLibrosPosibles) {
        	for(Libro libro : getLibrosDisponibles()) {
        		if(libro.getId() == idPosible) {
        			librosPosibles.add(libro);
        		}
        	}
        	
        }
        
        
        // returning the list with the possible name and authors of the book searched 
        return  librosPosibles;
     
    }
    


    // adders (like a setter) for librarians, books, computers, lap tops, 
    public void agregarLibro(Libro libro) {
        librosDisponibles.add(libro);
    }
    
    public void agregarLibro(Bibliotecario bibliotecario) {
        bibliotecarios.add(bibliotecario);
    }
    
    public void agregarBibliotecario(Bibliotecario bibliotecario) {
        bibliotecarios.add(bibliotecario);
    }
    public void agregarComputadorMesaDisponible(String computadorMesa) {
        computadoresMesaDisponibles.add(computadorMesa);
    }

    public void agregarLaptopDisponible(String laptop) {
        laptopsDisponibles.add(laptop);
    }
    
    // GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getComputadoresMesaDisponibles() {
        return computadoresMesaDisponibles;
    }

    public ArrayList<String> getLaptopsDisponibles() {
        return laptopsDisponibles;
    }


    public ArrayList<Libro> getLibrosDisponibles() {
        return librosDisponibles;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public ArrayList<String> getGenerosDisponibles() {
        return generosDisponibles;
    }

    public ArrayList<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

	public void setComputadoresMesaDisponibles(ArrayList<String> computadoresMesaDisponibles) {
		this.computadoresMesaDisponibles = computadoresMesaDisponibles;
	}

	public void setLaptopsDisponibles(ArrayList<String> laptopsDisponibles) {
		this.laptopsDisponibles = laptopsDisponibles;
	}

	public void setLibrosDisponibles(ArrayList<Libro> librosDisponibles) {
		this.librosDisponibles = librosDisponibles;
	}
    
    
}

