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
public class Contrato {

    private final String id;
    private final Empleado empleado;
    private final LocalDate fechaInicio;
    private LocalDate fechaFin;
    private final String categoria;
    private final String puesto;
    private final double salarioBase;

    public Contrato(String id, Empleado empleado,
            LocalDate fechaInicio, String categoria,
            String puesto, double salarioBase) {

        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("El id es obligatorio");
        }

        if (empleado == null) {
            throw new IllegalArgumentException("El empleado es obligatorio");
        }

        if (fechaInicio == null) {
            throw new IllegalArgumentException("La fecha de inicio es obligatoria");
        }

        if (categoria == null || categoria.trim().isEmpty()) {
            throw new IllegalArgumentException("La categoría es obligatoria");
        }

        if (puesto == null || puesto.trim().isEmpty()) {
            throw new IllegalArgumentException("El puesto es obligatorio");
        }

        if (salarioBase <= 0 || Double.isNaN(salarioBase)
                || Double.isInfinite(salarioBase)) {
            throw new IllegalArgumentException("El salario debe ser válido y mayor que cero");
        }

        this.id = id;
        this.empleado = empleado;
        this.fechaInicio = fechaInicio;
        this.categoria = categoria;
        this.puesto = puesto;
        this.salarioBase = salarioBase;
        this.fechaFin = null;
    }

    public String getId() {
        return id;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public boolean estaVigente() {
        return fechaFin == null;
    }

    public boolean estaVigenteEn(LocalDate fecha) {
    if (fecha == null || fecha.isBefore(fechaInicio)) {
        return false;
    }

    return fechaFin == null || !fecha.isAfter(fechaFin);
    }
    
    public void finalizarContrato(LocalDate fechaFin) {
        if (fechaFin == null || fechaFin.isBefore(fechaInicio)) {
            throw new IllegalArgumentException("La fecha final no es válida");
        }

        if (this.fechaFin != null) {
            throw new IllegalStateException("El contrato ya fue finalizado");
        }

        this.fechaFin = fechaFin;
    }
}
