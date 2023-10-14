import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);
        BufferedReader entrada2 = new BufferedReader(new InputStreamReader(System.in));
        char masVenta;
        double totalVenta = 0;

        do {
            System.out.print("Cantidad de la venta: ");
            double venta = entrada.nextDouble();
            double iva = venta * 0.16;
            double ventaIva = venta + iva;
            totalVenta = totalVenta + ventaIva;
            System.out.println("Venta: "+venta);
            System.out.println("IVA: "+iva);
            System.out.println("Venta con IVA: "+ventaIva);
            System.out.print("Otra venta (s/n)? ");
            masVenta = entrada2.readLine().charAt(0);
        } while (masVenta == 's' || masVenta == 'S');

        if (masVenta == 'n' || masVenta == 'N') {
            double reporteVenta = totalVenta / 24;
            System.out.println();
            System.out.println("El promedio de venta de hoy es de: "+reporteVenta);
        } else {
            System.out.println("Opcion no valida");
            System.out.println("Fin del programa");
        }

    }
}