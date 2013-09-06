/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tdalistas;

/**
 *
 * @author CEETI
 */
public class lista {
    public NodoLista cabeza = null;
    NodoLista temp1 = null;
    NodoLista temp2 = null;
    boolean listaVacia;
    
    
    
    public void IMPRIME(){
        NodoLista puntero = cabeza;
        if(puntero == null)
            System.out.println("La lista esta vacia");
        else
            System.out.println("\nElementos de la lista: ");
        
        while(puntero !=null)
        {
            System.out.println(puntero.getDato());
            puntero = puntero.getSiguiente();
        }
    }
/////////////////////////////
    public void IMPRIME2(){
        NodoLista puntero = cabeza;
        if (puntero == null) 
            System.out.println("La Lista esta vacia");    
        else
            System.out.println("\nPosicion # , elemento de la lista:");
        int p = 1;
        while(p !=FIN()){
            System.out.println("posicion #"+p+", elemento = \""+ this.RECUPERA(p)+"\"");
            p = this.SIGUIENTE(p);
        }
    }
    public void IMPRIME3(){
        NodoLista puntero = cabeza;
        if (puntero == null) 
            System.out.println("-> -¬ (Lista Vacia)");
        else{
            int p =1;
            while(p !=FIN()){
                System.out.println("-> [" + this.RECUPERA(p) + "]");
                p = this.SIGUIENTE(p);
            }
            System.out.println("-> -¬ (fin)\n");
        }
    }
 //metodo fr apoyo 
    public int Conteo(){
        int cuenta =0;
        NodoLista puntero = cabeza;
        if(puntero == null)
            return 0;
        while(puntero !=null)
        {
            cuenta++;
            puntero = puntero.getSiguiente();
        }
        return cuenta;
    }
 // medoto fin 
    public int FIN(){
        return (Conteo()+1);
    }
 //metodo anula
    public int ANULA(){
        cabeza = null;
        return FIN();
    }
///medoto suprime
    public int SUPRIME(int pos){
           try {
            if ((pos == 0) || (pos >= this.FIN())){
                System.out.println("\nError: Posicion Invalida");
                return -1;
            }else{
                if (cabeza != null && pos ==1) {
                    temp1 = cabeza;
                    temp2 = temp1.getSiguiente();
                    cabeza = temp2;
                }else{
                    temp1 = PosAnterior(pos);
                    temp2 = PosSiguiente(pos);
                    temp1.setSiguiente(temp2);
                }
            }
            return pos;
        } catch (NullPointerException e) {
            System.out.println("\nError: null\n lista vacia o posicion invalida");
            return -1;
        }//fin del try catch
    }
//fin medoto suprime
    public int POS_ANTERIOR(Object dato ){  
        int posant;
        posant = ((this.LOCALIZA(dato))-1);
        return posant;
    }
public int ANTERIOR(int pos){
    NodoLista puntero = cabeza;
    int cuenta = 0;
        if((pos==1) || (pos>this.FIN())){
            System.out.println("Error: posicion invalida");
            return cuenta;
        }
        while(puntero !=null){
            if(cuenta == (pos-1))
            break;
            cuenta++;
        }
        return cuenta;
    }
    public int POS_SIGUIENTE(Object dato){
        int possig;
        possig = ((this.LOCALIZA(dato))+1);
        return possig;
    }
    public int SIGUIENTE(int pos){
        NodoLista puntero = cabeza;
        int cuenta = 0;
        if((pos == this.FIN())){
        System.out.println("Error: posicion invalida");
        return cuenta;
        }
        while(puntero !=null){
        cuenta++;
        if (cuenta !=pos)
            puntero = puntero.getSiguiente();
        else
            break;
        }
        if (puntero == null) {
            return 0;
        }
        return pos+1;
    }
///
    public NodoLista PosActual(int pos){
        int cuenta = 0;
        NodoLista puntero = null;
        puntero = cabeza;
        if (cabeza == null) 
            return null;
        else {
            while(puntero != null){
                cuenta++;
                if (cuenta == pos)
                    break;
                puntero = puntero.getSiguiente();
            }
        }
        return puntero;
    }
    
 public Object RECUPERA(int pos){
        try {
         if((pos == 0) || (pos >= (this.FIN())) ){
             System.out.println("\nError: Posicion invalida");
            return null;
         }else
             return PosActual(pos).getDato();
     } catch (NullPointerException  e) {
         System.out.println("\nError: NullPointerException \nLista esta vacia o Posicion invalida, fuera del rango");
        return null;
     }
    }//fin recupera
 
 public Object PRIMERO_O(){
     return this.RECUPERA(1);
 }
 
 public int PRIMERO(){
     NodoLista puntero = cabeza;
     if (puntero == null) {
         return FIN();
     }else{
     return 1;
     }
 }
 
 public int LOCALIZA(Object Dato){
     int cuenta =1;
     while(cuenta !=this.FIN()){
         if ((Dato.equals(this.RECUPERA(cuenta))) || (this.RECUPERA(cuenta) == null)) 
             break;
         cuenta++;
     }
     if (this.FIN() == cuenta) {
         System.out.println("\nSe llego al final de la lista sin encontrar valor\n");
         cuenta = -1;
     }
     return cuenta;
 }//fin del metodo localiza
 public int LOCALIZA2(Object Dato){
     int cuenta =1;
     while(cuenta != this.FIN()){
         if((Dato.equals(this.RECUPERA(cuenta))) || (this.RECUPERA(cuenta)==null))
             break;
         cuenta++;
     }
     if (this.FIN()==cuenta) {
         cuenta = -1;
     }
     return cuenta;
 }//fin metodo localiza2
 public int INSERTA(Object Dato , int pos){
     if ((pos>(this.FIN()) || (pos<1))) {
         System.out.println("Error: Posicion invalida");
         return -1; // retorna error
     }
     if ((cabeza == null) && (pos == 1)){
         cabeza = new NodoLista(); // se crea el primer nodo
         cabeza.setDato(Dato); // se asigna el valor a insertar en la casilla
     }else{
        temp1 = PosAnterior(pos).getSiguiente(); // nodo actual
        temp2 = PosAnterior(pos); // posicion anterior
        temp2.setSiguiente(new NodoLista()); /* posicion anterior se le crea un
        * un nodo nuevo seguido
        */
        temp2.getSiguiente().setDato(Dato); /* a ese nuevo nodo se le inserta
        * el dato, en el area de datos
        */
        temp2.getSiguiente().setSiguiente(temp1); /* luego a este nuevo nodo se la
        * añade la referencia a nodo actual*/
     }
     return pos;
 }//fin metodo inserta
 public NodoLista PosAnterior(int pos){
     int cuenta = 0;
     NodoLista puntero = null;
     puntero = cabeza;
     if (cabeza == null) {
         return null;
     }else{
         while(puntero!=null){
             cuenta++;
             if(cuenta == (pos -1))
                 break;
             puntero = puntero.getSiguiente();
         }
     }
     return puntero;
 }//fin metodo nodolista posanterior
 
 public NodoLista PosSiguiente(int pos){
     int cuenta = 0;
    NodoLista puntero = null;
    puntero = cabeza;
    if(cabeza==null){
     return null;   
    }else{
        while(puntero != null){
            cuenta++;
            if(cuenta==(pos-1))
                break;
            puntero = puntero.getSiguiente();
        }
    }
    return puntero;
 }//fin nodolista possiguiente
 
 public boolean VACIA(){
    if (this.FIN() == this.PRIMERO())
        listaVacia = true;
    else
        listaVacia = false;

    return listaVacia;
}//fin metodo vacio     
}//fin de la clase
