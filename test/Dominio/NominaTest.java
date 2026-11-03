/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;
import org.junit.Test;
import static org.junit.Assert.*;

import java.time.LocalDate;
/**
 *
 * @author USER
 */
public class NominaTest {

    @Test
    public void calcularSalarioNetoCorrectamente() {

        Empleado empleado = new Empleado(
                "1",
                "Aldair",
                "123456789"
        );

        Nomina nomina = new Nomina(
                "NOM-001",
                empleado,
                LocalDate.now(),
                1500000
        );

        nomina.agregarDeduccion(
                new Deduccion("Salud", 60000)
        );

        nomina.agregarDeduccion(
                new Deduccion("Pension", 60000)
        );

        assertEquals(120000, nomina.calcularTotalDeducciones(), 0.001);
        assertEquals(1380000, nomina.calcularSalarioNeto(), 0.001);
    }
 @Test(expected = IllegalStateException.class)
    public void noPermitirDeduccionesDespuesDeAprobar() {

        Empleado empleado = new Empleado(
                "1",
                "Aldair",
                "123456789"
        );

        Nomina nomina = new Nomina(
                "NOM-002",
                empleado,
                LocalDate.now(),
                1500000
        );

        nomina.aprobar();

        nomina.agregarDeduccion(
                new Deduccion("Salud", 50000)
        );
    }
}
