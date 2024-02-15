import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio2 extends JFrame {
    private JTextField textField;

    public Ejercicio2() {
        super("Saludar Ventana");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear els components
        JLabel label = new JLabel("Introdueix el teu nom:");
        textField = new JTextField(20);
        JButton saludarButton = new JButton("Saludar");

        // Afegir un ActionListener al botó "Saludar"
        saludarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nom = textField.getText();
                JOptionPane.showMessageDialog(Ejercicio2.this, "Hola, " + nom + "!");
            }
        });

        // Configurar el layout
        setLayout(new FlowLayout());

        // Afegir els components a la finestra
        add(label);
        add(textField);
        add(saludarButton);

        // Establir les dimensions i fer visible la finestra
        setSize(300, 150);
        setLocationRelativeTo(null); // Centrar la finestra
        setVisible(true);
    }

    public static void main(String[] args) {
        // Crear una instància de la classe SaludarVentana
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ejercicio2();
            }
        });
    }
}

