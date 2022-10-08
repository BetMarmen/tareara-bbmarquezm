/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import dal.Archivo;
import dol.Asignatura;
import java.util.Scanner;

/**
 *
 * @author Larry Mendez
 */
public class AgregarAsignatura {
 public void add(){
     Scanner scan=new Scanner(System.in);
     Asignatura a=new Asignatura();
     System.out.println("Ingrese el nombre");
     a.setNombre(scan.next());
     a.setId();
     Archivo.Archivo("Asignaturas", a.getId(), a.toString());
 }   
}
