package ControlAcceso;

import ControlAcceso.*;
import ControlAcceso.*;
import java.util.ArrayList;

class Sistema {
    private ArrayList<Usuario> usuarios;

    public Sistema() {
        this.usuarios = new ArrayList<>();
    }

    public void cargarUsuarios() {
        // Simulación de carga de usuarios por el administrador
        // En una aplicación real, esta información se cargaría desde una base de datos u otro almacenamiento persistente
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