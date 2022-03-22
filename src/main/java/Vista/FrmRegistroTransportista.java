package Vista;

import javax.swing.*;
import java.awt.*;

/**
 * @author Andre Mujica
 **/
public class FrmRegistroTransportista extends JFrame {

    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    public JButton jbtnCancelar;
    public JButton jbtnRegistrar;
    public JComboBox<String> jcbTipoUsuario;
    public JTextField jtxtApellidos;
    public JPasswordField jtxtConfirmacion;
    public JPasswordField jtxtConstrasenia;
    public JTextField jtxtCorreo;
    public JTextField jtxtDNI;
    public JTextField jtxtNombres;
    public JTextField jtxtUsuario;

    public FrmRegistroTransportista() {
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jtxtNombres = new JTextField();
        jtxtApellidos = new JTextField();
        jLabel4 = new JLabel();
        jtxtUsuario = new JTextField();
        jLabel5 = new JLabel();
        jtxtConstrasenia = new JPasswordField();
        jLabel6 = new JLabel();
        jtxtConfirmacion = new JPasswordField();
        jbtnRegistrar = new JButton();
        jLabel7 = new JLabel();
        jtxtCorreo = new JTextField();
        jLabel8 = new JLabel();
        jtxtDNI = new JTextField();
        jLabel10 = new JLabel();
        jcbTipoUsuario = new JComboBox<>();
        jbtnCancelar = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new Color(51, 153, 255));
        setForeground(new Color(0, 153, 255));
        setResizable(false);
        /*addWindowListener(new event.WindowAdapter() {
            public void windowClosing(event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });*/

        jLabel1.setFont(new Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE TRABAJADOR");

        jLabel2.setFont(new Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("NOMBRES:");

        jLabel3.setFont(new Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("APELLIDOS:");

        jtxtNombres.setFont(new Font("Dialog", 0, 14)); // NOI18N

        jtxtApellidos.setFont(new Font("Dialog", 0, 14)); // NOI18N

        jLabel4.setFont(new Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("USUARIO:");

        jtxtUsuario.setFont(new Font("Dialog", 0, 14)); // NOI18N

        jLabel5.setFont(new Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("CONTRASEÑA:");

        jtxtConstrasenia.setFont(new Font("Dialog", 0, 14)); // NOI18N

        jLabel6.setFont(new Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("<html>CONFIRMAR CONTRASEÑA:</html>");

        jtxtConfirmacion.setFont(new Font("Dialog", 0, 14)); // NOI18N

        jbtnRegistrar.setFont(new Font("Dialog", 1, 14)); // NOI18N
        jbtnRegistrar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        jbtnRegistrar.setText("REGISTRAR");
        jbtnRegistrar.setPreferredSize(new Dimension(180, 40));

        jLabel7.setFont(new Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("CORREO:");

        jLabel8.setFont(new Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("DNI: ");

        jLabel10.setFont(new Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("TIPO: ");

        jcbTipoUsuario.setModel(new DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "TRANSPORTISTA" }));
        jcbTipoUsuario.setSelectedIndex(-1);
        jcbTipoUsuario.setToolTipText("");
        jcbTipoUsuario.setPreferredSize(new Dimension(23, 34));

        jbtnCancelar.setFont(new Font("Dialog", 1, 14)); // NOI18N
        jbtnCancelar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/x.png"))); // NOI18N
        jbtnCancelar.setText("CANCELAR");
        jbtnCancelar.setPreferredSize(new Dimension(150, 40));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 409, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(46, 46, 46)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jbtnRegistrar, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jbtnCancelar, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(jLabel3, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel2, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel4, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel5, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel6, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                                        .addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel8, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel10, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jtxtNombres)
                                                                        .addComponent(jtxtApellidos)
                                                                        .addComponent(jtxtUsuario)
                                                                        .addComponent(jtxtConstrasenia)
                                                                        .addComponent(jtxtConfirmacion)
                                                                        .addComponent(jtxtCorreo)
                                                                        .addComponent(jtxtDNI)
                                                                        .addComponent(jcbTipoUsuario, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE))))))
                                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtxtNombres, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtxtApellidos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtxtDNI, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtxtCorreo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtxtUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtxtConstrasenia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtxtConfirmacion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jcbTipoUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jbtnRegistrar, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbtnCancelar, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }
}
