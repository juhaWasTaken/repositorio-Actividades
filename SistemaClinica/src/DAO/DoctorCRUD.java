package DAO;

import Entidades.Doctor;
import java.util.ArrayList;
import Utilidades.ManejoArchivos;

public class DoctorCRUD {

    public void inscribirDoctor(Doctor nuevoDoc) {
        ManejoArchivos manejador = new ManejoArchivos();

        ArrayList<Doctor> otraLista = manejador.leerArchivo();
        otraLista.add(nuevoDoc);

        manejador.escribirArchivo(otraLista);
    }

    public Doctor buscarDocPorId(String id) {
        ManejoArchivos manejador = new ManejoArchivos();

        ArrayList<Doctor> otraLista = manejador.leerArchivo();
        for (Doctor d : otraLista) {
            if (d.getId().equals(id)) {
                return d;
            }
        }
        return null;
    }

    public boolean eliminarDoctorPorId(String id) {
        ManejoArchivos manejador = new ManejoArchivos();

        ArrayList<Doctor> otraLista = manejador.leerArchivo();
        Doctor doctorAEliminar = null;

        for (Doctor d : otraLista) {
            if (d.getId().equals(id)) {
                doctorAEliminar = d;
                break;
            }
        }

        if (doctorAEliminar != null) {
            otraLista.remove(doctorAEliminar);
            manejador.escribirArchivo(otraLista);
            return true;
        } else {
            return false;
        }
    }

    public boolean actualizarDoctor(Doctor doctorActualizado) {
        ManejoArchivos manejador = new ManejoArchivos();
        ArrayList<Doctor> listaDoctores = manejador.leerArchivo();

        // Busca el doctor por su ID en la lista y actualiza sus datos si se encuentra
        for (int i = 0; i < listaDoctores.size(); i++) {
            Doctor doctor = listaDoctores.get(i);
            if (doctor.getId().equals(doctorActualizado.getId())) {
                listaDoctores.set(i, doctorActualizado); // Reemplaza el doctor existente con el doctor actualizado
                manejador.escribirArchivo(listaDoctores); // Guarda la lista actualizada en el archivo
                return true; // Doctor actualizado exitosamente
            }
        }
        return false; // No se encontró el doctor o no se pudo actualizar
    }
}
