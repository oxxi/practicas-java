/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String nombres;
        int contador = 0;
        System.out.println("Ingrese Su Nombre y Apellido");
        nombres = entrada.nextLine();
        nombres = nombres.replaceAll(" ", "");
        char [] C = nombres.toCharArray();
         for (int i = 0; i < C.length; i++) {
            contador++;
        }
         System.out.println("El numero de caracteres que contiene son: "+contador);
    }
}
