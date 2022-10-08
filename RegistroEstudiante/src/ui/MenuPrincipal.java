
package ui;

import java.util.Scanner;

public class MenuPrincipal implements Menu{
    @Override
    public void opciones(){
        System.out.println("1.Asignaturas");
        System.out.println("2.Grupos");
        System.out.println("3.Profesores");
        System.out.println("4.Estudiantes");
        System.out.println("5.Salir");
    }
    @Override
    public void seleccion(){
    int opc=0;
    Scanner scan= new Scanner(System.in);
    while (opc!=5){
        opciones();
        opc= scan.nextInt();
        switch (opc){
            case 1:
                MenuAsignatura d= new MenuAsignatura();
                d.seleccion();
                break;
            case 2:
                MenuGrupo c= new MenuGrupo();
                c.seleccion();
                break;
            case 3:
                MenuProfesor b=new MenuProfesor();
                b.seleccion();
                break;
            case 4:
                MenuEstudiante a=new MenuEstudiante();
                a.seleccion();
                break;
            case 5:
                break;
                default: System.out.println("Ingrese una opción valida");
                    break;
        }
        
    
    }
    }
    
}
