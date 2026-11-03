/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;
import java.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author USER
 */
public class ContratoActivoSpecificationTest {

    @Test
    public void debeCumplirCuandoContratoEstaVigente() {
        Empleado empleado = new Empleado(
                "1", "Aldair", "123456789"
        );

        Contrato contrato = new Contrato(
                "CON-001",
                empleado,
                LocalDate.of(2026, 1, 1),
                "Administrativo",
                "Auxiliar",
                1500000
        );

        ContratoActivoSpecification especificacion =
                new ContratoActivoSpecification();

        assertTrue(especificacion.cumple(
                contrato, LocalDate.of(2026, 10, 1)
        ));
    }

    @Test
    public void noDebeCumplirSiContratoYaFinalizo() {
        Empleado empleado = new Empleado(
                "1", "Aldair", "123456789"
        );

        Contrato contrato = new Contrato(
                "CON-002",
                empleado,
                LocalDate.of(2026, 1, 1),
                "Administrativo",
                "Auxiliar",
                1500000
        );

        contrato.finalizarContrato(LocalDate.of(2026, 6, 1));

        ContratoActivoSpecification especificacion =
                new ContratoActivoSpecification();

        assertFalse(especificacion.cumple(
                contrato, LocalDate.of(2026, 10, 1)
        ));
    }

    @Test
    public void noDebeCumplirConContratoNulo() {
        ContratoActivoSpecification especificacion =
                new ContratoActivoSpecification();

        assertFalse(especificacion.cumple(
                null, LocalDate.of(2026, 10, 1)
        ));
    }
}
