package notificaciones;

import negocio.Editorial;
import negocio.Configuracion;
import negocio.EstadoStand;

import java.time.LocalDate;
import java.util.List;

public class SistemaNotificaciones {

    // 1. Revisa si las reservas están a punto de vencer
    public void verificarVencimientoReservas(List<Editorial> editoriales) {
        LocalDate hoy = LocalDate.now();
        System.out.println("--- VERIFICANDO VENCIMIENTO DE RESERVAS ---");
        for (Editorial ed : editoriales) {
            if (ed.getStandAsignado().getEstado() == EstadoStand.RESERVADO) {
                LocalDate vigencia = ed.getStandAsignado().getVigenciaReserva();
                if (vigencia != null && vigencia.minusDays(2).isBefore(hoy)) {
                    System.out.println("[ALERTA] La editorial " + ed.getNombre() + 
                                       " (Correo: " + ed.getCorreoContacto() + 
                                       ") tiene su reserva a punto de vencer el: " + vigencia);
                }
            }
        }
    }

    // 2. Comprueba el pronto pago
    public void verificarProntoPago(List<Editorial> editoriales, Configuracion config) {
        LocalDate hoy = LocalDate.now();
        System.out.println("--- VERIFICANDO PLAZOS DE PRONTO PAGO ---");
        if (hoy.isBefore(config.getFechaProntoPago()) || hoy.isEqual(config.getFechaProntoPago())) {
            for (Editorial ed : editoriales) {
                System.out.println("[AVISO] Editorial " + ed.getNombre() + 
                                   ": Aún aplica descuento por pronto pago antes del " + config.getFechaProntoPago());
            }
        } else {
            System.out.println("[AVISO] El periodo de pronto pago ha finalizado.");
        }
    }

    // 3. Alerta si la fecha límite para cubrir el costo está por vencer
    public void verificarFechaLimiteCosto(List<Editorial> editoriales, Configuracion config) {
        LocalDate hoy = LocalDate.now();
        System.out.println("--- VERIFICANDO FECHA LÍMITE DE COSTO ---");
        if (config.getFechaLimiteCosto().minusDays(3).isBefore(hoy)) {
            for (Editorial ed : editoriales) {
                System.out.println("[URGENTE] Editorial " + ed.getNombre() + 
                                   ", la fecha límite para cubrir el costo total del stand es el: " + 
                                   config.getFechaLimiteCosto());
            }
        }
    }
}