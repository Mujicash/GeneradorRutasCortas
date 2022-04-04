package Controlador;

import Dao.DBUsuarioDAO;
import Dao.UsuarioDAO;
import Modelo.Usuario;
import Modelo.UsuarioDTO;
import Util.TextPrompt;
import Vista.FrmTrabajadores;
import Vista.IFrameView;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.util.List;

/**
 * @author Andre Mujica
 **/
public class CtrlTrabajadores implements IControlador {

    private final FrmTrabajadores vista;
    private static List<UsuarioDTO> usuarios;

    public CtrlTrabajadores(FrmTrabajadores vista) {
        this.vista = vista;
        this.vista.jbtnBuscar.addActionListener(e -> buscarTrabajador());
        this.vista.jbtnNuevo.addActionListener(e -> registrarTrabajador());
        new TextPrompt("CODIGO", vista.jtxtCodigo);
    }

    @Override
    public void iniciar() {
        UsuarioDAO repository = new DBUsuarioDAO();
        usuarios = repository.readAll();
        cargarTablaTrabajadores();
        vista.setVisible(true);
    }

    public static void addUser(UsuarioDTO newUser) {
        usuarios.add(newUser);
        cargarTablaTrabajadores();
    }

    private static void cargarTablaTrabajadores() {
        String[] columns = {"USUARIO", "NOMBRE", "DNI", "CORREO", "TIPO"};
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        DefaultTableModel modelTrabajadores = new DefaultTableModel(null, columns);

        for(UsuarioDTO i : usuarios) {
            Object[] row = {i.getUserName(), i.getFullName(), i.getDNI(), i.getEmail(), i.getTypeUser()};
            modelTrabajadores.addRow(row);
        }

        FrmTrabajadores.jtblTrabajadores.setModel(modelTrabajadores);
        for(int i = 0; i < FrmTrabajadores.jtblTrabajadores.getColumnCount(); i++){
            FrmTrabajadores.jtblTrabajadores.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    private void buscarTrabajador() {

    }

    private void registrarTrabajador() {
        IFrameView registrationForm = IFrameView.Factory(Controllers.REGISTROTRABAJADOR);
        IControlador ctrl = registrationForm.generarControlador();
        ControllerStrategy strategy = new ControllerStrategy(ctrl);
        strategy.executeStrategy();

        System.out.println("mmm");
    }
}
