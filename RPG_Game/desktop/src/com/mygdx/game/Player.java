// Clase que representa a un jugador en el juego
package com.mygdx.game;

public class Player {
    private String name;
    private PlayerClass playerClass;
    private float x;
    private float y;

    public Player(String name, PlayerClass playerClass) {
        this.name = name;
        this.playerClass = playerClass;
        this.x = 0;
        this.y = 0;
    }

    public void displayStatus() {
        System.out.println("Nombre: " + name);
        System.out.println("Clase: " + playerClass.getClassName());
        System.out.println("Salud: " + playerClass.getBaseHealth());
        System.out.println("Posición: (" + x + ", " + y + ")");
    }

    public PlayerClass getPlayerClass() {
        return playerClass;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setPosition(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void displayQuests() {
        // Implementa la lógica de mostrar las misiones aquí
    }

    public void displayInventory() {
        // Implementa la lógica de mostrar el inventario aquí
    }
}
