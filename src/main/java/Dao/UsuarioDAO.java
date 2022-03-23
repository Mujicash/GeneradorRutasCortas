package Dao;

import Modelo.Usuario;

/**
 * @author Andre Mujica
 **/
public interface UsuarioDAO extends IRepositorio<Usuario> {

    public Usuario exists(String usuario, String contrasenia) throws UserException;
    public int leerIdUsuario(String username);
    public void existsByUsername(String username) throws UserException;
    public void existsByEmail(String email) throws UserException;

}
