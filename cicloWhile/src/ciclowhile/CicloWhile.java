/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclowhile;

/**
 *
 * @author Jose
 */
public class CicloWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suma = 0;
        int x=1;
        
        while (x<=10){
            suma = suma+x;
            x++;
        }
        System.out.println("La suma total es: "+suma);
    }
}
