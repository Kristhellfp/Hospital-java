package Hospital.view;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class DoctorView extends JFrame {
    private int[] pantalla = {1300, 800};

    public DoctorView(HashMap<String, String> doctorData) {
        setSize(pantalla[0], pantalla[1]);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Perfil del Doctor");
        setLayout(new BorderLayout());


        JPanel headerPanel = new JPanel();
        headerPanel.setPreferredSize(new Dimension(1300, 60));
        headerPanel.setBackground(new Color(40, 44, 52));  // Color oscuro para la cabecera
        headerPanel.setLayout(new BorderLayout());

        JLabel hospitalLabel = new JLabel("Hospital Santa Catalina");
        hospitalLabel.setForeground(new Color(200, 200, 200));  // Texto gris claro
        hospitalLabel.setFont(new Font("Arial", Font.BOLD, 18));  // Fuente moderna
        headerPanel.add(hospitalLabel, BorderLayout.WEST);

        JPanel userPanel = new JPanel(new GridBagLayout());
        userPanel.setBackground(new Color(40, 44, 52));  // Fondo oscuro para coherencia
        GridBagConstraints gbc = new GridBagConstraints();


        JPanel logoPanel = new JPanel();
        logoPanel.setPreferredSize(new Dimension(50, 50));
        logoPanel.setBackground(Color.YELLOW);  // Color amarillo para el logo como en la imagen
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        userPanel.add(logoPanel, gbc);


        JLabel nombreDoctor = new JLabel(doctorData.get("Nombre"));
        nombreDoctor.setForeground(new Color(255, 255, 255));  // Texto en blanco
        nombreDoctor.setFont(new Font("Arial", Font.BOLD, 16));  // Fuente moderna
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        userPanel.add(nombreDoctor, gbc);


        JLabel especialidadDoctor = new JLabel(doctorData.get("Especialidad"));
        especialidadDoctor.setForeground(new Color(192, 192, 192));  // Gris claro para la especialidad
        especialidadDoctor.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridx = 1;
        gbc.gridy = 1;
        userPanel.add(especialidadDoctor, gbc);


        headerPanel.add(userPanel, BorderLayout.EAST);

        add(headerPanel, BorderLayout.NORTH);

        add(componenteMenuLateral(), BorderLayout.WEST);

        setVisible(true);
    }

    private JPanel componenteMenuLateral() {
        JPanel panelMenu = new JPanel();
        panelMenu.setPreferredSize(new Dimension(250, pantalla[1]));
        panelMenu.setBackground(new Color(35, 38, 40));  // Color gris oscuro uniforme para el menú lateral
        panelMenu.setLayout(new BorderLayout());

        // MENU
        JPanel menu = new JPanel(new GridBagLayout());
        menu.setBackground(new Color(200, 200, 200));  // Fondo claro para la columna, simulando la imagen
        GridBagConstraints restricciones = new GridBagConstraints();
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.gridx = 0;


        menu.add(crearUnBoton("Opción 1"), restricciones);
        menu.add(crearUnBoton("Opción 2"), restricciones);
        menu.add(crearUnBoton("Opción 3"), restricciones);
        menu.add(crearUnBoton("Opción 4"), restricciones);
        menu.add(crearUnBoton("Opción 5"), restricciones);

        panelMenu.add(menu, BorderLayout.CENTER);
        return panelMenu;
    }


    private JButton crearUnBoton(String texto) {
        JButton boton = new JButton(texto);
        boton.setPreferredSize(new Dimension(200, 40));
        boton.setBackground(new Color(50, 70, 90));  // Botones oscuros para contraste con el fondo claro
        boton.setForeground(Color.WHITE);
        boton.setFont(new Font("Arial", Font.BOLD, 14));
        boton.setFocusPainted(false);
        boton.setBorder(BorderFactory.createLineBorder(new Color(80, 80, 80), 1));  // Bordes sutiles

        boton.addActionListener(e -> {
            System.out.println(texto);
        });

        return boton;
    }

    public static void main(String[] args) {

        HashMap<String, String> dummyData = new HashMap<>();
        dummyData.put("Nombre", "Fernanda Paz");  // Cambiado el nombre a Fernanda Paz
        dummyData.put("Especialidad", "Doctor General");
        new DoctorView(dummyData);
    }
}
