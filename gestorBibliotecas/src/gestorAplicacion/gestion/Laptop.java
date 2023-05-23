package gestorBibliotecas.src.gestorAplicacion.gestion;


public class Laptop extends Computador {
    private String modelo;
    
    public Laptop(String marca, String modelo, int capacidadRAM, int capacidadDiscoDuro, int id) {
        super(marca, modelo, capacidadRAM, capacidadDiscoDuro, id);
        this.modelo = modelo;
        if (modelo.contains("2022") || modelo.contains("2023")) {
            setEsPortable(true);
        }
    }
    

	public String getModelo() {
        return modelo;
    }
}

