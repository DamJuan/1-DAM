public abstract class PlayerClass {
    private String className;
    private int baseHealth;

    public PlayerClass(String className, int baseHealth) {
        this.className = className;
        this.baseHealth = baseHealth;
    }

    public String getClassName() {
        return className;
    }

    public int getBaseHealth() {
        return baseHealth;
    }
}