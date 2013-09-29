/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass3;

/**
 *
 * @author Alumno
 */
public class animal {
    public void sonido(String animal){
        String perro="perro";
        String gato="gato";
        String pollito="pollito";
        if (animal.equals(perro)) {
            System.out.println("Guao Guao!!!");
        }
        else if(animal.equals(gato)){
            System.out.println("miau miau!!!");
        }
        else if (animal.equals(pollito)){
            System.out.println("Pio Pio!!");
        }
        else{
            System.out.println("Ese animal no esta");
        }
            
    }
    
}
