package Vista;

import Controlador.CtrlInformacionUsuario;
import Controlador.IControlador;

import javax.swing.*;
import java.awt.*;

/**
 * @author Andre Mujica
 **/
public class FrmInformacionUsuario extends IPanelView {

    public JTextField jtxtApellidos;
    public JTextField jtxtCorreo;
    public JTextField jtxtDNI;
    public JTextField jtxtNombres;
    public JTextField jtxtTipoUsuario;
    public JTextField jtxtUsuario;

    public FrmInformacionUsuario() {
        GridBagConstraints gridBagConstraints;

        JPanel jpnCabecera = new JPanel();
        JLabel jLabel1 = new JLabel();
        JPanel jPanel1 = new JPanel();
        JLabel jLabel2 = new JLabel();
        JLabel jLabel3 = new JLabel();
        JLabel jLabel4 = new JLabel();
        JLabel jLabel5 = new JLabel();
        JLabel jLabel6 = new JLabel();
        JLabel jLabel7 = new JLabel();
        JLabel jLabel8 = new JLabel();
        JLabel jLabel9 = new JLabel();
        JLabel jLabel10 = new JLabel();
        JLabel jLabel11 = new JLabel();
        JLabel jLabel12 = new JLabel();
        JLabel jLabel13 = new JLabel();
        jtxtUsuario = new JTextField();
        jtxtNombres = new JTextField();
        jtxtApellidos = new JTextField();
        jtxtDNI = new JTextField();
        jtxtCorreo = new JTextField();
        jtxtTipoUsuario = new JTextField();

        setLayout(new BorderLayout());

        jpnCabecera.setBackground(new Color(255, 255, 255));
        jpnCabecera.setPreferredSize(new Dimension(1300, 80));
        jpnCabecera.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 20));

        jLabel1.setBackground(new Color(255, 255, 255));
        jLabel1.setFont(new Font("Ubuntu", Font.BOLD, 30)); // NOI18N
        jLabel1.setForeground(new Color(0, 0, 0));
        jLabel1.setText("INFORMACION DE USUARIO");
        jLabel1.setPreferredSize(new Dimension(500, 40));
        jpnCabecera.add(jLabel1);

        add(jpnCabecera, BorderLayout.PAGE_START);

        jPanel1.setBackground(new Color(255, 255, 255));
        jPanel1.setLayout(new GridBagLayout());

        jLabel2.setFont(new Font("Monospaced", Font.BOLD, 20)); // NOI18N
        jLabel2.setForeground(new Color(0, 0, 0));
        jLabel2.setText("NOMBRE USUARIO:");
        jLabel2.setPreferredSize(new Dimension(180, 40));
        jPanel1.add(jLabel2, new GridBagConstraints());

        jtxtUsuario.setEditable(false);
        jtxtUsuario.setBackground(new Color(255, 255, 255));
        jtxtUsuario.setFont(new Font("Monospaced", Font.PLAIN, 20)); // NOI18N
        jtxtUsuario.setForeground(new Color(0, 0, 0));
        jtxtUsuario.setMinimumSize(new Dimension(300, 40));
        jtxtUsuario.setPreferredSize(new Dimension(300, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel1.add(jtxtUsuario, gridBagConstraints);

        jLabel3.setFont(new Font("Monospaced", Font.BOLD, 20)); // NOI18N
        jLabel3.setForeground(new Color(0, 0, 0));
        jLabel3.setText("NOMBRES:");
        jLabel3.setPreferredSize(new Dimension(180, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel1.add(jLabel3, gridBagConstraints);

        jtxtNombres.setEditable(false);
        jtxtNombres.setBackground(new Color(255, 255, 255));
        jtxtNombres.setFont(new Font("Monospaced", Font.PLAIN, 20)); // NOI18N
        jtxtNombres.setForeground(new Color(0, 0, 0));
        jtxtNombres.setMinimumSize(new Dimension(300, 40));
        jtxtNombres.setPreferredSize(new Dimension(300, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        jPanel1.add(jtxtNombres, gridBagConstraints);

        jLabel4.setFont(new Font("Monospaced", Font.BOLD, 20)); // NOI18N
        jLabel4.setForeground(new Color(0, 0, 0));
        jLabel4.setText("APELLIDOS:");
        jLabel4.setPreferredSize(new Dimension(180, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        jPanel1.add(jLabel4, gridBagConstraints);

        jtxtApellidos.setEditable(false);
        jtxtApellidos.setBackground(new Color(255, 255, 255));
        jtxtApellidos.setFont(new Font("Monospaced", Font.PLAIN, 20)); // NOI18N
        jtxtApellidos.setForeground(new Color(0, 0, 0));
        jtxtApellidos.setMinimumSize(new Dimension(300, 40));
        jtxtApellidos.setPreferredSize(new Dimension(300, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        jPanel1.add(jtxtApellidos, gridBagConstraints);

        jLabel5.setFont(new Font("Monospaced", Font.BOLD, 20)); // NOI18N
        jLabel5.setForeground(new Color(0, 0, 0));
        jLabel5.setText("DNI:");
        jLabel5.setPreferredSize(new Dimension(180, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        jPanel1.add(jLabel5, gridBagConstraints);

        jtxtDNI.setEditable(false);
        jtxtDNI.setBackground(new Color(255, 255, 255));
        jtxtDNI.setFont(new Font("Monospaced", Font.PLAIN, 20)); // NOI18N
        jtxtDNI.setForeground(new Color(0, 0, 0));
        jtxtDNI.setMinimumSize(new Dimension(300, 40));
        jtxtDNI.setPreferredSize(new Dimension(300, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        jPanel1.add(jtxtDNI, gridBagConstraints);

        jLabel6.setFont(new Font("Monospaced", Font.BOLD, 20)); // NOI18N
        jLabel6.setForeground(new Color(0, 0, 0));
        jLabel6.setText("CORREO:");
        jLabel6.setPreferredSize(new Dimension(180, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        jPanel1.add(jLabel6, gridBagConstraints);

        jtxtCorreo.setEditable(false);
        jtxtCorreo.setBackground(new Color(255, 255, 255));
        jtxtCorreo.setFont(new Font("Monospaced", Font.PLAIN, 20)); // NOI18N
        jtxtCorreo.setForeground(new Color(0, 0, 0));
        jtxtCorreo.setMinimumSize(new Dimension(300, 40));
        jtxtCorreo.setPreferredSize(new Dimension(300, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        jPanel1.add(jtxtCorreo, gridBagConstraints);

        jLabel7.setFont(new Font("Monospaced", Font.BOLD, 20)); // NOI18N
        jLabel7.setForeground(new Color(0, 0, 0));
        jLabel7.setText("TIPO USUARIO:");
        jLabel7.setPreferredSize(new Dimension(180, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        jPanel1.add(jLabel7, gridBagConstraints);

        jtxtTipoUsuario.setEditable(false);
        jtxtTipoUsuario.setBackground(new Color(255, 255, 255));
        jtxtTipoUsuario.setFont(new Font("Monospaced", Font.PLAIN, 20)); // NOI18N
        jtxtTipoUsuario.setForeground(new Color(0, 0, 0));
        jtxtTipoUsuario.setMinimumSize(new Dimension(300, 40));
        jtxtTipoUsuario.setPreferredSize(new Dimension(300, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        jPanel1.add(jtxtTipoUsuario, gridBagConstraints);

        jLabel8.setPreferredSize(new Dimension(10, 0));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel1.add(jLabel8, gridBagConstraints);

        jLabel9.setPreferredSize(new Dimension(10, 10));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel1.add(jLabel9, gridBagConstraints);

        jLabel10.setPreferredSize(new Dimension(10, 10));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        jPanel1.add(jLabel10, gridBagConstraints);

        jLabel11.setPreferredSize(new Dimension(10, 10));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        jPanel1.add(jLabel11, gridBagConstraints);

        jLabel12.setPreferredSize(new Dimension(10, 10));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        jPanel1.add(jLabel12, gridBagConstraints);

        jLabel13.setPreferredSize(new Dimension(10, 10));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        jPanel1.add(jLabel13, gridBagConstraints);

        add(jPanel1, BorderLayout.CENTER);
    }

    @Override
    public IControlador generarControlador() {
        return new CtrlInformacionUsuario(this);
    }
}
