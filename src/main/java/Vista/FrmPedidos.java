package Vista;

import Controlador.CtrlPedidos;
import Controlador.IControlador;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;
import javax.swing.table.DefaultTableModel;

/**
 * @author Andre Mujica
 **/
public class FrmPedidos extends IPanelView {

    public JButton jbtnEliminar;
    public JButton jbtnBuscar;
    public JButton jbtnNuevo;
    public JButton jbtnOrdenar;
    public JComboBox<String> jcbParametro;
    public JTable jtblTrabajadores;
    public JTextField jtxtCodigo;

    public FrmPedidos() {
        JPanel jpnCabecera = new JPanel();
        JLabel jLabel1 = new JLabel();
        jtxtCodigo = new JTextField();
        jbtnBuscar = new JButton();
        JLabel jLabel2 = new JLabel();
        jcbParametro = new JComboBox<>();
        jbtnOrdenar = new JButton();
        JScrollPane jScrollPane1 = new JScrollPane();
        jtblTrabajadores = new JTable();
        JPanel jpnBotones = new JPanel();
        jbtnNuevo = new JButton();
        jbtnEliminar = new JButton();

        setLayout(new BorderLayout());

        jpnCabecera.setPreferredSize(new Dimension(1300, 80));
        jpnCabecera.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 20));

        jLabel1.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/order.png"))));
        jLabel1.setPreferredSize(new Dimension(50, 50));
        jpnCabecera.add(jLabel1);

        jtxtCodigo.setBackground(new Color(255, 255, 255));
        jtxtCodigo.setFont(new Font("Monospaced", Font.PLAIN, 15)); // NOI18N
        jtxtCodigo.setForeground(new Color(0, 0, 0));
        jtxtCodigo.setPreferredSize(new Dimension(200, 40));
        jpnCabecera.add(jtxtCodigo);

        jbtnBuscar.setFont(new Font("Monospaced", Font.BOLD, 15));
        jbtnBuscar.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/lupa.png"))));
        jbtnBuscar.setText("BUSCAR");
        jbtnBuscar.setPreferredSize(new Dimension(120, 40));
        jpnCabecera.add(jbtnBuscar);

        jLabel2.setEnabled(false);
        jLabel2.setPreferredSize(new Dimension(400, 40));
        jpnCabecera.add(jLabel2);

        jcbParametro.setFont(new Font("Monospaced", Font.BOLD, 15));
        jcbParametro.setModel(new DefaultComboBoxModel<>(new String[] { "SELECCIONE PARAMETRO", "ID", "LOCAL", "FECHA DE REGISTRO" }));
        jcbParametro.setPreferredSize(new Dimension(250, 40));
        jpnCabecera.add(jcbParametro);

        jbtnOrdenar.setFont(new Font("Monospaced", Font.BOLD, 15));
        jbtnOrdenar.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/order.png"))));
        jbtnOrdenar.setText("ORDENAR");
        jbtnOrdenar.setPreferredSize(new Dimension(150, 40));
        jpnCabecera.add(jbtnOrdenar);

        add(jpnCabecera, BorderLayout.PAGE_START);

        jtblTrabajadores.setFont(new Font("Monospaced", Font.PLAIN, 15)); // NOI18N
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

        jbtnNuevo.setFont(new Font("Monospaced", Font.BOLD, 15));
        jbtnNuevo.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/add.png"))));
        jbtnNuevo.setText("NUEVO");
        jbtnNuevo.setPreferredSize(new Dimension(140, 40));
        jpnBotones.add(jbtnNuevo);

        jbtnEliminar.setFont(new Font("Monospaced", Font.BOLD, 15));
        jbtnEliminar.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/delete.png"))));
        jbtnEliminar.setText("ELIMINAR");
        jbtnEliminar.setPreferredSize(new Dimension(160, 40));
        jpnBotones.add(jbtnEliminar);

        add(jpnBotones, BorderLayout.PAGE_END);
    }

    @Override
    public IControlador generarControlador() {
        return new CtrlPedidos(this);
    }
}
