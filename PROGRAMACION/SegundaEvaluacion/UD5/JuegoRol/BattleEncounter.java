public class BattleEncounter extends Encounter {
    public BattleEncounter(String enemyName) {
        super("Batalla contra " + enemyName);
    }

    @Override
    public void start(Player player) {
        // Implementar lógica de combate aquí
        System.out.println("¡Te encuentras en una batalla!");
        // ...
    }
}
