/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaii;

/**
 *
 * @author CEETI
 */
public class pruebaempleadoporcomision {
    public static void main(String[] args){
        empleadoporcomision empleado = new empleadoporcomision("Jorge", "Medina", "2222222222", 1000, 0.50);
        System.out.println("El Primer Nombre es "+empleado.getPrimernombre());
        System.out.println("El apellido paterno es "+empleado.getApellidopaterno());
        System.out.println("El numero nde seguro social es "+empleado.getNumerodesegurosocial());
        System.out.println("Las ventas brutas fueron "+empleado.getVentasbrutas());
        System.out.println("La Comision fue de "+empleado.getTarifacomision());
        empleado.setVentasbrutas(5000);
        empleado.setTarifacomision(0.2);
        System.out.println("***************************************************");
        System.out.println(empleado);
    }
    
}
