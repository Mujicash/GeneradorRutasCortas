package Aplicacion.Servicios;

import Dao.DBUsuarioDAO;
import Dao.UserException;
import Dao.UsuarioDAO;
import Modelo.IPasswordHashLib;
import Modelo.Sha1;
import Modelo.Usuario;

import java.util.Scanner;

/**
 * @author Andre Mujica
 **/
public class RegistrarNuevoUsuario {

    private final UsuarioDAO repositorio;
    private final IPasswordHashLib generador;

    public RegistrarNuevoUsuario(UsuarioDAO repositorio, IPasswordHashLib generador) {
        this.repositorio = repositorio;
        this.generador = generador;
    }

    public String registrar(Usuario nuevoUsuario) {
        String mensaje = "Error en el registro de usuario.";

        try {
            repositorio.existsByUsername(nuevoUsuario.getUsuario());
            repositorio.existsByEmail(nuevoUsuario.getCorreo());
            nuevoUsuario.setContrasenia(generador.hashPassword(nuevoUsuario.getContrasenia())); //Hash a la contraseña literal
            repositorio.crear(nuevoUsuario);
            mensaje = "Trabajador registrado satisfactoriamente";
        } catch (UserException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        return mensaje;
    }

}
