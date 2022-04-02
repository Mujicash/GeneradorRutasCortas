package Controlador;

import Modelo.Transportista;
import Modelo.Usuario;
import Vista.FrmPrincipal;
import Vista.IPanelView;

import javax.swing.*;

/**
 * @author Andre Mujica
 **/
public class CtrlPrincipal implements IControlador {

    private final FrmPrincipal vista;
    private static Usuario conectado;

    public CtrlPrincipal(FrmPrincipal vista) {
        this.vista = vista;
        this.vista.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                formWindowClosing();
            }
        });
        this.vista.jmitPerfil.addActionListener(e -> jmitPerfilAction());
        this.vista.jmitSalir.addActionListener(e -> jmitSalirAction());
        this.vista.jmitTrabajadores.addActionListener(e -> jmitTrabajadoresAction());
        this.vista.jmitNodos.addActionListener(e -> jmitNodosAction());
        this.vista.jmitLocales.addActionListener(e -> jmitLocalesAction());
        this.vista.jmitPedidos.addActionListener(e -> jmitPedidosAction());
    }

    public void setConectado(Usuario conectado) {
        CtrlPrincipal.conectado = conectado;
    }

    public static Usuario getConectado() {
        return conectado;
    }

    @Override
    public void iniciar() {
        if(conectado instanceof Transportista){
            vista.jmitTrabajadores.setVisible(false);
            vista.jmitLocales.setVisible(false);
            vista.jmitNodos.setVisible(false);
        }
        jmitPerfilAction();
        System.out.println(conectado);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }

    public void addNewPanel(JPanel newJPanel){
        vista.jpnPrincipal.removeAll();
        vista.jpnPrincipal.add(newJPanel);
        vista.jpnPrincipal.repaint();
        vista.jpnPrincipal.revalidate();
    }

    private void jmitPerfilAction() {
        IPanelView info = IPanelView.Factory(Controllers.INFORMACIONUSUARIO);
        IControlador ctrl = info.generarControlador();
        this.addNewPanel(info);
        ctrl.iniciar();
    }

    private void jmitPedidosAction() {
    }

    private void jmitLocalesAction() {
    }

    private void jmitNodosAction() {
    }

    private void jmitTrabajadoresAction() {
        IPanelView workers = IPanelView.Factory(Controllers.TRABAJADORES);
        IControlador ctrl = workers.generarControlador();
        this.addNewPanel(workers);
        ctrl.iniciar();
    }

    private void jmitSalirAction() {
        vista.dispose();
        formWindowClosing();
    }

    private void formWindowClosing() {
        CtrlLogin login = CtrlLogin.getInstance();
        login.iniciar();
    }

}
