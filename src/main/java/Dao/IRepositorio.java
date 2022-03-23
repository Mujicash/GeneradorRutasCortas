package Dao;

/**
 * @author Andre Mujica
 **/
public interface IRepositorio<T> {

    public boolean crear(T t) throws UserException;
    public T obtener(int id);
    public boolean actualizar(T t);
    public boolean eliminar(int id);

}
