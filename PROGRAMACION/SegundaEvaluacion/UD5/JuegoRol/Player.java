import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private PlayerClass playerClass;
    private int level;
    private int experience;
    private int health;
    private List<Item> inventory;
    private List<Quest> quests;

    public Player(String name, PlayerClass playerClass) {
        this.name = name;
        this.playerClass = playerClass;
        this.level = 1;
        this.experience = 0;
        this.health = playerClass.getBaseHealth();
        this.inventory = new ArrayList<>();
        this.quests = new ArrayList<>();
    }

    public void displayStatus() {
        System.out.println("Nombre: " + name);
        System.out.println("Clase: " + playerClass.getClassName());
        System.out.println("Nivel: " + level);
        System.out.println("Experiencia: " + experience);
        System.out.println("Salud: " + health);
    }

    public void displayInventory() {
        System.out.println("Inventario:");
        for (Item item : inventory) {
            System.out.println("- " + item.getName());
        }
    }

    public void displayQuests() {
        System.out.println("Misiones:");
        for (Quest quest : quests) {
            System.out.println("- " + quest.getName() + " (" + quest.getStatus() + ")");
        }
    }

    // Métodos para subir de nivel, ganar experiencia, etc.
    // ...

    // Métodos para gestionar el inventario y las misiones
    // ...
}
