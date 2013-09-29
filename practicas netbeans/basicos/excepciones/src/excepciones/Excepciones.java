/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;
/**
 *
 * @author Alumno
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor =5, cero=0;
        int[] array = {1,2,3};
      try{
          valor = valor/cero;
          array[4]=5;
      }catch(ArithmeticException e){
          System.out.println("Division Por Cero");
      }
      catch(Exception e){
          System.out.println("Se Produjo un erro");
      }
        
    }
}
