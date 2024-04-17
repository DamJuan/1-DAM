public class Empleat {
    public double calculaSalariBrut(String tipusEmpleat, double vendesMes, int horesExtra) throws MaException {
        if (tipusEmpleat == null || (!tipusEmpleat.equals("venedor") && !tipusEmpleat.equals("encarregat"))) {
            throw new MaException("El tipus d'empleat no és correcte");
        }

        if (vendesMes < 0 || horesExtra < 0) {
            throw new MaException("El valor no pot ser negatiu");
        }

        double salariBase;
        if (tipusEmpleat.equals("venedor")) {
            salariBase = 1000;
        } else {
            salariBase = 1500;
        }

        double prima = 0;
        if (vendesMes >= 1000 && vendesMes < 2500) {
            prima = 100;
        } else if (vendesMes >= 2500) {
            prima = 200;
        }

        double salariBrut = salariBase + prima + (horesExtra * 18.57);
        return salariBrut;
    }

    public double calculaSalariNet(double salariBrut) throws MaException {
        if (salariBrut < 0) {
            throw new MaException("El salario bruto no puede ser negativo");
        }

        double retencio;
        if (salariBrut <= 999) {
            retencio = 0;
        } else if (salariBrut <= 1500) {
            retencio = 0.16;
        } else {
            retencio = 0.20;
        }

        return salariBrut * (1 - retencio);
    }
}
