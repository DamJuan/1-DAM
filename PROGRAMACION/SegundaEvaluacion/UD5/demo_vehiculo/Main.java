package demo_vehiculo.juan;

import demo_vehiculo.juan.*;


public class Main {
    public static void main(String[] args) {
        Coche mio = new Coche(4, 5);
        Starter.startEngine((IVehiculoMotor) mio);

        Moto tuya = new Moto(2, 2);
        Starter.startEngine(tuya);

        Vehiculo suyo = new Moto(2, 2);
        Starter.startEngine((Moto) suyo);


    }
}
