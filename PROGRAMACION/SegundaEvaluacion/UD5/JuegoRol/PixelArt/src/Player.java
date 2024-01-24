public class Player {
    private String name;
    private PlayerClass playerClass;
    private int x;  // Posición en el eje x
    private int y;  // Posición en el eje y

    public Player(String name, PlayerClass playerClass) {
        this.name = name;
        this.playerClass = playerClass;
        this.x = 0;  // Posición inicial en el eje x
        this.y = 0;  // Posición inicial en el eje y
    }

    public void displayStatus() {
        System.out.println("Nombre: " + name);
        System.out.println("Clase: " + playerClass.getClassName());
        System.out.println("Salud: " + playerClass.getBaseHealth());
        System.out.println("Posición: (" + x + ", " + y + ")");
        // Muestra más información del jugador según sea necesario
    }

    public PlayerClass getPlayerClass() {
        return playerClass;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void displayQuests() {
    }

    public void displayInventory() {
    }
}
