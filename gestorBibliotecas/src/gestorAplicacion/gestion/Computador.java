package gestorAplicacion.gestion;

public class Computador {
    private boolean esPortable = false;
    private boolean reporte = false;
    private String marca;
    private String modelo;
    private int capacidadRAM;
    private int capacidadDiscoDuro;
    private int id;
    
    public Computador(String marca, String modelo, int capacidadRAM, int capacidadDiscoDuro, int id) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadRAM = capacidadRAM;
        this.capacidadDiscoDuro = capacidadDiscoDuro;
        this.id = id;
    }
    
    public boolean isEsPortable() {
        return esPortable;
    }
    
    public void setEsPortable(boolean esPortable) {
        this.esPortable = esPortable;
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

