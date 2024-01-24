import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private World world;

    public GamePanel(World world) {
        this.world = world;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Escala del pixel art (ajusta según tus preferencias)
        int scale = 4;

        // Dibuja el fondo
        g2d.setColor(Color.BLACK);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        // Dibuja al jugador
        Player player = world.getPlayer();
        g2d.setColor(Color.BLUE);
        int playerSize = 30;
        g2d.fillRect(player.getX() * scale, player.getY() * scale, playerSize * scale, playerSize * scale);

        // Dibuja información del jugador
        g2d.setColor(Color.WHITE);
        g2d.setFont(new Font("Arial", Font.PLAIN, 14));
        g2d.drawString("Nombre: " + player.getName(), 10, 20);
        g2d.drawString("Clase: " + player.getPlayerClass().getClassName(), 10, 40);
        g2d.drawString("Salud: " + player.getPlayerClass().getBaseHealth(), 10, 60);

        // Dibuja el escenario actual
        Scene currentScene = world.getCurrentScene();
        g2d.setColor(Color.GREEN);
        g2d.fillRect(200 * scale, 200 * scale, 400 * scale, 300 * scale);

        // Dibuja los encuentros en el escenario
        for (int i = 0; i < currentScene.getEncounters().size(); i++) {
            Encounter encounter = currentScene.getEncounters().get(i);
            int x = 250 + i * 150;
            int y = 250;
            g2d.setColor(Color.RED);
            g2d.fillRect(x * scale, y * scale, 100 * scale, 100 * scale);
            g2d.setColor(Color.WHITE);
            g2d.drawString(encounter.getName(), x * scale + 10, y * scale + 20);
        }
    }
}
