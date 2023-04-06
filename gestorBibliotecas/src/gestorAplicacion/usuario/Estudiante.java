package gestorAplicacion.usuario;

public class Estudiante extends Lector {
    private boolean reporte;
    private boolean tieneLibro;
    private boolean tieneComputador;
    private boolean tieneLaptop;

    public Estudiante(String nombre, String apellido, int edad, String direccion, String tipoId, int Id, String tipoPersona, boolean reporte, boolean tieneLibro, boolean tieneComputador, boolean tieneLaptop) {
        super(nombre, apellido, edad, direccion, tipoId, Id, tipoPersona);
        this.reporte = reporte;
        this.tieneLibro = tieneLibro;
        this.tieneComputador = tieneComputador;
        this.tieneLaptop = tieneLaptop;
    }

    // Getters y Setters
    public boolean tieneReporte() {
        return reporte;
    }

    public void setReporte(boolean reporte) {
        this.reporte = reporte;
    }

    public boolean tieneLibro() {
        return tieneLibro;
    }

    public void setTieneLibro(boolean tieneLibro) {
        this.tieneLibro = tieneLibro;
    }

    public boolean tieneComputador() {
        return tieneComputador;
    }

    public void setTieneComputador(boolean tieneComputador) {
        this.tieneComputador = tieneComputador;
    }

    public boolean tieneLaptop() {
        return tieneLaptop;
    }

    public void setTieneLaptop(boolean tieneLaptop) {
        this.tieneLaptop = tieneLaptop;
    }
}
