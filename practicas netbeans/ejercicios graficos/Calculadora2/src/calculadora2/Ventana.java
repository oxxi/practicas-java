/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose
 */
public class Ventana extends javax.swing.JFrame implements ActionListener,KeyListener{
    boolean nuevaOp;
    double resultado;
    String operacion;
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        resultado = 0;
        operacion = "";
        nuevaOp = true;
        setLocationRelativeTo(null);
        setTitle("Calculadora Teclado");
        setResizable(false);
       this.addKeyListener(this);
       this.setFocusableWindowState(true);
    }
void OperacionSelec(String op){
    switch (op) {
            case "\n":
                Calculos();
                break;
            default:
                operacion = op;
                if ((resultado > 0) && !nuevaOp) {
                    Calculos();
                }else{
                    resultado = new Double(txtResultado.getText());
                }
                break;
        }
       nuevaOp = true;
}
void Calculos(){
    switch (operacion) {
            case "+":
                resultado += new Double(txtResultado.getText());
                break;
            case "-":
                resultado -= new Double(txtResultado.getText());
                break;
            case "*":
                resultado *= new Double(txtResultado.getText());
                break;
            case "/":
                resultado /= new Double(txtResultado.getText());
                break;
        }
        txtResultado.setText(""+ resultado);
        operacion = "";
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtResultado = new javax.swing.JTextField();
        btnCe = new javax.swing.JButton();
        btnNegativoPositivo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);

        txtResultado.setEditable(false);
        txtResultado.setBackground(new java.awt.Color(255, 255, 255));
        txtResultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtResultado.setText("0");
        txtResultado.setFocusable(false);

        btnCe.setText("CE");
        btnCe.setFocusable(false);
        btnCe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeActionPerformed(evt);
            }
        });

        btnNegativoPositivo.setText("- / +");
        btnNegativoPositivo.setFocusable(false);
        btnNegativoPositivo.setPreferredSize(new java.awt.Dimension(45, 23));
        btnNegativoPositivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegativoPositivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnNegativoPositivo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNegativoPositivo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCe, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeActionPerformed
        // TODO add your handling code here:
        resultado = 0;
        txtResultado.setText("0");
        nuevaOp = true;
       // Ventana().setFocusableWindowState(true);
    }//GEN-LAST:event_btnCeActionPerformed

    private void btnNegativoPositivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegativoPositivoActionPerformed
        // TODO add your handling code here:
        txtResultado.setText(""+(Double.parseDouble(txtResultado.getText())) * -1);
    }//GEN-LAST:event_btnNegativoPositivoActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCe;
    private javax.swing.JButton btnNegativoPositivo;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
      //JOptionPane.showMessageDialog(null, "la teclaes: "+e.getKeyChar() + " :");
        String var = ""+e.getKeyChar();
        if (Character.isDigit(e.getKeyChar()) || var.matches("[.]")) {//valida que sea un numero 
            if (txtResultado.getText().equals("0") || nuevaOp) {//si es una primera operacion
                txtResultado.setText(""+ e.getKeyChar());
            }else if(new Double(txtResultado.getText()) > 0 || var.matches("[.]") ){
                txtResultado.setText(txtResultado.getText() + e.getKeyChar());
            }
            nuevaOp = false;
        }else if(var.matches("[-,+,/,*,-,/\n]") ){//captura las operaciones 
            //JOptionPane.showMessageDialog(null, e.getKeyChar());
            
            OperacionSelec(var);
        }
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }
}
