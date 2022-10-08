package ui;

import dal.Archivo;
import java.util.Scanner;

public class Matricula {
    public void matricular(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingrese el dni del estudiante");
        String string=scan.next();
        System.out.println("Ingrese el id de la asignatura");
        String as="asignatura\n"+scan.next();
        System.out.println("Ingrese id del grupo");
        String grupo= "grupo\n"+scan.next();
        String combinar=as+"\n"+grupo;
        Archivo.agregar("Estudiante", string,combinar);
    }
}
