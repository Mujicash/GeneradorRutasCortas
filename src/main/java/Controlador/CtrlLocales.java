package Controlador;

import Vista.FrmLocales;

/**
 * @author Andre Mujica
 **/
public class CtrlLocales implements IControlador {

    private final FrmLocales vista;

    public CtrlLocales(FrmLocales vista) {
        this.vista = vista;
        this.vista.jbtnBuscar.addActionListener(e -> buscarLocal());
        this.vista.jbtnNuevo.addActionListener(e -> nuevoLocal());
        this.vista.jbtnEditar.addActionListener(e -> editarLocal());
    }

    private void editarLocal() {
    }

    private void nuevoLocal() {
    }

    private void buscarLocal() {
    }

    @Override
    public void iniciar() {
        vista.setVisible(true);

    }
}
