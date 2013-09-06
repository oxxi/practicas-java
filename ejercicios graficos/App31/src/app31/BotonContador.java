/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app31;

import javax.swing.JButton;

/**
 *
 * @author Jose
 */
public class BotonContador extends JButton{
    int pulsaciones;
    private int aumento;
    
     public BotonContador(){
         pulsaciones =0;
         aumento =1;
     }
     //Metodos 
     public void setPulsaciones(int p){
         pulsaciones=p;
     }
     
     public int getPulsaciones(){
        return pulsaciones;
     }
     public void incrementa() {
        pulsaciones = pulsaciones+aumento;
     }
     public void decrementa() {
	pulsaciones--;
     }
     public void reiniciar() {
	pulsaciones=0;
     }
     public void aumenta(int c) {
         pulsaciones=pulsaciones+c;
     }
     public void disminuye(int c) {
         pulsaciones=pulsaciones-c;
     }

    /**
     * @param aumento the aumento to set
     */
    public void setAumento(int aumento) {
        this.aumento = aumento;
    }
}
