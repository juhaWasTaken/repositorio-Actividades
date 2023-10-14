import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

public class imcPrograma {

    public static void main(String[] args)  {
        double imc =  calcularIMC();
        String diagnostico = imcDiagnostico(imc);
        System.out.printf("Tu IMC es de: " + "%.2f", imc);
        System.out.println("\nDiagnóstico: " + diagnostico);
    }

    public static double calcularIMC() {
        Scanner entrada = new Scanner(System.in);
        int peso = 0;
        try {
            System.out.print("Cual es tu peso? ");
            peso = entrada.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Peso no valido");
            System.exit(0);
        }
        System.out.print("Cuánto mides(En metros) ? ");
        double estatura = entrada.nextDouble();
        return peso / (Math.pow(estatura,2));
    }

    public static String imcDiagnostico(double imc) {
        if (imc < 18.5) {
            return "BAJO PESO";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "PESO NORMAL";
        } else if (imc >= 25 && imc <= 29.9) {
            return "SOBREPESO";
        } else if (imc >= 30 && imc <= 34.9) {
            return "OBESIDAD TIPO 1";
        } else if (imc >= 35 && imc <= 39.9) {
            return "OBESIDAD TIPO 2";
        } else {
            return "OBESIDAD TIPO 3";
        }
    }
}
