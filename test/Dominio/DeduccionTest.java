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
public class DeduccionTest {

    @Test
    public void crearDeduccionCorrectamente() {

        Deduccion deduccion = new Deduccion(
                "Seguridad Social",
                50000
        );

        assertEquals("Seguridad Social", deduccion.getConcepto());
        assertEquals(50000, deduccion.getValor(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void noPermitirValorNegativo() {

        new Deduccion("IRPF", -100);
    }
}
