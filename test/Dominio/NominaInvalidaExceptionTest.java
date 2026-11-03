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
public class NominaInvalidaExceptionTest {

    @Test
    public void crearExcepcionConMensaje() {
        NominaInvalidaException excepcion =
                new NominaInvalidaException("La nómina no es válida");

        assertEquals(
                "La nómina no es válida",
                excepcion.getMessage()
        );
    }
}
