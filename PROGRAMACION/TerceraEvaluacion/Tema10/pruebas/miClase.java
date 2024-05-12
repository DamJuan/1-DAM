import java.util.Objects;

public class miClase {
    int num;
    String txt;

    public miClase() {
        this.num = 0;
        this.txt = "";
    }

    public miClase(int num, String txt) {
        this.num = num;
        this.txt = txt;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    @Override
    public String toString() {
        return "miClase{" +
                "num=" + num +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(num);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        miClase miClase = (miClase) o;
        return num == miClase.num;
    }
}
