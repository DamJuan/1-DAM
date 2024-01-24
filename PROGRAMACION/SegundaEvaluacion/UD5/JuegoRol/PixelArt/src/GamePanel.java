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

        // Dibuja tu pixel art y otros elementos gráficos aquí
        // Puedes acceder a la información del mundo para obtener datos del juego (jugador, escenario, etc.)
        // Ejemplo: Player player = world.getPlayer();
        //         g.drawImage(player.getImage(), player.getX(), player.getY(), null);
    }
}
