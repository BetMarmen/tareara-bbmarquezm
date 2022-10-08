/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import dal.Archivo;
import dol.Estudiante;
import java.util.Scanner;

/**
 *
 * @author Larry Mendez
 */
public class AgregarEstudiante {
    public void add(){
        Estudiante a=new Estudiante();
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese su primer nombre");
        a.setP_nombre(scan.next());
        System.out.println("Ingrese sus egundo nombre");
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
        while(9!=1){
        System.out.println("Ingrese su fecha de ingreso");
        a.setFecha_ingreso(scan.next());
        if(!"Error".equals(a.getFecha_ingreso()))break;
        }
        a.setId();
        Archivo.Archivo(a.getId(), "Estudiante", a.Mostrar());
    }
    
}
