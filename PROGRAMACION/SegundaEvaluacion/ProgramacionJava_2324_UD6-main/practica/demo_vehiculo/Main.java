package practica.demo_vehiculo;

import teoria.demo_vehiculo.IVehiculoMotor;

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
