package practica.demo_vehiculo;

import practica.polimorfismo.angel_parking.GestionParking.VehiculoNoMotor;

public class VehiculoMotor extends Vehiculo implements IMotor, Transmision{

    public VehiculoMotor(int nRuedas, int nAsientos) {
        super(nRuedas, nAsientos);
    }

    @Override
    public float getMaxVel() {
        return 0;
    }

    @Override
    public void arrancar() {

    }

    @Override
    public void detener() {

    }

    @Override
    public void cambiarMarcha() {

    }

    @Override
    public void embragar() {

    }

    @Override
    public void cambiarModo() {

    }
}
