package Controlador;

import Vista.FrmNodos;

/**
 * @author Andre Mujica
 **/
public class CtrlNodos implements IControlador {

    private final FrmNodos vista;

    public CtrlNodos(FrmNodos vista) {
        this.vista = vista;
        this.vista.jbtnBuscar.addActionListener(e -> buscarNodo());
        this.vista.jbtnNuevo.addActionListener(e -> nuevoNodo());
        this.vista.jbtnEditar.addActionListener(e -> editarNodo());
    }

    private void buscarNodo() {
    }

    private void nuevoNodo() {
    }

    private void editarNodo() {
    }

    @Override
    public void iniciar() {
        vista.setVisible(true);
    }
}
