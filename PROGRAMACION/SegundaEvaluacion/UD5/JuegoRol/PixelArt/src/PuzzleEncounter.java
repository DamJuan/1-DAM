public class PuzzleEncounter extends Encounter {
    public PuzzleEncounter(String puzzleName) {
        super("Resolver " + puzzleName);
    }

    @Override
    public void start(Player player) {
        System.out.println("¡Te encuentras con un rompecabezas!");
        // Implementa la lógica de rompecabezas aquí
    }
}