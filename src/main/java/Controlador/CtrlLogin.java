package Controlador;

import Aplicacion.Servicios.VerificarUsuarioRegistrado;
import Dao.DBUsuarioDAO;
import Dao.UsuarioDAO;
import Modelo.IPasswordHashLib;
import Modelo.Sha1;
import Modelo.Usuario;
import Util.TextPrompt;
import Vista.FrmLogin;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Andre Mujica
 **/
public class CtrlLogin implements ActionListener {

    private static FrmLogin vista;
    private static CtrlLogin instance;

    private CtrlLogin() {
        vista = new FrmLogin();
        new TextPrompt("USUARIO", vista.jtxtUsuario);
        new TextPrompt("CONTRASEÑA", vista.jtxtContrasenia);
        vista.jbtnIniciar.addActionListener(this);
    }

    public static CtrlLogin getInstance(){
        return (instance == null) ? new CtrlLogin() : instance;
    }

    public void iniciar(){
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }

    private void limpiarCajas(){
        vista.jtxtUsuario.setText("");
        vista.jtxtContrasenia.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.jbtnIniciar){
            Usuario conectado;
            String username = vista.jtxtUsuario.getText();
            String password = new String(vista.jtxtContrasenia.getPassword());

            if(!username.equals("") && !password.equals("")){
                UsuarioDAO repositorio = new DBUsuarioDAO();
                IPasswordHashLib generador = new Sha1();
                VerificarUsuarioRegistrado vur = new VerificarUsuarioRegistrado(repositorio, generador);
                conectado = vur.validarCredenciales(username, password);

                if(conectado != null){
                    vista.setVisible(false);
                    instance = null;
                    IControlador userController = conectado.generarControlador();
                    ControllerStrategy cs = new ControllerStrategy();
                    cs.setStrategy(userController);
                    cs.executeStrategy();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Credenciales invalidas.");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Faltan ingresar campos.");
            }

            limpiarCajas();
        }
    }

    public static void main(String[] args) {
        CtrlLogin vista = CtrlLogin.getInstance();
        vista.iniciar();
    }
}
