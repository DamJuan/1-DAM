package demo_vehiculo.juan;

import demo_vehiculo.juan.*;

public class Moto extends Vehiculo implements IVehiculoMotor {

    private boolean tieneSidecar = Boolean.FALSE;
    public Moto(int nRuedas, int nAsientos){
        super(nRuedas, nAsientos);
    }
    @Override
    public void arrancar() {

    }

    @Override
    public void detener() {

    }

    @Override
    public void consumoCombustible() {
        IVehiculoMotor.super.consumoCombustible();
    }

    @Override
    public float getMaxVel() {
        return 0;
    }

    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
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

