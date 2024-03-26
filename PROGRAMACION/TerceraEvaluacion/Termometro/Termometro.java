public class Termometro {
    private double temperatura;

    public Termometro() {
        this.temperatura = 0.0;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) throws TemperaturaFueraRangoException {
        if (temperatura < -192 || temperatura > 100) {
            throw new TemperaturaFueraRangoException("La temperatura debe estar entre -192 y 100 grados.");
        }
        this.temperatura = temperatura;
    }

    public static void main(String[] args) {
        Termometro termometro = new Termometro();

        try {
            termometro.setTemperatura(50);
            System.out.println("Temperatura actual: " + termometro.getTemperatura());

            termometro.setTemperatura(-200);
            System.out.println("Temperatura actual: " + termometro.getTemperatura());
        } catch (TemperaturaFueraRangoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
