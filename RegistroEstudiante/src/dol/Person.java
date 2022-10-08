
package dol;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;
import misc.DateOperator;

public class Person {
    private String p_nombre, s_nombre, p_apellido, s_apellido,gender, Id,f_nacimiento; 

    public Person() {
    }
    

    public String getP_nombre() {
        return p_nombre;
    }

    public void setP_nombre(String p_nombre) {
        this.p_nombre = p_nombre;
    }

    public String getS_nombre() {
        return s_nombre;
    }

    public void setS_nombre(String s_nombre) {
        this.s_nombre = s_nombre;
    }

    public String getP_apellido() {
        return p_apellido;
    }

    public void setP_apellido(String p_apellido) {
        this.p_apellido = p_apellido;
    }

    public String getS_apellido() {
        return s_apellido;
    }

    public void setS_apellido(String s_apellido) {
        this.s_apellido = s_apellido;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return Id;
    }

    public void setId() {
        this.Id = UUID.randomUUID().toString();
    }

    public String getF_nacimiento() {
        return f_nacimiento;
    }

    public void setF_nacimiento(String f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }
    public String Edad(){
     return DateOperator.getEdad(f_nacimiento);
    }
    @Override
    public String toString() {
        return "Nombre=" + p_nombre + " " + s_nombre + " " + p_apellido + " " + s_apellido + "\nGenero=" + gender + "\nId=" + Id + "\n Fecha de nacimiento=" + f_nacimiento + "\n Edad="+Edad();
    }
}
