package Aplicacion.Servicios;

import Dao.UserException;
import Dao.UsuarioDAO;
import Modelo.IPasswordHashLib;
import Modelo.Usuario;

/**
 * @author Andre Mujica
 **/
public class VerificarUsuarioRegistrado {

    private final UsuarioDAO repositorio;
    private final IPasswordHashLib generador;

    public VerificarUsuarioRegistrado(UsuarioDAO consulta, IPasswordHashLib hashing) {
        this.repositorio = consulta;
        this.generador = hashing;
    }

    public Usuario validarCredenciales(String usuario, String contrasenia){
        Usuario user = null;

        try {
            contrasenia = generador.hashPassword(contrasenia);
            user = repositorio.exists(usuario, contrasenia);
        } catch (UserException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        return user;
    }

}
