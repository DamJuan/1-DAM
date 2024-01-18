public class Quest {
    private String name;
    private String status; // Puede ser "En progreso", "Completada", etc.
    // Otros atributos y métodos según sea necesario

    public Quest(String name) {
        this.name = name;
        this.status = "En progreso";
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    // Otros métodos y atributos específicos de la misión
    // ...
}
