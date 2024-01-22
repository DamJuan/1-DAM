import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Ejercicio7 extends JFrame {

    private JTextField numeroField;
    private JButton jugaButton;
    private JLabel resultadoLabel;

    public Ejercicio7() {
        setTitle("Juego de Adivinanza");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Campo de texto para el número
        numeroField = new JTextField();
        add(numeroField, BorderLayout.CENTER);

        // Botón para jugar
        jugaButton = new JButton("Jugar");
        add(jugaButton, BorderLayout.EAST);
        jugaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jugar();
            }
        });

        // Etiqueta para mostrar el resultado
        resultadoLabel = new JLabel("");
        add(resultadoLabel, BorderLayout.SOUTH);

        // Menú emergente al hacer clic derecho en el campo de texto
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem generarAleatorioItem = new JMenuItem("Generar Aleatorio");
        generarAleatorioItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generarNumeroAleatorio();
            }
        });
        popupMenu.add(generarAleatorioItem);

        numeroField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    popupMenu.show(numeroField, e.getX(), e.getY());
                }
            }
        });

        setVisible(true);
    }

    private void jugar() {
        try {
            int numeroUsuario = Integer.parseInt(numeroField.getText());
            int numeroAleatorio = generarNumeroAleatorio();

            if (numeroUsuario == numeroAleatorio) {
                resultadoLabel.setText("¡Felicidades! Has adivinado el número.");
            } else {
                resultadoLabel.setText("Lo siento, intenta de nuevo.");
            }
        } catch (NumberFormatException ex) {
            resultadoLabel.setText("Por favor, ingresa un número válido.");
        }
    }

    private int generarNumeroAleatorio() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(10) + 1; // Número aleatorio entre 1 y 10
        resultadoLabel.setText(""); // Limpiar la etiqueta de resultado
        return numeroAleatorio;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ejercicio7();
            }
        });
    }
}
