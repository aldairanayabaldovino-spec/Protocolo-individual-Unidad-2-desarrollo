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
public class DeduccionPorcentajeFijoTest {

    @Test
    public void calcularDeduccionCorrectamente() {
        DeduccionPorcentajeFijo estrategia =
                new DeduccionPorcentajeFijo(4);

        double resultado = estrategia.calcular(1500000);

        assertEquals(60000, resultado, 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void rechazarPorcentajeInvalido() {
        new DeduccionPorcentajeFijo(120);
    }

    @Test(expected = IllegalArgumentException.class)
    public void rechazarSalarioNegativo() {
        DeduccionPorcentajeFijo estrategia =
                new DeduccionPorcentajeFijo(4);

        estrategia.calcular(-1000);
    }
}
