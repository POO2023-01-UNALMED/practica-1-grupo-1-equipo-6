package gestorAplicacion.usuario;

import java.util.ArrayList;

import gestorAplicacion.gestion.Biblioteca;

public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String direccion;
    protected String tipoId;
    protected int Id;
    
    public static ArrayList<Persona> personasExistentes = new ArrayList<Persona>();

    public Persona(String nombre, String apellido, int edad, String direccion, String tipoId, int id) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.direccion = direccion;
		this.tipoId = tipoId;
		Id = id;
		personasExistentes.add(this);
	}
    
    public abstract void desertar();

	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTipoId() {
		return tipoId;
	}


	public void setTipoId(String tipoId) {
		this.tipoId = tipoId;
	}
	
	
	
}
