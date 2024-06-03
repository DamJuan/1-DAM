//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package app.objetos;

import app.utilidades.Utils;
import java.io.Serializable;
import java.util.Iterator;
import java.util.TreeSet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Batalla implements Serializable {
    private static final Logger LOGGER = LogManager.getRootLogger();
    private TreeSet<Personaje> guardianes;
    private TreeSet<Personaje> ladrones;
    private boolean ganadaPorGuardianes;
    private transient String motivo;

    public Batalla(TreeSet<Personaje> guardianes, TreeSet<Personaje> ladrones) {
        this.guardianes = guardianes;
        this.ladrones = ladrones;
    }

    public boolean luchar() {
        TreeSet<Personaje> guardianesClone = (TreeSet)this.guardianes.clone();
        TreeSet<Personaje> ladronesClone = (TreeSet)this.ladrones.clone();
        int guardianesSize = guardianesClone.size();
        int numGanadas = 0;

        for(int i = 0; i < guardianesSize; ++i) {
            Personaje guardian = (Personaje)guardianesClone.pollFirst();
            Personaje ladron = this.obtenerContrincante(guardian, ladronesClone);
            if (guardian == null || ladron == null) {
                LOGGER.error("Error al obtener los contrincantes. Alguno de ellos es nulo");
                return Boolean.FALSE;
            }

            boolean guardianVencedor = this.esGuardianVencedor(guardian, ladron);
            if (guardianVencedor) {
                guardian.setEsGanador(Boolean.TRUE);
                ++numGanadas;
            }

            this.imprimirResultado(guardian, ladron, guardianVencedor);
        }

        if (numGanadas >= guardianesSize / 2 + guardianesSize % 2) {
            this.ganadaPorGuardianes = Boolean.TRUE;
        } else {
            this.ganadaPorGuardianes = Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    private void imprimirResultado(Personaje guardian, Personaje ladron, boolean guardianVencedor) {
        StringBuilder cadena = new StringBuilder();
        cadena.append("Guardián: " + guardian.getDatosParaVS()).append("\n");
        Iterator var5 = guardian.getObjetosMagicos().iterator();

        ObjetoMagico objeto;
        while(var5.hasNext()) {
            objeto = (ObjetoMagico)var5.next();
            cadena.append("\t" + objeto.getDatosParaVS()).append("\n");
        }

        cadena.append("vs ");
        cadena.append("\nLadrón: " + ladron.getDatosParaVS()).append("\n");
        var5 = ladron.getObjetosMagicos().iterator();

        while(var5.hasNext()) {
            objeto = (ObjetoMagico)var5.next();
            cadena.append("\t" + objeto.getDatosParaVS()).append("\n");
        }

        cadena.append(guardianVencedor ? "GUARDIÁN GANA" : "LADRÓN GANA ");
        cadena.append(" --> ").append(this.motivo).append("\n");
        System.out.println(cadena);
    }

    private boolean esGuardianVencedor(Personaje guardian, Personaje ladron) {
        if (guardian.tieneObjetosDeAtributo() && !ladron.tieneObjetosDeAtributo()) {
            this.motivo = "El ladrón no tiene objetos de su atributo y guardián sí";
            return Boolean.TRUE;
        } else if (!guardian.tieneObjetosDeAtributo() && ladron.tieneObjetosDeAtributo()) {
            this.motivo = "El guardián no tiene objetos de su atributo y ladrón sí";
            return Boolean.FALSE;
        } else {
            return guardian.tieneObjetosDeAtributo() && ladron.tieneObjetosDeAtributo() ? this.lucharConObjetosDeAtributo(guardian, ladron) : this.lucharSinObjetosDeAtributo(guardian, ladron);
        }
    }

    private boolean lucharConObjetosDeAtributo(Personaje guardian, Personaje ladron) {
        int poderGuardian = guardian.getPoderObjetosDeAtributo();
        int poderLadron = ladron.getPoderObjetosDeAtributo();
        if (poderGuardian > poderLadron) {
            this.motivo = "El guardián tiene más poder de objetos de su atributo";
            return Boolean.TRUE;
        } else if (poderGuardian < poderLadron) {
            this.motivo = "El ladrón tiene más poder de objetos de su atributo";
            return Boolean.FALSE;
        } else {
            int numGuardian = guardian.getNumObjetosDeAtributo();
            int numLadron = ladron.getNumObjetosDeAtributo();
            if (numGuardian > numLadron) {
                this.motivo = "El guardián tiene más objetos de su atributo";
                return Boolean.TRUE;
            } else if (numGuardian < numLadron) {
                this.motivo = "El ladrón tiene más objetos de su atributo";
                return Boolean.FALSE;
            } else {
                poderGuardian += Utils.generaNumeroDesempate();
                if (poderGuardian > poderLadron) {
                    this.motivo = "El guardián ha ganado el desempate, con objetos de su atributo";
                    return Boolean.TRUE;
                } else {
                    this.motivo = "El ladrón ha ganado el desempate, con objetos de su atributo";
                    return Boolean.FALSE;
                }
            }
        }
    }

    private boolean lucharSinObjetosDeAtributo(Personaje guardian, Personaje ladron) {
        int poderGuardian = guardian.getPoderTotalObjetos() + guardian.getValentia();
        int poderLadron = ladron.getPoderTotalObjetos() + ladron.getValentia();
        if (poderGuardian > poderLadron) {
            this.motivo = "El guardián tiene más poder total";
            return Boolean.TRUE;
        } else if (poderGuardian < poderLadron) {
            this.motivo = "El ladrón tiene más poder total";
            return Boolean.FALSE;
        } else {
            poderGuardian += Utils.generaNumeroDesempate();
            if (poderGuardian > poderLadron) {
                this.motivo = "El guardián ha ganado el desempate, sin objetos de su atributo";
                return Boolean.TRUE;
            } else {
                this.motivo = "El ladrón ha ganado el desempate, sin objetos de su atributo";
                return Boolean.FALSE;
            }
        }
    }

    private Personaje obtenerContrincante(Personaje guardian, TreeSet<Personaje> ladronesClone) {
        Personaje ladronSelected = null;
        Iterator var4 = ladronesClone.iterator();

        while(var4.hasNext()) {
            Personaje ladron = (Personaje)var4.next();
            if (guardian.getClase().equals(ladron.getClase())) {
                ladronSelected = ladron;
                break;
            }
        }

        if (ladronSelected == null) {
            ladronSelected = (Personaje)ladronesClone.pollFirst();
        } else {
            ladronesClone.remove(ladronSelected);
        }

        return ladronSelected;
    }

    public TreeSet<Personaje> getGuardianes() {
        return this.guardianes;
    }

    public void setGuardianes(TreeSet<Personaje> guardianes) {
        this.guardianes = guardianes;
    }

    public TreeSet<Personaje> getLadrones() {
        return this.ladrones;
    }

    public void setLadrones(TreeSet<Personaje> ladrones) {
        this.ladrones = ladrones;
    }

    public boolean isGanadaPorGuardianes() {
        return this.ganadaPorGuardianes;
    }

    public void setGanadaPorGuardianes(boolean ganadaPorGuardianes) {
        this.ganadaPorGuardianes = ganadaPorGuardianes;
    }
}
