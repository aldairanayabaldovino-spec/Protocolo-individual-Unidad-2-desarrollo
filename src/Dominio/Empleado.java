/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author USER
 */
public class Empleado {

    private String id;
    private String nombre;
    private String documento;

    public Empleado(String id, String nombre, String documento) {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("El id es obligatorio");
        }

        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre es obligatorio");
        }

        if (documento == null || documento.isEmpty()) {
            throw new IllegalArgumentException("El documento es obligatorio");
        }

        this.id = id;
        this.nombre = nombre;
        this.documento = documento;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }
}
