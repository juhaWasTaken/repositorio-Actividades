import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Perro perro1 = new Perro();
        System.out.print("Ingresa el nombre del primer perro: ");
        perro1.setNombre(entrada.nextLine());

        System.out.print("Ingresa la raza del primer perro: ");
        perro1.setRaza(entrada.nextLine());

        System.out.print("Ingresa la edad del primer perro: ");
        try{
            perro1.setEdad(entrada.nextInt());
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Error, ingresa una edad válida");
            return;
        }
        entrada.nextLine();

        System.out.print("Ingresa el peso del primer perro: ");
        try{
            perro1.setPeso(entrada.nextDouble());
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Error, ingresa un peso válida");
            return;
        }
        entrada.nextLine();

        System.out.print("El primer perro come: ");
        perro1.setComida(entrada.nextLine());

        System.out.print("La cantidad que come es de: ");
        try {
            perro1.setCantidadComida(entrada.nextDouble());
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Error, ingresa una cantidad válida");
            return;
        }
        entrada.nextLine();
        System.out.println();

        Perro perro2 = new Perro();
        System.out.print("Ingresa el nombre del segundo perro: ");
        perro2.setNombre(entrada.nextLine());

        System.out.print("Ingresa la raza del segundo perro: ");
        perro2.setRaza(entrada.nextLine());

        System.out.print("Ingresa la edad del segundo perro: ");
        try{
            perro2.setEdad(entrada.nextInt());
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Error, ingresa una edad válida");
            return;
        }
        entrada.nextLine();

        System.out.print("Ingresa el peso del segundo perro: ");
        try{
            perro2.setPeso(entrada.nextDouble());
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Error, ingresa un peso válida");
            return;
        }
        entrada.nextLine();

        System.out.print("El segundo perro come: ");
        perro2.setComida(entrada.nextLine());

        System.out.print("La cantidad que come es de: ");
        try {
            perro2.setCantidadComida(entrada.nextDouble());
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Error, ingresa una cantidad válida");
            return;
        }
        entrada.nextLine();

        System.out.println();
        System.out.println("El primer perro se llama " + perro1.getNombre() + " ,es de raza " + perro1.getRaza() + " ,tiene " + perro1.getEdad() + " años y pesa " + perro1.getPeso());
        perro1.comer(perro1.getComida(), perro1.getCantidadComida());
        System.out.println(perro1.getNombre() + " dice: " + perro1.ladrar());

        System.out.println();
        System.out.println("El segundo perro se llama " + perro2.getNombre() + " ,es de raza " + perro2.getRaza() + " ,tiene " + perro2.getEdad() + " años y pesa " + perro2.getPeso());
        perro2.comer(perro2.getComida(), perro2.getCantidadComida());
        System.out.println(perro2.getNombre() + " dice: " + perro2.ladrar());
    }
}