public class PuzzleEncounter extends Encounter {
    public PuzzleEncounter(String puzzleName) {
        super("Resolver " + puzzleName);
    }

    @Override
    public void start(Player player) {
        // Implementar lógica de rompecabezas aquí
        System.out.println("¡Te encuentras con un rompecabezas!");
        // ...
    }
}
