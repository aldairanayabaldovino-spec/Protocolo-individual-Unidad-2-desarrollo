/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author USER
 */
public class ServicioNomina {

    public double calcularSalarioNeto(Nomina nomina) {

        if (nomina == null) {
            throw new IllegalArgumentException(
                    "La nómina es obligatoria");
        }

        return nomina.calcularSalarioNeto();
    }

    public void aprobarNomina(Nomina nomina) {

        if (nomina == null) {
            throw new IllegalArgumentException(
                    "La nómina es obligatoria");
        }

        nomina.aprobar();
    }
}
