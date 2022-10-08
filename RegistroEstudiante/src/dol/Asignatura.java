/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dol;

import java.util.UUID;

/**
 *
 * @author Larry Mendez
 */
public class Asignatura {
    private String nombre;
    private String id;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId() {
        this.id = UUID.randomUUID().toString();
    }

    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", id=" + id + '}';
    }
    
}
