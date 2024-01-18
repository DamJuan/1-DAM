import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class World {
    private Player player;
    private List<Scene> scenes;

    public World() {
        this.scenes = initializeScenes();
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void explore() {
        System.out.println("Explorando...");
        Encounter randomEncounter = getRandomEncounter();
        System.out.println("Te encuentras con: " + randomEncounter.getName());
        randomEncounter.start(player);
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

    private List<Scene> initializeScenes() {
        List<Scene> scenes = new ArrayList<>();
        // Agrega escenarios, por ejemplo:
        scenes.add(new Scene("Ciudad inicial"));
        scenes.add(new Scene("Bosque oscuro"));
        // ...

        return scenes;
    }

    private static Encounter getRandomEncounter() {
        Random random = new Random();
        int randomNum = random.nextInt(2);
        return (randomNum == 0) ? new BattleEncounter("Monstruo feroz") : new PuzzleEncounter("Rompecabezas antiguo");
    }
}
