import java.io.*;
import java.util.ArrayList;

class Sistema {
    private ArrayList<Usuario> usuarios;

    public Sistema() {
        this.usuarios = new ArrayList<>();
    }

    public void cargarUsuarios() {
        try (BufferedReader br = new BufferedReader(new FileReader("usuarios.csv"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datosUsuario = linea.split(",");
                String nick = datosUsuario[0];
                String contrasena = datosUsuario[1];
                usuarios.add(new Usuario(nick, contrasena, datosUsuario[2], datosUsuario[3], datosUsuario[4], datosUsuario[5], datosUsuario[6]));
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

    public void guardarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        guardarUsuariosArchivo();
    }

    public void guardarUsuariosArchivo() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("usuarios.csv"))) {
            for (Usuario usuario : usuarios) {
                bw.write(usuario.getNick() + "," + usuario.getContrasena() + "," + usuario.getNombre() + "," + usuario.getApellidos() + "," + usuario.getCorreo() + "," + usuario.getIp() + "," + usuario.getTelefono());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al guardar los usuarios: " + e.getMessage());
        }
    }
}
