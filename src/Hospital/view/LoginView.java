import javax.swing.*;
import java.awt.*;

public class LoginView {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null); 

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout()); 
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5); 
        constraints.fill = GridBagConstraints.HORIZONTAL;

      
        JLabel labelCorreo = new JLabel("Correo:");
        JTextField textCorreo = new JTextField(15);
        JLabel labelContrasena = new JLabel("Contraseña:");
        JPasswordField textContrasena = new JPasswordField(15);
        JButton buttonLogin = new JButton("Iniciar sesión");

    
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(labelCorreo, constraints);

        constraints.gridx = 1;
        panel.add(textCorreo, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(labelContrasena, constraints);

        constraints.gridx = 1;
        panel.add(textContrasena, constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;
        panel.add(buttonLogin, constraints);

       
        frame.add(panel);
        frame.setVisible(true);
    }
}
