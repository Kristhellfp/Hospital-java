package Hospital.view;

import Hospital.service.DataSalas;

import javax.swing.*;
import java.awt.*;

public class SalasView extends JFrame {
    public SalasView() {
        setTitle("Salas del Hospital");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel principal
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // Título
        JLabel titleLabel = new JLabel("Salas", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        mainPanel.add(titleLabel, BorderLayout.NORTH);

        // Panel de salas
        JPanel salasPanel = new JPanel();
        salasPanel.setLayout(new GridLayout(3, 4, 10, 10)); // 3 filas, 4 columnas, espacio de 10px entre componentes

        // Cargar y mostrar la información de las salas
        DataSalas dataSalas = new DataSalas();
        for (DataSalas.Sala sala : dataSalas.obtenerSalas()) {
            JButton salaButton = new JButton(sala.getNombre());
            salaButton.setBackground(Color.WHITE);
            salaButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            salaButton.setFont(new Font("Arial", Font.PLAIN, 16));
            salaButton.setPreferredSize(new Dimension(150, 100));

            // Cambiar color según tipo de sala (ejemplo)
            switch (sala.getTipo()) {
                case "Consulta":
                    salaButton.setBackground(Color.RED);
                    break;
                case "Emergencias":
                    salaButton.setBackground(Color.GREEN);
                    break;
                case "Pediatría":
                    salaButton.setBackground(Color.YELLOW);
                    break;
                case "Cirugía":
                    salaButton.setBackground(Color.ORANGE);
                    break;
                case "Maternidad":
                    salaButton.setBackground(Color.PINK);
                    break;
                default:
                    salaButton.setBackground(Color.LIGHT_GRAY);
                    break;
            }

            salasPanel.add(salaButton);
        }

        mainPanel.add(salasPanel, BorderLayout.CENTER);
        add(mainPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SalasView();
    }
}
