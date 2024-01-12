package CajaAventura;

import CajaAventura.*;

// Clase Weapon (Arma)
public class Weapon {

    // Crear objetos de armas
    Weapon sword = new Weapon("Espada", 15, "pesada", 1.1);
    Weapon dagger = new Weapon("Daga", 8, "ligera", 1.5);
    Weapon axe = new Weapon("Hacha", 20, "pesada", 0.9);
    Weapon nunchucks = new Weapon("Nunchacus", 12, "ligera", 1.3);
    Weapon woodenSword = new Weapon("Espada de madera", 10, "pesada", 1.1);
    Weapon woodenAxe = new Weapon("Hacha de madera", 14, "pesada", 0.9);


    private String name;
    private int damage;
    private String type; // Puede ser "ligera" o "pesada"
    private double attackSpeed; // Velocidad de ataque

    // Constructor
    public Weapon(String name, int damage, String type, double attackSpeed) {
        this.name = name;
        this.damage = damage;
        this.type = type;
        this.attackSpeed = attackSpeed;
    }

    // Métodos getter para acceder a los atributos
    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public String getType() {
        return type;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public String getWeaponDetails() {
        return "Nombre: " + name + "\n" +
                "Daño: " + damage + "\n" +
                "Tipo: " + type + "\n" +
                "Velocidad de Ataque: " + attackSpeed;
    }
}
