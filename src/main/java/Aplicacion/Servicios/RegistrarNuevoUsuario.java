package Aplicacion.Servicios;

import Dao.*;
import Modelo.*;

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
            if(nuevoUsuario.getIdTipo() == 1){
                Administrador nuevo = new Administrador();
                nuevo.setIdUsuario(nuevoUsuario.getIdUsuario());
                IRepositorio<Administrador> dao = new DBAdministradorDAO();
                dao.crear(nuevo);
            }
            else{
                Transportista nuevo = new Transportista();
                nuevo.setIdUsuario(nuevoUsuario.getIdUsuario());
                nuevo.setHabilitado(true);
                TransportistaDAO dao = new DBTransportistaDAO();
                dao.crear(nuevo);
            }
            mensaje = "Trabajador registrado satisfactoriamente";
        } catch (UserException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        return mensaje;
    }

}
