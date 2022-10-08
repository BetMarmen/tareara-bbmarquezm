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
public class MenuAsignatura implements Menu {

    @Override
    public void opciones() {
        System.out.println("1.Abrir");
        System.out.println("2.Agregar");
        System.out.println("3.Volver al menú principal");
        
    }

    @Override
    public void seleccion() {
        int opc=0;
        Scanner scan=new Scanner(System.in);
        while(opc!=3){
            opciones();
            opc=scan.nextInt();
        switch(opc){
            case 1:
                conditional.Ver("Asignaturas");
                break;
            case 2:
                AgregarAsignatura a = new AgregarAsignatura();
                a.add();
                break;
            case 3:
                break;
            default:System.out.println("Opcion invalida");
                break;
        }
        }
        
    }
    
}
