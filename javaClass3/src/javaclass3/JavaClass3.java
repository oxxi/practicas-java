/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass3;
import java.util.*;
/**
 *
 * @author Alumno
 */
public class JavaClass3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un animal");
        String animales = entrada.nextLine();
        animal an = new animal();
        an.sonido(animales);
    }
}
