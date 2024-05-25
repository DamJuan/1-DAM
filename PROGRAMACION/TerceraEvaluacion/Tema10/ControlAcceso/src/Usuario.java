import java.util.Date;
import java.util.Objects;

class Usuario {
    private String nombre;
    private String apellidos;
    private String correo;
    private String ip;
    private String telefono;
    private String nick;
    private String contrasena;
    private boolean permisoAcceso;
    private Date ultimoAcceso;
    private int numeroAccesos;

    public Usuario(String nick, String contrasena, String nombre, String apellidos, String correo, String ip, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.ip = ip;
        this.telefono = telefono;
        this.nick = nick;
        this.contrasena = contrasena;
        this.permisoAcceso = false;
        this.ultimoAcceso = null;
        this.numeroAccesos = 0;
    }

    public String getNick() {
        return nick;
    }

    public String getNombre() {
        return nombre;
    }


    public String getApellidos() {
        return apellidos;
    }


    public String getCorreo() {
        return correo;
    }


    public String getIp() {
        return ip;
    }


    public String getTelefono() {
        return telefono;
    }


    public String getContrasena() {
        return contrasena;
    }


    public boolean validarContrasena(String contrasena) {
        return this.contrasena.equals(contrasena);
    }

    public void permitirAcceso() {
        this.permisoAcceso = true;
        this.ultimoAcceso = new Date();
        this.numeroAccesos++;
    }

    public Date getUltimoAcceso() {
        return ultimoAcceso;
    }

    public int getNumeroAccesos() {
        return numeroAccesos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return permisoAcceso == usuario.permisoAcceso && numeroAccesos == usuario.numeroAccesos && Objects.equals(nombre, usuario.nombre) && Objects.equals(apellidos, usuario.apellidos) && Objects.equals(correo, usuario.correo) && Objects.equals(ip, usuario.ip) && Objects.equals(telefono, usuario.telefono) && Objects.equals(nick, usuario.nick) && Objects.equals(contrasena, usuario.contrasena) && Objects.equals(ultimoAcceso, usuario.ultimoAcceso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos, correo, ip, telefono, nick, contrasena, permisoAcceso, ultimoAcceso, numeroAccesos);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", correo='" + correo + '\'' +
                ", ip='" + ip + '\'' +
                ", telefono='" + telefono + '\'' +
                ", nick='" + nick + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", permisoAcceso=" + permisoAcceso +
                ", ultimoAcceso=" + ultimoAcceso +
                ", numeroAccesos=" + numeroAccesos +
                '}';
    }

}
