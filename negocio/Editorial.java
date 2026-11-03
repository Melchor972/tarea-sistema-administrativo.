package negocio;

public class Editorial {
    private String idEditorial;
    private String nombre;
    private String correoContacto;
    private Stand standAsignado;

    public Editorial(String idEditorial, String nombre, String correoContacto, Stand standAsignado) {
        this.idEditorial = idEditorial;
        this.nombre = nombre;
        this.correoContacto = correoContacto;
        this.standAsignado = standAsignado;
    }

    public String getNombre() { return nombre; }
    public String getCorreoContacto() { return correoContacto; }
    public Stand getStandAsignado() { return standAsignado; }
}