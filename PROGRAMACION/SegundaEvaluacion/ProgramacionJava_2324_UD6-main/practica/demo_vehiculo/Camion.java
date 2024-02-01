package practica.demo_vehiculo;

import teoria.demo_vehiculo.IVehiculoMotor;

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
