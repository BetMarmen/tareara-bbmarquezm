
package dol;

public class Profesor extends Person{
    private String Profesion, año_experiencia;

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }

    public String getAño_experiencia() {
        return año_experiencia;
    }

    public void setAño_experiencia(String año_experiencia) {
        try{
        int a=(int)Integer.parseInt(año_experiencia);
        }catch(Exception e){
            this.año_experiencia="Error";
        }
        this.año_experiencia = año_experiencia;
    }
    public String Mostrar(){
        return toString()+"Años de experiencia"+ año_experiencia + "Profesion" + Profesion;
    }
}
