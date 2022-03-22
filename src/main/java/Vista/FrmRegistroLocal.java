package Vista;

import javax.swing.*;
import java.awt.*;

/**
 * @author Andre Mujica
 **/
public class FrmRegistroLocal extends JFrame {

    private JLabel jLabel1;
    private JLabel jLabel2;
    public JButton jbtnUbicacion;
    public JButton jbtnUbicacionCANCELAR;
    public JTextField jtxtNombre;

    public FrmRegistroLocal() {
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jtxtNombre = new JTextField();
        jbtnUbicacion = new JButton();
        jbtnUbicacionCANCELAR = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setText("REGISTRO DE LOCAL");
        jLabel1.setToolTipText("");

        jLabel2.setText("NOMBRE: ");
        jLabel2.setMaximumSize(new Dimension(70, 40));
        jLabel2.setMinimumSize(new Dimension(70, 40));
        jLabel2.setPreferredSize(new Dimension(70, 40));

        jtxtNombre.setPreferredSize(new Dimension(23, 40));

        jbtnUbicacion.setFont(new Font("Ubuntu", 1, 15)); // NOI18N
        jbtnUbicacion.setText("UBICAR PUNTO EN EL MAPA");
        jbtnUbicacion.setPreferredSize(new Dimension(250, 40));

        jbtnUbicacionCANCELAR.setFont(new Font("Ubuntu", 1, 15)); // NOI18N
        jbtnUbicacionCANCELAR.setText("CANCELAR");
        jbtnUbicacionCANCELAR.setPreferredSize(new Dimension(140, 40));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(118, 118, 118)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jbtnUbicacion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jbtnUbicacionCANCELAR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jtxtNombre, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtxtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jbtnUbicacionCANCELAR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jbtnUbicacion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }
}
