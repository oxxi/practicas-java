/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app28;

/**
 *
 * @author Jose
 */
public class SalaCine {
    private int Aforo;
    private int Ocupadas;
    private String Peliculas;
    private double Entrada;
    public SalaCine(){
        
        Aforo = 100;
        Ocupadas =0;
        Peliculas= "";
        Entrada = 5.00;
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
     * @param Entrada the Entrada to set
     */
    public void setEntrada(double Entrada) {
        this.Entrada = Entrada;
    }
///Metodos get
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
     * @return the Entrada
     */
    public double getEntrada() {
        return Entrada;
    }
}
