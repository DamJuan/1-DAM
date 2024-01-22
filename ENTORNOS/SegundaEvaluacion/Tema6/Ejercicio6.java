import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Ejercicio6 extends JFrame {
    private JTextField textField;
    private JRadioButton masculinoRadioButton;
    private JRadioButton femeninoRadioButton;
    private JRadioButton radioButton3;
    private JCheckBox checkBox;
    private JComboBox<String> provinciaComboBox;
    private JSpinner spinner;

    private JLabel espejoSexoLabel;
    private JLabel espejoCondicionesLabel;
    private JLabel espejoNombreLabel;
    private JLabel espejoProvinciaLabel;
    private JLabel espejoEdadLabel;

    private JCheckBox enableNombreCheckbox;
    private JCheckBox enableSexoCheckbox;
    private JCheckBox enableCondicionesCheckbox;
    private JCheckBox enableProvinciaCheckbox;
    private JCheckBox enableEdadCheckbox;

    public Ejercicio6() {
        setTitle("Formulario App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        textField = new JTextField();
        textField.setBackground(Color.LIGHT_GRAY);
        add(new JLabel("Nombre: "), gbc);
        gbc.gridy++;
        add(textField, gbc);

        masculinoRadioButton = new JRadioButton("Masculino");
        femeninoRadioButton = new JRadioButton("Femenino");
        radioButton3 = new JRadioButton("Otro");
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(masculinoRadioButton);
        radioGroup.add(femeninoRadioButton);
        radioGroup.add(radioButton3);
        gbc.gridy++;
        add(new JLabel("Sexo: "), gbc);
        gbc.gridy++;
        add(masculinoRadioButton, gbc);
        gbc.gridy++;
        add(femeninoRadioButton, gbc);
        gbc.gridy++;
        add(radioButton3, gbc);

        checkBox = new JCheckBox("Acepta las condiciones");
        gbc.gridy++;
        add(new JLabel("Condiciones: "), gbc);
        gbc.gridy++;
        add(checkBox, gbc);

        String[] provincias = {"Barcelona", "Girona", "Lleida", "Tarragona"};
        provinciaComboBox = new JComboBox<>(provincias);
        gbc.gridy++;
        add(new JLabel("Provincia: "), gbc);
        gbc.gridy++;
        add(provinciaComboBox, gbc);

        spinner = new JSpinner(new SpinnerNumberModel(18, 18, 99, 1));
        gbc.gridy++;
        add(new JLabel("Edad: "), gbc);
        gbc.gridy++;
        add(spinner, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridheight = 6;
        gbc.insets = new Insets(5, 20, 5, 5);

        espejoSexoLabel = new JLabel("Sexo: ");
        add(espejoSexoLabel, gbc);

        gbc.gridy++;
        espejoCondicionesLabel = new JLabel("Condiciones: ");
        add(espejoCondicionesLabel, gbc);

        gbc.gridy++;
        espejoNombreLabel = new JLabel("Nombre: ");
        add(espejoNombreLabel, gbc);

        gbc.gridy++;
        espejoProvinciaLabel = new JLabel("Provincia: ");
        add(espejoProvinciaLabel, gbc);

        gbc.gridy++;
        espejoEdadLabel = new JLabel("Edad: ");
        add(espejoEdadLabel, gbc);

        JButton enviarButton = new JButton("Enviar");
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        add(enviarButton, gbc);
        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(Ejercicio6.this, "¿Quieres confirmar los datos?", "Confirmación", JOptionPane.YES_NO_CANCEL_OPTION);

                if (result == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(Ejercicio6.this, "Datos enviados:\nNombre: " + textField.getText() + "\nSexo: " +
                            (masculinoRadioButton.isSelected() ? "Masculino" : femeninoRadioButton.isSelected() ? "Femenino" : radioButton3.isSelected() ? "Otro" : "") +
                            "\nCondiciones aceptadas: " + (checkBox.isSelected() ? "Sí" : "No") + "\nProvincia: " + provinciaComboBox.getSelectedItem() + "\nEdad: " + spinner.getValue(), "Datos Confirmados", JOptionPane.INFORMATION_MESSAGE);

                } else if (result == JOptionPane.NO_OPTION) {
                    System.exit(0);
                }
            }
        });

        JButton cancelarButton = new JButton("Cancelar");
        gbc.gridx = 1;
        add(cancelarButton, gbc);
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                radioGroup.clearSelection();
                checkBox.setSelected(false);
                provinciaComboBox.setSelectedIndex(0);
                spinner.setValue(18);
            }
        });

        JMenu opcionesMenu = new JMenu("Opciones");

        enableNombreCheckbox = new JCheckBox("Habilitar Nombre");
        enableSexoCheckbox = new JCheckBox("Habilitar Sexo");
        enableCondicionesCheckbox = new JCheckBox("Habilitar Condiciones");
        enableProvinciaCheckbox = new JCheckBox("Habilitar Provincia");
        enableEdadCheckbox = new JCheckBox("Habilitar Edad");

        opcionesMenu.add(enableNombreCheckbox);
        opcionesMenu.add(enableSexoCheckbox);
        opcionesMenu.add(enableCondicionesCheckbox);
        opcionesMenu.add(enableProvinciaCheckbox);
        opcionesMenu.add(enableEdadCheckbox);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(opcionesMenu);
        setJMenuBar(menuBar);

        enableNombreCheckbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setEnabled(enableNombreCheckbox.isSelected());
            }
        });

        enableSexoCheckbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                masculinoRadioButton.setEnabled(enableSexoCheckbox.isSelected());
                femeninoRadioButton.setEnabled(enableSexoCheckbox.isSelected());
                radioButton3.setEnabled(enableSexoCheckbox.isSelected());
            }
        });

        enableCondicionesCheckbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkBox.setEnabled(enableCondicionesCheckbox.isSelected());
            }
        });

        enableProvinciaCheckbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                provinciaComboBox.setEnabled(enableProvinciaCheckbox.isSelected());
            }
        });

        enableEdadCheckbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                spinner.setEnabled(enableEdadCheckbox.isSelected());
            }
        });

        setVisible(true);
    }

    private void actualitzarEspillSexe() {
        String sexo = masculinoRadioButton.isSelected() ? "Masculino" :
                femeninoRadioButton.isSelected() ? "Femenino" :
                        radioButton3.isSelected() ? "Otro" : "";

        espejoSexoLabel.setText("Sexo: " + sexo);
    }

    private void actualitzarEspillCondicions() {
        boolean condicionesAceptadas = checkBox.isSelected();

        espejoCondicionesLabel.setText("Condiciones aceptadas: " + (condicionesAceptadas ? "Sí" : "No"));
    }

    private void actualitzarEspillNom() {
        String nombre = textField.getText();

        espejoNombreLabel.setText("Nombre: " + nombre);
    }

    private void actualitzarEspillProvincia() {
        String provincia = (String) provinciaComboBox.getSelectedItem();

        espejoProvinciaLabel.setText("Provincia: " + provincia);
    }

    private void actualitzarEspillEdat() {
        int edad = (int) spinner.getValue();

        espejoEdadLabel.setText("Edad: " + edad);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FormulariApp();
            }
        });
    }
}
