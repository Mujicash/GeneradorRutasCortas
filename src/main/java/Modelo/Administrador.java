package Modelo;

/**
 * @author Andre Mujica
 **/
public class Administrador extends Usuario {

    public Administrador() {
    }

    public Administrador(int idUsuario, String usuario, String contrasenia, int id_tipo, String nombres, String apellidos, String correo, String DNI) {
        super(idUsuario, usuario, contrasenia, id_tipo, nombres, apellidos, correo, DNI);
    }
}
