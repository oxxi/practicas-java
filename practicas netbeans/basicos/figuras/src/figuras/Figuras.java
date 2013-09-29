/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int figura;
        System.out.println("Seleccione una Opcion \n [1]<--Cuadrado"
                + "\n [2]<--Triangulo \n [3]<--Rombo");
        figura = entrada.nextInt();
        switch(figura){
            case 1:
                //Impresion de cuadrado 
                System.out.println("-------------");
                for (int i = 0; i < 4; i++) {
                    System.out.print("\t@");
                    for (int j = 0; j < 6; j++) {
                        System.out.print("@");
                    }
                    System.out.println();
                }
                System.out.println("-------------");
                break;
            case 2:
                //Impresion de Triangulo 
                System.out.println("-------------");
                for(int i=1; i<=5; i++){
                    for(int j=5-i; j>0; j--)
                        System.out.print(' ');
                    for(int k=1; k<2*i; k++)
                        System.out.print('@');
                    System.out.println("");
                }
                break;
            case 3:
                //impresion de rombo 
              System.out.println("-------------");
              for(int i=1; i<=5; i++){
                    for(int j=5-i; j>0; j--)
                        System.out.print(' ');
                    for(int k=1; k<2*i; k++)
                        System.out.print('@');
                    System.out.println("");
                }           
               for(int i=4; i>0; i--){
                    for(int j=5-i; j>0; j--)
                        System.out.print(' ');
                    for(int k=1; k<2*i; k++)
                        System.out.print('@');
                    System.out.println("");
                }
                break;
            default:
                System.out.println("No es una opcion");
                break;
        }
    }
}
