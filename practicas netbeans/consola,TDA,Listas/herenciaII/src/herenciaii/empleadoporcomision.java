/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaii;

/**
 *
 * @author CEETI
 */
public class empleadoporcomision extends Object{
    private String Primernombre;
    private String Apellidopaterno;
    private String numerodesegurosocial;
    private double ventasbrutas;
    private double tarifacomision;
    
    public empleadoporcomision(String nombre, String apellido, String nss, double ventas, double tarifa){
        setPrimernombre(nombre);
        setApellidopaterno(apellido);
        setNumerodesegurosocial(nss);
        setTarifacomision(tarifa);
        setVentasbrutas(ventas);
    }

    /**
     * @return the Primernombre
     */
    public String getPrimernombre() {
        return Primernombre;
    }

    /**
     * @param Primernombre the Primernombre to set
     */
    public void setPrimernombre(String Primernombre) {
        this.Primernombre = Primernombre;
    }

    /**
     * @return the Apellidopaterno
     */
    public String getApellidopaterno() {
        return Apellidopaterno;
    }

    /**
     * @param Apellidopaterno the Apellidopaterno to set
     */
    public void setApellidopaterno(String Apellidopaterno) {
        this.Apellidopaterno = Apellidopaterno;
    }

    /**
     * @return the numerodesegurosocial
     */
    public String getNumerodesegurosocial() {
        return numerodesegurosocial;
    }

    /**
     * @param numerodesegurosocial the numerodesegurosocial to set
     */
    public void setNumerodesegurosocial(String numerodesegurosocial) {
        this.numerodesegurosocial = numerodesegurosocial;
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
    @Override
    public String toString(){
        return String.format("Empleado por comision "+Primernombre+" "+Apellidopaterno+"\nNumero de seguro Social "+numerodesegurosocial+"\n Ventas Brutas "+ventasbrutas+"\n Tarifa por Comision "+tarifacomision); 
    }
}
