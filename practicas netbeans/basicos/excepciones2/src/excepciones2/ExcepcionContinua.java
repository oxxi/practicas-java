/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones2;

/**
 *
 * @author Alumno
 */
class ExcepcionContinua {
    static void divide(){
     int[] num = {4,8,16,32,64,128,256};
     int [] dem ={2,0,4,4,0,8,16};
        for (int i = 0; i < num.length; i++) {
            try{
                System.out.println(num[i]+"/"+"="+num[i]/dem[i]);
            }
            catch(java.lang.ArithmeticException exception){
                System.out.println("Dividiendo por Cero");
            }
        }
 }
}
