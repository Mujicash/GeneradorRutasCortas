package Vista;

import Controlador.IControlador;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

/**
 * @author Andre Mujica
 **/
public class FrmActualizarTrabajador extends IFrameView {

    public JRadioButton jrbSi;
    public JRadioButton jrbNo;
    public JButton jbtnActualizar;
    public JLabel jlblHabilitado;
    public JPanel jpnButtons;
    public JTextField jtxtApellidos;
    public JTextField jtxtCorreo;
    public JTextField jtxtDNI;
    public JTextField jtxtNombres;
    public JTextField jtxtTipoUsuario;
    public JTextField jtxtUsuario;

    public FrmActualizarTrabajador() {
        super("ACTUALIZAR INFORMACION");
        GridBagConstraints gridBagConstraints;

        ButtonGroup buttonGroup1 = new ButtonGroup();
        JPanel jpnCabecera = new JPanel();
        JLabel jLabel1 = new JLabel();
        JPanel jpnBotones = new JPanel();
        jbtnActualizar = new JButton();
        JPanel jPanel3 = new JPanel();
        JLabel jLabel2 = new JLabel();
        jtxtUsuario = new JTextField();
        JLabel jLabel3 = new JLabel();
        jtxtNombres = new JTextField();
        JLabel jLabel4 = new JLabel();
        jtxtApellidos = new JTextField();
        JLabel jLabel5 = new JLabel();
        jtxtDNI = new JTextField();
        JLabel jLabel6 = new JLabel();
        jtxtCorreo = new JTextField();
        JLabel jLabel7 = new JLabel();
        jlblHabilitado = new JLabel();
        jpnButtons = new JPanel();
        jrbSi = new JRadioButton();
        jrbNo = new JRadioButton();
        jtxtTipoUsuario = new JTextField();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jpnCabecera.setBackground(new Color(255, 255, 255));
        jpnCabecera.setPreferredSize(new Dimension(540, 80));
        jpnCabecera.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 18));

        jLabel1.setFont(new Font("Monospaced", Font.BOLD, 40));
        jLabel1.setForeground(new Color(0, 0, 0));
        jLabel1.setText("FICHA DE TRABAJADOR");
        jpnCabecera.add(jLabel1);

        getContentPane().add(jpnCabecera, BorderLayout.PAGE_START);

        jpnBotones.setBackground(new Color(255, 255, 255));
        jpnBotones.setPreferredSize(new Dimension(540, 80));
        jpnBotones.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 20));

        jbtnActualizar.setFont(new Font("Monospaced", Font.BOLD, 20));
        jbtnActualizar.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/update.png"))));
        jbtnActualizar.setText("ACTUALIZAR");
        jbtnActualizar.setPreferredSize(new Dimension(200, 40));
        jpnBotones.add(jbtnActualizar);

        getContentPane().add(jpnBotones, BorderLayout.PAGE_END);

        jPanel3.setBackground(new Color(255, 255, 255));
        GridBagLayout jPanel3Layout = new GridBagLayout();
        jPanel3Layout.columnWidths = new int[] {0, 5, 0};
        jPanel3Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel3.setLayout(jPanel3Layout);

        jLabel2.setFont(new Font("Liberation Sans", Font.BOLD, 18));
        jLabel2.setForeground(new Color(0, 0, 0));
        jLabel2.setText("USUARIO");
        jLabel2.setPreferredSize(new Dimension(180, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel3.add(jLabel2, gridBagConstraints);

        jtxtUsuario.setBackground(new Color(255, 255, 255));
        jtxtUsuario.setFont(new Font("Liberation Sans", Font.PLAIN, 18));
        jtxtUsuario.setForeground(new Color(0, 0, 0));
        jtxtUsuario.setPreferredSize(new Dimension(250, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel3.add(jtxtUsuario, gridBagConstraints);

        jLabel3.setFont(new Font("Liberation Sans", Font.BOLD, 18));
        jLabel3.setForeground(new Color(0, 0, 0));
        jLabel3.setText("NOMBRES");
        jLabel3.setPreferredSize(new Dimension(180, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel3.add(jLabel3, gridBagConstraints);

        jtxtNombres.setBackground(new Color(255, 255, 255));
        jtxtNombres.setFont(new Font("Liberation Sans", Font.PLAIN, 18));
        jtxtNombres.setForeground(new Color(0, 0, 0));
        jtxtNombres.setPreferredSize(new Dimension(250, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        jPanel3.add(jtxtNombres, gridBagConstraints);

        jLabel4.setFont(new Font("Liberation Sans", Font.BOLD, 18));
        jLabel4.setForeground(new Color(0, 0, 0));
        jLabel4.setText("APELLIDOS");
        jLabel4.setPreferredSize(new Dimension(180, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        jPanel3.add(jLabel4, gridBagConstraints);

        jtxtApellidos.setBackground(new Color(255, 255, 255));
        jtxtApellidos.setFont(new Font("Liberation Sans", Font.PLAIN, 18));
        jtxtApellidos.setForeground(new Color(0, 0, 0));
        jtxtApellidos.setPreferredSize(new Dimension(250, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        jPanel3.add(jtxtApellidos, gridBagConstraints);

        jLabel5.setFont(new Font("Liberation Sans", Font.BOLD, 18));
        jLabel5.setForeground(new Color(0, 0, 0));
        jLabel5.setText("DNI");
        jLabel5.setPreferredSize(new Dimension(180, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        jPanel3.add(jLabel5, gridBagConstraints);

        jtxtDNI.setBackground(new Color(255, 255, 255));
        jtxtDNI.setFont(new Font("Liberation Sans", Font.PLAIN, 18));
        jtxtDNI.setForeground(new Color(0, 0, 0));
        jtxtDNI.setPreferredSize(new Dimension(250, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        jPanel3.add(jtxtDNI, gridBagConstraints);

        jLabel6.setFont(new Font("Liberation Sans", Font.BOLD, 18));
        jLabel6.setForeground(new Color(0, 0, 0));
        jLabel6.setText("CORREO");
        jLabel6.setPreferredSize(new Dimension(180, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        jPanel3.add(jLabel6, gridBagConstraints);

        jtxtCorreo.setBackground(new Color(255, 255, 255));
        jtxtCorreo.setFont(new Font("Liberation Sans", Font.PLAIN, 18));
        jtxtCorreo.setForeground(new Color(0, 0, 0));
        jtxtCorreo.setPreferredSize(new Dimension(250, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        jPanel3.add(jtxtCorreo, gridBagConstraints);

        jLabel7.setFont(new Font("Liberation Sans", Font.BOLD, 18));
        jLabel7.setForeground(new Color(0, 0, 0));
        jLabel7.setText("TIPO DE USUARIO");
        jLabel7.setPreferredSize(new Dimension(180, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        jPanel3.add(jLabel7, gridBagConstraints);

        jlblHabilitado.setFont(new Font("Liberation Sans", Font.BOLD, 18));
        jlblHabilitado.setForeground(new Color(0, 0, 0));
        jlblHabilitado.setText("HABILITADO");
        jlblHabilitado.setPreferredSize(new Dimension(180, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        jPanel3.add(jlblHabilitado, gridBagConstraints);

        jpnButtons.setBackground(new Color(255, 255, 255));
        jpnButtons.setForeground(new Color(255, 255, 255));
        jpnButtons.setMinimumSize(new Dimension(200, 40));
        jpnButtons.setPreferredSize(new Dimension(200, 40));
        jpnButtons.setLayout(new GridBagLayout());

        buttonGroup1.add(jrbSi);
        jrbSi.setForeground(new Color(0, 0, 0));
        jrbSi.setText("SI");
        jrbSi.setPreferredSize(new Dimension(70, 22));
        jpnButtons.add(jrbSi, new GridBagConstraints());

        buttonGroup1.add(jrbNo);
        jrbNo.setForeground(new Color(0, 0, 0));
        jrbNo.setText("NO");
        jrbNo.setPreferredSize(new Dimension(60, 22));
        jpnButtons.add(jrbNo, new GridBagConstraints());

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        jPanel3.add(jpnButtons, gridBagConstraints);

        jtxtTipoUsuario.setEditable(false);
        jtxtTipoUsuario.setBackground(new Color(255, 255, 255));
        jtxtTipoUsuario.setFont(new Font("Liberation Sans", Font.PLAIN, 18));
        jtxtTipoUsuario.setForeground(new Color(0, 0, 0));
        jtxtTipoUsuario.setPreferredSize(new Dimension(250, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        jPanel3.add(jtxtTipoUsuario, gridBagConstraints);

        getContentPane().add(jPanel3, BorderLayout.CENTER);

        pack();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> (new FrmActualizarTrabajador()).setVisible(true));
    }


    @Override
    public IControlador generarControlador() {
        return null;
    }
}
