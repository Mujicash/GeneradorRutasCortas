package Controlador;

import Modelo.Usuario;
import Vista.FrmInformacionUsuario;

/**
 * @author Andre Mujica
 **/
public class CtrlInformacionUsuario implements IControlador {

    private final FrmInformacionUsuario vista;
    private final Usuario conectado;

    public CtrlInformacionUsuario(FrmInformacionUsuario vista) {
        this.vista = vista;
        conectado = CtrlPrincipal.getConectado();
    }

    public void iniciar() {
        vista.setVisible(true);

        vista.jtxtUsuario.setText(conectado.getUsuario());
        vista.jtxtNombres.setText(conectado.getNombres());
        vista.jtxtApellidos.setText(conectado.getApellidos());
        vista.jtxtDNI.setText(conectado.getDNI());
        vista.jtxtCorreo.setText(conectado.getCorreo());
        vista.jtxtTipoUsuario.setText(String.valueOf(conectado.getIdTipo()));
    }

}
