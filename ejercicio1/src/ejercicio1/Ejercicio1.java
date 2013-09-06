/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String nombre;
       System.out.println("Ingrese Su primer nombre"); 
       nombre = entrada.nextLine();
       nombre = nombre.replaceAll(" ", "");
       char[] C = nombre.toCharArray();
        for (int i = 0; i < nombre.length(); i++) {
            C[i] = '*';
            System.out.print(C[i]);
        }
       System.out.println();
    }
}
