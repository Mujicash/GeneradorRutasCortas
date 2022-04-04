package Dao;

import Modelo.Transportista;

/**
 * @author Andre Mujica
 **/
public interface TransportistaDAO extends IRepositorio<Transportista> {

    boolean estado(int idUsuario);

}
