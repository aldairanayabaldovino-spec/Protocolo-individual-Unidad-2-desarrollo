/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;
import java.time.LocalDate;
/**
 *
 * @author USER
 */
public class ContratoActivoSpecification {

    public boolean cumple(Contrato contrato, LocalDate fecha) {
        if (contrato == null || fecha == null) {
            return false;
        }

        return contrato.estaVigenteEn(fecha);
    }
}
