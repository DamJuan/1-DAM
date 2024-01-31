import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EntornGrafic2Ejer9 extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public EntornGrafic2Ejer9() {
        setTitle("Login Form");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Cambia el comportamiento predeterminado de cierre
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
                    showMessageDialog("Login Successful", "Welcome, " + username + "!");
                } else {
                    showMessageDialog("Login Failed", "Incorrect username or password.");
                }

                passwordField.setText("");
            }
        });

        // Agrega un WindowListener para manejar el evento de cierre de la ventana
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                confirmacionCerrarVentana();
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

    private void confirmacionCerrarVentana() {
        int opcion = JOptionPane.showConfirmDialog(this,
                "¿Está seguro de que desea cerrar la ventana?",
                "Confirmar cierre",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE);

        if (opcion == JOptionPane.OK_OPTION) {
            // Si el usuario selecciona "Aceptar", cierra la ventana
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EntornGrafic2Ejer9());
    }
}
