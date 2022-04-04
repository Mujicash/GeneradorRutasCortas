package Controlador;

import Modelo.Transportista;
import Modelo.Usuario;
import Vista.FrmPrincipal;
import Vista.IPanelView;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author Andre Mujica
 **/
public class CtrlPrincipal implements IControlador {

    private final FrmPrincipal vista;
    private static Usuario conectado;

    public CtrlPrincipal(FrmPrincipal vista) {
        this.vista = vista;
        this.vista.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
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

    public void changePanel(JPanel newJPanel, IControlador ctrl){
        vista.jpnPrincipal.removeAll();
        vista.jpnPrincipal.add(newJPanel);
        vista.jpnPrincipal.repaint();
        vista.jpnPrincipal.revalidate();
        ControllerStrategy strategy = new ControllerStrategy(ctrl);
        strategy.executeStrategy();
    }

    private void jmitPerfilAction() {
        IPanelView info = IPanelView.Factory(Controllers.INFORMACIONUSUARIO);
        IControlador ctrl = info.generarControlador();
        this.changePanel(info, ctrl);
    }

    private void jmitSalirAction() {
        vista.dispose();
        formWindowClosing();
    }

    private void jmitTrabajadoresAction() {
        IPanelView workers = IPanelView.Factory(Controllers.TRABAJADORES);
        IControlador ctrl = workers.generarControlador();
        this.changePanel(workers, ctrl);
    }

    private void jmitNodosAction() {
        IPanelView nodos = IPanelView.Factory(Controllers.NODOS);
        IControlador ctrl = nodos.generarControlador();
        this.changePanel(nodos, ctrl);
    }

    private void jmitPedidosAction() {
        IPanelView pedidos = IPanelView.Factory(Controllers.PEDIDOS);
        IControlador ctrl = pedidos.generarControlador();
        this.changePanel(pedidos, ctrl);
    }

    private void jmitLocalesAction() {
        IPanelView locales = IPanelView.Factory(Controllers.LOCALES);
        IControlador ctrl = locales.generarControlador();
        this.changePanel(locales, ctrl);
    }

    private void formWindowClosing() {
        CtrlLogin login = CtrlLogin.getInstance();
        login.iniciar();
    }

}