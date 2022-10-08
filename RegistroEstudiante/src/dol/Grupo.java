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
public class Grupo {
    private String dni;
    private String nombre_grupo;

    public String getDni() {
        return dni;
    }

    public void setDni() {
        this.dni = UUID.randomUUID().toString();
    }

    public String getNombre_grupo() {
        return nombre_grupo;
    }

    public void setNombre_grupo(String nombre_grupo) {
        this.nombre_grupo = nombre_grupo;
    }

    @Override
    public String toString() {
        return "Grupo{" + "dni=" + dni + ", nombre_grupo=" + nombre_grupo + '}';
    }
    
}
