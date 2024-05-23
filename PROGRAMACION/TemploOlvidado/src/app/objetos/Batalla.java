package app.objetos;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Batalla implements Serializable {

    //private static final Logger logger = LogManager.getLogger(Batalla.class);

    private List<Personaje> guardianes;
    private List<Personaje> ladrones;

    private boolean ganadaPorGuardianes;

    private String motivo;

    public Batalla(List<Personaje> guardianes, List<Personaje> ladrones) {
        this.guardianes = guardianes;
        this.ladrones = ladrones;
    }

    public boolean luchar() {
        List<Personaje> guardianesClone = new ArrayList<>(this.guardianes);
        List<Personaje> ladronesClone = new ArrayList<>(this.ladrones);

        int guardianesSize = guardianesClone.size();
        int numGanadas = 0;

        for (int i = 0; i < guardianesSize; i++) {
            Personaje guardian = guardianesClone.get(i);
            Personaje ladron = obtenerContrincante(guardian, ladronesClone);

            boolean guardianVencedor = esGuardianVencedor(guardian, ladron);
            if (guardianVencedor) {
                numGanadas++;
            }
            imprimirResultado(guardian, ladron, guardianVencedor);
        }

        if (numGanadas > (guardianesSize / 2)) {
            ganadaPorGuardianes = true;
        } else {
            ganadaPorGuardianes = false;
        }

        return ganadaPorGuardianes;
    }

    private void imprimirResultado(Personaje guardian, Personaje ladron, boolean guardianVencedor) {
        StringBuilder cadena = new StringBuilder();
        cadena.append("Guardián: ").append(guardian.getDatosParaVS()).append("\n");
        for (ObjetoMagico objeto : guardian.getObjetosMagicos()) {
            cadena.append("\t").append(objeto.getDatosParaVS()).append("\n");
        }
        cadena.append("vs ");
        cadena.append("\nLadrón: ").append(ladron.getDatosParaVS()).append("\n");
        for (ObjetoMagico objeto : ladron.getObjetosMagicos()) {
            cadena.append("\t").append(objeto.getDatosParaVS()).append("\n");
        }
        cadena.append(guardianVencedor ? "GUARDIÁN GANA" : "LADRÓN GANA ");
        cadena.append(" --> ").append(motivo).append("\n");
        System.out.println(cadena);
    }

    private boolean esGuardianVencedor(Personaje guardian, Personaje ladron) {
        int valorGuardian = calcularValorTotal(guardian);
        int valorLadron = calcularValorTotal(ladron);

        if (valorGuardian > valorLadron) {
            motivo = "El guardián tiene más valentía total.";
            return true;
        } else if (valorLadron > valorGuardian) {
            motivo = "El ladrón tiene más valentía total.";
            return false;
        } else {
            motivo = "Empate en valentía total, pero el ladrón gana por reglas del juego.";
            return false;
        }
    }

    private int calcularValorTotal(Personaje personaje) {
        int valorTotal = personaje.getValentia();
        for (ObjetoMagico objeto : personaje.getObjetosMagicos()) {
            valorTotal += objeto.getPoder();
        }
        return valorTotal;
    }

    private Personaje obtenerContrincante(Personaje personaje, List<Personaje> contrincantes) {
        return contrincantes.remove(0);
    }

    public boolean isGanadaPorGuardianes() {
        return ganadaPorGuardianes;
    }

    public void setGanadaPorGuardianes(boolean ganadaPorGuardianes) {
        this.ganadaPorGuardianes = ganadaPorGuardianes;
    }
}
