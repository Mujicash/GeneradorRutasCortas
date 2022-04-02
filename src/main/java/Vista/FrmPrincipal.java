
package Vista;

import Controlador.CtrlPrincipal;
import Controlador.IControlador;

import  javax.swing.*;
import java.awt.*;

/**
 *
 * @author Andre Mujica
 */
public class FrmPrincipal extends IFrameView {

    public JMenuBar jmbBarraMenu;
    public JMenuItem jmitLocales;
    public JMenuItem jmitNodos;
    public JMenuItem jmitPerfil;
    public JMenuItem jmitSalir;
    public JMenuItem jmitTrabajadores;
    public JMenuItem jmitPedidos;
    public JPanel jpnPrincipal;

    public FrmPrincipal() {
        super("MENU PRINCIPAL");
        jpnPrincipal = new JPanel();
        jmbBarraMenu = new JMenuBar();
        JMenu jmenuInformacion = new JMenu();
        jmitPerfil = new JMenuItem();
        jmitSalir = new JMenuItem();
        JMenu jmenuGestionar = new JMenu();
        jmitTrabajadores = new JMenuItem();
        jmitNodos = new JMenuItem();
        jmitLocales = new JMenuItem();
        jmitPedidos = new JMenuItem();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jpnPrincipal.setPreferredSize(new Dimension(1300, 670));
        jpnPrincipal.setLayout(new CardLayout());
        getContentPane().add(jpnPrincipal, BorderLayout.CENTER);

        jmbBarraMenu.setPreferredSize(new Dimension(1300, 30));

        jmenuInformacion.setText("INFORMACION");
        jmenuInformacion.setFont(new Font("Monospaced", Font.BOLD, 15)); // NOI18N
        jmenuInformacion.setMinimumSize(new Dimension(117, 30));

        jmitPerfil.setText("Perfil");
        jmitPerfil.setPreferredSize(new Dimension(81, 25));
        jmenuInformacion.add(jmitPerfil);

        jmitSalir.setText("Salir");
        jmitSalir.setPreferredSize(new Dimension(77, 25));
        jmenuInformacion.add(jmitSalir);

        jmbBarraMenu.add(jmenuInformacion);

        jmenuGestionar.setText("GESTIONAR");
        jmenuGestionar.setFont(new Font("Monospaced", Font.BOLD, 15)); // NOI18N
        jmenuGestionar.setMinimumSize(new Dimension(101, 30));

        jmitTrabajadores.setText("Trabajadores");
        jmitTrabajadores.setPreferredSize(new Dimension(134, 25));
        jmenuGestionar.add(jmitTrabajadores);

        jmitNodos.setText("Nodos");
        jmitNodos.setPreferredSize(new Dimension(113, 25));
        jmenuGestionar.add(jmitNodos);

        jmitLocales.setText("Locales");
        jmitLocales.setPreferredSize(new Dimension(99, 25));
        jmenuGestionar.add(jmitLocales);

        jmitPedidos.setText("Pedidos");
        jmitPedidos.setPreferredSize(new Dimension(101, 25));
        jmenuGestionar.add(jmitPedidos);

        jmbBarraMenu.add(jmenuGestionar);

        setJMenuBar(jmbBarraMenu);

        pack();
    }

    @Override
    public IControlador generarControlador() {
        return new CtrlPrincipal(this);
    }
}