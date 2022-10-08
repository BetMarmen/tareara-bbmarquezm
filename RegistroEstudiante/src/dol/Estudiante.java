
package dol;

import misc.DateOperator;

public class Estudiante extends Person {
    private String Fecha_ingreso;

    public String getFecha_ingreso() {
        return Fecha_ingreso;
    }

    public void setFecha_ingreso(String Fecha_ingreso) {
        if(DateOperator.Edad(Fecha_ingreso)==-1)this.Fecha_ingreso="Error";
        else this.Fecha_ingreso=Fecha_ingreso;
    }
    public String Mostrar(){
        return toString()+", Fecha de ingreso=" + Fecha_ingreso;
    }
}
