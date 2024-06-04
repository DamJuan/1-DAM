//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package app.utilidades;

import app.objetos.ObjetoMagico;
import java.util.Comparator;

public class PoderComparator implements Comparator<ObjetoMagico> {
    public PoderComparator() {
    }

    public int compare(ObjetoMagico o1, ObjetoMagico o2) {
        return Integer.compare(o1.getPoder(), o2.getPoder());
    }
}
