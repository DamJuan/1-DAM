import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Biblioteca {

    private Map<String, Libro> libros;
    private Map<String, Usuario> usuarios;

    //constructor
    public Biblioteca(Map<String, Libro> libros, Map<String, Usuario> usuarios) {
        this.libros = libros;
        this.usuarios = usuarios;
    }

    //getters
    public Map<String, Libro> getLibros() {
        return libros;
    }

    public Map<String, Usuario> getUsuarios() {
        return usuarios;
    }

    //setters

    public void setLibros(Map<String, Libro> libros) {
        this.libros = libros;
    }

    public void setUsuarios(Map<String, Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    //toString

    @Override
    public String toString() {
        return "Libros: " + libros + "\nUsuarios: " + usuarios;
    }

    //equals

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Biblioteca biblioteca = (Biblioteca) obj;
        return this.libros.equals(biblioteca.getLibros()) && this.usuarios.equals(biblioteca.getUsuarios());
    }

    @Override
    public int hashCode() {
        return libros.hashCode() + usuarios.hashCode();
    }

    //metodos

    public void agregarLibro(Libro libro) throws LibroYaRegistradoException {
        if (libros.containsKey(libro.getIsbn())) {
            throw new LibroYaRegistradoException("El libro con ISBN " + libro.getIsbn() + " ya se encuentra registrado");
        }
        libros.put(libro.getIsbn(), libro);
    }

    public void eliminarLibro(String isbn) {
        if (!libros.containsKey(isbn)) {
            System.out.println("El libro con ISBN " + isbn + " no se encuentra registrado");
        }
        libros.remove(isbn);
    }

    public void agregarUsuario(Usuario usuario) {
        if (usuarios.containsKey(usuario.getId())) {
            System.out.println("El usuario con ID " + usuario.getId() + " ya se encuentra registrado");
        }
        usuarios.put(usuario.getId(), usuario);

    }

    public void eliminarUsuario(String id) throws UsuarioNoRegistradoException {
        if (!usuarios.containsKey(id)) {
            throw new UsuarioNoRegistradoException("El usuario con ID " + id + " no se encuentra registrado");
        }
        usuarios.remove(id);

    }

    public void devolverLibro(Libro idUsuario, Usuario isbn) throws LibroNoDisponibleException {
        Usuario usuario = usuarios.get(idUsuario);
        Libro libro = libros.get(isbn);

        if (usuario == null) {
            throw new LibroNoDisponibleException("El usuario con ID " + idUsuario + " no se encuentra registrado");
        }

        if (libro == null) {
            throw new LibroNoDisponibleException("El libro con ISBN " + isbn + " no se encuentra registrado");
        }

        if (libro != null) {
            if (!libro.getDisponibilidad()) {
                libro.setDisponibilidad(true);
                usuario.getLibrosPrestados().remove(libro);
            } else {
                throw new LibroNoDisponibleException("El libro con ISBN " + isbn + " no se encuentra prestado");
            }

        }

    }


        public void prestarLibro (Libro idUsuario, Usuario isbn) throws LibroNoDisponibleException {

            Usuario usuario = usuarios.get(idUsuario);
            Libro libro = libros.get(isbn);

            if (usuario == null) {
                throw new LibroNoDisponibleException("El usuario con ID " + idUsuario + " no se encuentra registrado");
            }

            if (libro == null) {
                throw new LibroNoDisponibleException("El libro con ISBN " + isbn + " no se encuentra registrado");
            }

            if (libro != null) {
                if (libro.getDisponibilidad()) {
                    libro.setDisponibilidad(false);
                    usuario.getLibrosPrestados().add(libro);
                } else {
                    throw new LibroNoDisponibleException("El libro con ISBN " + isbn + " no se encuentra disponible");
                }

            }

        }

        public List<Libro> buscarLibroPorTitulo (String titulo){
            List<Libro> librosEncontrados = new ArrayList<>();
            for (Libro l : libros.values()) {
                if (l.getTitulo().equals(titulo)) {
                    librosEncontrados.add(l);
                }
            }
            return librosEncontrados.isEmpty() ? Collections.emptyList() : librosEncontrados;
        }

        public List<Libro> mostrarLibrosDisponibles () {
            List<Libro> librosDisponibles = new ArrayList<>();
            for (Libro l : libros.values()) {
                if (l.getDisponibilidad()) {
                    librosDisponibles.add(l);
                }
            }
            return librosDisponibles;
        }

        public List<Libro> mostrarLibrosPrestados () {
            List<Libro> librosPrestados = new ArrayList<>();
            for (Libro l : libros.values()) {
                if (!l.getDisponibilidad()) {
                    librosPrestados.add(l);
                }
            }
            return librosPrestados;
        }

        public void mostrarEstado () {
            System.out.println("Libros disponibles:");
            for (Libro l : mostrarLibrosDisponibles()) {
                System.out.println(l);
            }
            System.out.println("Libros prestados:");
            for (Libro l : mostrarLibrosPrestados()) {
                System.out.println(l);
            }
            System.out.println("Usuarios:");
            for (Usuario u : usuarios.values()) {
                System.out.println(u);
            }
        }

        public void buscarLibro (String titulo){
            List<Libro> librosEncontrados = buscarLibroPorTitulo(titulo);
            if (librosEncontrados.isEmpty()) {
                System.out.println("No se encontraron libros con el título " + titulo);
            } else {
                for (Libro l : librosEncontrados) {
                    System.out.println(l);
                }
            }
        }


    }
