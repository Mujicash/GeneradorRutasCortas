package Controlador;

import Aplicacion.Servicios.RegistrarNuevoUsuario;
import Dao.DBUsuarioDAO;
import Dao.UserException;
import Dao.UsuarioDAO;
import Modelo.*;
import Vista.FrmRegistroTrabajador;

import javax.swing.*;
import java.awt.*;

/**
 * @author Andre Mujica
 **/
public class CtrlRegistroTrabajador implements IControlador {

    private final FrmRegistroTrabajador vista;

    public CtrlRegistroTrabajador(FrmRegistroTrabajador vista) {
        this.vista = vista;
        this.vista.jbtnRegistrar.addActionListener(e -> registrarTrabajador());
        this.vista.jbtnCancelar.addActionListener(e -> cancelarRegistro());
    }

    @Override
    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }

    private void limpiarCajas() {
        vista.jtxtApellidos.setText("");
        vista.jtxtNombres.setText("");
        vista.jtxtConfirmacion.setText("");
        vista.jtxtConstrasenia.setText("");
        vista.jtxtCorreo.setText("");
        vista.jtxtUsuario.setText("");
        vista.jtxtDNI.setText("");
    }

    private void cancelarRegistro() {
        vista.dispose();
    }

    private void registrarTrabajador() {
        WorkerRegistrationValidations val = new WorkerRegistrationValidations();

        try {
            val.NamesValidation(vista.jtxtNombres.getText());
            val.NamesValidation(vista.jtxtApellidos.getText());
            val.DNIValidation(vista.jtxtDNI.getText());
            val.EmailValidation(vista.jtxtCorreo.getText());
            val.UserNameValidation(vista.jtxtUsuario.getText());

            String password = new String(vista.jtxtConstrasenia.getPassword());
            String confirm = new String(vista.jtxtConfirmacion.getPassword());

            if(password.equals(confirm)) {
                Usuario newUser = new Usuario(
                        vista.jtxtUsuario.getText(),password,vista.jtxtNombres.getText(),vista.jtxtApellidos.getText(),
                        vista.jtxtCorreo.getText(),vista.jtxtDNI.getText(),vista.jcbTipoUsuario.getSelectedIndex()+1
                );

                UsuarioDAO repository = new DBUsuarioDAO();
                IPasswordHashLib hashManager = new Sha1();
                RegistrarNuevoUsuario rnu = new RegistrarNuevoUsuario(repository, hashManager);
                String message = rnu.registrar(newUser);
                JOptionPane.showMessageDialog(null, message);

                CtrlTrabajadores.addUser(new UsuarioDTO(vista.jtxtUsuario.getText(),
                        vista.jtxtNombres.getText()+vista.jtxtApellidos.getText(),
                        vista.jtxtDNI.getText(),vista.jtxtCorreo.getText(), (String) vista.jcbTipoUsuario.getSelectedItem())
                );
                vista.dispose();
            }

        } catch (UserException e) {
            JOptionPane.showMessageDialog(null,e.getMessage(), "Error Registro de Trabajador", JOptionPane.ERROR_MESSAGE);
        }
        limpiarCajas();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> (new CtrlRegistroTrabajador(new FrmRegistroTrabajador())).iniciar());
    }
}
