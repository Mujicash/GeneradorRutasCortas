package Vista;

import Controlador.CtrlCalcularRutas;
import Controlador.IControlador;
import Modelo.IVista;
import Util.FondoPanel;
import javax.swing.*;
import java.awt.*;

/**
 * @author Andre Mujica
 **/
public class FrmCalcularRuta extends IVista {

    private JLabel jLabel1;
    private JLabel jLabel2;
    private JPanel jPanel1;
    public JButton jbtnCalcularRuta;
    public JButton jbtnEntregado;
    public JComboBox<String> jcbOrigen;
    public JPanel jpnMapa;
    public JTextField jtxtDestino;

    public FrmCalcularRuta() {
        super("CALCULAR RUTA MAS CORTA");
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jcbOrigen = new JComboBox<>();
        jLabel2 = new JLabel();
        jtxtDestino = new JTextField();
        jbtnCalcularRuta = new JButton();
        jbtnEntregado = new JButton();
        jpnMapa = new FondoPanel();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setMinimumSize(new Dimension(395, 100));
        jPanel1.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 30));

        jLabel1.setText("PUNTO DE ORIGEN: ");
        jLabel1.setPreferredSize(new Dimension(150, 40));
        jPanel1.add(jLabel1);

        jcbOrigen.setPreferredSize(new Dimension(200, 40));
        jPanel1.add(jcbOrigen);

        jLabel2.setText("PUNTO DE DESTINO: ");
        jLabel2.setPreferredSize(new Dimension(150, 40));
        jPanel1.add(jLabel2);

        jtxtDestino.setEditable(false);
        jtxtDestino.setPreferredSize(new Dimension(200, 40));
        jPanel1.add(jtxtDestino);

        jbtnCalcularRuta.setIcon(new ImageIcon(getClass().getResource("/Imagenes/map.png"))); // NOI18N
        jbtnCalcularRuta.setText("CALCULAR RUTA");
        jbtnCalcularRuta.setPreferredSize(new Dimension(200, 40));
        jPanel1.add(jbtnCalcularRuta);

        jbtnEntregado.setIcon(new ImageIcon(getClass().getResource("/Imagenes/deliverytruck_106577.png"))); // NOI18N
        jbtnEntregado.setText("ENTREGADO");
        jbtnEntregado.setPreferredSize(new Dimension(180, 40));
        jPanel1.add(jbtnEntregado);

        getContentPane().add(jPanel1, BorderLayout.PAGE_END);

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

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmCalcularRuta().setVisible(true);
            }
        });
    }

    @Override
    public IControlador generarControlador() {
        return new CtrlCalcularRutas(this);
    }
}
