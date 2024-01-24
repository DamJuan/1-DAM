public class BattleEncounter extends Encounter {
    public BattleEncounter(String enemyName) {
        super("Batalla contra " + enemyName);
    }

    @Override
    public void start(Player player) {
        System.out.println("¡Te encuentras en una batalla!");
        // Implementa la lógica de combate aquí
    }
}