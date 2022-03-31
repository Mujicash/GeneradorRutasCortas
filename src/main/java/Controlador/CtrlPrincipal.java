package Controlador;

import Modelo.Administrador;
import Modelo.Transportista;
import Modelo.Usuario;
import Vista.FrmInformacionUsuario;
import Vista.FrmPrincipal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Andre Mujica
 **/
public class CtrlPrincipal implements IControlador {

    private final FrmPrincipal vista;
    private Usuario conectado;

    public CtrlPrincipal(FrmPrincipal vista) {
        this.vista = vista;
        this.vista.jmitPerfil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jmitPedidosAction();
            }
        });
    }

    public void setConectado(Usuario conectado) {
        this.conectado = conectado;
    }

    @Override
    public void iniciar() {
        if(conectado instanceof Transportista){
            System.out.println("Transportista");
        }
        jmitPedidosAction();
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

    private void jmitPedidosAction() {
        FrmInformacionUsuario info = new FrmInformacionUsuario();
        CtrlInformacionUsuario ctrl = new CtrlInformacionUsuario(info,conectado);
        this.addNewPanel(info);
        ctrl.iniciar();
    }

}
