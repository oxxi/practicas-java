/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetePrincipal;

/**
 *
 * @author Jose
 */
public class SalaCine {
 private int Aforo;
 private int Ocupadas;
 private String Peliculas;
 private double Entradas;
    
    public SalaCine(){
        Aforo=100;
        Ocupadas=0;
        Peliculas="";
        Entradas=5.0;
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
     * @return the Peliculas
     */
    public String getPeliculas() {
        return Peliculas;
    }

    /**
     * @return the Entradas
     */
    public double getEntradas() {
        return Entradas;
    }
    public int getLibres(){
        int lib;
        lib = Aforo - Ocupadas;
        return lib;
    }
    public double getPorcentaje(){
        double por;
        por = ((double) Ocupadas/ (double) Aforo) *100.0;
        return por;
    }
    public double getIngresos(){
        double ingre;
        ingre = Ocupadas * Entradas;
        return ingre;
    }
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
     * @param Peliculas the Peliculas to set
     */
    public void setPeliculas(String Peliculas) {
        this.Peliculas = Peliculas;
    }

    /**
     * @param Entradas the Entradas to set
     */
    public void setEntradas(double Entradas) {
        this.Entradas = Entradas;
    }
    public void setLibres(int lib){
        int ocu;
        ocu = Aforo - lib;
        Ocupadas = ocu;
    }
/*** Metodos   **/
    public void Vaciar(){
        Ocupadas=0;
        Peliculas="";
    }
    public void entradaUno(){
        Ocupadas++;
    }
}
