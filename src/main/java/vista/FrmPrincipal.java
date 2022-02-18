
package vista;

import javax.swing.JPanel;

/**
 *
 * @author Andre Mujica
 */
public class FrmPrincipal extends javax.swing.JFrame {

    public FrmPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jpnPrincipal = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuInformacion = new javax.swing.JMenu();
        mitPerfil = new javax.swing.JMenuItem();
        mitSalir = new javax.swing.JMenuItem();
        menuGestionar = new javax.swing.JMenu();
        mitTrabajadores = new javax.swing.JMenuItem();
        mitNodos = new javax.swing.JMenuItem();
        mitLocales = new javax.swing.JMenuItem();
        mitPedidos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 700));

        jpnPrincipal.setBackground(new java.awt.Color(254, 254, 254));
        jpnPrincipal.setLayout(new java.awt.CardLayout());

        jMenuBar1.setPreferredSize(new java.awt.Dimension(1200, 40));

        menuInformacion.setText("INFORMACION");

        mitPerfil.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        mitPerfil.setText("MI PERFIL");
        menuInformacion.add(mitPerfil);

        mitSalir.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        mitSalir.setText("SALIR");
        menuInformacion.add(mitSalir);

        jMenuBar1.add(menuInformacion);

        menuGestionar.setText("GESTIONAR");

        mitTrabajadores.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        mitTrabajadores.setText("TRABAJADORES");
        mitTrabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitTrabajadoresActionPerformed(evt);
            }
        });
        menuGestionar.add(mitTrabajadores);

        mitNodos.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        mitNodos.setText("NODOS");
        mitNodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitNodosActionPerformed(evt);
            }
        });
        menuGestionar.add(mitNodos);

        mitLocales.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        mitLocales.setText("LOCALES");
        mitLocales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitLocalesActionPerformed(evt);
            }
        });
        menuGestionar.add(mitLocales);

        mitPedidos.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        mitPedidos.setText("PEDIDOS");
        mitPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitPedidosActionPerformed(evt);
            }
        });
        menuGestionar.add(mitPedidos);

        jMenuBar1.add(menuGestionar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mitTrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitTrabajadoresActionPerformed
/*
        panelPrincipal.removeAll();
        panelPrincipal.add(panelActual);
        panelPrincipal.repaint();
        panelPrincipal.revalidate();

*/
        System.out.println("ini");
        FrmTrabajadores vista = new FrmTrabajadores();
        cambiarMenu(vista);
        System.out.println("fin");
    }//GEN-LAST:event_mitTrabajadoresActionPerformed

    private void mitNodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitNodosActionPerformed

        FrmNodos vista = new FrmNodos();
        cambiarMenu(vista);
    }//GEN-LAST:event_mitNodosActionPerformed

    private void mitLocalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitLocalesActionPerformed

        FrmLocales vista = new FrmLocales();
        cambiarMenu(vista);

    }//GEN-LAST:event_mitLocalesActionPerformed

    private void mitPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitPedidosActionPerformed
        
        FrmPedidos vista = new FrmPedidos();
        cambiarMenu(vista);

    }//GEN-LAST:event_mitPedidosActionPerformed

    private void cambiarMenu(JPanel nuevo){
        jpnPrincipal.removeAll();
        jpnPrincipal.add(nuevo);
        jpnPrincipal.repaint();
        jpnPrincipal.revalidate();
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jpnPrincipal;
    private javax.swing.JMenu menuGestionar;
    private javax.swing.JMenu menuInformacion;
    private javax.swing.JMenuItem mitLocales;
    private javax.swing.JMenuItem mitNodos;
    private javax.swing.JMenuItem mitPedidos;
    private javax.swing.JMenuItem mitPerfil;
    private javax.swing.JMenuItem mitSalir;
    private javax.swing.JMenuItem mitTrabajadores;
    // End of variables declaration//GEN-END:variables
}
