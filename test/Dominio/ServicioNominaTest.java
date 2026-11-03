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
public class ServicioNominaTest {

    @Test
    public void calcularSalarioNetoCorrectamente() {

        Empleado empleado = new Empleado(
                "1", "Aldair", "123456789");

        Nomina nomina = new Nomina(
                "NOM-003", empleado,
                LocalDate.now(), 1500000);

        nomina.agregarDeduccion(
                new Deduccion("Salud", 60000));

        ServicioNomina servicio = new ServicioNomina();

        double resultado = servicio.calcularSalarioNeto(nomina);

        assertEquals(1440000, resultado, 0.001);
    }

    @Test
    public void aprobarNominaCorrectamente() {

        Empleado empleado = new Empleado(
                "1", "Aldair", "123456789");

        Nomina nomina = new Nomina(
                "NOM-004", empleado,
                LocalDate.now(), 1500000);

        ServicioNomina servicio = new ServicioNomina();

        servicio.aprobarNomina(nomina);

        assertTrue(nomina.isAprobada());
    }

    @Test(expected = IllegalArgumentException.class)
    public void noPermitirCalcularNominaNula() {

        ServicioNomina servicio = new ServicioNomina();

        servicio.calcularSalarioNeto(null);
    }
}
