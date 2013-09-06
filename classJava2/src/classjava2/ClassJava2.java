/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classjava2;
import java.util.*;
/**
 *
 * @author Alumno
 */
public class ClassJava2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese año");
        int anio = entrada.nextInt();
        averigua a =new averigua(anio);
        
    }
}
