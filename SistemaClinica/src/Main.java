import Entidades.Doctor;

import javax.print.Doc;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Doctor> listaDoctor = new ArrayList<Doctor>();
        Doctor nuevoDoc = new Doctor();
        listaDoctor.add(nuevoDoc);

//        try {
//            FileOutputStream escribir = new
//                    FileOutputStream("C:\\Windows\\Temp\\listaDoctor.txt");
//            ObjectOutputStream miStream = new
//                    ObjectOutputStream(escribir);
//            miStream.writeObject(listaDoctor);
//            miStream.close();
//
//
//            //Leer lista
//            FileInputStream leer = new
//                    FileInputStream("C:\\Windows\\Temp\\listaDoctor.txt");
//            ObjectInputStream miStream2 = new ObjectInputStream(leer);
//            Object obj = miStream2.readObject();
//            ArrayList<Doctor> otraLista =  (ArrayList<Doctor>)obj;
//            Doctor doctorPrueba = otraLista.get(0);
//            miStream2.close();
//
//
//        }catch (FileNotFoundException e) {
//            System.out.println("Error. No se pudo encontrar el archivo");
//        } catch (IOException e) {
//            System.out.println("Error de entrada/salida");
//        } catch (ClassNotFoundException e) {
//            System.out.println("Error al leer lista de clase Doctor");
//        }


    }
}