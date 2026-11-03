/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;
import java.time.LocalDate;
/**
 *
 * @author USER
 */
public class NominaAprobada {

    private final String idNomina;
    private final LocalDate fechaAprobacion;

    public NominaAprobada(String idNomina, LocalDate fechaAprobacion) {
        if (idNomina == null || idNomina.trim().isEmpty()) {
            throw new IllegalArgumentException("El id de la nómina es obligatorio");
        }

        if (fechaAprobacion == null) {
            throw new IllegalArgumentException("La fecha de aprobación es obligatoria");
        }

        this.idNomina = idNomina;
        this.fechaAprobacion = fechaAprobacion;
    }

    public String getIdNomina() {
        return idNomina;
    }

    public LocalDate getFechaAprobacion() {
        return fechaAprobacion;
    }
}
