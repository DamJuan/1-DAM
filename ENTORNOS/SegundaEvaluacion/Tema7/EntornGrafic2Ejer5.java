import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EntornGrafic2Ejer5 extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public EntornGrafic2Ejer5() {
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

        loginButton = new JButton("Log In");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performLogin();
            }
        });

        passwordField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    performLogin();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

        setLayout(new GridLayout(4, 2));

        add(titleLabel);
        add(new JLabel());
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);

        loginButton.setFocusable(false);

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

    private void performLogin() {
        String username = usernameField.getText();
        char[] password = passwordField.getPassword();
        if (checkCredentials(username, new String(password))) {
            showMessageDialog("Login Successful", "Welcome, " + username + "!");
        } else {
            showMessageDialog("Login Failed", "Incorrect username or password.");
        }

        passwordField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EntornGrafic2Ejer5();
            }
        });
    }
}
