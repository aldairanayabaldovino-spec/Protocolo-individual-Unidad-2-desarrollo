/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author USER
 */
public class DeduccionPorcentajeFijo implements EstrategiaDeduccion {

    private final double porcentaje;

    public DeduccionPorcentajeFijo(double porcentaje) {

        if (porcentaje < 0 || porcentaje > 100
                || Double.isNaN(porcentaje)
                || Double.isInfinite(porcentaje)) {
            throw new IllegalArgumentException(
                    "El porcentaje debe estar entre 0 y 100");
        }

        this.porcentaje = porcentaje;
    }

    @Override
    public double calcular(double salarioBase) {

        if (salarioBase < 0 || Double.isNaN(salarioBase)
                || Double.isInfinite(salarioBase)) {
            throw new IllegalArgumentException(
                    "El salario debe ser válido y no negativo");
        }

        return salarioBase * porcentaje / 100;
    }
}