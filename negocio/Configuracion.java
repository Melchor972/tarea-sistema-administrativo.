package negocio;

import java.time.LocalDate;

public class Configuracion {
    private double costoPorMetroCuadrado;
    private LocalDate fechaLimiteCosto;
    private double porcentajeMinimoOcupado;
    private LocalDate fechaProntoPago;
    private double descuentoProntoPago;

    public Configuracion(double costoPorMetroCuadrado, LocalDate fechaLimiteCosto, 
                         double porcentajeMinimoOcupado, LocalDate fechaProntoPago, double descuentoProntoPago) {
        this.costoPorMetroCuadrado = costoPorMetroCuadrado;
        this.fechaLimiteCosto = fechaLimiteCosto;
        this.porcentajeMinimoOcupado = porcentajeMinimoOcupado;
        this.fechaProntoPago = fechaProntoPago;
        this.descuentoProntoPago = descuentoProntoPago;
    }

    public double getCostoPorMetroCuadrado() { return costoPorMetroCuadrado; }
    public LocalDate getFechaLimiteCosto() { return fechaLimiteCosto; }
    public LocalDate getFechaProntoPago() { return fechaProntoPago; }
}