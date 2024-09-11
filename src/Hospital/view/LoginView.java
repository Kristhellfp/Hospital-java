import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {

    // Componentes de la interfaz
    private JTextField usuarioCampo;
    private JPasswordField contrasenaCampo;
    private JButton botonLogin;
    private JLabel mensajeLabel;

    public LoginView() {
        // Configuración del marco
        setTitle("Inicio de Sesión");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 1));

        // Campo de usuario
        usuarioCampo = new JTextField();
        add(new JLabel("Usuario:"));
        add(usuarioCampo);

        // Campo de contraseña
        contrasenaCampo = new JPasswordField();
        add(new JLabel("Contraseña:"));
        add(contrasenaCampo);

        // Botón de inicio de sesión
        botonLogin = new JButton("Iniciar Sesión");
        add(botonLogin);

        // Mensaje
        mensajeLabel = new JLabel("", SwingConstants.CENTER);
        add(mensajeLabel);

        // Acción del botón
        botonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = usuarioCampo.getText();
                String contrasena = new String(contrasenaCampo.getPassword());

                // Comprobación simple del usuario y la contraseña
                if (usuario.equals("admin") && contrasena.equals("1234")) {
                    mensajeLabel.setText("Inicio de sesión exitoso");
                    mensajeLabel.setForeground(Color.GREEN);
                } else {
                    mensajeLabel.setText("Credenciales incorrectas");
                    mensajeLabel.setForeground(Color.RED);
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginView();
    }
}
