package Controlador;

import Vista.FrmTrabajadores;
import Vista.IFrameView;

/**
 * @author Andre Mujica
 **/
public class CtrlTrabajadores implements IControlador {

    private final FrmTrabajadores vista;

    public CtrlTrabajadores(FrmTrabajadores vista) {
        this.vista = vista;
        this.vista.jbtnBuscar.addActionListener(e -> buscarTrabajador());
        this.vista.jbtnNuevo.addActionListener(e -> registrarTrabajador());

    }

    @Override
    public void iniciar() {
        vista.setVisible(true);
    }

    private void buscarTrabajador() {

    }

    private void registrarTrabajador() {
        IFrameView registrationForm = IFrameView.Factory(Controllers.REGISTROTRABAJADOR);
        IControlador ctrl = registrationForm.generarControlador();
        ControllerStrategy strategy = new ControllerStrategy(ctrl);
        strategy.executeStrategy();
    }
}
