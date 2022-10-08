/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import dal.Archivo;
import java.util.ArrayList;
import java.util.Scanner;
import misc.conditional;

/**
 *
 * @author Larry Mendez
 */
class AsignarGrupo {
    public void add(){
        Scanner scan = new Scanner(System.in);
        ArrayList<String>a=new ArrayList<String>();
        int opc=0;
        System.out.println("Ingrese el id del profesor");
        String id=scan.next();
        while(opc!=2){
            System.out.println("1.Agregar grupo\n2.Salir");
            opc=scan.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Ingrese el Id");
                    a.add("Grupo:"+scan.next());
                    break;
                case 2:
                    System.out.println("Usted ha regresado al menú principal");
                    break;
                default:System.out.println("Opción invalida");
                    break;
            }
            
        }
        String aa=conditional.Abrir("Profesor", id+".txt");
        Archivo.agregar("Profesor", id, aa+"\n"+conditional.Imprimir(a));
    }
}
