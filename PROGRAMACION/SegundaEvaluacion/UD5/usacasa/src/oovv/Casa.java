package oovv;

public class Casa {

    private String calle;
    private int numero;
    private String poblacion;
    private double superficie;
    private boolean ifGaraje;
    private int edad;
    private static int contadorCasas = 0;

    private static final double minSuperficie = 43.5;


    public Casa() {
        incrementarContCasas();

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
        this.calle = calle;
        this.numero = numero;
        this.poblacion = poblacion;

        incrementarContCasas();
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


    public String getDireccionCompleta(String calle, int numero, String poblacion) {

        String direccion = "";


        if (Qutil.esVocal(poblacion)) {

            direccion += "C/ " + calle + " nº " + numero + " d' " + poblacion;

        } else {
            direccion += "C/ " + calle + " nº " + numero + " de " + poblacion;
        }
        return direccion;
    }

    public String getInfo(String calle, int numero, String poblacion, double superficie, boolean ifGaraje, int edad) {
        String info = getDireccionCompleta(calle, numero, poblacion);

        info += ", superficie: " + superficie + ", Tiene Garaje: " + ifGaraje + ", Edad: " + edad;

        return info;
    }


    public int getContadorCasas() {
        return contadorCasas;
    }

    public void setContadorCasas(int contadorCasas) {
        this.contadorCasas = contadorCasas;
    }

    public static void incrementarContCasas() {
        contadorCasas++;
        System.out.println("El numero de casas creadas es: " + contadorCasas);
    }

    @Override
    public String toString() {
        return getInfo(getCalle(), getNumero(), getPoblacion(), getSuperficie(), isIfGaraje(), getEdad());
    }
}