import java.util.Comparator;

public class FiguraComparator implements Comparator<FiguraAbstracta>{
    @Override
    public int compare(FiguraAbstracta o1, FiguraAbstracta o2) {
        return Double.compare(o1.calularArea(), o2.calularArea());
    }
}