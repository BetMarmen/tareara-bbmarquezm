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
public class MenuEstudiante implements Menu{
    @Override
    public void opciones() {
        System.out.println("1.Abrir");
        System.out.println("2.Agregar");
        System.out.println("3.Matricula");
        System.out.println("4.Volver al menú principal ");
    }

    @Override
    public void seleccion() {
        Scanner scan=new Scanner(System.in);
       int opc=0;
       while (opc!=4){
           opciones();
           opc=scan.nextInt();
       switch(opc){
           case 1:
               conditional.Ver("Estudiante");
               break;
           case 2:
               AgregarEstudiante a=new AgregarEstudiante();
               a.add();
               break;
           case 3:
               Matricula b=new Matricula();
               b.matricular();
               break;
           case 4:
               System.out.println("Ha regresado al menú principal");
               break;
           default: System.out.println("Opción invalida");
               break;
       }
       }
    }
    
    
}
