package ControlAcceso;

import java.util.ArrayList;

class Sistema {
    private ArrayList<Usuario> usuarios;

    public Sistema() {
        this.usuarios = new ArrayList<>();
    }

    public void cargarUsuarios() {
        usuarios.add(new Usuario("admin", "admin123"));
        usuarios.add(new Usuario("alumno", "alumno"));
        usuarios.add(new Usuario("antonio", "antonio"));
    }

    public Usuario validarAcceso(String nick, String contrasena) throws InvalidUserException {
        for (Usuario usuario : usuarios) {
            if (usuario.getNick().equals(nick) && usuario.validarContrasena(contrasena)) {
                usuario.permitirAcceso();
                return usuario;
            }
        }
        throw new InvalidUserException();
    }
}