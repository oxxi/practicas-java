/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetePrincipal;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author Jose
 */
public class ventanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form ventanaPrincipal
     */
    public ventanaPrincipal() {
        initComponents();
        ConfiguracionVentana();
    }
    public final void ConfiguracionVentana(){
        this.setSize(880, 600);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInterno = new javax.swing.JDesktopPane();
        menuArchivo = new javax.swing.JMenuBar();
        menuArchivoAbriir = new javax.swing.JMenu();
        menuArchivoAbrir = new javax.swing.JMenuItem();
        menuArchivoCerrar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuArchivoSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelInterno.setBackground(new java.awt.Color(0, 153, 204));
        panelInterno.setForeground(new java.awt.Color(0, 153, 204));
        getContentPane().add(panelInterno, java.awt.BorderLayout.CENTER);

        menuArchivoAbriir.setText("File");

        menuArchivoAbrir.setText("Abrir");
        menuArchivoAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArchivoAbrirActionPerformed(evt);
            }
        });
        menuArchivoAbriir.add(menuArchivoAbrir);

        menuArchivoCerrar.setText("Cerrar");
        menuArchivoAbriir.add(menuArchivoCerrar);
        menuArchivoAbriir.add(jSeparator1);

        menuArchivoSalir.setText("Salir");
        menuArchivoAbriir.add(menuArchivoSalir);

        menuArchivo.add(menuArchivoAbriir);

        setJMenuBar(menuArchivo);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuArchivoAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoAbrirActionPerformed
        // TODO add your handling code here:
        JFileChooser abrir = new JFileChooser();
        int boton = abrir.showOpenDialog(null);
        if (boton==JFileChooser.APPROVE_OPTION) {
            ///instanciar la MDI
            ventanaInterna vi = new ventanaInterna();
            vi.setResizable(true);
            vi.setMaximizable(true);
            vi.setIconifiable(true);
            vi.setClosable(true);
            panelInterno.add(vi);
            ///setiar la imagen al label
            String ruta = abrir.getSelectedFile().toString();
            vi.setImagen(ruta);
            vi.setTitle(ruta);
            vi.setVisible(true);
        }
    }//GEN-LAST:event_menuArchivoAbrirActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ventanaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuBar menuArchivo;
    private javax.swing.JMenu menuArchivoAbriir;
    private javax.swing.JMenuItem menuArchivoAbrir;
    private javax.swing.JMenuItem menuArchivoCerrar;
    private javax.swing.JMenuItem menuArchivoSalir;
    private javax.swing.JDesktopPane panelInterno;
    // End of variables declaration//GEN-END:variables
}
