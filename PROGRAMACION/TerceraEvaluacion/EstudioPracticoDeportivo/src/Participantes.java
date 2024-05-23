import java.util.List;

public class Participantes {

    //atributos
    private String nombre;
    private int edad;
    private String Id;
    private List<Eventos> eventos;

    //El id es unico para cada participante

    //TODO AGREGAR NUEVOS PARTICIPANTES A LA LISTA DE PARTICIPANTES
    //TODO BUSCAR PARTICIPANTES POR ID
    //TODO SER CAPAZ DE LISTAR TODOS LOS PARTICIPANTES DE UN EVENTO DETERMINADO

    //constructor
    public Participantes(String nombre, int edad, String id, List<Eventos> eventos) {
        this.nombre = nombre;
        this.edad = edad;
        Id = id;
        this.eventos = eventos;
    }

    //getters y setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public List<Eventos> getEventos() {
        return eventos;
    }

    public void setEventos(List<Eventos> eventos) {
        this.eventos = eventos;
    }

    //metodo toString
    @Override
    public String toString() {
        return "Participantes{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", Id='" + Id + '\'' +
                ", eventos=" + eventos +
                '}';
    }

    //metodo hashCode
    @Override
    public int hashCode() {
        return Id.hashCode();
    }

    //metodo equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Participantes that = (Participantes) obj;
        return Id.equals(that.Id);
    }

    //metodo para agregar un evento a la lista de eventos de un participante
    public void agregarEvento(Eventos evento){
        eventos.add(evento);
    }
}
