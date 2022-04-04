package Modelo;

/**
 * @author Andre Mujica
 **/
public class Transportista extends Usuario {

    private boolean habilitado;

    public Transportista() {
    }

    public Transportista(int idUsuario, String usuario, String contrasenia, String nombres, String apellidos, String correo, String DNI, int id_tipo, boolean habilitado) {
        super(idUsuario, usuario, contrasenia, nombres, apellidos, correo, DNI, id_tipo);
        this.habilitado = habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public boolean isHabilitado() {
        return habilitado;
    }
}
