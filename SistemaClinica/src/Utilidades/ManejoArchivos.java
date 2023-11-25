package Utilidades;

import Entidades.Doctor;

import java.io.*;
import java.util.ArrayList;

public class ManejoArchivos {
    public static void escribirArchivo(ArrayList<Doctor> listaDoctor) {
        try {
            FileOutputStream escribir = new FileOutputStream("C:\\Windows\\Temp\\listaDoctor.txt");
            ObjectOutputStream miStream = new ObjectOutputStream(escribir);
            miStream.writeObject(listaDoctor);
            miStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error. No se pudo encontrar el archivo");
        } catch (IOException e) {
            System.out.println("Error de entrada/salida");
        }
    }

    public static ArrayList<Doctor> leerArchivo() {
        ArrayList<Doctor> otraLista = new ArrayList<>();
        try {
            FileInputStream leer = new FileInputStream("C:\\Windows\\Temp\\listaDoctor.txt");
            ObjectInputStream miStream2 = new ObjectInputStream(leer);
            Object obj = miStream2.readObject();
            otraLista = (ArrayList<Doctor>) obj;
            miStream2.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error. No se pudo encontrar el archivo");
        } catch (IOException e) {
            System.out.println("Error de entrada/salida");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al leer lista de clase Doctor");
        }
        return otraLista;
    }

}
