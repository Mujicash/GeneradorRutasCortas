package Dao;

/**
 * @author Andre Mujica
 **/
public interface IRepositorio<T> {

    void crear(T t) throws UserException;
    T obtener(int id);
    boolean actualizar(T t);
    boolean eliminar(int id);

}
