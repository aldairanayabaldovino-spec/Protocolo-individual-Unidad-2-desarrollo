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
public class ContratoTest {

    @Test
    public void crearContratoCorrectamente() {

        Empleado empleado = new Empleado(
                "1",
                "Aldair",
                "123456789"
        );

        Contrato contrato = new Contrato(
                "CON-001",
                empleado,
                LocalDate.of(2026, 1, 1),
                "Administrativo",
                "Auxiliar",
                1500000
        );

        assertEquals("CON-001", contrato.getId());
        assertEquals(empleado, contrato.getEmpleado());
        assertEquals("Administrativo", contrato.getCategoria());
        assertEquals("Auxiliar", contrato.getPuesto());
        assertEquals(1500000, contrato.getSalarioBase(), 0.001);
    }

    @Test
    public void contratoDebeEstarVigenteAlCrearse() {

        Empleado empleado = new Empleado(
                "1",
                "Aldair",
                "123456789"
        );

        Contrato contrato = new Contrato(
                "CON-002",
                empleado,
                LocalDate.of(2026, 1, 1),
                "Administrativo",
                "Auxiliar",
                1500000
        );

        assertTrue(contrato.estaVigente());
    }

    @Test
    public void finalizarContratoDebeDejarloNoVigente() {

        Empleado empleado = new Empleado(
                "1",
                "Aldair",
                "123456789"
        );

        Contrato contrato = new Contrato(
                "CON-003",
                empleado,
                LocalDate.of(2026, 1, 1),
                "Administrativo",
                "Auxiliar",
                1500000
        );

        contrato.finalizarContrato(LocalDate.of(2026, 10, 1));

        assertFalse(contrato.estaVigente());
    }
}
