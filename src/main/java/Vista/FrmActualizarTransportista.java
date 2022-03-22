package Vista;

import javax.swing.*;
import java.awt.*;

/**
 * @author Andre Mujica
 **/
public class FrmActualizarTransportista extends JFrame {

    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JPanel jPanel3;
    public JButton jbtnActualizar;
    public JComboBox<String> jcbTipoUsuario;
    private JPanel jpnBotones;
    private JPanel jpnCabecera;
    public JTextField jtxtApellidos;
    public JTextField jtxtCorreo;
    public JTextField jtxtDNI;
    public JTextField jtxtNombres;
    public JTextField jtxtUsuario;

    public FrmActualizarTransportista() {
        GridBagConstraints gridBagConstraints;

        jpnCabecera = new JPanel();
        jLabel1 = new JLabel();
        jpnBotones = new JPanel();
        jbtnActualizar = new JButton();
        jPanel3 = new JPanel();
        jLabel2 = new JLabel();
        jtxtUsuario = new JTextField();
        jLabel3 = new JLabel();
        jtxtNombres = new JTextField();
        jLabel4 = new JLabel();
        jtxtApellidos = new JTextField();
        jLabel5 = new JLabel();
        jtxtDNI = new JTextField();
        jLabel6 = new JLabel();
        jtxtCorreo = new JTextField();
        jLabel7 = new JLabel();
        jcbTipoUsuario = new JComboBox<>();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jpnCabecera.setBackground(new Color(255, 255, 255));
        jpnCabecera.setPreferredSize(new Dimension(540, 80));
        jpnCabecera.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 18));

        jLabel1.setFont(new Font("Monospaced", 1, 40)); // NOI18N
        jLabel1.setForeground(new Color(0, 0, 0));
        jLabel1.setText("FICHA DE TRABAJADOR");
        jpnCabecera.add(jLabel1);

        getContentPane().add(jpnCabecera, BorderLayout.PAGE_START);

        jpnBotones.setBackground(new Color(255, 255, 255));
        jpnBotones.setPreferredSize(new Dimension(540, 80));
        jpnBotones.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 20));

        jbtnActualizar.setFont(new Font("Monospaced", 1, 20)); // NOI18N
        jbtnActualizar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/update.png"))); // NOI18N
        jbtnActualizar.setText("ACTUALIZAR");
        jbtnActualizar.setPreferredSize(new Dimension(200, 40));
        jpnBotones.add(jbtnActualizar);

        getContentPane().add(jpnBotones, BorderLayout.PAGE_END);

        jPanel3.setBackground(new Color(255, 255, 255));
        GridBagLayout jPanel3Layout = new GridBagLayout();
        jPanel3Layout.columnWidths = new int[] {0, 5, 0};
        jPanel3Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel3.setLayout(jPanel3Layout);

        jLabel2.setFont(new Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new Color(0, 0, 0));
        jLabel2.setText("USUARIO");
        jLabel2.setPreferredSize(new Dimension(180, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel3.add(jLabel2, gridBagConstraints);

        jtxtUsuario.setBackground(new Color(255, 255, 255));
        jtxtUsuario.setFont(new Font("Liberation Sans", 0, 18)); // NOI18N
        jtxtUsuario.setForeground(new Color(0, 0, 0));
        jtxtUsuario.setPreferredSize(new Dimension(200, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel3.add(jtxtUsuario, gridBagConstraints);

        jLabel3.setFont(new Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel3.setForeground(new Color(0, 0, 0));
        jLabel3.setText("NOMBRES");
        jLabel3.setPreferredSize(new Dimension(180, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel3.add(jLabel3, gridBagConstraints);

        jtxtNombres.setBackground(new Color(255, 255, 255));
        jtxtNombres.setFont(new Font("Liberation Sans", 0, 18)); // NOI18N
        jtxtNombres.setForeground(new Color(0, 0, 0));
        jtxtNombres.setPreferredSize(new Dimension(200, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        jPanel3.add(jtxtNombres, gridBagConstraints);

        jLabel4.setFont(new Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel4.setForeground(new Color(0, 0, 0));
        jLabel4.setText("APELLIDOS");
        jLabel4.setPreferredSize(new Dimension(180, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        jPanel3.add(jLabel4, gridBagConstraints);

        jtxtApellidos.setBackground(new Color(255, 255, 255));
        jtxtApellidos.setFont(new Font("Liberation Sans", 0, 18)); // NOI18N
        jtxtApellidos.setForeground(new Color(0, 0, 0));
        jtxtApellidos.setPreferredSize(new Dimension(200, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        jPanel3.add(jtxtApellidos, gridBagConstraints);

        jLabel5.setFont(new Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel5.setForeground(new Color(0, 0, 0));
        jLabel5.setText("DNI");
        jLabel5.setPreferredSize(new Dimension(180, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        jPanel3.add(jLabel5, gridBagConstraints);

        jtxtDNI.setBackground(new Color(255, 255, 255));
        jtxtDNI.setFont(new Font("Liberation Sans", 0, 18)); // NOI18N
        jtxtDNI.setForeground(new Color(0, 0, 0));
        jtxtDNI.setPreferredSize(new Dimension(200, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        jPanel3.add(jtxtDNI, gridBagConstraints);

        jLabel6.setFont(new Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel6.setForeground(new Color(0, 0, 0));
        jLabel6.setText("CORREO");
        jLabel6.setPreferredSize(new Dimension(180, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        jPanel3.add(jLabel6, gridBagConstraints);

        jtxtCorreo.setBackground(new Color(255, 255, 255));
        jtxtCorreo.setFont(new Font("Liberation Sans", 0, 18)); // NOI18N
        jtxtCorreo.setForeground(new Color(0, 0, 0));
        jtxtCorreo.setPreferredSize(new Dimension(200, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        jPanel3.add(jtxtCorreo, gridBagConstraints);

        jLabel7.setFont(new Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel7.setForeground(new Color(0, 0, 0));
        jLabel7.setText("TIPO DE USUARIO");
        jLabel7.setPreferredSize(new Dimension(180, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        jPanel3.add(jLabel7, gridBagConstraints);

        jcbTipoUsuario.setBackground(new Color(255, 255, 255));
        jcbTipoUsuario.setFont(new Font("Liberation Sans", 0, 18)); // NOI18N
        jcbTipoUsuario.setForeground(new Color(0, 0, 0));
        jcbTipoUsuario.setModel(new DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "TRANSPORTISTA" }));
        jcbTipoUsuario.setPreferredSize(new Dimension(200, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        jPanel3.add(jcbTipoUsuario, gridBagConstraints);

        getContentPane().add(jPanel3, BorderLayout.CENTER);

        pack();
    }

    
}
