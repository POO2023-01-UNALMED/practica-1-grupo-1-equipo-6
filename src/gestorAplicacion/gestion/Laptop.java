package gestorAplicacion.gestion;

import java.io.Serializable;
import java.util.ArrayList;

public class Laptop extends Computador implements transportar,Serializable {
    private String modelo;
    boolean fueraDeLaUniversidad;
    
    public static ArrayList<Laptop> laptopsExistentes=new ArrayList<Laptop>();
    
    public static final String PERMISO_DENEGADO = "PERMISO-DENEGADO";
    
    
    public Laptop(String marca, String modelo, int capacidadRAM, int capacidadDiscoDuro, int id) {
        super(marca, modelo, capacidadRAM, capacidadDiscoDuro, id);
        this.modelo = modelo;
        laptopsExistentes.add(this);
    }
    
    
    
    
    
    public String transportar(String permisoDeTransporte, String fechaTransporte, String direccion) {
    	if(permisoDeTransporte != PERMISO_DENEGADO) {
    		permisoDeTransporte = permisoDeTransporte +'/'+ fechaTransporte +'/'+ direccion;
    				return permisoDeTransporte;
    	}
    	return PERMISO_DENEGADO;
    }
    

	public String getModelo() {
        return modelo;
    }
	
	
	
}

