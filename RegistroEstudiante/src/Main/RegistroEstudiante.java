
package Main;

import dal.Archivo;
import misc.conditional;

import ui.MenuPrincipal;

public class RegistroEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Archivo.Almacen();
       MenuPrincipal a= new MenuPrincipal();
       a.seleccion();
    }
    
}
