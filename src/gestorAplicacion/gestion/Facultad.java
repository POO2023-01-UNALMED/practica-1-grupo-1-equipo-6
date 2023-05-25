package gestorAplicacion.gestion;

public enum Facultad {
    CIENCIAS("Facultad de Ciencias"),
    CIENCIAS_HUMANAS_ECONOMIA("Facultad de Ciencias Humanas y Economia"),
    CIENCIAS_AGRARIAS("Facultad de Ciencias Agrarias"),
    MINAS("Facultad de Minas"),
    ARQUITECTURA("Facultad de Arquitectura"),
	UNIVERSIDAD("TODAS LAS FACULTADES");

    private final String nombre;

    Facultad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
