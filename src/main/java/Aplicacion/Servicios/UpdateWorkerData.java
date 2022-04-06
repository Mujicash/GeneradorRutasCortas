package Aplicacion.Servicios;

import Dao.DBTransportistaDAO;
import Dao.TransportistaDAO;
import Dao.UserException;
import Dao.UsuarioDAO;
import Modelo.Transportista;
import Modelo.Usuario;

/**
 * @author Andre Mujica
 **/
public class UpdateWorkerData {

    private final UsuarioDAO repositorio;

    public UpdateWorkerData(UsuarioDAO repositorio) {
        this.repositorio = repositorio;
    }

    public String actualizar (Usuario usuario) {
        String mensaje = "Error en la actualizacion de los datos de usuario";

        try {
            repositorio.actualizar(usuario);

            if(usuario.getIdTipo() == 2) { //Es Transportista
                TransportistaDAO dao = new DBTransportistaDAO();
                dao.actualizar((Transportista) usuario);
            }
            mensaje = "Datos del trabajador actualizados satisfactoriamente";

        } catch (UserException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        return mensaje;
    }
}
