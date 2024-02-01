package demo_vehiculo.juan;

import demo_vehiculo.juan.*;

public class Camion extends Vehiculo implements IVehiculoMotor {

    public Camion(int nRuedas, int nAsientos) {
        super(nRuedas, nAsientos);
    }

    @Override
    public void arrancar() {

    }

    @Override
    public void detener() {

    }

    @Override
    public float getMaxVel() {
        return 0;
    }
}
