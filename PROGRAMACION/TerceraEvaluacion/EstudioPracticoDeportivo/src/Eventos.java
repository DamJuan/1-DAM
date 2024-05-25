import java.util.List;

public class Eventos {
    //atributos
    private String nombre;
    private String fecha;
    private String ubicacion;
    private List<Eventos> categorias;


    //constructor
    public Eventos(String nombre, String fecha, String ubicacion, List<Eventos> categorias) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.categorias = categorias;
    }

    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Eventos> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Eventos> categorias) {
        this.categorias = categorias;
    }

    //metodo toString
    @Override
    public String toString() {
        return "Eventos{" +
                "nombre='" + nombre + '\'' +
                ", fecha='" + fecha + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", categorias=" + categorias +
                '}';
    }

    //metodo hashCode
    @Override
    public int hashCode() {
        return nombre.hashCode();
    }

    //metodo equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Eventos eventos = (Eventos) obj;
        return nombre.equals(eventos.nombre);
    }

    //metodo para agregar eventos
    public void agregarEvento(Eventos evento){
        if (evento != null){
            this.categorias.add(evento);
        }else {
            System.out.println("No se puede agregar un evento nulo");
        }
    }

    //metodo para buscar eventos por nombre
    public Eventos buscarEventoPorNombre(String nombre){
        for (Eventos evento : this.categorias){
            if (evento.getNombre().equals(nombre)){
                return evento;
            }
        }
        return null;
    }

    //metodo para buscar eventos por fecha

    public Eventos buscarEventoPorFecha(String fecha){
        for (Eventos evento : this.categorias){
            if (evento.getFecha().equals(fecha)){
                return evento;
            }
        }
        return null;
    }

    //metodo para listar eventos en una fecha determinada

    public List<Eventos> listarEventosPorFecha(String fecha){
        List<Eventos> eventosEnFecha = null;
        for (Eventos evento : this.categorias){
            if (evento.getFecha().equals(fecha)){
                eventosEnFecha.add(evento);
            }
        }
        return eventosEnFecha;
    }

}
