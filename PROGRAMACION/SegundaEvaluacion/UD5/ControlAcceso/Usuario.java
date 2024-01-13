package PrimeraEvaluacion.UD5.ControlAcceso;

import java.util.Date;
class Usuario {
    private String nick;
    private String contrasena;
    private boolean permisoAcceso;
    private Date ultimoAcceso;
    private int numeroAccesos;

    public Usuario(String nick, String contrasena) {
        this.nick = nick;
        this.contrasena = contrasena;
        this.permisoAcceso = false;
        this.ultimoAcceso = null;
        this.numeroAccesos = 0;
    }

    public String getNick() {
        return nick;
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
}