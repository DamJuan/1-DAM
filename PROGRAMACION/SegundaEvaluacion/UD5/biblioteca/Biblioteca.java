package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private final ArrayList<MaterialPrestable> materiales;
    private final ArrayList<Usuario> usuarios;

    public Biblioteca() {
        materiales = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void agregarLibro(int id, String titulo, String autor) {
        materiales.add(new Libro(id, titulo, autor));
    }

    public void agregarPublicacion(int id, String titulo, String editorial) {
        materiales.add(new Publicacion(id, titulo, editorial));
    }

    public void agregarUsuario(int id, String nombre) {
        usuarios.add(new Usuario(id, nombre));
    }

    public void prestarMaterial(int codigoMaterial, int idUsuario) {
        for (MaterialPrestable material : materiales) {
            if (material instanceof Libro && material.esPrestable() && material.estaPrestado()) {
                Libro libro = (Libro) material;
                if (libro.getId() == codigoMaterial) {
                    for (Usuario usuario : usuarios) {
                        if (usuario.getId() == idUsuario) {
                            libro.prestar(usuario);
                            System.out.println("Se ha prestado el libro " + libro.getTitulo() + " al usuario " + usuario.getNombre());
                        }
                    }
                }
            } else if (material instanceof Publicacion && material.esPrestable() && material.estaPrestado()) {
                Publicacion publicacion = (Publicacion) material;
                if (publicacion.getId() == codigoMaterial) {
                    for (Usuario usuario : usuarios) {
                        if (usuario.getId() == idUsuario) {
                            publicacion.prestar(usuario);
                            System.out.println("Se ha prestado la publicación " + publicacion.getTitulo() + " al usuario " + usuario.getNombre());
                        }
                    }
                }
            }
        }
    }

    public void devolverMaterial(int codigoMaterial) {
        for (MaterialPrestable material : materiales) {
            if ((material instanceof Libro || material instanceof Publicacion) && material.estaPrestado()) {
                if (material instanceof Libro) {
                    Libro libro = (Libro) material;
                    if (libro.getId() == codigoMaterial) {
                        Usuario usuario = libro.devolver();
                        System.out.println("El libro " + libro.getTitulo() + " ha sido devuelto" + (usuario != null ? " por el usuario " + usuario.getNombre() : "."));
                    }
                } else if (material instanceof Publicacion) {
                    Publicacion publicacion = (Publicacion) material;
                    if (publicacion.getId() == codigoMaterial) {
                        Usuario usuario = publicacion.devolver();
                        System.out.println("La publicación " + publicacion.getTitulo() + " ha sido devuelta" + (usuario != null ? " por el usuario " + usuario.getNombre() : "."));
                    }
                }
            } else {
                System.out.println("No se puede devolver el material porque no está prestado.");
            }
        }
    }
}
