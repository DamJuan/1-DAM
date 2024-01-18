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
        int randomNum = random.nextInt(getNumberOfEncounterTypes());

        switch (randomNum) {
            case 0:
                return new BattleEncounter("Monstruo feroz");
            case 1:
                return new PuzzleEncounter("Rompecabezas antiguo");
            // Agrega más casos según sea necesario para otros tipos de encuentros
            default:
                throw new IllegalStateException("Tipo de encuentro no manejado");
        }
    }

    // Método que indica el número total de tipos de encuentros disponibles
    private static int getNumberOfEncounterTypes() {
        return 2; // Ajusta según el número real de tipos de encuentros
    }
}
