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
public class MenuGrupo implements Menu{

    @Override
    public void opciones() {
        System.out.println("1.Abrir");
        System.out.println("2.Agregar");
        System.out.println("3.Asignar asignaturas");
        System.out.println("4.Volver al menú principal");
       
        
    }

    @Override
    public void seleccion() {
        int opc = 1;
        Scanner scan=new Scanner(System.in);
        while(opc!=3){
            opciones();
            opc=scan.nextInt();
        switch(opc){
            case 1:
                conditional.Ver("Grupos");
                break;
            case 2:
                AgregarGrupo  a = new AgregarGrupo ();
                a.add();
                break;
            case 3:    
                AsignarAs b=new AsignarAs();
                b.add();
                break;
            case 4:System.out.println("Ha abandonado");
                break;
            default:
                break;
        }
        }
        
    }
    
}
