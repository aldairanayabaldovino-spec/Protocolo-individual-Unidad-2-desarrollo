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
public class NominaAprobadaTest {

    @Test
    public void debeCrearEventoDeNominaAprobada() {
        LocalDate fecha = LocalDate.of(2026, 10, 26);

        NominaAprobada evento =
                new NominaAprobada("N001", fecha);

        assertEquals("N001", evento.getIdNomina());
        assertEquals(fecha, evento.getFechaAprobacion());
    }

    @Test(expected = IllegalArgumentException.class)
    public void noDebeAceptarIdVacio() {
        new NominaAprobada(
                " ",
                LocalDate.of(2026, 10, 26)
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void noDebeAceptarFechaNula() {
        new NominaAprobada("N001", null);
    }
}
