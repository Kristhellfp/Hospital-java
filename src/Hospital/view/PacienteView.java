package Hospital.view;

import Hospital.service.PacientesData;
import Hospital.model.Paciente;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class PacienteView {

    // Atributo privado para almacenar el listado de pacientes
    private List<Paciente> pacientes;

    // Constructor que recibe el PacientesData
    public PacienteView(PacientesData pacientesData) {

    }

    // Método que crea el panel con los datos de los pacientes
    public JPanel crearPanelPacientes() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 4));  // Organiza en un grid

        // Título
        JLabel titulo = new JLabel("Listado de Pacientes", JLabel.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(titulo);

        // Espacio vacío para que el título ocupe una fila completa
        panel.add(new JLabel(""));
        panel.add(new JLabel(""));
        panel.add(new JLabel(""));

        // Títulos de las columnas
        String[] columnas = {"Nombre", "Fecha de Nacimiento", "Hora de Cita", "Tipo de Visita"};
        for (String columna : columnas) {
            JLabel label = new JLabel(columna, JLabel.CENTER);
            label.setFont(new Font("Arial", Font.BOLD, 12));
            panel.add(label);
        }

        // Agregar los datos de cada paciente
        for (Paciente paciente : pacientes) {  // Asegúrate de que "pacientes" es la lista correcta
            panel.add(new JLabel(paciente.getNombre(), JLabel.CENTER));
            panel.add(new JLabel(String.valueOf(paciente.getFechaNacimiento()), JLabel.CENTER));
            panel.add(new JLabel(String.valueOf(paciente.getHoraCita()), JLabel.CENTER));
        }

        // Botón para agregar un nuevo paciente
        JButton btnAgregar = new JButton("Agregar Paciente");
        btnAgregar.addActionListener(e -> agregarPaciente());
        panel.add(btnAgregar);

        return panel;  // Devolver el panel con los datos
    }

    // Método para manejar la lógica de agregar un nuevo paciente
    private void agregarPaciente() {
        // Lógica para agregar un nuevo paciente (puedes implementar un formulario aquí)
        JOptionPane.showMessageDialog(null, "Funcionalidad para agregar paciente no implementada.");
    }
}
