package Modelo;

/**
 * @author Andre Mujica
 **/
public class Transportista extends Usuario {

    private boolean habilitado;

    public Transportista() {
    }

    public Transportista(int idUsuario, String usuario, String contrasenia, int id_tipo, String nombres, String apellidos, String correo, String DNI, boolean habilitado) {
        super(idUsuario, usuario, contrasenia, id_tipo, nombres, apellidos, correo, DNI);
        this.habilitado = habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
}
