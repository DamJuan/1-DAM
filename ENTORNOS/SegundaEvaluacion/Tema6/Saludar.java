import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Saludar extends JFrame {

    private JTextField textField;
    private JButton button;

    public Saludar() {
        JPanel panel = new JPanel(new BorderLayout());

        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel label = new JLabel("Introduce tu nombre:");
        textField = new JTextField(15);
        button = new JButton("Saludar");

        topPanel.add(label);
        topPanel.add(textField);
        topPanel.add(button);

        JPanel centerPanel = new JPanel();

        panel.add(topPanel, BorderLayout.NORTH);
        panel.add(centerPanel, BorderLayout.CENTER);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String texto = textField.getText();
                JOptionPane.showMessageDialog(null, "Hola " + texto);
            }
        });

        add(panel);

        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        Saludar formulario1 = new Saludar();
        formulario1.setVisible(true);
    }
}
