/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientewscalculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Oxxi
 */
public class ClienteWsCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            com.calculadora.ws.CalculadoraWs_Service service = new com.calculadora.ws.CalculadoraWs_Service();
            com.calculadora.ws.CalculadoraWs port = service.getCalculadoraWsPort();
            
            int j = 4;
            int i = 3;
            int result = port.add(i, j);
            JOptionPane.showMessageDialog(null, result);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

   
}
