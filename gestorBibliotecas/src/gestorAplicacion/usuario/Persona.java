package gestorAplicacion.usuario;

public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String direccion;
    protected String tipoId;
    protected int Id;

    public Persona(String nombre, String apellido, int edad, String direccion, String tipoId, int id) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.direccion = direccion;
		this.tipoId = tipoId;
		Id = id;
	}


	public abstract void buscarBiblioteca();
}
