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
public class NominaFactoryTest {

    @Test
    public void crearNominaCorrectamente() {
        Empleado empleado = new Empleado("1", "Aldair", "123456");
        NominaFactory factory = new NominaFactory();

        Nomina nomina = factory.crear(
                "N001", empleado, LocalDate.now(), 1500000
        );

        assertNotNull(nomina);
    }

    @Test(expected = IllegalArgumentException.class)
    public void noCrearNominaSinEmpleado() {
        NominaFactory factory = new NominaFactory();

        factory.crear("N001", null, LocalDate.now(), 1500000);
    }
}
