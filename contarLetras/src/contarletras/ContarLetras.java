/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contarletras;

import java.util.Scanner;



/**
 *
 * @author Jose
 */
public class ContarLetras {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String stxt;
        int contador = 0;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese un texto");
        stxt = lectura.nextLine();
        stxt = stxt.replaceAll(" ","");
        char[] C = stxt.toCharArray();
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C.length; j++) {
                if (C[i]==C[j]) {
                    //System.out.println("valor de i es= "+C[i]+" |Valor de j: "+C[j]);
                    contador++;  
                }
            } 
           System.out.println(C[i]+": "+contador);
           contador = 0;
        }
    }
}
