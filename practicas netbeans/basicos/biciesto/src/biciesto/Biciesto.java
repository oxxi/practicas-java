/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biciesto;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Biciesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int anyo;
        System.out.println("Ingrese año");
        anyo = entrada.nextInt();
        
        if ((anyo % 4) == 0 && (anyo % 100) != 0 || (anyo % 400) == 0) {
            System.out.println("El año: "+anyo+" es bisiesto");
        }else{
            System.out.println("El año: "+anyo+" No es bisiesto");
        }
        
    }
}
