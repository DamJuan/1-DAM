package practica.demo_vehiculo;

public class IVehiculoMotor extends Vehiculo implements IMotor, ITransmision {

    public IVehiculoMotor(int nRuedas, int nAsientos) {
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
