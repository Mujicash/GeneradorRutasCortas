package Dao;

import Modelo.Usuario;
import Modelo.UsuarioDTO;

import java.util.List;

/**
 * @author Andre Mujica
 **/
public interface UsuarioDAO extends IRepositorio<Usuario> {

    Usuario exists(String usuario, String contrasenia) throws UserException;
    int leerIdUsuario(String username);
    void existsByUsername(String username) throws UserException;
    void existsByEmail(String email) throws UserException;
    List<UsuarioDTO> readAll();
    Usuario readByUserName(String username);

}
