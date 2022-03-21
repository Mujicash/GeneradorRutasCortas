
package vista;

import  javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Andre Mujica
 */
public class FrmPrincipal extends JFrame {

    public JMenuBar jmbBarraMenu;
    private JMenu jmenuGestionar;
    private JMenu jmenuInformacion;
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
        jmenuInformacion = new JMenu();
        jmitPerfil = new JMenuItem();
        jmitSalir = new JMenuItem();
        jmenuGestionar = new JMenu();
        jmitTrabajadores = new JMenuItem();
        jmitNodos = new JMenuItem();
        jmitLocales = new JMenuItem();
        jmitPedidos = new JMenuItem();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jpnPrincipal.setPreferredSize(new Dimension(1300, 670));
        jpnPrincipal.setLayout(new CardLayout());
        getContentPane().add(jpnPrincipal, BorderLayout.CENTER);

        jmbBarraMenu.setPreferredSize(new Dimension(1300, 30));

        jmenuInformacion.setText("INFORMACION");
        jmenuInformacion.setFont(new Font("Monospaced", 1, 15)); // NOI18N
        jmenuInformacion.setMinimumSize(new Dimension(117, 30));

        jmitPerfil.setText("Perfil");
        jmitPerfil.setPreferredSize(new Dimension(81, 25));
        jmenuInformacion.add(jmitPerfil);

        jmitSalir.setText("Salir");
        jmitSalir.setPreferredSize(new Dimension(77, 25));
        jmenuInformacion.add(jmitSalir);

        jmbBarraMenu.add(jmenuInformacion);

        jmenuGestionar.setText("GESTIONAR");
        jmenuGestionar.setFont(new Font("Monospaced", 1, 15)); // NOI18N
        jmenuGestionar.setMinimumSize(new Dimension(101, 30));

        jmitTrabajadores.setText("Trabajadores");
        jmitTrabajadores.setPreferredSize(new Dimension(134, 25));
        jmenuGestionar.add(jmitTrabajadores);
        jmitTrabajadores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jmitTrabajadoresAction();
            }
        });

        jmitNodos.setText("jmitNodos");
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

    private void jmitTrabajadoresAction() {
        System.out.println("ini");
        FrmTrabajadores vista = new FrmTrabajadores();
        cambiarMenu(vista);
        System.out.println("fin");
    }

    private void cambiarMenu(JPanel nuevo){
        jpnPrincipal.removeAll();
        jpnPrincipal.add(nuevo);
        jpnPrincipal.repaint();
        jpnPrincipal.revalidate();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

}