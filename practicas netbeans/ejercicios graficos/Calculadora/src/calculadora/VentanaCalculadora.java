/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Jose
 */
public class VentanaCalculadora extends javax.swing.JFrame {
     boolean nuevaOp;// variable para determinar una nueva operacion
     String operacion; //Almacena la operacion
     double resultado; //alamcena el resultado
    /**
     * Creates new form VentanaCalculadora
     */
    
    public VentanaCalculadora() {
        initComponents();
        setTitle("Calculadora");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        
        nuevaOp = true; // variable para determinar una nueva operacion
        operacion ="";
        resultado = 0;
        
        //Agregar el listener a los botnes numerico
        btn1.addActionListener(evt);
        btn2.addActionListener(evt);
        btn3.addActionListener(evt);
        btn4.addActionListener(evt);
        btn5.addActionListener(evt);
        btn6.addActionListener(evt);
        btn7.addActionListener(evt);
        btn8.addActionListener(evt);
        btn9.addActionListener(evt);
        btn0.addActionListener(evt);
        btnPunto.addActionListener(evt);
        //Agregar listener a los botones de Operacion
        btnSuma.addActionListener(event);
        btnResta.addActionListener(event);
        btnMultiplica.addActionListener(event);
        btnDivide.addActionListener(event);
        btnIgual.addActionListener(event);
        btnCE.addActionListener(event);
    }
    /*Creo el listener para saber que boton numerico se preciono*/
    private final ActionListener evt = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet.");
            JButton btn = (JButton) e.getSource();
            Numero(btn.getText());
        }
    };
    /**Creando el listener para los botones de operacion
     */
    private  final  ActionListener event = new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet.");
            JButton obj = (JButton) e.getSource();
            //JOptionPane.showMessageDialog(null, btn.getText());
            OperacionSelec(obj.getText());
        }
    };
    
   //funcion para saber si se concatena  o se realiza una operacion
    //@param digito: resive un parametro para saber si se concatena
    void Numero(String digito){
        if (txtResultado.getText().equals("0") || nuevaOp) {
            txtResultado.setText(digito);
        }else{
            txtResultado.setText(txtResultado.getText() + digito);
        }
        nuevaOp = false;
    }
    
    /**
    Funcion para saber que boton de operacion se pulso
    ** @param: el parametro que resibe es la operacion
     **/
    void OperacionSelec(String op){
        switch (op) {
            case "=":
                Calculos();
                break;
            case "CE":
                resultado = 0;
                txtResultado.setText("0");
                nuevaOp = true;
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
    //Funcion que realiz los calculos
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
     **
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelResultado = new javax.swing.JPanel();
        txtResultado = new javax.swing.JTextField();
        panelBotones = new javax.swing.JPanel();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        panelOperaciones = new javax.swing.JPanel();
        btnSuma = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnMultiplica = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        btnNegaPositivo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtResultado.setEditable(false);
        txtResultado.setBackground(new java.awt.Color(255, 255, 255));
        txtResultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtResultado.setText("0");

        javax.swing.GroupLayout panelResultadoLayout = new javax.swing.GroupLayout(panelResultado);
        panelResultado.setLayout(panelResultadoLayout);
        panelResultadoLayout.setHorizontalGroup(
            panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtResultado)
                .addContainerGap())
        );
        panelResultadoLayout.setVerticalGroup(
            panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadoLayout.createSequentialGroup()
                .addComponent(txtResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBotones.setLayout(new java.awt.GridLayout(4, 3, 3, 2));

        btn7.setText("7");
        panelBotones.add(btn7);

        btn8.setText("8");
        panelBotones.add(btn8);

        btn9.setText("9");
        panelBotones.add(btn9);

        btn4.setText("4");
        panelBotones.add(btn4);

        btn5.setText("5");
        panelBotones.add(btn5);

        btn6.setText("6");
        panelBotones.add(btn6);

        btn1.setText("1");
        panelBotones.add(btn1);

        btn2.setText("2");
        panelBotones.add(btn2);

        btn3.setText("3");
        panelBotones.add(btn3);

        btn0.setText("0");
        panelBotones.add(btn0);

        btnPunto.setText(".");
        panelBotones.add(btnPunto);

        btnSuma.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        btnSuma.setForeground(new java.awt.Color(255, 51, 51));
        btnSuma.setText("+");
        btnSuma.setPreferredSize(new java.awt.Dimension(79, 30));

        btnResta.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        btnResta.setForeground(new java.awt.Color(255, 51, 51));
        btnResta.setText("-");
        btnResta.setPreferredSize(new java.awt.Dimension(79, 30));

        btnMultiplica.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        btnMultiplica.setForeground(new java.awt.Color(255, 51, 51));
        btnMultiplica.setText("*");
        btnMultiplica.setPreferredSize(new java.awt.Dimension(79, 30));

        btnDivide.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        btnDivide.setForeground(new java.awt.Color(255, 51, 51));
        btnDivide.setText("/");
        btnDivide.setPreferredSize(new java.awt.Dimension(79, 30));

        btnIgual.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        btnIgual.setForeground(new java.awt.Color(255, 51, 51));
        btnIgual.setText("=");
        btnIgual.setPreferredSize(new java.awt.Dimension(79, 30));

        btnCE.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        btnCE.setForeground(new java.awt.Color(255, 51, 51));
        btnCE.setText("CE");
        btnCE.setPreferredSize(new java.awt.Dimension(79, 30));

        javax.swing.GroupLayout panelOperacionesLayout = new javax.swing.GroupLayout(panelOperaciones);
        panelOperaciones.setLayout(panelOperacionesLayout);
        panelOperacionesLayout.setHorizontalGroup(
            panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOperacionesLayout.createSequentialGroup()
                .addGroup(panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiplica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelOperacionesLayout.setVerticalGroup(
            panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOperacionesLayout.createSequentialGroup()
                .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMultiplica, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnNegaPositivo.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        btnNegaPositivo.setForeground(new java.awt.Color(255, 0, 0));
        btnNegaPositivo.setText("- / +");
        btnNegaPositivo.setPreferredSize(new java.awt.Dimension(79, 30));
        btnNegaPositivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegaPositivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelOperaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNegaPositivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNegaPositivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(21, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNegaPositivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegaPositivoActionPerformed
        // TODO add your handling code here:
        txtResultado.setText(""+(Double.parseDouble(txtResultado.getText()) * -1));
    }//GEN-LAST:event_btnNegaPositivoActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaCalculadora().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMultiplica;
    private javax.swing.JButton btnNegaPositivo;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelOperaciones;
    private javax.swing.JPanel panelResultado;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
