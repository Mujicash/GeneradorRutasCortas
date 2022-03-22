package Vista;

import javax.swing.*;
import java.awt.*;
import Util.FondoPanel;

/**
 * @author Andre Mujica
 **/
public class FrmMapa extends JFrame {

    public JButton jbtnGuardar;
    public JButton jbtnRetroceder;
    public JPanel jpnBotones;
    public JPanel jpnMapa;

    public FrmMapa() {
        jpnBotones = new JPanel();
        jbtnRetroceder = new JButton();
        jbtnGuardar = new JButton();
        jpnMapa = new FondoPanel();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jpnBotones.setPreferredSize(new Dimension(360, 100));
        jpnBotones.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 30));

        jbtnRetroceder.setIcon(new ImageIcon(getClass().getResource("/Imagenes/flecha-atras2.png"))); // NOI18N
        jbtnRetroceder.setText("RETROCEDER");
        jbtnRetroceder.setPreferredSize(new Dimension(180, 40));
        jpnBotones.add(jbtnRetroceder);

        jbtnGuardar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/save.png"))); // NOI18N
        jbtnGuardar.setText("GUARDAR");
        jbtnGuardar.setPreferredSize(new Dimension(150, 40));
        jpnBotones.add(jbtnGuardar);

        getContentPane().add(jpnBotones, BorderLayout.PAGE_END);

        GroupLayout jpnMapaLayout = new GroupLayout(jpnMapa);
        jpnMapa.setLayout(jpnMapaLayout);
        jpnMapaLayout.setHorizontalGroup(
                jpnMapaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 1300, Short.MAX_VALUE)
        );
        jpnMapaLayout.setVerticalGroup(
                jpnMapaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(jpnMapa, BorderLayout.CENTER);

        pack();
    }

}
