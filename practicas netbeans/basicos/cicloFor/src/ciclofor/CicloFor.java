/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclofor;

/**
 *
 * @author Jose
 */
public class CicloFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i <= 5; i++) {
            System.out.println("valor de i es: "+ i);
            System.out.println("-----------------");
            for (int j = 1; j <= 3; j++) {
                System.out.println("valor de j es: "+ j);
                System.out.println("-----------------");
                for (int k = 1; k <= 4; k++) {
                    System.out.println("valor de k es:"+ k);
                    System.out.print("*");
                    System.out.println();
                }
                System.out.println();
            }
            
        }
    }
}
