/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author USER
 */
public class Deduccion {

    private String concepto;
    private double valor;

    public Deduccion(String concepto, double valor) {

        if (concepto == null || concepto.isEmpty()) {
            throw new IllegalArgumentException("El concepto es obligatorio");
        }

        if (valor < 0) {
            throw new IllegalArgumentException("El valor no puede ser negativo");
        }

        this.concepto = concepto;
        this.valor = valor;
    }

    public String getConcepto() {
        return concepto;
    }

    public double getValor() {
        return valor;
    }
}
