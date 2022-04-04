package Vista;

import Controlador.CtrlRegistroTrabajador;
import Controlador.IControlador;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

/**
 * @author Andre Mujica
 **/
public class FrmRegistroTrabajador extends IFrameView {

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

    public FrmRegistroTrabajador() {
        super("REGISTRO DE TRABAJADOR");
        JLabel jLabel1 = new JLabel();
        JLabel jLabel2 = new JLabel();
        JLabel jLabel3 = new JLabel();
        jtxtNombres = new JTextField();
        jtxtApellidos = new JTextField();
        JLabel jLabel4 = new JLabel();
        jtxtUsuario = new JTextField();
        JLabel jLabel5 = new JLabel();
        jtxtConstrasenia = new JPasswordField();
        JLabel jLabel6 = new JLabel();
        jtxtConfirmacion = new JPasswordField();
        jbtnRegistrar = new JButton();
        JLabel jLabel7 = new JLabel();
        jtxtCorreo = new JTextField();
        JLabel jLabel8 = new JLabel();
        jtxtDNI = new JTextField();
        JLabel jLabel10 = new JLabel();
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

        jLabel1.setFont(new Font("Dialog", Font.BOLD, 24)); 
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE TRABAJADOR");

        jLabel2.setFont(new Font("Dialog", Font.PLAIN, 14)); 
        jLabel2.setText("NOMBRES:");

        jLabel3.setFont(new Font("Dialog", Font.PLAIN, 14)); 
        jLabel3.setText("APELLIDOS:");

        jtxtNombres.setFont(new Font("Dialog", Font.PLAIN, 14)); 

        jtxtApellidos.setFont(new Font("Dialog", Font.PLAIN, 14)); 

        jLabel4.setFont(new Font("Dialog", Font.PLAIN, 14)); 
        jLabel4.setText("USUARIO:");

        jtxtUsuario.setFont(new Font("Dialog", Font.PLAIN, 14)); 

        jLabel5.setFont(new Font("Dialog", Font.PLAIN, 14)); 
        jLabel5.setText("CONTRASEÑA:");

        jtxtConstrasenia.setFont(new Font("Dialog", Font.PLAIN, 14)); 

        jLabel6.setFont(new Font("Dialog", Font.PLAIN, 14)); 
        jLabel6.setText("<html>CONFIRMAR CONTRASEÑA:</html>");

        jtxtConfirmacion.setFont(new Font("Dialog", Font.PLAIN, 14)); 

        jbtnRegistrar.setFont(new Font("Dialog", Font.BOLD, 14)); 
        jbtnRegistrar.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/add.png")))); 
        jbtnRegistrar.setText("REGISTRAR");
        jbtnRegistrar.setPreferredSize(new Dimension(180, 40));

        jLabel7.setFont(new Font("Dialog", Font.PLAIN, 14)); 
        jLabel7.setText("CORREO:");

        jLabel8.setFont(new Font("Dialog", Font.PLAIN, 14)); 
        jLabel8.setText("DNI: ");

        jLabel10.setFont(new Font("Dialog", Font.PLAIN, 14)); 
        jLabel10.setText("TIPO: ");

        jcbTipoUsuario.setModel(new DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "TRANSPORTISTA" }));
        jcbTipoUsuario.setSelectedIndex(-1);
        jcbTipoUsuario.setToolTipText("");
        jcbTipoUsuario.setPreferredSize(new Dimension(23, 34));

        jbtnCancelar.setFont(new Font("Dialog", Font.BOLD, 14)); 
        jbtnCancelar.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/x.png")))); 
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

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> (new FrmRegistroTrabajador()).setVisible(true));
    }

    @Override
    public IControlador generarControlador() {
        return new CtrlRegistroTrabajador(this);
    }
}
