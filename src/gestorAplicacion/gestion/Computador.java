package gestorAplicacion.gestion;

import java.io.Serializable;
import java.util.ArrayList;

public class Computador implements Serializable {
    private boolean reporte = false;
    private String marca;
    private String modelo;
    private int capacidadRAM;
    private int capacidadDiscoDuro;
    private int id;
    
    public static ArrayList<Computador> computadoresExistentes=new ArrayList<Computador>();
    
    public Computador(String marca, String modelo, int capacidadRAM, int capacidadDiscoDuro, int id) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadRAM = capacidadRAM;
        this.capacidadDiscoDuro = capacidadDiscoDuro;
        this.id = id;
        computadoresExistentes.add(this);
    }
    
    
    public boolean isReporte() {
        return reporte;
    }
    
    public void setReporte(boolean reporte) {
        this.reporte = reporte;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public int getCapacidadRAM() {
        return capacidadRAM;
    }
    
    public int getCapacidadDiscoDuro() {
        return capacidadDiscoDuro;
    }
    
    public int getId() {
        return id;
    }
}

