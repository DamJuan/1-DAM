package practica.demo_vehiculo;

import teoria.demo_vehiculo.IVehiculoMotor;

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
    public float getMaxVel() {
        return 0;
    }

    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }
}

