/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author CEETI
 */
public class empleadoporcomision {
    private String primernombre;
    private String apellidopaterno;
    private String numerosegurosocial;
    private double ventasbrutas;
    private double tarifacomision;
    
    public empleadoporcomision(String nombre, String apellido, String nns, double ventas,double tarifa){
        //se puede hacer uso del identificador this
        String primernombre =nombre;
        String apellidopaterno = apellido;
        String numerosegurosocial = nns;
        setVentasbrutas(ventas);
        setTarifacomision(tarifa);
    }

    /**
     * @return the primernombre
     */
    public String getPrimernombre() {
        return primernombre;
    }

    /**
     * @param primernombre the primernombre to set
     */
    public void setPrimernombre(String primernombre) {
        this.primernombre = primernombre;
    }

    /**
     * @return the apellidopaterno
     */
    public String getApellidopaterno() {
        return apellidopaterno;
    }

    /**
     * @param apellidopaterno the apellidopaterno to set
     */
    public void setApellidopaterno(String apellidopaterno) {
        this.apellidopaterno = apellidopaterno;
    }

    /**
     * @return the numerosegurosocial
     */
    public String getNumerosegurosocial() {
        return numerosegurosocial;
    }

    /**
     * @param numerosegurosocial the numerosegurosocial to set
     */
    public void setNumerosegurosocial(String numerosegurosocial) {
        this.numerosegurosocial = numerosegurosocial;
    }

    /**
     * @return the ventasbrutas
     */
    public double getVentasbrutas() {
        return ventasbrutas;
    }

    /**
     * @param ventasbrutas the ventasbrutas to set
     */
    public void setVentasbrutas(double ventasbrutas) {
        this.ventasbrutas = ventasbrutas;
    }

    /**
     * @return the tarifacomision
     */
    public double getTarifacomision() {
        return tarifacomision;
    }

    /**
     * @param tarifacomision the tarifacomision to set
     */
    public void setTarifacomision(double tarifacomision) {
        this.tarifacomision = tarifacomision;
    }
    
//creacion de los metodos 
    public double ingreso(){
        return tarifacomision * ventasbrutas;
    }
    @Override
    //toString jala las cadenas
    public String toString(){
        return String.format("Empleado por comision "+primernombre+" "+apellidopaterno+"\n numero de seguro social "+numerosegurosocial+ "\nventas brutas"+ventasbrutas+"\ntarifa comision"+tarifacomision);    
    }    

}
