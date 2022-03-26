package Modelo;

/**
 * @author Andre Mujica
 **/
public class Administrador extends Usuario {

    public Administrador() {
    }

    public Administrador(int idUsuario, String usuario, String contrasenia, String nombres, String apellidos, String correo, String DNI, int id_tipo) {
        super(idUsuario, usuario, contrasenia, nombres, apellidos, correo, DNI, id_tipo);
    }

}
