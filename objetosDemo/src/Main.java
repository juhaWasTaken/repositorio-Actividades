import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Alumno a; //objeto de la clase Alumno
        a = new Alumno(); //INSTANCIAR línea de Dios

        //a.nombre = "Ramses Sr.";
        a.setNombre("Ramses Gonzalez");
        a.getCalif1(100);
        a.getCalif2(100);
        a.getCalif3(100);
        a.calculaPromedio();

        System.out.println(a.calculaPromedio());


    }
}