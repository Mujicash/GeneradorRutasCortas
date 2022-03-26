package Controlador;

import Modelo.Usuario;
import Vista.FrmPrincipal;

/**
 * @author Andre Mujica
 **/
public class CtrlPrincipal implements IControlador {

    private FrmPrincipal vista;
    private Usuario conectado;

    public CtrlPrincipal(FrmPrincipal vista, Usuario conectado) {
        this.vista = vista;
        this.conectado = conectado;
    }

    public CtrlPrincipal(FrmPrincipal vista) {
        this.vista = vista;
    }

    public void setConectado(Usuario conectado) {
        this.conectado = conectado;
    }

    @Override
    public void iniciar() {
        System.out.println(conectado);
    }
}
