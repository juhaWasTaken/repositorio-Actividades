import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada1 = new Scanner(System.in);
        Random random = new Random();

        int pagoHora = random.nextInt(400 - 100) + 100;
        System.out.print("Cuantos empleado trabajaron hoy? ");
        int numEmpleados = entrada1.nextInt();

        for (int i = 1; i <=numEmpleados; i++) {
            System.out.print("Cuantas horas trabajo el empleado " + i + "? ");
            int hTrabajadas = entrada1.nextInt();
            int hExtras, totalExtras = 0;
            if (hTrabajadas > 12) {
                if (hTrabajadas >= 18) {
                    hExtras = hTrabajadas - 12;  // Aquí corregimos el cálculo de horas extras.
                    totalExtras = hExtras * (pagoHora * 3);
                    hTrabajadas = 12;  // Esto asegura que solo se cuenten hasta 18 horas trabajadas.
                } else {
                    hExtras = hTrabajadas - 12;
                    totalExtras = hExtras * (pagoHora * 2);
                    hTrabajadas = 12;
                }
            } else {
                hExtras = 0;
            }
            int totalNomina = hTrabajadas * pagoHora;
            System.out.println("Empleado " +i + ": ");
            System.out.println("El pago por hora es de: "+pagoHora);
            System.out.println("Horas trabajadas: "+hTrabajadas);
            System.out.println("Horas extras trabajadas: "+hExtras);
            System.out.println("El tota de la nomina es: "+totalNomina);
            System.out.println("El tota de las horas extras es: "+totalExtras);
        }
    }
}