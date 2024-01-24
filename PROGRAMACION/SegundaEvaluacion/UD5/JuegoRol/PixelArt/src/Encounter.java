import java.util.Random;

public abstract class Encounter {
    private String name;

    public Encounter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void start(Player player);

    public static Encounter getRandomEncounter() {
        Random random = new Random();
        int randomNum = random.nextInt(2);
        if (randomNum == 0) {
            return new BattleEncounter("Monstruo feroz");
        } else {
            return new PuzzleEncounter("Rompecabezas antiguo");
        }
    }
}