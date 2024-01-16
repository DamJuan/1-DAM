package ControlAcceso;

import ControlAcceso.*;
import java.util.ArrayList;

class Sistema {
    private ArrayList<Usuario> usuarios;

    public Sistema() {
        this.usuarios = new ArrayList<>();
    }

    public void cargarUsuarios() {
        usuarios.add(new Usuario("admin", "admin123"));
        usuarios.add(new Usuario("usuario1", "pass123"));
        usuarios.add(new Usuario("usuario2", "pass456"));
    }

    public Usuario validarAcceso(String nick, String contrasena) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNick().equals(nick) && usuario.validarContrasena(contrasena)) {
                usuario.permitirAcceso();
                return usuario;
            }
        }
        return null;
    }
}