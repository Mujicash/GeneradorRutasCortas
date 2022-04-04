package Vista;

import Controlador.Controllers;
import Controlador.IControlador;

import javax.swing.*;

/**
 * @author Andre Mujica
 **/
public abstract class IFrameView extends JFrame {

    public IFrameView(String titulo) {
        super(titulo);
    }

    public abstract IControlador generarControlador();

    public static IFrameView Factory(Controllers name) {
        IFrameView vista = null;

        switch (name) {
            case PRINCIPAL: vista = new FrmPrincipal(); break;
            case RUTAS: vista = new FrmCalcularRuta(); break;
            case REGISTROTRABAJADOR: vista = new FrmRegistroTrabajador(); break;
        }

        return vista;
    }

}
