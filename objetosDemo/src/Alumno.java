public class Alumno {

    private String nombre, matricula;

    private double calif1, calif2, calif3;

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getMatricula(){
        return matricula;
    }

    public double getCalif1(double calif1) {
        return calif1;
    }
    public double getCalif2(double calif2) {
        return calif2;
    }

    public double getCalif3(double calif3) {
        return calif3;
    }
    public double calculaPromedio() {
        return ((calif1+calif2+calif3)/3);
    }



}
