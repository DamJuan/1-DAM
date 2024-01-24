public class Player {
    private String name;
    private PlayerClass playerClass;

    public Player(String name, PlayerClass playerClass) {
        this.name = name;
        this.playerClass = playerClass;
    }

    public void displayStatus() {
        System.out.println("Nombre: " + name);
        System.out.println("Clase: " + playerClass.getClassName());
        System.out.println("Salud: " + playerClass.getBaseHealth());
        // Muestra más información del jugador según sea necesario
    }

    public PlayerClass getPlayerClass() {
        return playerClass;
    }
}