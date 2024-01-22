import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JuegoTiraAflojaGUI extends JFrame {
    private int fuerzaJugador1 = 0;
    private int fuerzaJugador2 = 0;

    private JLabel labelJugador1;
    private JLabel labelJugador2;

    public JuegoTiraAflojaGUI() {
        setTitle("Juego de Tira y Afloja");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        labelJugador1 = new JLabel("Fuerza Jugador 1: 0");
        labelJugador2 = new JLabel("Fuerza Jugador 2: 0");

        JButton botonJugador1 = new JButton("Tirar Jugador 1");
        JButton botonJugador2 = new JButton("Tirar Jugador 2");

        botonJugador1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fuerzaJugador1 += generarFuerzaAleatoria();
                actualizarLabels();
            }
        });

        botonJugador2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fuerzaJugador2 += generarFuerzaAleatoria();
                actualizarLabels();
            }
        });

        add(labelJugador1, BorderLayout.NORTH);
        add(labelJugador2, BorderLayout.CENTER);
        add(botonJugador1, BorderLayout.WEST);
        add(botonJugador2, BorderLayout.EAST);

        setVisible(true);
    }

    private void actualizarLabels() {
        labelJugador1.setText("Fuerza Jugador 1: " + fuerzaJugador1);
        labelJugador2.setText("Fuerza Jugador 2: " + fuerzaJugador2);

        if (fuerzaJugador1 > fuerzaJugador2) {
            JOptionPane.showMessageDialog(this, "¡Jugador 1 gana!");
        } else if (fuerzaJugador2 > fuerzaJugador1) {
            JOptionPane.showMessageDialog(this, "¡Jugador 2 gana!");
        }
    }

    private int generarFuerzaAleatoria() {
        return (int) (Math.random() * 10) + 1;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JuegoTiraAflojaGUI();
            }
        });
    }
}
