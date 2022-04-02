package Controlador;

import Vista.FrmTrabajadores;

/**
 * @author Andre Mujica
 **/
public class CtrlTrabajadores implements IControlador {

    private final FrmTrabajadores vista;

    public CtrlTrabajadores(FrmTrabajadores vista) {
        this.vista = vista;
    }


    @Override
    public void iniciar() {
        vista.setVisible(true);
    }
}
