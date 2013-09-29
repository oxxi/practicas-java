/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tdalistas;

/**
 *
 * @author Jose
 */
public class NodoLista {
    private Object dato = null;
    private NodoLista siguiente = null;

    public Object getDato(){ // getElement
   
   return dato;
   }
    public void setDato(Object dato) {
        this.dato = dato;
    }
    public NodoLista getSiguiente(){ // getNext

    return siguiente;
    }
    public void setSiguiente(NodoLista siguiente){ // setNext
    this.siguiente = siguiente;
    }
}
