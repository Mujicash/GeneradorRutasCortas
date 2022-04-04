package Vista;

import Controlador.CtrlLocales;
import Controlador.IControlador;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Objects;

/**
 * @author Andre Mujica
 **/
public class FrmLocales extends IPanelView {

    public JButton jbtnActualizar;
    public JButton jbtnBuscar;
    public JButton jbtnEditar;
    public JButton jbtnNuevo;
    public JTable jtblTrabajadores;
    public JTextField jtxtCodigo;

    public FrmLocales() {
        JPanel jpnCabecera = new JPanel();
        JLabel jLabel1 = new JLabel();
        jtxtCodigo = new JTextField();
        jbtnBuscar = new JButton();
        JScrollPane jScrollPane1 = new JScrollPane();
        jtblTrabajadores = new JTable();
        JPanel jpnBotones = new JPanel();
        jbtnNuevo = new JButton();
        jbtnEditar = new JButton();
        jbtnActualizar = new JButton();

        setLayout(new BorderLayout());

        jpnCabecera.setPreferredSize(new Dimension(1300, 80));
        jpnCabecera.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 20));

        jLabel1.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/store.png"))));
        jLabel1.setPreferredSize(new Dimension(46, 40));
        jpnCabecera.add(jLabel1);

        jtxtCodigo.setBackground(new Color(255, 255, 255));
        jtxtCodigo.setFont(new Font("Monospaced", Font.PLAIN, 15));
        jtxtCodigo.setForeground(new Color(0, 0, 0));
        jtxtCodigo.setPreferredSize(new Dimension(200, 40));
        jpnCabecera.add(jtxtCodigo);

        jbtnBuscar.setFont(new Font("Monospaced", Font.BOLD, 15));
        jbtnBuscar.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/lupa.png"))));
        jbtnBuscar.setText("BUSCAR");
        jbtnBuscar.setPreferredSize(new Dimension(120, 40));
        jpnCabecera.add(jbtnBuscar);

        add(jpnCabecera, BorderLayout.PAGE_START);

        jtblTrabajadores.setFont(new Font("Monospaced", Font.PLAIN, 15));
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

        jbtnEditar.setFont(new Font("Monospaced", Font.BOLD, 15));
        jbtnEditar.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/edit.png"))));
        jbtnEditar.setText("EDITAR");
        jbtnEditar.setPreferredSize(new Dimension(140, 40));
        jpnBotones.add(jbtnEditar);

        jbtnActualizar.setFont(new Font("Monospaced", Font.BOLD, 15));
        jbtnActualizar.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/update.png"))));
        jbtnActualizar.setText("ACTUALIZAR");
        jbtnActualizar.setPreferredSize(new Dimension(160, 40));
        jpnBotones.add(jbtnActualizar);

        add(jpnBotones, BorderLayout.PAGE_END);
    }

    @Override
    public IControlador generarControlador() {
        return new CtrlLocales(this);
    }
}
