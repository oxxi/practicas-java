/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app29;

/**
 *
 * @author Jose
 */
public class SalaCine {
    private int Aforo;
    private int Ocupadas;
    private String Pelicula;
    private int Entrada;
 
    public SalaCine(){
        Aforo = 100;
        Ocupadas=0;
        Pelicula="";
        Entrada=5;
        
    }

    /**
     * @return the Aforo
     */
    public int getAforo() {
        return Aforo;
    }

    /**
     * @return the Ocupadas
     */
    public int getOcupadas() {
        return Ocupadas;
    }

    /**
     * @return the Pelicula
     */
    public String getPelicula() {
        return Pelicula;
    }

    /**
     * @return the Entrada
     */
    public int getEntrada() {
        return Entrada;
    }
    
    public int getLibres(){
        int lib;
        lib = Aforo - Ocupadas;
        return lib;
    }
    public double getPorcentaje(){
        double por;
        
        por = (double) Ocupadas / ((double) (Aforo*100.0));
        return por;
    }
    public double getIngresos(){
        double ingr;
        ingr = Ocupadas * Entrada;
        return ingr;
    }
///////////////Setter
    /**
     * @param Aforo the Aforo to set
     */
    public void setAforo(int Aforo) {
        this.Aforo = Aforo;
    }

    /**
     * @param Ocupadas the Ocupadas to set
     */
    public void setOcupadas(int Ocupadas) {
        this.Ocupadas = Ocupadas;
    }

    /**
     * @param Pelicula the Pelicula to set
     */
    public void setPelicula(String Pelicula) {
        this.Pelicula = Pelicula;
    }

    /**
     * @param Entrada the Entrada to set
     */
    public void setEntrada(int Entrada) {
        this.Entrada = Entrada;
    }
    public void setLibres(int lib){
        int ocu;
        ocu = Aforo -lib;
        Ocupadas = ocu;
    }

    //////////////////////////////////////////////////////////
    /** Metodos***/
    public void Vaciar(){
        Ocupadas=0;
        Pelicula="";
    }
    public void entradaUno(){
        Ocupadas++;
    }
}
