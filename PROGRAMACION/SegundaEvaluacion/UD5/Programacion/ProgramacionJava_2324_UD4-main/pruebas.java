class Main {
    public class Bicicleta {

        protected int cadencia;
        private int marcha;
        private int velocidad;

        protected int getVelocidad() {
            return velocidad;
        }

        public void velocidadUp(int incremento) {
            velocidad += incremento;
        }
    }

    public class MountainBike extends Bicicleta { }
}
