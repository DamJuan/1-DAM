package app.objetos;

public final class ObjetoMagico {

    private int id;
    private String atributo;
    private String nombre;
    private int poder;

    public ObjetoMagico(int id, String atributo, String nombre, int poder) {
        this.id = id;
        this.atributo = atributo;
        this.nombre = nombre;
        this.poder = poder;
    }

    public static ObjetoMagico crearInstanciaDeCSV(String linea) {
        String[] partes = linea.split(";");
        if (partes.length != 4) {
            return null;
        }
        try {
            int id = Integer.parseInt(partes[0]);
            String nombre = partes[1];
            String atributo = partes[2];
            int poder = Integer.parseInt(partes[3]);
            return new ObjetoMagico(id, atributo, nombre, poder);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public int getId() {
        return id;
    }

    public String getAtributo() {
        return atributo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPoder() {
        return poder;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ObjetoMagico{");
        sb.append("id=").append(id);
        sb.append(", atributo='").append(atributo).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", poder=").append(poder);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjetoMagico that = (ObjetoMagico) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public String getDatosParaVS() {
        return this.id + " -> " + this.nombre + ", " + this.atributo + ", " + this.poder;
    }
}
