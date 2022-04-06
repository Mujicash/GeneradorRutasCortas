package Dao;

/**
 * @author Andre Mujica
 **/
public interface IRepositorio<T> {

    void crear(T t) throws UserException;
    T obtener(int id);
    void actualizar(T t) throws UserException;
    boolean eliminar(int id);

}
