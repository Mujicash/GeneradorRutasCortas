package Vista;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

/**
 * @author Andre Mujica
 **/
public class FrmPedidos extends JPanel {

    private JLabel jLabel1;
    private JLabel jLabel2;
    private JScrollPane jScrollPane1;
    private JButton jbtnActualizar;
    public JButton jbtnBuscar;
    public JButton jbtnNuevo;
    public JButton jbtnOrdenar;
    public JComboBox<String> jcbParametro;
    private JPanel jpnBotones;
    private JPanel jpnCabecera;
    public JTable jtblTrabajadores;
    public JTextField jtxtCodigo;

    public FrmPedidos() {
        jpnCabecera = new JPanel();
        jLabel1 = new JLabel();
        jtxtCodigo = new JTextField();
        jbtnBuscar = new JButton();
        jLabel2 = new JLabel();
        jcbParametro = new JComboBox<>();
        jbtnOrdenar = new JButton();
        jScrollPane1 = new JScrollPane();
        jtblTrabajadores = new JTable();
        jpnBotones = new JPanel();
        jbtnNuevo = new JButton();
        jbtnActualizar = new JButton();

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

        jbtnBuscar.setFont(new Font("Monospaced", 1, 15)); // NOI18N
        jbtnBuscar.setText("BUSCAR");
        jbtnBuscar.setPreferredSize(new Dimension(100, 40));
        jpnCabecera.add(jbtnBuscar);

        jLabel2.setEnabled(false);
        jLabel2.setPreferredSize(new Dimension(400, 40));
        jpnCabecera.add(jLabel2);

        jcbParametro.setFont(new Font("Monospaced", 1, 15)); // NOI18N
        jcbParametro.setModel(new DefaultComboBoxModel<>(new String[] { "SELECCIONE PARAMETRO", "ID", "LOCAL", "FECHA DE REGISTRO" }));
        jcbParametro.setPreferredSize(new Dimension(250, 40));
        jpnCabecera.add(jcbParametro);

        jbtnOrdenar.setFont(new Font("Monospaced", 1, 15)); // NOI18N
        jbtnOrdenar.setText("ORDENAR");
        jbtnOrdenar.setPreferredSize(new Dimension(150, 40));
        jpnCabecera.add(jbtnOrdenar);

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

        jbtnNuevo.setFont(new Font("Monospaced", 1, 15)); // NOI18N
        jbtnNuevo.setText("NUEVO");
        jbtnNuevo.setPreferredSize(new Dimension(140, 40));
        jpnBotones.add(jbtnNuevo);

        jbtnActualizar.setFont(new Font("Monospaced", 1, 15)); // NOI18N
        jbtnActualizar.setText("ACTUALIZAR");
        jbtnActualizar.setPreferredSize(new Dimension(140, 40));
        jpnBotones.add(jbtnActualizar);

        add(jpnBotones, BorderLayout.PAGE_END);
    }
}
