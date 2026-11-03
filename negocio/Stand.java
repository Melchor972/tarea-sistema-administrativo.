package negocio;

import java.time.LocalDate;

public class Stand {
    private String id;
    private String dimensiones;
    private double metrosCuadrados;
    private double precio;
    private EstadoStand estado;
    private LocalDate vigenciaReserva;

    // Constructor
    public Stand(String id, String dimensiones, double metrosCuadrados) {
        this.id = id;
        this.dimensiones = dimensiones;
        this.metrosCuadrados = metrosCuadrados;
        this.estado = EstadoStand.DISPONIBLE; // Por defecto inicia disponible
    }

    // Método para calcular el precio basado en los metros cuadrados y la configuración
    public void calcularPrecio(Configuracion config) {
        this.precio = this.metrosCuadrados * config.getCostoPorMetroCuadrado();
    }

    // Método para cambiar el estado del stand (ej. de BLOQUEADO a DISPONIBLE)
    public void cambiarEstado(EstadoStand nuevoEstado) {
        this.estado = nuevoEstado;
    }

    // Getters y Setters (Encapsulamiento)
    public String getId() { return id; }
    public double getPrecio() { return precio; }
    public EstadoStand getEstado() { return estado; }
    public LocalDate getVigenciaReserva() { return vigenciaReserva; }
    public void setVigenciaReserva(LocalDate vigenciaReserva) { this.vigenciaReserva = vigenciaReserva; }
}