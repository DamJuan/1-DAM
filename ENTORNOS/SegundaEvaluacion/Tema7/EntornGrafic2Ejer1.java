import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EntornGrafic2Ejer1 extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public EntornGrafic2Ejer1() {
        // Configuración del frame
        setTitle("Login Form");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Creación de los componentes
        JLabel titleLabel = new JLabel("Welcome", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Source Code Pro", Font.BOLD, 24));

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();

        JButton loginButton = new JButton("Log In");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes comprobar las credenciales
                String username = usernameField.getText();
                char[] password = passwordField.getPassword();
                if (checkCredentials(username, new String(password))) {
                    showMessageDialog("Login Successful", "Welcome, " + username + "!");
                } else {
                    showMessageDialog("Login Failed", "Incorrect username or password.");
                }

                // Borra la contraseña por seguridad
                passwordField.setText("");
            }
        });

        // Configuración del layout
        setLayout(new GridLayout(4, 2));

        // Añadir componentes al frame
        add(titleLabel);
        add(new JLabel()); // Espacio en blanco
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(new JLabel()); // Espacio en blanco
        add(loginButton);

        // Mostrar el frame
        setVisible(true);
    }

    private boolean checkCredentials(String username, String password) {
        // Aquí puedes implementar la lógica para comprobar las credenciales con tu lógica de backend
        // En este ejemplo, solo comprobamos que el nombre de usuario sea "admin" y la contraseña "admin123"
        return username.equals("admin") && password.equals("admin123");
    }

    private void showMessageDialog(String title, String message) {
        JOptionPane.showMessageDialog(this, message, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EntornGrafic2Ejer1();
            }
        });
    }
}