import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Scene {
    private String name;
    private List<Encounter> encounters;

    public Scene(String name) {
        this.name = name;
        this.encounters = initializeEncounters();
    }

    public String getName() {
        return name;
    }

    public void explore(Player player) {
        System.out.println("Explorando " + name + "...");
        // Implementa la lógica de exploración y encuentros aleatorios aquí
        Encounter randomEncounter = getRandomEncounter();
        randomEncounter.start(player);
    }

    private List<Encounter> initializeEncounters() {
        List<Encounter> encounters = new ArrayList<>();
        // Implementa la creación de encuentros aquí
        encounters.add(new BattleEncounter("Monstruo feroz"));
        encounters.add(new PuzzleEncounter("Rompecabezas antiguo"));
        // ...

        return encounters;
    }

    private Encounter getRandomEncounter() {
        Random random = new Random();
        int index = random.nextInt(encounters.size());
        return encounters.get(index);
    }
}
