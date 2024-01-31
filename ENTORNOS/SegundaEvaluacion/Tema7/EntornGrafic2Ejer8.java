import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class EntornGrafic2Ejer8 extends JFrame {
    private JSlider slider;
    private JLabel valueLabel;

    public EntornGrafic2Ejer8() {
        setTitle("Visor JSlider");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Configuración del JSlider
        slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        // Configuración del JLabel
        valueLabel = new JLabel("Valor: " + slider.getValue(), SwingConstants.CENTER);
        valueLabel.setForeground(Color.GREEN);
        valueLabel.setFont(new Font("Arial", Font.BOLD, 18));

        // Añadir un ChangeListener al JSlider para actualizar el valor en tiempo real
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                updateValueLabel();
            }
        });

        setLayout(new GridLayout(2, 1));

        add(slider);
        add(valueLabel);

        setVisible(true);
    }

    private void updateValueLabel() {
        valueLabel.setText("Valor: " + slider.getValue());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EntornGrafic2Ejer8());
    }
}
