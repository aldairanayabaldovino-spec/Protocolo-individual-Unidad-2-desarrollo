/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author USER
 */
public class Nomina {

    private String id;
    private Empleado empleado;
    private LocalDate fecha;
    private double salarioBase;
    private List<Deduccion> deducciones;
    private boolean aprobada;

    public Nomina(String id, Empleado empleado,
            LocalDate fecha, double salarioBase) {

        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("El id es obligatorio");
        }

        if (empleado == null) {
            throw new IllegalArgumentException("El empleado es obligatorio");
        }

        if (fecha == null) {
            throw new IllegalArgumentException("La fecha es obligatoria");
        }

        if (salarioBase < 0 || Double.isNaN(salarioBase)
        || Double.isInfinite(salarioBase)) {
    throw new IllegalArgumentException("El salario debe ser válido y no negativo");
         }

        this.id = id;
        this.empleado = empleado;
        this.fecha = fecha;
        this.salarioBase = salarioBase;
        this.deducciones = new ArrayList<>();
        this.aprobada = false;
    }

    public void agregarDeduccion(Deduccion deduccion) {

        if (aprobada) {
            throw new IllegalStateException(
                    "No se pueden agregar deducciones a una nómina aprobada");
        }

        if (deduccion == null) {
            throw new IllegalArgumentException(
                    "La deducción es obligatoria");
        }

        deducciones.add(deduccion);
    }

    public double calcularTotalDeducciones() {

        double total = 0;

        for (Deduccion deduccion : deducciones) {
            total += deduccion.getValor();
        }

        return total;
    }

    public double calcularSalarioNeto() {
        return salarioBase - calcularTotalDeducciones();
    }

    public NominaAprobada aprobar() {

    if (aprobada) {
        throw new IllegalStateException(
                "La nómina ya está aprobada");
    }

   if (calcularSalarioNeto() < 0) {
    throw new NominaInvalidaException(
            "El salario neto no puede ser negativo");
    }

    aprobada = true;

    return new NominaAprobada(id, LocalDate.now());
    }

    public String getId() {
        return id;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public boolean isAprobada() {
        return aprobada;
    }
}
