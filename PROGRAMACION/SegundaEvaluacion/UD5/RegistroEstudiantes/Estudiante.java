import java.util.ArrayList;
import java.util.List;

public class Estudiante {

    private String name;
    private int edad;
    private double notaPromedio;
    private List<String> cursando;


    public Estudiante(String name, int edad, double notaPromedio) {
        this.name = name;
        this.edad = edad;
        this.notaPromedio = notaPromedio;
        this.cursando = new ArrayList<>();
    }


    public boolean riesgoAcademico() {
        return notaPromedio < 60;
    }

    public List<String> obtenerCursos() {
        return cursando;
    }

    public void agregarCurso(String curso) {
        cursando.add(curso);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        this.notaPromedio = notaPromedio;
    }

    public List<String> getCursando() {
        return cursando;
    }

    public void setCursando(List<String> cursando) {
        this.cursando = cursando;
    }
}
