package demo_vehiculo.juan;

import demo_vehiculo.juan.*;


public interface IMotor {

    public static boolean esMasRapido(IMotor vehiculoMotor, IMotor vehiculoMotor2) {
        if (vehiculoMotor.getMaxVel() > vehiculoMotor2.getMaxVel()) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }


    default void consumoCombustible(){
        //TODO implementacion
    }

    float getMaxVel();

    void arrancar();

    void detener();

}
