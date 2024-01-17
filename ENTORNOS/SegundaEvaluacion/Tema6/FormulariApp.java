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

public class FormulariApp extends JFrame {
    private JTextField textField;
    private JRadioButton masculinoRadioButton;
    private JRadioButton femeninoRadioButton;
    private JRadioButton radioButton3;
    private JCheckBox checkBox;
    private JComboBox<String> provinciaComboBox;
    private JSpinner spinner;

    // Componentes espejo
    private JLabel espejoSexoLabel;
    private JLabel espejoCondicionesLabel;
    private JLabel espejoNombreLabel;
    private JLabel espejoProvinciaLabel;
    private JLabel espejoEdadLabel;

    public FormulariApp() {
        // Configuración de la ventana principal
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

        // Configuración del JTextField
        textField = new JTextField();
        textField.setBackground(Color.LIGHT_GRAY);
        add(new JLabel("Nombre: "), gbc);
        gbc.gridy++;
        add(textField, gbc);

        // Configuración de los JRadioButtons
        masculinoRadioButton = new JRadioButton("Masculi");
        femeninoRadioButton = new JRadioButton("Femeni");
        radioButton3 = new JRadioButton("Altre");
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

        // Configuración del JCheckBox
        checkBox = new JCheckBox("Acepta las condiciones");
        gbc.gridy++;
        add(new JLabel("Condiciones: "), gbc);
        gbc.gridy++;
        add(checkBox, gbc);

        // Configuración del JComboBox para seleccionar una provincia
        String[] provincias = {"Barcelona", "Girona", "Lleida", "Tarragona"};
        provinciaComboBox = new JComboBox<>(provincias);
        gbc.gridy++;
        add(new JLabel("Provincia: "), gbc);
        gbc.gridy++;
        add(provinciaComboBox, gbc);

        // Configuración del JSpinner
        spinner = new JSpinner(new SpinnerNumberModel(18, 18, 99, 1));
        gbc.gridy++;
        add(new JLabel("Edad: "), gbc);
        gbc.gridy++;
        add(spinner, gbc);

        // Configuración del "espejo"
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

        // Botones para enviar y cancelar el formulario
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
                // Lógica para mostrar el JOptionPane
                int result = JOptionPane.showConfirmDialog(FormulariApp.this, "¿Quieres confirmar los datos?", "Confirmación", JOptionPane.YES_NO_CANCEL_OPTION);

                if (result == JOptionPane.YES_OPTION) {
                    // Mostrar el diálogo con los datos introducidos
                    JOptionPane.showMessageDialog(FormulariApp.this, "Datos enviados:\nNombre: " + textField.getText() + "\nSexo: " +
                            (masculinoRadioButton.isSelected() ? "Masculino" : femeninoRadioButton.isSelected() ? "Femenino" : radioButton3.isSelected() ? "Otro" : "") +
                            "\nCondiciones aceptadas: " + (checkBox.isSelected() ? "Sí" : "No") + "\nProvincia: " + provinciaComboBox.getSelectedItem() + "\nEdad: " + spinner.getValue(), "Datos Confirmados", JOptionPane.INFORMATION_MESSAGE);

                } else if (result == JOptionPane.NO_OPTION) {
                    // Salir de la aplicación
                    System.exit(0);
                } else {
                    // Mostrar de nuevo el formulario
                    // No es necesario hacer nada, ya que el diálogo se cierra y el código continúa desde aquí
                }
            }
        });

        JButton cancelarButton = new JButton("Cancelar");
        gbc.gridx = 1;
        add(cancelarButton, gbc);
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Volver a mostrar el formulario
                textField.setText("");
                radioGroup.clearSelection();
                checkBox.setSelected(false);
                provinciaComboBox.setSelectedIndex(0);
                spinner.setValue(18);
            }
        });


        // Configuración de eventos

        // Eventos para los JRadioButtons
        masculinoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualitzarEspillSexe();
            }
        });

        femeninoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualitzarEspillSexe();
            }
        });

        radioButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualitzarEspillSexe();
            }
        });

        // Evento para el JCheckBox
        checkBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualitzarEspillCondicions();
            }
        });

        // Evento para el JTextField
        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                actualitzarEspillNom();
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // No es necesario implementar este método
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // No es necesario implementar este método
            }
        });

        // Evento para el JComboBox
        provinciaComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    actualitzarEspillProvincia();
                }
            }
        });

        // Evento para el JSpinner
        spinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                actualitzarEspillEdat();
            }
        });

        // Mostrar la ventana
        setVisible(true);
    }

    private void actualitzarEspillSexe() {
        // Obtener el sexo seleccionado
        String sexo = masculinoRadioButton.isSelected() ? "Masculino" :
                femeninoRadioButton.isSelected() ? "Femenino" :
                        radioButton3.isSelected() ? "Otro" : "";

        // Actualizar el espejo con el sexo
        espejoSexoLabel.setText("Sexo: " + sexo);
    }

    private void actualitzarEspillCondicions() {
        // Obtener el estado del CheckBox
        boolean condicionesAceptadas = checkBox.isSelected();

        // Actualizar el espejo con el estado del CheckBox
        espejoCondicionesLabel.setText("Condiciones aceptadas: " + (condicionesAceptadas ? "Sí" : "No"));
    }

    private void actualitzarEspillNom() {
        // Obtener el nombre introducido en el JTextField
        String nombre = textField.getText();

        // Actualizar el espejo con el nombre
        espejoNombreLabel.setText("Nombre: " + nombre);
    }

    private void actualitzarEspillProvincia() {
        // Obtener la provincia seleccionada en el JComboBox
        String provincia = (String) provinciaComboBox.getSelectedItem();

        // Actualizar el espejo con la provincia
        espejoProvinciaLabel.setText("Provincia: " + provincia);
    }

    private void actualitzarEspillEdat() {
        // Obtener la edad seleccionada en el JSpinner
        int edad = (int) spinner.getValue();

        // Actualizar el espejo con la edad
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
