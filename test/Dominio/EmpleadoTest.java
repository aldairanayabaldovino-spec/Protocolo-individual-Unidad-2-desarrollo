/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author USER
 */
public class EmpleadoTest {

    @Test
    public void crearEmpleadoCorrectamente() {

        Empleado empleado = new Empleado(
                "1",
                "Aldair",
                "123456789"
        );

        assertEquals("1", empleado.getId());
        assertEquals("Aldair", empleado.getNombre());
        assertEquals("123456789", empleado.getDocumento());
    }
}
