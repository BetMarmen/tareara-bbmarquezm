/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import dal.Archivo;
import dol.Profesor;
import java.util.Scanner;
import misc.conditional;

/**
 *
 * @author Larry Mendez
 */
public class AgregarProfesor {
    public void add(){ 
        Profesor a= new Profesor();
    Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese su primer nombre");
        a.setP_nombre(scan.next());
        System.out.println("Ingrese su segundo nombre");
        a.setS_nombre(scan.next());
        System.out.println("Ingrese su primer apellido");
        a.setP_apellido(scan.next());
        System.out.println("Ingrese su segundo apellido");
        a.setS_apellido(scan.next());
        System.out.println("Ingrese su género");
        a.setGender(scan.next());
        while(9!=1){
        System.out.println("Ingrese su fecha de nacimiento (yyyy-mm-dd)");
        a.setF_nacimiento(scan.next());
        if(!"La fecha que ingreso es invalida".equals(a.Edad()))break;
        }
        System.out.println("Ingrese años de experiencia");
        a.setAño_experiencia(scan.next());   
        System.out.println("Ingrese Profesión");
        a.setProfesion(scan.next());
        a.setId();
        Archivo.Archivo(a.getId(), "Profesor", a.Mostrar());
}
}