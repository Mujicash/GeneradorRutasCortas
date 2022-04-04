package Vista;

import Controlador.Controllers;
import Controlador.IControlador;

import javax.swing.*;

/**
 * @author Andre Mujica
 **/
public abstract class IPanelView extends JPanel {

    public abstract IControlador generarControlador();

    public static IPanelView Factory(Controllers name) {
        IPanelView view = null;

        switch (name) {
            case INFORMACIONUSUARIO: view = new FrmInformacionUsuario(); break;
            case TRABAJADORES: view = new FrmTrabajadores(); break;
            case PEDIDOS: view = new FrmPedidos(); break;
            case NODOS: view = new FrmNodos(); break;
            case LOCALES: view = new FrmLocales(); break;
        }

        return view;
    }


}
