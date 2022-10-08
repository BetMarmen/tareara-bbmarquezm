
package dal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import misc.conditional;


public class Archivo {
    public static void Almacen(){
    File a=new File("Estudiante");
    a.mkdir();
            
    File b= new File ("Profesor");
    b.mkdir();
    
    File c= new File ("Grupos");
    c.mkdir();
    
    File d= new File ("Asignaturas");
    d.mkdir();
    }
    public static void Archivo(String nombre, String almacen, String texto){
    File a= new File (conditional.direccion(almacen),nombre+ ".txt");
    try{
     a.createNewFile();
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
    try{
    BufferedWriter p = new BufferedWriter(new FileWriter(a));
            p.write(texto);
            p.close();
    }
    catch(Exception e){
            System.out.println(e.getMessage());
}        
    }
    public static void agregar(String direccion,String string, String texto){
        File a=new File(direccion,string+".txt");
        
        try{
           BufferedWriter p = new BufferedWriter(new FileWriter(a));
            p.write(texto);
            p.close();
        }
            catch(Exception e){
            System.out.println(e.getMessage());
}   
    }
}
