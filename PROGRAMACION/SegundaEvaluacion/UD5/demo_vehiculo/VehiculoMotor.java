package demo_vehiculo.juan;

import demo_vehiculo.juan.*;


/**
 * Libre configuración por los alumnos
 * por ejemplo:
 *  - extends Vehiculo
 *  - implements ABS y IRadio
 *  - Pero no implements GPS --> para eso crear otro que sea VehiculoMotorGps
 */
public class VehiculoMotor implements IVehiculoMotor {

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
