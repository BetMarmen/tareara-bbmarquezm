/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.util.Scanner;
import misc.conditional;

/**
 *
 * @author Larry Mendez
 */
public class MenuProfesor implements Menu {

    @Override
    public void opciones() {
        System.out.println("1.Abrir");
        System.out.println("2.Agregar");
        System.out.println("3.Asignar Grupo");
        System.out.println("4.Asignar asignatura");
        System.out.println("5.Volver al menú Principal");
    }

    @Override
    public void seleccion() {
        int opc=0;
        Scanner scan=new Scanner(System.in);
        while(opc!=5){
            opciones();
            opc=scan.nextInt();
        switch (opc){
            case 1:
                conditional.Ver("Profesor");
                break;
            case 2:  
                AgregarProfesor a = new AgregarProfesor();
                a.add();
                break;
            case 3 :
                AsignarGrupo b=new AsignarGrupo();
                b.add();
                break;
            case 4:
                AsignarAsignatura c= new AsignarAsignatura();
                c.add();
                break;
            case 5:
                break;
            default:System.out.println("Opción invalida");
                break;
        }
        }
       
    }
    
}
