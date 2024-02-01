package practica.demo_vehiculo;

public class Coche extends IVehiculoMotor implements IRadio, Climatizador {

    private int numPuertas;
    private int numVentanas;
    private boolean packFumador;
    private String tipoTapiceria;

    public Coche(int nRuedas, int nAsientos) {
        super(nRuedas, nAsientos);
    }

    public void arrancar(){

    }
    public void detener(){

    }

    @Override
    public void encederAire() {

    }

    @Override
    public void apagarAire() {

    }

    @Override
    public void startRadio() {

    }

    @Override
    public void stopRadio() {

    }

    @Override
    public String toString() {
        return "Coche{" +
                "nRuedas=" + nRuedas +
                ", nAsientos=" + nAsientos +
                '}';
    }
}
