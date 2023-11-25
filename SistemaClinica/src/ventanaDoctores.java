import DAO.DoctorCRUD;
import Entidades.Doctor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventanaDoctores extends JFrame{
    private JPanel miPanel;
    private JTextField txtNombre;
    private JTextField txtApMaterno;
    private JTextField txtApPaterno;
    private JTextField txtEdad;
    private JLabel lblNombre;
    private JLabel lblApMaterno;
    private JLabel lblApPaterno;
    private JLabel lblEdad;
    private JTextField txtEspecialidad;
    private JTextField txtID;
    private JLabel lblEspecialidad;
    private JLabel lblID;
    private JButton btnLimpiar;
    private JButton btnInscribir;
    private JButton btnActualizar;
    private JButton btnBorrar;
    private JButton btnBuscar;

    private boolean validarCamposVacios() {
        return !txtNombre.getText().isEmpty() &&
                !txtApMaterno.getText().isEmpty() &&
                !txtApPaterno.getText().isEmpty() &&
                !txtEdad.getText().isEmpty() &&
                !txtEspecialidad.getText().isEmpty() &&
                !txtID.getText().isEmpty();
    }
    private void limpiarFormulario() {
        txtNombre.setText("");
        txtApMaterno.setText("");
        txtApPaterno.setText("");
        txtEdad.setText("");
        txtEspecialidad.setText("");
        txtID.setText("");
    }


    public ventanaDoctores() {

        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarFormulario();
            }
        });

        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DoctorCRUD crud = new DoctorCRUD();
                String matricula = txtID.getText();
                Doctor d = crud.buscarDocPorId(matricula);
                if(d == null) {
                    //JOptionPane.showMessageDialog(miPanel,"No se encuentra el doctor con el ID " + matricula);
                    int respuesta = JOptionPane.showConfirmDialog(miPanel, "No se encuentra el doctor con el ID "
                            + matricula + "\n¿Desea inscribir el Doctor?", "Doctor" , JOptionPane.YES_NO_OPTION);
                    if (respuesta == 0) {
                        limpiarFormulario();
                        btnInscribir.setEnabled(true);
                        txtNombre.requestFocus();

                    } else if (respuesta == 1) {
                        //No se da de alta
                        limpiarFormulario();
                    }
                } else {
                    txtNombre.setText(d.getNombre());
                    txtApPaterno.setText(d.getApPaterno());
                    txtApMaterno.setText(d.getApMaterno());
                    txtEspecialidad.setText(d.getEspecialidad());
                    txtEdad.setText(String.valueOf(d.getEdad()));

                    btnActualizar.setEnabled(true);
                }
            }
        });

        btnInscribir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!validarCamposVacios()) {
                    JOptionPane.showMessageDialog(miPanel, "Por favor, complete todos los campos");
                    return;
                }

                Doctor doc = new Doctor();
                doc.setNombre(txtNombre.getText());
                doc.setApPaterno(txtApPaterno.getText());
                doc.setApMaterno(txtApMaterno.getText());
                doc.setEdad(Integer.parseInt(txtEdad.getText()));
                doc.setEspecialidad(txtEspecialidad.getText());
                doc.setId(txtID.getText());

                DoctorCRUD doctor = new DoctorCRUD();
                doctor.inscribirDoctor(doc);
                limpiarFormulario();


            }
        });

        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idDoctorAEliminar = txtID.getText();
                DoctorCRUD crud = new DoctorCRUD();

                if (idDoctorAEliminar.isEmpty()) {
                    JOptionPane.showMessageDialog(miPanel, "Por favor, ingrese un ID para eliminar al doctor");
                } else {
                    Doctor doctorAEliminar = crud.buscarDocPorId(idDoctorAEliminar);

                    if (doctorAEliminar != null) {
                        int confirmacion = JOptionPane.showConfirmDialog(miPanel,
                                "¿Estás seguro de que quieres eliminar a este doctor?",
                                "Confirmar eliminación",
                                JOptionPane.YES_NO_OPTION);

                        if (confirmacion == JOptionPane.YES_OPTION) {
                            boolean eliminado = crud.eliminarDoctorPorId(idDoctorAEliminar);

                            if (eliminado) {
                                JOptionPane.showMessageDialog(miPanel, "Doctor eliminado exitosamente");
                                limpiarFormulario();
                            } else {
                                JOptionPane.showMessageDialog(miPanel, "No se pudo eliminar al doctor");
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(miPanel, "No se encontró ningún doctor con el ID proporcionado");
                    }
                }
            }
        });
        btnActualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idDoctor = txtID.getText();
                DoctorCRUD crud = new DoctorCRUD();
                Doctor doctorExistente = crud.buscarDocPorId(idDoctor);

                if (doctorExistente != null) {
                    // Actualiza la información del doctor con los nuevos valores de los campos de texto
                    doctorExistente.setNombre(txtNombre.getText());
                    doctorExistente.setApPaterno(txtApPaterno.getText());
                    doctorExistente.setApMaterno(txtApMaterno.getText());
                    doctorExistente.setEdad(Integer.parseInt(txtEdad.getText()));
                    doctorExistente.setEspecialidad(txtEspecialidad.getText());

                    // Actualiza el doctor en el archivo o base de datos
                    crud.actualizarDoctor(doctorExistente); // Agrega el método actualizarDoctor en DoctorCRUD
                    JOptionPane.showMessageDialog(miPanel, "Doctor actualizado exitosamente");
                } else {
                    JOptionPane.showMessageDialog(miPanel, "No se encontró ningún doctor con el ID proporcionado");
                }
            }
        });
    }



    public static void main(String[] args) {
        ventanaDoctores v = new ventanaDoctores();
        v.setContentPane(v.miPanel);
        v.setSize(500,300);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setVisible(true);

    }
}
