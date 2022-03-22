package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * @author Andre Mujica
 **/
public class FrmTransportista extends  JPanel {

    private JLabel jLabel1;
    private JScrollPane jScrollPane1;
    public JButton jbtnEntregarPedido;
    private JPanel jpnBotones;
    private JPanel jpnCabecera;
    public JTable jtblTrabajadores;

    public FrmTransportista() {
        jpnCabecera = new JPanel();
        jLabel1 = new JLabel();
        jScrollPane1 = new JScrollPane();
        jtblTrabajadores = new JTable();
        jpnBotones = new JPanel();
        jbtnEntregarPedido = new JButton();

        setLayout(new BorderLayout());

        jpnCabecera.setBackground(new Color(255, 255, 255));
        jpnCabecera.setPreferredSize(new Dimension(1300, 80));
        jpnCabecera.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 20));

        jLabel1.setBackground(new Color(255, 255, 255));
        jLabel1.setFont(new Font("Ubuntu", 1, 30)); // NOI18N
        jLabel1.setForeground(new Color(0, 0, 0));
        jLabel1.setText("PEDIDOS PENDIENTES");
        jLabel1.setPreferredSize(new Dimension(500, 40));
        jpnCabecera.add(jLabel1);

        add(jpnCabecera, BorderLayout.PAGE_START);

        jtblTrabajadores.setBackground(new Color(255, 255, 255));
        jtblTrabajadores.setFont(new Font("Monospaced", 0, 15)); // NOI18N
        jtblTrabajadores.setModel(new DefaultTableModel(
                new Object [][] {

                },
                new String [] {

                }
        ));
        jScrollPane1.setViewportView(jtblTrabajadores);

        add(jScrollPane1, BorderLayout.CENTER);

        jpnBotones.setBackground(new Color(255, 255, 255));
        jpnBotones.setPreferredSize(new Dimension(1300, 80));
        jpnBotones.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 20));

        jbtnEntregarPedido.setFont(new Font("Monospaced", 1, 15)); // NOI18N
        jbtnEntregarPedido.setText("ENTREGAR PEDIDO");
        jbtnEntregarPedido.setPreferredSize(new Dimension(200, 40));
        jpnBotones.add(jbtnEntregarPedido);

        add(jpnBotones, BorderLayout.PAGE_END);
    }
}
