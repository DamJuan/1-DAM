import java.util.ArrayList;
import java.util.List;

public class World {
    private Player player;
    private List<Scene> scenes;
    private int currentSceneIndex;

    public World() {
        this.scenes = initializeScenes();
        this.currentSceneIndex = 0;  // Inicia en el primer escenario
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void explore() {
        // Simulación de exploración de escenarios aquí
        Scene currentScene = getCurrentScene();
        currentScene.explore(player);
    }

    public void showPlayerStatus() {
        player.displayStatus();
    }

    public void showInventory() {
        player.displayInventory();
    }

    public void showQuests() {
        player.displayQuests();
    }

    public void showMap() {
        System.out.println("Mapa del Mundo:");
        // Implementar la visualización del mapa aquí
    }

    public Scene getCurrentScene() {
        return scenes.get(currentSceneIndex);
    }

    private List<Scene> initializeScenes() {
        List<Scene> scenes = new ArrayList<>();

        // Ejemplo de creación de escenarios. Puedes personalizar esto según tus necesidades.
        scenes.add(new Scene("Ciudad inicial"));
        scenes.add(new Scene("Bosque encantado"));
        scenes.add(new Scene("Cueva oscura"));

        return scenes;
    }

    public void update() {
    }
}
