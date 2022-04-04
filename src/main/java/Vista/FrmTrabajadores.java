/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Controlador.CtrlTrabajadores;
import Controlador.IControlador;

import  javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Objects;


/**
 *
 * @author Andre Mujica
 */
public class FrmTrabajadores extends IPanelView {

    public JButton jbtnBuscar;
    public JButton jbtnEditar;
    public JButton jbtnEliminar;
    public JButton jbtnNuevo;
    public static JTable jtblTrabajadores;
    public JTextField jtxtCodigo;

    public FrmTrabajadores() {
        JPanel jpnCabecera = new JPanel();
        JLabel jLabel1 = new JLabel();
        JLabel jlblCodigoTrabajador = new JLabel();
        jtxtCodigo = new JTextField();
        jbtnBuscar = new JButton();
        JScrollPane jScrollPane1 = new JScrollPane();
        jtblTrabajadores = new JTable();
        JPanel jpnBotones = new JPanel();
        jbtnNuevo = new JButton();
        jbtnEditar = new JButton();
        jbtnEliminar = new JButton();

        setLayout(new BorderLayout());

        jpnCabecera.setPreferredSize(new Dimension(1300, 80));
        jpnCabecera.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setEnabled(false);
        jLabel1.setPreferredSize(new java.awt.Dimension(10, 40));
        jpnCabecera.add(jLabel1);

        jlblCodigoTrabajador.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/access_42px.png"))));
        jlblCodigoTrabajador.setPreferredSize(new Dimension(45, 45));
        jpnCabecera.add(jlblCodigoTrabajador);

        jtxtCodigo.setBackground(new Color(255, 255, 255));
        jtxtCodigo.setFont(new Font("Monospaced", Font.PLAIN, 15)); // NOI18N
        jtxtCodigo.setForeground(new Color(0, 0, 0));
        jtxtCodigo.setPreferredSize(new Dimension(200, 40));
        jpnCabecera.add(jtxtCodigo);

        jbtnBuscar.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/lupa.png"))));
        jbtnBuscar.setText("BUSCAR");
        jbtnBuscar.setPreferredSize(new Dimension(120, 40));
        jpnCabecera.add(jbtnBuscar);

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

        jbtnNuevo.setFont(new Font("Monospaced", Font.PLAIN, 15));
        jbtnNuevo.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/add.png"))));
        jbtnNuevo.setText("NUEVO");
        jbtnNuevo.setPreferredSize(new Dimension(140, 40));
        jpnBotones.add(jbtnNuevo);

        jbtnEditar.setFont(new Font("Monospaced", Font.BOLD, 15));
        jbtnEditar.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/edit.png"))));
        jbtnEditar.setText("EDITAR");
        jbtnEditar.setPreferredSize(new Dimension(140, 40));
        jpnBotones.add(jbtnEditar);

        jbtnEliminar.setFont(new Font("Monospaced", Font.BOLD, 15));
        jbtnEliminar.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/delete.png"))));
        jbtnEliminar.setText("ELIMINAR");
        jbtnEliminar.setPreferredSize(new Dimension(160, 40));
        jpnBotones.add(jbtnEliminar);

        add(jpnBotones, BorderLayout.PAGE_END);
    }

    @Override
    public IControlador generarControlador() {
        return new CtrlTrabajadores(this);
    }
}
