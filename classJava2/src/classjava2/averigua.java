/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classjava2;

/**
 *
 * @author Alumno
 */
public class averigua {
    public averigua(int anio){
        
        if (anio%4==0 && anio%100 !=0 || anio%400==0) 
          System.out.println("El año es bisiesto");
        else
            System.out.println("El año no es bisiesto");   
           
    }
            
}
