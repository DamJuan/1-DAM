import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Galaxia extends JPanel {
    private static final int NUM_ESTRELLAS = 600;
    private int[] posX;
    private int[] posY;
    private Image capyImg; // La imagen de la capibara
    private Image capyGif; // La imagen de la capibara


    private Timer timer;

    public Galaxia() {

        cargarImagen();
        cargarGIF();
        generarEstrellas();

        timer = new Timer(50, e -> moverEstrellas());
        timer.start();
    }

    private void cargarImagen() {
        // Cargar la imagen desde el archivo
        capyImg = new ImageIcon("capy.png").getImage();
    }

    private void cargarGIF() {
        // Cargar la imagen desde el archivo
        capyGif = new ImageIcon("nadando.gif").getImage();
    }

    private void generarEstrellas() {
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }

        posX = new int[NUM_ESTRELLAS];
        posY = new int[NUM_ESTRELLAS];
        Random rand = new Random();
        for (int i = 0; i < NUM_ESTRELLAS; i++) {
            posX[i] = rand.nextInt(getWidth());
            posY[i] = rand.nextInt(getHeight());
        }
    }

    private void moverEstrellas() {
        if (posX == null || posY == null) {
            generarEstrellas();
            return;
        }

        Random rand = new Random();
        for (int i = 0; i < NUM_ESTRELLAS; i++) {
            posX[i] = (posX[i] + rand.nextInt(3) - 1 + getWidth()) % getWidth();
            posY[i] = (posY[i] + rand.nextInt(3) - 1 + getHeight()) % getHeight();
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK); // Fondo negro para simular el espacio vacío
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.WHITE); // Color de las estrellas

        if (posX == null || posY == null) {
            generarEstrellas();
        }

        for (int i = 0; i < NUM_ESTRELLAS; i++) {
            g.fillRect(posX[i], posY[i], 2, 2); // Dibuja estrellas pequeñas
        }

        if (capyImg != null) {
            g.drawImage(capyImg, 100, 100, this); // Cambia las coordenadas según sea necesario
        }

        if (capyGif != null) {
            g.drawImage(capyGif, 800, 800, this); // Cambia las coordenadas según sea necesario
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame ventana = new JFrame("Galaxia en 2D");
            Galaxia galaxiaPanel = new Galaxia();
            ventana.add(galaxiaPanel);
            ventana.setSize(1920, 1080);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setVisible(true);
        });
    }
}
