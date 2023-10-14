import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int calificacionFinal = sumaCalificaciones();
        System.out.println("La calificacion final es: " + calificacionFinal);
        if (aprobado(calificacionFinal)) {
            System.out.println("Feliciades aprobaste");
        } else {
            System.out.println("Mala suerte, no aprobaste!");
        }


    }

    public static int sumaCalificaciones() {
        int calificacionFinal = 0;
        for (int i = 1; i <= 20 ; i++) {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Cual es la calificación numero "+ i +": ");
            int calificacion = entrada.nextInt();
            calificacionFinal = calificacion + calificacionFinal;
        }
        return calificacionFinal / 20;
    }

    public static boolean aprobado(int calificacionFinal) {
        return calificacionFinal >= 80;
    }
}