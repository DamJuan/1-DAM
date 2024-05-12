import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class Sistema {
    private ArrayList<Usuario> usuarios;

    public Sistema() {
        this.usuarios = new ArrayList<>();
    }

    public void cargarUsuarios() {
        try (BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datosUsuario = linea.split(",");
                String nick = datosUsuario[0];
                String contrasena = datosUsuario[1];
                usuarios.add(new Usuario(nick, contrasena));
            }
        } catch (IOException e) {
            System.err.println("Error al cargar los usuarios: " + e.getMessage());
        }
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
