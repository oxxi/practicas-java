/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        int promedio;
        Scanner entrada = new Scanner(System.in);
       for (int a=0; a<10; a++){
            System.out.println("introdusca nota 1 alumno "+ (a+1));
            nota1 = entrada.nextInt();
            System.out.println("introdusca nota 2 alumno "+ (a+1));
             nota2 = entrada.nextInt();
             System.out.println("introdusca nota 3 alumno "+ (a+1));
            nota3 = entrada.nextInt();
            
             promedio =(nota1+nota2+nota3)/3;
        
            if(promedio<=100 && promedio >=100){
                System.out.println("A");
                System.out.println(promedio);
            }else if (promedio <90 && promedio >=80){
                System.out.println("B");
                System.out.println(promedio);
            }else if (promedio <80 && promedio >=70){
                System.out.println("C");
                System.out.println(promedio);            
            }else if (promedio <70 && promedio >=60){
                System.out.println("D");
                System.out.println(promedio);
            }else{
                System.out.println("Reprobado");
            }//fin else
        }//fin del for 
        
        
       
    }
}
