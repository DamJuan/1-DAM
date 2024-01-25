// Clase que representa una clase de jugador en el juego
package com.mygdx.game;

public class PlayerClass {
    private String className;
    private int baseHealth;
    private int baseAttack;
    private int baseDefense;

    public PlayerClass(String className, int baseHealth, int baseAttack, int baseDefense) {
        this.className = className;
        this.baseHealth = baseHealth;
        this.baseAttack = baseAttack;
        this.baseDefense = baseDefense;
    }

    public String getClassName() {
        return className;
    }

    public int getBaseHealth() {
        return baseHealth;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public int getBaseDefense() {
        return baseDefense;
    }
}
