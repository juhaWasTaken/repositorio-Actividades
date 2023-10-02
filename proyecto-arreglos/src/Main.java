import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] numeros = new int [20];

        try {
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Ingresa un numero: ");
                numeros[i] = entrada.nextInt();
                int numCuadrado = numeros[i] * numeros[i];
                int numCubo = numCuadrado * numeros[i];

                System.out.println("Tu numero es: " + numeros[i]);
                System.out.println("El cuadrado es " + numCuadrado);
                System.out.println("El cubo es " + numCubo);
                System.out.println();
            }
        } catch (InputMismatchException e) {
            System.out.println("Valor no válido. Debes ingresar un número entero.");
        }
    }
}

