import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int sumNum = 0;
        try {
            for (int i = 1; i<= 20; i++) {
                int num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero " + i + " : "));
                JOptionPane.showMessageDialog(null, "El numero " + i + " tiene el valor: " + num);
                sumNum = sumNum + num;
            }
        } catch (NumberFormatException e) {
            System.out.println("Algo salio mal");
        }
        JOptionPane.showMessageDialog(null, "La suma total de los numeros es: " + sumNum);
    }
}

