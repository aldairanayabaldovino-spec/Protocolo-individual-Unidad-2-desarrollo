/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author USER
 */
public class NominaFactory {

    public Nomina crear(String id, Empleado empleado,
            java.time.LocalDate fecha, double salarioBase) {

        return new Nomina(id, empleado, fecha, salarioBase);
    }
}
