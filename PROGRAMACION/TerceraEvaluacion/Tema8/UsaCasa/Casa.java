package oovv;

public class Casa {
    private static final double MIN_SUPERFICIE = 43.5;
    private static int comptadorCases;
    private String carrer;
    private String població;
    private int nombre;
    private double superficie;
    private boolean contieneGaraje;
    private int edadCasa;


    public Casa() {
        incrementaComptadorCases();
    }

    public Casa(String carrer, int nombre, String població, double superficie, boolean contieneGaraje, int edadCasa) {
        this(carrer, nombre, població);
        this.superficie = superficie;
        this.contieneGaraje = contieneGaraje;
        this.edadCasa = edadCasa;

        if (edadCasa < 0) {
            throw new IllegalArgumentException(String.format("Edad no válida: %f", edadCasa));
        }

        if (superficie < MIN_SUPERFICIE) {
            throw new IllegalArgumentException(String.format("Dimensiones no válidas: %f", superficie));
        }
    }

    public Casa(String carrer, int nombre, String població) {
        this();
        this.carrer = carrer;
        this.nombre = nombre;
        this.població = població;
    }

    public String getCarrer() {
        return carrer;
    }

    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public String getpoblació() {
        return població;
    }

    public void setpoblació(String població) {
        this.població = població;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public boolean isContieneGaraje() {
        return contieneGaraje;
    }

    public void setContieneGaraje(boolean contieneGaraje) {
        this.contieneGaraje = contieneGaraje;
    }

    public int getEdadCasa() {
        return edadCasa;
    }

    public void setEdadCasa(int edadCasa) {
        this.edadCasa = edadCasa;
    }

    public String getAdreçaCompleta() {
        return "C/ " + this.getCarrer() + " nº " + this.getNombre() + (Qutil.esVocal(població) ? " d'" : " de ") + this.getpoblació();
    }

    public String getInfo() {
        return getAdreçaCompleta() + " " + superficie + "m2 " + devolverGaraje(contieneGaraje) + " Antigüetat " + edadCasa;

    }

    public static int getComptadorCases() {
        return comptadorCases;
    }

    public void incrementaComptadorCases() {
        comptadorCases++;

    }

    public String devolverGaraje(boolean contieneGaraje) {
        if (!contieneGaraje) {
            return "te garatje";
        }
        return "no te garatje";
    }

    @Override
    public String toString() {
        return
                "C/" + carrer + '\'' +
                        " nº" + nombre +
                        " " + població + '\'' +
                        " superficie=" + superficie + "m² " + devolverGaraje(contieneGaraje) +
                        " edat=" + edadCasa + "anys";
    }
}