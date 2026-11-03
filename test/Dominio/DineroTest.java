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
public class DineroTest {

    @Test
    public void crearDineroCorrectamente() {

        Dinero dinero = new Dinero(50000, "COP");

        assertEquals(50000, dinero.getCantidad(), 0.001);
        assertEquals("COP", dinero.getMoneda());
    }

    @Test
    public void sumarDineroDeLaMismaMoneda() {

        Dinero dinero1 = new Dinero(50000, "COP");
        Dinero dinero2 = new Dinero(30000, "COP");

        Dinero resultado = dinero1.sumar(dinero2);

        assertEquals(80000, resultado.getCantidad(), 0.001);
        assertEquals("COP", resultado.getMoneda());
    }

    @Test(expected = IllegalArgumentException.class)
    public void noPermitirSumarMonedasDiferentes() {

        Dinero dinero1 = new Dinero(50000, "COP");
        Dinero dinero2 = new Dinero(20, "USD");

        dinero1.sumar(dinero2);
    }
@Test(expected = IllegalArgumentException.class)
public void noPermitirSumarDineroNulo() {

    Dinero dinero = new Dinero(50000, "COP");

    dinero.sumar(null);
}
}

