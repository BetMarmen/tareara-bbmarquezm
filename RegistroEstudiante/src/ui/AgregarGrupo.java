/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import dal.Archivo;
import dol.Grupo;
import java.util.Scanner;

/**
 *
 * @author Larry Mendez
 */
class AgregarGrupo {
    public void add(){
        Grupo a=new Grupo();
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese el nombre del grupo");
        a.setNombre_grupo(scan.next());
        a.setDni();
        Archivo.Archivo("Grupos", a.getDni(), a.toString());
    }
}
