/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaci;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Fibonaci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int longitud;
        int temp;
        int x =0;
        int anterior = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la longitud de la serie fibonaci");
        longitud = entrada.nextInt();
       while(true){
            temp = x;
            x = x + anterior;
            anterior = temp;
            System.out.print(anterior);
            System.out.print(",");
            System.out.print(x);
       
           if (x == longitud) {
               break;
           }
         x++;
       }
       System.out.println();
       
        
    }
}
