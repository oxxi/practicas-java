/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturastring;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class LecturaString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String cadena;
       Scanner entrada = new Scanner(System.in);
       System.out.println("Ingrese una frase");
       cadena = entrada.nextLine();
       System.out.println("La frase ingresada fue:");
       System.out.println(cadena);
       System.out.println("la frase tiene: " +cadena.length()+" caracteres" );
    }
}
