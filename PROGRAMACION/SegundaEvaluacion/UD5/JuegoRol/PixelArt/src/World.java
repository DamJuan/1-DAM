import java.util.ArrayList;
import java.util.List;

public class World {
    private Player player;
    private List<Scene> scenes;

    public World() {
        this.scenes = initializeScenes();
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void update() {
        // Lógica de actualización del mundo (por ejemplo, procesamiento de eventos, actualización de misiones, etc.)
    }

    private List<Scene> initializeScenes() {
        List<Scene> scenes = new ArrayList<>();
        // Implementa la creación de escenarios aquí (ciudades, bosques, cuevas, etc.)
        scenes.add(new Scene("Ciudad inicial"));
        scenes.add(new Scene("Bosque oscuro"));
        // ...

        return scenes;
    }
}
