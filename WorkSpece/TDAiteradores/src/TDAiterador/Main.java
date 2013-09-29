package TDAiterador;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args){
		LinkedList lista = new LinkedList();
		lista.add("Hola");
		lista.add("Mundo");
		lista.add("Listas ");
		lista.add("Enlazadas");
		
		ListIterator iterador = lista.listIterator();
		
		while (iterador.hasNext()) 
		{
			System.out.println(iterador.next()); 
			
		}
		System.out.println(lista.get(2));
	}
}
