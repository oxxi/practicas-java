/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetePrincipal;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose
 */
public class VentanaPrincipal extends javax.swing.JFrame {
SalaCine central;
SalaCine vo;
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        //instanciacion de las Clases
        central = new SalaCine();
        vo = new SalaCine();
        
        central.setAforo(500);
        central.setEntradas(8.0);
        
        vo.setAforo(80);
        vo.setEntradas(6.0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCental = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCentralPelicula = new javax.swing.JLabel();
        btnCentralCambiar = new javax.swing.JButton();
        btnCentralNueva = new javax.swing.JButton();
        btnCentralOcupacion = new javax.swing.JButton();
        btnCentralVaciar = new javax.swing.JButton();
        btnCentralIngreso = new javax.swing.JButton();
        panelVOriginal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblOriginalPelicula = new javax.swing.JLabel();
        btnOriginlCambiar = new javax.swing.JButton();
        btnOriginalNueva = new javax.swing.JButton();
        btnOriginalOcupacion = new javax.swing.JButton();
        btnOriginalVaciar = new javax.swing.JButton();
        btnOriginalIngreso = new javax.swing.JButton();
        btnIngresoTotal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelCental.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("SALA CENTRAL");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Pelicula");

        lblCentralPelicula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCentralCambiar.setText("Cambiar");
        btnCentralCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentralCambiarActionPerformed(evt);
            }
        });

        btnCentralNueva.setText("Nueva Venta");
        btnCentralNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentralNuevaActionPerformed(evt);
            }
        });

        btnCentralOcupacion.setText("%  Ocupacion");
        btnCentralOcupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentralOcupacionActionPerformed(evt);
            }
        });

        btnCentralVaciar.setText("Vaciar");
        btnCentralVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentralVaciarActionPerformed(evt);
            }
        });

        btnCentralIngreso.setText("Ingresos");
        btnCentralIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentralIngresoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCentalLayout = new javax.swing.GroupLayout(panelCental);
        panelCental.setLayout(panelCentalLayout);
        panelCentalLayout.setHorizontalGroup(
            panelCentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentalLayout.createSequentialGroup()
                .addGroup(panelCentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCentalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(panelCentalLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(panelCentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCentalLayout.createSequentialGroup()
                                .addComponent(btnCentralNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCentralOcupacion)
                                .addGap(18, 18, 18)
                                .addComponent(btnCentralVaciar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCentralIngreso))
                            .addGroup(panelCentalLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCentralPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCentralCambiar)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        panelCentalLayout.setVerticalGroup(
            panelCentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(panelCentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3)
                    .addComponent(btnCentralCambiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCentralPelicula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55)
                .addGroup(panelCentalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCentralNueva)
                    .addComponent(btnCentralOcupacion)
                    .addComponent(btnCentralVaciar)
                    .addComponent(btnCentralIngreso))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        panelVOriginal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("SALA VERSIÓN ORIGINAL");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Pelicula");

        lblOriginalPelicula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnOriginlCambiar.setText("Cambiar");
        btnOriginlCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOriginlCambiarActionPerformed(evt);
            }
        });

        btnOriginalNueva.setText("Nueva Venta");
        btnOriginalNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOriginalNuevaActionPerformed(evt);
            }
        });

        btnOriginalOcupacion.setText("% Ocupacion");
        btnOriginalOcupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOriginalOcupacionActionPerformed(evt);
            }
        });

        btnOriginalVaciar.setText("Vaciar");
        btnOriginalVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOriginalVaciarActionPerformed(evt);
            }
        });

        btnOriginalIngreso.setText("Ingreso");
        btnOriginalIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOriginalIngresoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelVOriginalLayout = new javax.swing.GroupLayout(panelVOriginal);
        panelVOriginal.setLayout(panelVOriginalLayout);
        panelVOriginalLayout.setHorizontalGroup(
            panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVOriginalLayout.createSequentialGroup()
                .addGroup(panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVOriginalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(panelVOriginalLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelVOriginalLayout.createSequentialGroup()
                                .addComponent(btnOriginalNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnOriginalOcupacion)
                                .addGap(18, 18, 18)
                                .addComponent(btnOriginalVaciar)
                                .addGap(18, 18, 18)
                                .addComponent(btnOriginalIngreso))
                            .addGroup(panelVOriginalLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(lblOriginalPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnOriginlCambiar)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelVOriginalLayout.setVerticalGroup(
            panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVOriginalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnOriginlCambiar)
                    .addGroup(panelVOriginalLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40)
                        .addGroup(panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(lblOriginalPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOriginalNueva)
                    .addComponent(btnOriginalOcupacion)
                    .addComponent(btnOriginalVaciar)
                    .addComponent(btnOriginalIngreso))
                .addGap(38, 38, 38))
        );

        btnIngresoTotal.setText("Ingresos Totales");
        btnIngresoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(panelCental, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panelVOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnIngresoTotal)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCental, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelVOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnIngresoTotal)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCentralCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentralCambiarActionPerformed
        // TODO add your handling code here:
        String titulo;
        titulo = JOptionPane.showInputDialog(null,"introduce el Titulo de la Pelicula: ");
        central.setPeliculas(titulo);
        lblCentralPelicula.setText(titulo);
    }//GEN-LAST:event_btnCentralCambiarActionPerformed

    private void btnCentralNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentralNuevaActionPerformed
        // TODO add your handling code here:
        central.entradaUno();
    }//GEN-LAST:event_btnCentralNuevaActionPerformed

    private void btnCentralOcupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentralOcupacionActionPerformed
        // TODO add your handling code here:
        String info;
        info = "Sala Cental \n";
        info = info+"Peicula: "+central.getPeliculas()+"\n";
        info = info+"Aforo: "+central.getAforo()+"\n";
        info = info+"Ocupadas: "+central.getOcupadas()+"\n";
        info = info+"libres: "+central.getLibres()+"\n";
        info = info+"Procentaje Ocupacion: "+central.getPorcentaje()+"\n";
        
        JOptionPane.showMessageDialog(null, info);
    }//GEN-LAST:event_btnCentralOcupacionActionPerformed

    private void btnCentralVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentralVaciarActionPerformed
        // TODO add your handling code here:
        central.Vaciar();
        lblCentralPelicula.setText("");
    }//GEN-LAST:event_btnCentralVaciarActionPerformed

    private void btnCentralIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentralIngresoActionPerformed
        // TODO add your handling code here:
        String info;
        info = "Ingreso de la Sala "+central.getIngresos()+" Euros";
        
        JOptionPane.showMessageDialog(null, info);
    }//GEN-LAST:event_btnCentralIngresoActionPerformed

    private void btnOriginlCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOriginlCambiarActionPerformed
        // TODO add your handling code here:
        String titulo;
        titulo = JOptionPane.showInputDialog(null,"introduce el Titulo de la Pelicula: ");
        vo.setPeliculas(titulo);
        lblOriginalPelicula.setText(titulo);
    }//GEN-LAST:event_btnOriginlCambiarActionPerformed

    private void btnOriginalNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOriginalNuevaActionPerformed
        // TODO add your handling code here:
        vo.entradaUno();
    }//GEN-LAST:event_btnOriginalNuevaActionPerformed

    private void btnOriginalOcupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOriginalOcupacionActionPerformed
        // TODO add your handling code here:
        String info;
        info = "Sala Cental \n";
        info = info+"Peicula: "+vo.getPeliculas()+"\n";
        info = info+"Aforo: "+vo.getAforo()+"\n";
        info = info+"Ocupadas: "+vo.getOcupadas()+"\n";
        info = info+"libres: "+vo.getLibres()+"\n";
        info = info+"Procentaje Ocupacion: "+vo.getPorcentaje()+"\n";
        
        JOptionPane.showMessageDialog(null, info);
    }//GEN-LAST:event_btnOriginalOcupacionActionPerformed

    private void btnOriginalVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOriginalVaciarActionPerformed
        // TODO add your handling code here:
        vo.Vaciar();
        lblOriginalPelicula.setText("");
    }//GEN-LAST:event_btnOriginalVaciarActionPerformed

    private void btnOriginalIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOriginalIngresoActionPerformed
        // TODO add your handling code here:
        String info;
        info = "Ingreso de la Sala "+vo.getIngresos()+" Euros";
        
        JOptionPane.showMessageDialog(null, info);
    }//GEN-LAST:event_btnOriginalIngresoActionPerformed

    private void btnIngresoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoTotalActionPerformed
        // TODO add your handling code here:
        double cntl,org,tt;
        cntl = central.getIngresos();
        org = vo.getIngresos();
        tt = cntl +org;
        
        JOptionPane.showMessageDialog(null, "El ingreso Total es: "+tt+" Euros");
        
        
    }//GEN-LAST:event_btnIngresoTotalActionPerformed

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
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCentralCambiar;
    private javax.swing.JButton btnCentralIngreso;
    private javax.swing.JButton btnCentralNueva;
    private javax.swing.JButton btnCentralOcupacion;
    private javax.swing.JButton btnCentralVaciar;
    private javax.swing.JButton btnIngresoTotal;
    private javax.swing.JButton btnOriginalIngreso;
    private javax.swing.JButton btnOriginalNueva;
    private javax.swing.JButton btnOriginalOcupacion;
    private javax.swing.JButton btnOriginalVaciar;
    private javax.swing.JButton btnOriginlCambiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCentralPelicula;
    private javax.swing.JLabel lblOriginalPelicula;
    private javax.swing.JPanel panelCental;
    private javax.swing.JPanel panelVOriginal;
    // End of variables declaration//GEN-END:variables
}