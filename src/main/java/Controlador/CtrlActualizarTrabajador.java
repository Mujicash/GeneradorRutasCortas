package Controlador;

import Aplicacion.Servicios.RegistrarNuevoUsuario;
import Aplicacion.Servicios.UpdateWorkerData;
import Dao.DBUsuarioDAO;
import Dao.UserException;
import Dao.UsuarioDAO;
import Modelo.*;
import Vista.FrmActualizarTrabajador;

import javax.swing.*;

/**
 * @author Andre Mujica
 **/
public class CtrlActualizarTrabajador implements IControlador {

    private final FrmActualizarTrabajador vista;
    private final Usuario userSelected;

    public CtrlActualizarTrabajador(FrmActualizarTrabajador vista, Usuario userSelected) {
        this.vista = vista;
        this.userSelected = userSelected;
        this.vista.jbtnActualizar.addActionListener(e -> actualizarTrabajador());
    }

    @Override
    public void iniciar() {
        vista.jtxtUsuario.setText(userSelected.getUsuario());
        vista.jtxtNombres.setText(userSelected.getNombres());
        vista.jtxtApellidos.setText(userSelected.getApellidos());
        vista.jtxtDNI.setText(userSelected.getDNI());
        vista.jtxtCorreo.setText(userSelected.getCorreo());
        if (userSelected.getIdTipo() == 1) {
            vista.jtxtTipoUsuario.setText("ADMINISTRADOR");
            vista.jlblHabilitado.setVisible(false);
            vista.jpnButtons.setVisible(false);
        } else {
            vista.jtxtTipoUsuario.setText("TRANSPORTISTA");
            if (((Transportista) userSelected).isHabilitado()) vista.jrbSi.setSelected(true);
            else vista.jrbNo.setSelected(true);

        }
        vista.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }

    private void actualizarTrabajador() {
        WorkerRegistrationValidations val = new WorkerRegistrationValidations();

        try {
            val.UserNameValidation(vista.jtxtUsuario.getText());
            val.NamesValidation(vista.jtxtNombres.getText());
            val.NamesValidation(vista.jtxtApellidos.getText());
            val.DNIValidation(vista.jtxtDNI.getText());
            val.EmailValidation(vista.jtxtCorreo.getText());

            userSelected.setUsuario(vista.jtxtUsuario.getText());
            userSelected.setNombres(vista.jtxtNombres.getText());
            userSelected.setApellidos(vista.jtxtApellidos.getText());
            userSelected.setDNI(vista.jtxtDNI.getText());
            userSelected.setCorreo(vista.jtxtCorreo.getText());

            UsuarioDAO repository = new DBUsuarioDAO();
            UpdateWorkerData uwd = new UpdateWorkerData(repository);
            String message = uwd.actualizar(userSelected);
            JOptionPane.showMessageDialog(null, message);
            CtrlTrabajadores.updateUser(userSelected);
            vista.dispose();

        } catch (UserException e) {
            JOptionPane.showMessageDialog(null,e.getMessage(), "Error en la actualizacion de Trabajador", JOptionPane.ERROR_MESSAGE);
        }

    }
}
