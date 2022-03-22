package Vista;

import javax.swing.*;
import java.awt.*;

/**
 * @author Andre Mujica
 **/
public class FrmLogin extends JFrame {

    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    public JButton jbtnIniciar;
    private JPanel jpnLogin;
    public JPasswordField jtxtContrasenia;
    public JTextField jtxtUsuario;

    public FrmLogin() {
        super("INICIO DE SESION");

        jpnLogin = new JPanel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel1 = new JLabel();
        jtxtUsuario = new JTextField();
        jtxtContrasenia = new JPasswordField();
        jLabel6 = new JLabel();
        jbtnIniciar = new JButton();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        /*addWindowListener(new WindowAdapter() {
            public void windowClosing(event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });*/

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnLogin.setBackground(new Color(254, 254, 254));
        jpnLogin.setPreferredSize(new Dimension(550, 700));

        jLabel4.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        jLabel4.setForeground(new Color(4, 2, 2));
        jLabel4.setText("Bienvenido de nuevo");
        jLabel4.setPreferredSize(new Dimension(350, 19));

        jLabel5.setFont(new Font("Ubuntu", 1, 30)); // NOI18N
        jLabel5.setForeground(new Color(1, 1, 1));
        jLabel5.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel5.setText("Ingrese a su cuenta");
        jLabel5.setPreferredSize(new Dimension(350, 35));

        jLabel1.setPreferredSize(new Dimension(350, 18));

        jtxtUsuario.setBackground(new Color(254, 254, 254));
        jtxtUsuario.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        jtxtUsuario.setPreferredSize(new Dimension(350, 40));
        /*jtxtUsuario.addActionListener(new event.ActionListener() {
            public void actionPerformed(event.ActionEvent evt) {
                jtxtUsuarioActionPerformed(evt);
            }
        });*/

        jtxtContrasenia.setBackground(new Color(254, 254, 254));
        jtxtContrasenia.setFont(new Font("Ubuntu", 0, 18)); // NOI18N
        jtxtContrasenia.setPreferredSize(new Dimension(350, 40));

        jLabel6.setPreferredSize(new Dimension(350, 30));

        jbtnIniciar.setBackground(new Color(75, 160, 112));
        jbtnIniciar.setFont(new Font("Ubuntu", 1, 15)); // NOI18N
        jbtnIniciar.setText("INICIAR SESION");
        jbtnIniciar.setPreferredSize(new Dimension(350, 45));

        jLabel7.setPreferredSize(new Dimension(350, 12));

        jLabel8.setIcon(new ImageIcon(getClass().getResource("/Imagenes/user.png"))); // NOI18N

        jLabel9.setIcon(new ImageIcon(getClass().getResource("/Imagenes/pass.png"))); // NOI18N

        GroupLayout jpnLoginLayout = new GroupLayout(jpnLogin);
        jpnLogin.setLayout(jpnLoginLayout);
        jpnLoginLayout.setHorizontalGroup(
                jpnLoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jpnLoginLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jpnLoginLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpnLoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jpnLoginLayout.createSequentialGroup()
                                                .addGap(356, 356, 356)
                                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jpnLoginLayout.createSequentialGroup()
                                                .addComponent(jtxtUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jpnLoginLayout.createSequentialGroup()
                                                .addComponent(jtxtContrasenia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jbtnIniciar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(327, 327, 327))
        );
        jpnLoginLayout.setVerticalGroup(
                jpnLoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jpnLoginLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addGroup(jpnLoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jpnLoginLayout.createSequentialGroup()
                                                .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(64, 64, 64)
                                                .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jpnLoginLayout.createSequentialGroup()
                                                .addComponent(jtxtUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addGroup(jpnLoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jtxtContrasenia, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel9, GroupLayout.Alignment.TRAILING)))
                                        .addComponent(jLabel8))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addComponent(jbtnIniciar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59))
        );

        getContentPane().add(jpnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 460, 500));

        jLabel10.setIcon(new ImageIcon(getClass().getResource("/Imagenes/loginfondo.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 500));

        pack();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

}
