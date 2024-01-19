package oovv;

public class Casa {
    private static final double MIN_SUPERFICIE = 43.5;
    private static int contadorCasas = 0;
    private String calle = "";
    private String poblacion = "";
    private int numero = 0;
    private double superficie = MIN_SUPERFICIE;
    private boolean ifGaraje = Boolean.FALSE;
    private int edad = 0;

    public Casa() {
        super();
    }

    public Casa(String calle, int numero, String poblacion, double superficie, boolean ifGaraje, int edad) {
        this.calle = calle;
        this.numero = numero;
        this.poblacion = poblacion;
        this.superficie = superficie;
        this.ifGaraje = ifGaraje;
        this.edad = edad;
        incrementarContCasas();
    }

    public Casa(String calle, int numero, String poblacion) {
        this();
        this.calle = calle;
        this.numero = numero;
        this.poblacion = poblacion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public boolean isIfGaraje() {
        return ifGaraje;
    }

    public void setIfGaraje(boolean ifGaraje) {
        this.ifGaraje = ifGaraje;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public String getDireccionCompleta() {

        String direccion = "";

        if (Qutil.esVocal(poblacion)) {

            direccion += "C/ " + calle + " nº " + numero + " d' " + poblacion;

        } else {
            direccion += "C/ " + calle + " nº " + numero + " de " + poblacion;
        }
        return direccion;
    }

    public String getInfo(String calle, int numero, String poblacion, double superficie, boolean ifGaraje, int edad) {
        String info = getDireccionCompleta();

        info += ", superficie: " + superficie + ", Tiene Garaje: " + ifGaraje + ", Edad: " + edad;

        return info;
    }


    public int getContadorCasas() {
        return contadorCasas;
    }

    public static void setContadorCasas(int contadorCasas) {
        Casa.contadorCasas = contadorCasas;
    }

    public static void incrementarContCasas() {
        contadorCasas++;
    }

    @Override
    public String toString() {
        return getInfo(getCalle(), getNumero(), getPoblacion(), getSuperficie(), isIfGaraje(), getEdad());
    }
}