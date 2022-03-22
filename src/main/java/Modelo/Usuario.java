package Modelo;

/**
 * @author Andre Mujica
 **/
public class Usuario {

    private int idUsuario;
    private String usuario;
    private String contrasenia;
    private int id_tipo;
    private String nombres;
    private String apellidos;
    private String correo;
    private String DNI;

    public Usuario() {
    }

    public Usuario(int idUsuario, String usuario, String contrasenia, int id_tipo, String nombres, String apellidos, String correo, String DNI) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.id_tipo = id_tipo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.DNI = DNI;
    }

    /**
     * Constructor para el inicio de sesión
     * @param usuario -- Usuario registrado en el sistema
     * @param contrasenia -- Contraseña del usuario
     */
    public Usuario(String usuario, String contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }


    @Override
    public String toString() {
        return "Usuario: " + usuario + " => " + nombres + ", " + apellidos;
    }
}
