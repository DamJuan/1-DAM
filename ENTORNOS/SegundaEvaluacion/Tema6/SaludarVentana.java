import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SaludarVentana extends JFrame {
    private JTextField textField;
    private JButton agregarButton;
    private JButton saludarButton;
    private JComboBox<String> comboBox;
    private ArrayList<String> nombres;

    public SaludarVentana() {
        setTitle("Saludar con ComboBox");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());

        JLabel label = new JLabel("Introduce un nombre:");
        textField = new JTextField(15);
        agregarButton = new JButton("Agregar");
        saludarButton = new JButton("Saludar");
        comboBox = new JComboBox<>();
        comboBox.setPreferredSize(new Dimension(150, 30));
        nombres = new ArrayList<>();

        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        topPanel.add(label);
        topPanel.add(textField);
        topPanel.add(agregarButton);
        topPanel.add(comboBox);

        panel.add(topPanel, BorderLayout.NORTH);
        panel.add(saludarButton, BorderLayout.CENTER);

        agregarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = textField.getText();
                if (!nombre.isEmpty()) {
                    nombres.add(nombre);
                    comboBox.addItem(nombre);
                    JOptionPane.showMessageDialog(null, "Se ha agregado el nombre: " + nombre);
                    textField.setText(""); // Limpiar el campo de texto después de agregar
                }
            }
        });

        saludarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombreSeleccionado = (String) comboBox.getSelectedItem();
                if (nombreSeleccionado != null) {
                    JOptionPane.showMessageDialog(null, "¡Hola " + nombreSeleccionado + "!");
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, selecciona un nombre.");
                }
            }
        });

        add(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SaludarVentana();
            }
        });
    }
}
