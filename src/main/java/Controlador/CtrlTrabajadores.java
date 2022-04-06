package Controlador;

import Dao.DBUsuarioDAO;
import Dao.UsuarioDAO;
import Modelo.*;
import Util.TextPrompt;
import Vista.FrmActualizarTrabajador;
import Vista.FrmTrabajadores;
import Vista.IFrameView;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

/**
 * @author Andre Mujica
 **/
public class CtrlTrabajadores implements IControlador {

    private final FrmTrabajadores vista;
    private static List<UsuarioDTO> usuarios;

    public CtrlTrabajadores(FrmTrabajadores vista) {
        this.vista = vista;
        this.vista.jbtnNuevo.addActionListener(e -> registrarTrabajador());
        this.vista.jbtnEditar.addActionListener(e -> editarTrabajador(FrmTrabajadores.jtblTrabajadores.getSelectedRow()));
        this.vista.jtxtCodigo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                buscarTrabajador();
            }

            @Override
            public void keyReleased(KeyEvent e) {
                buscarTrabajador();
            }
        });
        FrmTrabajadores.jtblTrabajadores.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() >= 2) {
                    editarTrabajador(FrmTrabajadores.jtblTrabajadores.getSelectedRow());
                }
            }
        });
        new TextPrompt("FILTRAR USUARIO", vista.jtxtCodigo);
    }

    @Override
    public void iniciar() {
        UsuarioDAO repository = new DBUsuarioDAO();
        usuarios = repository.readAll();
        cargarTablaTrabajadores(usuarios);
        vista.setVisible(true);
    }

    public static void addUser(UsuarioDTO newUser) {
        usuarios.add(newUser);
        cargarTablaTrabajadores(usuarios);
    }

    public static void updateUser(Usuario user) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getUserName().equals(user.getUsuario())) {
                usuarios.set(i, new UsuarioDTO(user.getUsuario(), user.getNombres() + " " + user.getApellidos(), user.getDNI(),
                        user.getCorreo(), (user.getIdTipo() == 1)? "ADMINISTRADOR" : "TRANSPORTISTA"
                ));
            }
        }
        cargarTablaTrabajadores(usuarios);
    }

    private static void cargarTablaTrabajadores(@NotNull List<UsuarioDTO> users) {
        String[] columns = {"USUARIO", "NOMBRE", "DNI", "CORREO", "TIPO"};
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        DefaultTableModel modelTrabajadores = new DefaultTableModel(null, columns) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return true;
            }
        };

        for(UsuarioDTO i : users) {
            Object[] row = {i.getUserName(), i.getFullName(), i.getDNI(), i.getEmail(), i.getTypeUser()};
            modelTrabajadores.addRow(row);
        }

        FrmTrabajadores.jtblTrabajadores.setModel(modelTrabajadores);
        for(int i = 0; i < FrmTrabajadores.jtblTrabajadores.getColumnCount(); i++){
            FrmTrabajadores.jtblTrabajadores.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    private void buscarTrabajador() {
        String filtro = vista.jtxtCodigo.getText();
        List<UsuarioDTO> encontrado;
        FilteredSearch<UsuarioDTO> ser = new FilteredSearch<>();
        encontrado = ser.find(usuarios, filtro);
        cargarTablaTrabajadores(encontrado);
    }

    private void registrarTrabajador() {
        IFrameView registrationForm = IFrameView.Factory(Controllers.REGISTROTRABAJADOR);
        IControlador ctrl = registrationForm.generarControlador();
        ControllerStrategy strategy = new ControllerStrategy(ctrl);
        strategy.executeStrategy();
    }

    private void editarTrabajador(int selectedRow) {

        if (selectedRow >= 0) {
            String username = (String) FrmTrabajadores.jtblTrabajadores.getValueAt(selectedRow,0);
            UsuarioDAO repo = new DBUsuarioDAO();
            Usuario selected = repo.readByUserName(username);
            FrmActualizarTrabajador view = new FrmActualizarTrabajador();
            IControlador ctrl = new CtrlActualizarTrabajador(view, selected);
            ctrl.iniciar();
        } else {
            JOptionPane.showMessageDialog(null, "SELECCIONE UN TRABAJADOR");
        }
    }
}
