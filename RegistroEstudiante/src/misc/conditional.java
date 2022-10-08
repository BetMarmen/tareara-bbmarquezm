/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Larry Mendez
 */
public class conditional {
    public static String direccion(String direccion){
        File a=new File(direccion);
        return a.getAbsolutePath();
    }
    public static void Ver(String ireccion){
        int i=0;
        File a=new File(direccion(ireccion));
        String[] b=a.list();
        for(String s:b){
            System.out.println("#"+(i+1));
            System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
            System.out.println(Abrir(ireccion,b[i]));
            i++;
            System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
        }
    }
    public static String Abrir(String ireccion,String string){
        String cont;
        String almacen="";
        try{
         File archivo=new File(direccion(ireccion),string);
         BufferedReader bw = new BufferedReader(new FileReader(archivo));
         while((cont=bw.readLine())!=null){
             almacen=almacen+cont+"\n";
         }
            return almacen;
        }catch(Exception e){
            return e.getMessage();
        }
    }
    public static String Imprimir(ArrayList <String> a){
        int i= 0;
        String b="";
        for (String j: a){
            b=a.get(i)+"\n";
            i++;
        }
    return b;
    }
}
