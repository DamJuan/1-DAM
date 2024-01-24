import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PixelArtGame extends JFrame {

    private World world;
    private GamePanel gamePanel;

    public PixelArtGame() {
        setTitle("Pixel Art RPG");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);

        world = new World();
        Player player = createPlayer();
        world.setPlayer(player);

        gamePanel = new GamePanel(world);
        add(gamePanel);

        Timer timer = new Timer(16, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                world.update(); // Actualiza la lógica del juego
                gamePanel.repaint(); // Vuelve a dibujar el panel
            }
        });
        timer.start();
    }

    private Player createPlayer() {
        System.out.println("¡Bienvenido al mundo RPG!");
        String playerName = JOptionPane.showInputDialog("Ingresa el nombre de tu personaje:");
        int classChoice = JOptionPane.showOptionDialog(
                this,
                "Elige una clase para tu personaje:",
                "Selección de Clase",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Guerrero", "Mago", "Ladrón"},
                "Guerrero"
        );

        PlayerClass playerClass;
        switch (classChoice) {
            case 0:
                playerClass = new Warrior();
                break;
            case 1:
                playerClass = new Mage();
                break;
            case 2:
                playerClass = new Thief();
                break;
            default:
                throw new IllegalArgumentException("Clase no válida");
        }

        return new Player(playerName, playerClass);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PixelArtGame().setVisible(true);
            }
        });
    }
}
