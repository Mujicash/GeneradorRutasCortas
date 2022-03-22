package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * @author Andre Mujica
 **/
public class FrmNodos extends JPanel {

    private JLabel jLabel1;
    private JScrollPane jScrollPane1;
    public JButton jbtnBuscar;
    public JButton jbtnEditar;
    public JButton jbtnNuevo;
    private JPanel jpnBotones;
    private JPanel jpnCabecera;
    public JTable jtblTrabajadores;
    public JTextField jtxtCodigo;

    public FrmNodos() {
        jpnCabecera = new JPanel();
        jLabel1 = new JLabel();
        jtxtCodigo = new JTextField();
        jbtnBuscar = new JButton();
        jScrollPane1 = new JScrollPane();
        jtblTrabajadores = new JTable();
        jpnBotones = new JPanel();
        jbtnNuevo = new JButton();
        jbtnEditar = new JButton();

        setLayout(new BorderLayout());

        jpnCabecera.setPreferredSize(new Dimension(1300, 80));
        jpnCabecera.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 20));

        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new Dimension(46, 40));
        jpnCabecera.add(jLabel1);

        jtxtCodigo.setBackground(new Color(255, 255, 255));
        jtxtCodigo.setFont(new Font("Monospaced", 0, 15)); // NOI18N
        jtxtCodigo.setForeground(new Color(0, 0, 0));
        jtxtCodigo.setPreferredSize(new Dimension(200, 40));
        jpnCabecera.add(jtxtCodigo);

        jbtnBuscar.setText("BUSCAR");
        jbtnBuscar.setPreferredSize(new Dimension(100, 40));
        jpnCabecera.add(jbtnBuscar);

        add(jpnCabecera, BorderLayout.PAGE_START);

        jtblTrabajadores.setFont(new Font("Monospaced", 0, 15)); // NOI18N
        jtblTrabajadores.setModel(new DefaultTableModel(
                new Object [][] {

                },
                new String [] {

                }
        ));
        jScrollPane1.setViewportView(jtblTrabajadores);

        add(jScrollPane1, BorderLayout.CENTER);

        jpnBotones.setPreferredSize(new Dimension(1300, 80));
        jpnBotones.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 20));

        jbtnNuevo.setFont(new Font("Monospaced", 0, 15)); // NOI18N
        jbtnNuevo.setText("NUEVO");
        jbtnNuevo.setPreferredSize(new Dimension(140, 40));
        jpnBotones.add(jbtnNuevo);

        jbtnEditar.setFont(new Font("Monospaced", 1, 15)); // NOI18N
        jbtnEditar.setText("EDITAR");
        jbtnEditar.setPreferredSize(new Dimension(140, 40));
        jpnBotones.add(jbtnEditar);

        add(jpnBotones, BorderLayout.PAGE_END);
    }
}
