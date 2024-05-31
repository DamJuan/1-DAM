package app.objetos;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.TreeSet;


public class Batalla {

    private TreeSet<Personaje> guardianes;
    private TreeSet<Personaje> ladrones;

    private TreeSet<Personaje> guardianesClone;
    private TreeSet<Personaje> ladronesClone;

    private static final Logger LOGGER = LogManager.getRootLogger();

    private boolean ganadaPorGuardianes;

    private String motivo;

    public Batalla(List<Personaje> guardianes, List<Personaje> ladrones) {
        this.guardianes = new TreeSet<>();
        this.ladrones = new TreeSet<>();
    }

    public void addGuardian(Personaje guardian) {
        guardianes.add(guardian);
    }

    public void addLadron(Personaje ladron) {
        ladrones.add(ladron);
    }

    public Personaje obtenerContrincante(Personaje personaje, TreeSet<Personaje> contrincantes) {

        for (Personaje contrincante : contrincantes) {
            if (personaje.getValentia() == contrincante.getValentia()) {
                return contrincante;
            }
        }

        return contrincantes.pollFirst();
    }

    public boolean luchar() {

        guardianesClone = (TreeSet<Personaje>) guardianes.clone();
        ladronesClone = (TreeSet<Personaje>) ladrones.clone();
        ganadaPorGuardianes = Boolean.FALSE;

        int guardianesSize = guardianesClone.size();
        int numGanadas = 0;

        for (int i = 0; i < guardianesSize; i++) {
            Personaje guardian = guardianesClone.pollFirst();
            Personaje ladron = obtenerContrincante(guardian, ladronesClone);

            boolean guardianVencedor = esGuardianVencedor(guardian, ladron);
            if (guardianVencedor) {
                numGanadas++;
            }
            imprimirResultado(guardian, ladron, guardianVencedor);
        }


        if (numGanadas > guardianesSize / 2) {
            ganadaPorGuardianes = Boolean.TRUE;
        } else {
            ganadaPorGuardianes = Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    private void imprimirResultado(Personaje guardian, Personaje ladron, boolean guardianVencedor) {
        StringBuilder cadena = new StringBuilder();
        cadena.append("Guardián: " + guardian.getDatosParaVS()).append("\n");
        for (ObjetoMagico objeto : guardian.getObjetosMagicos()) {
            cadena.append("\t" + objeto.getDatosParaVS()).append("\n");
        }
        cadena.append("vs ");
        cadena.append("\nLadrón: " + ladron.getDatosParaVS()).append("\n");
        for (ObjetoMagico objeto : ladron.getObjetosMagicos()) {
            cadena.append("\t" + objeto.getDatosParaVS()).append("\n");
        }
        cadena.append(guardianVencedor ? "GUARDIÁN GANA" : "LADRÓN GANA ");
        cadena.append(" --> ").append(motivo).append("\n");
        System.out.println(cadena);
    }

    private boolean esGuardianVencedor(Personaje guardian, Personaje ladron) {
        int poderGuardian = guardian.getValentia();
        int poderLadron = ladron.getValentia();
        for (ObjetoMagico objeto : guardian.getObjetosMagicos()) {
            poderGuardian += objeto.getPoder();
        }
        for (ObjetoMagico objeto : ladron.getObjetosMagicos()) {
            poderLadron += objeto.getPoder();
        }

        if (poderGuardian > poderLadron) {
            motivo = "Mayor poder";
            return Boolean.TRUE;
        } else if (poderGuardian < poderLadron) {
            motivo = "Menor poder";
            return Boolean.FALSE;
        } else {
            motivo = "Empate";
            return Boolean.FALSE;
        }

    }


    public boolean isGanadaPorGuardianes() {
        return ganadaPorGuardianes;
    }

}