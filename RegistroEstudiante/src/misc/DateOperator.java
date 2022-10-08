
package misc;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

public class DateOperator {
    public static LocalDate FechaActual(){
        Calendar calendar = Calendar.getInstance();
        String dia,mes,año;
        dia=Integer.toString(calendar.get(Calendar.DATE));
        if(dia.length()<2)dia="0"+dia;
        mes = Integer.toString(calendar.get(Calendar.MONTH));
        if(mes.length()<2)mes="0"+mes;
        año = Integer.toString(calendar.get(Calendar.YEAR));
        return LocalDate.parse(año+"-"+mes+"-"+dia);
    }
    public static LocalDate Fecha(String a){
        return LocalDate.parse(a);
    }
    public static int Edad(String a){
        try{
            Period Edad = Period.between(Fecha(a),FechaActual());
            return Edad.getYears();
        }
        catch(Exception e){
            return -1;
        }
    }
    public static String getEdad(String a){
        if(Edad(a)<=0)return "La fecha que ingreso es invalida";
        else return "Edad= "+Edad(a);
    }
}
