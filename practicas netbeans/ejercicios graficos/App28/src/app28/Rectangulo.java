/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app28;

/**
 *
 * @author Jose
 */
public class Rectangulo {
    private int Base;
    private int Altura;
    public Rectangulo(){
        Base = 10;
        Altura = 10;
    }
public int Area(){
    int base = getBase();
    int altura = getAltura();
    return base * altura;
}
public int Perimetro(){
    int base = getBase();
    int altura = getAltura();
        return 2*(base + altura);
    }
    /**
     * @return the Base
     */
    public int getBase() {
        return Base;
    }
    

    /**
     * @param Base the Base to set
     */
    public void setBase(int Base) {
        this.Base = Base;
    }

    /**
     * @return the Altura
     */
    public int getAltura() {
        return Altura;
    }

    /**
     * @param Altura the Altura to set
     */
    public void setAltura(int Altura) {
        this.Altura = Altura;
    }
}
