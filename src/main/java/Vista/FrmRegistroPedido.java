package Vista;

import Modelo.Local;
import Modelo.Transportista;
import javax.swing.*;
import java.awt.*;

/**
 * @author Andre Mujica
 **/
public class FrmRegistroPedido extends JFrame {

    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JPanel jPanel1;
    public JButton jbtnRegistrar;
    public JComboBox<Local> pedidoComboBoxLocal;
    public JComboBox<Transportista> pedidoComboBoxTrabajador;
    public JTextField pedidoTxtDescripcion;

    public FrmRegistroPedido() {
        jLabel1 = new JLabel();
        jPanel1 = new JPanel();
        jLabel2 = new JLabel();
        pedidoComboBoxLocal = new JComboBox<>();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        pedidoComboBoxTrabajador = new JComboBox<>();
        pedidoTxtDescripcion = new JTextField();
        jbtnRegistrar = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(577, 335));
        setResizable(false);

        jLabel1.setFont(new Font("Ubuntu", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("REGISTRO PEDIDO");
        jLabel1.setPreferredSize(new Dimension(218, 60));
        getContentPane().add(jLabel1, BorderLayout.PAGE_START);

        jLabel2.setText("LOCAL: ");
        jLabel2.setPreferredSize(new Dimension(120, 40));

        pedidoComboBoxLocal.setPreferredSize(new Dimension(260, 40));

        jLabel3.setText("DESCRIPCION: ");
        jLabel3.setPreferredSize(new Dimension(120, 40));

        jLabel4.setText("TRANSPORTISTA: ");
        jLabel4.setPreferredSize(new Dimension(120, 40));

        pedidoComboBoxTrabajador.setPreferredSize(new Dimension(260, 40));

        pedidoTxtDescripcion.setPreferredSize(new Dimension(260, 40));

        jbtnRegistrar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/edit.png"))); // NOI18N
        jbtnRegistrar.setText("REGISTRAR PEDIDO");
        jbtnRegistrar.setPreferredSize(new Dimension(230, 40));

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(jbtnRegistrar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 169, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                        .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(pedidoComboBoxLocal, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(pedidoComboBoxTrabajador, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pedidoTxtDescripcion, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(pedidoComboBoxLocal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(pedidoComboBoxTrabajador, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(pedidoTxtDescripcion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addComponent(jbtnRegistrar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, BorderLayout.CENTER);

        pack();
    }
}
