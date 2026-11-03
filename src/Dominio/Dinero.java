/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author USER
 */
public class Dinero {

    private final double cantidad;
    private final String moneda;

    public Dinero(double cantidad, String moneda) {

        if (cantidad < 0 || Double.isNaN(cantidad)
        || Double.isInfinite(cantidad)) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa");
        }

        if (moneda == null || moneda.trim().isEmpty()) {
            throw new IllegalArgumentException("La moneda es obligatoria");
        }

        this.cantidad = cantidad;
        this.moneda = moneda;
    }

    public double getCantidad() {
        return cantidad;
    }

    public String getMoneda() {
        return moneda;
    }

    public Dinero sumar(Dinero otro) {

        if (otro == null) {
            throw new IllegalArgumentException("El dinero a sumar es obligatorio");
        }

        if (!this.moneda.equals(otro.moneda)) {
            throw new IllegalArgumentException("Las monedas deben ser iguales");
        }

        return new Dinero(this.cantidad + otro.cantidad, this.moneda);
    }
}
