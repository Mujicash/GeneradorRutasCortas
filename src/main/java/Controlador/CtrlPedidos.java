package Controlador;

import Vista.FrmPedidos;

/**
 * @author Andre Mujica
 **/
public class CtrlPedidos implements IControlador {
    
    private final FrmPedidos vista;

    public CtrlPedidos(FrmPedidos vista) {
        this.vista = vista;
        this.vista.jbtnBuscar.addActionListener(e -> buscarPedido());
        this.vista.jbtnOrdenar.addActionListener(e -> ordenarPedidos());
        this.vista.jbtnNuevo.addActionListener(e -> nuevoPedido());
        this.vista.jbtnEliminar.addActionListener(e -> eliminarPedido());
    }

    @Override
    public void iniciar() {
        vista.setVisible(true);

    }

    private void buscarPedido() {
    }

    private void ordenarPedidos() {
    }

    private void nuevoPedido() {
    }

    private void eliminarPedido() {
    }
}
