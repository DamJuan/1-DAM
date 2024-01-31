import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EntornGrafic2Ejer6 extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public EntornGrafic2Ejer6() {
        setTitle("Login Form");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setIconImage(getIconImage());

        getContentPane().setBackground(new Color(240, 240, 240));

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
                String username = usernameField.getText();
                char[] password = passwordField.getPassword();
                if (checkCredentials(username, new String(password))) {
                    // Si las credenciales son correctas, crea una nueva ventana (Sesion)
                    Sesion nuevaSesion = new Sesion(username);
                    nuevaSesion.setVisible(true);

                    // Cierra la ventana actual
                    dispose();
                } else {
                    showMessageDialog("Login Failed", "Incorrect username or password.");
                }

                passwordField.setText("");
            }
        });

        setLayout(new GridLayout(4, 2));

        add(titleLabel);
        add(new JLabel());
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(new JLabel());
        add(loginButton);

        setVisible(true);
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage("img/monkey.png");
        return retValue;
    }

    private boolean checkCredentials(String username, String password) {
        return username.equals("admin") && password.equals("admin123");
    }

    private void showMessageDialog(String title, String message) {
        JOptionPane.showMessageDialog(this, message, title, JOptionPane.INFORMATION_MESSAGE);
    }

    // Clase para la nueva ventana
    class Sesion extends JFrame {
        public Sesion(String username) {
            setTitle("Sesión de " + username);
            setSize(400, 200);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cierra solo esta ventana, no toda la aplicación
            setLocationRelativeTo(null);

            // Contenido de la nueva ventana
            JLabel welcomeLabel = new JLabel("Welcome, " + username + "!", SwingConstants.CENTER);
            welcomeLabel.setFont(new Font("Source Code Pro", Font.BOLD, 24));

            JButton logoutButton = new JButton("Logout");
            logoutButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Acciones cuando se presiona el botón de salida
                    dispose(); // Cierra la ventana de sesión
                    new EntornGrafic2Ejer6().setVisible(true); // Abre la ventana de inicio de sesión
                }
            });

            JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout());
            panel.add(welcomeLabel, BorderLayout.CENTER);
            panel.add(logoutButton, BorderLayout.SOUTH);

            add(panel);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EntornGrafic2Ejer6();
            }
        });
    }
}
