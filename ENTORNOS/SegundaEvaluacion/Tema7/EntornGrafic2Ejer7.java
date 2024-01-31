import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EntornGrafic2Ejer7 extends JFrame {
    private JFormattedTextField birthDateField;

    public EntornGrafic2Ejer7() {
        setTitle("Calculadora de Edad");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        MaskFormatter maskFormatter;
        try {
            maskFormatter = new MaskFormatter("##-##-####");
            maskFormatter.setPlaceholderCharacter('_'); // Carácter de relleno para el formato
        } catch (ParseException e) {
            e.printStackTrace();
            return;
        }

        birthDateField = new JFormattedTextField(maskFormatter);
        JLabel birthDateLabel = new JLabel("Fecha de Nacimiento:");

        JButton calculateButton = new JButton("Calcular Edad");
        calculateButton.addActionListener(e -> calcularEdad());

        setLayout(new GridLayout(3, 2));

        add(birthDateLabel);
        add(birthDateField);
        add(new JLabel());
        add(calculateButton);

        setVisible(true);
    }

    private void calcularEdad() {
        String inputDate = birthDateField.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date birthDate = sdf.parse(inputDate);

            Date currentDate = new Date();

            Calendar calendar1 = Calendar.getInstance();
            calendar1.setTime(birthDate);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(currentDate);

            int age = calendar2.get(Calendar.YEAR) - calendar1.get(Calendar.YEAR);

            if (calendar2.get(Calendar.DAY_OF_YEAR) < calendar1.get(Calendar.DAY_OF_YEAR)) {
                age--;
            }

            JOptionPane.showMessageDialog(this, "La edad es: " + age + " años", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Formato de fecha incorrecto. Utiliza dd-MM-yyyy", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EntornGrafic2Ejer7());
    }
}
