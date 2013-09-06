/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bloquedowhile;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class BloquedoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 0;
        int factorial = 1;
        int entero;
        System.out.println("Ingrese un numero entero:");
        Scanner entrada = new Scanner(System.in);
        entero=entrada.nextInt();
            do {
            factorial*=numero;
            numero--;
            
        } while (numero>0);
        
      System.out.println("El Factorial de "+entero);
        if (entero>0 && entero <=25) {
            System.out.println("es "+factorial);
        }else if (entero == 0){
            System.out.println("El factorial es: 1");
        }else{
            System.out.println("No se puede calcular");
        }
    }
}
