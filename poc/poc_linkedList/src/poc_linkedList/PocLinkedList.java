package poc_linkedList;

import java.util.LinkedList;

public class PocLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList lista = new LinkedList();
		
		lista.add("perro");
		lista.add("gato");
		lista.addFirst("foca");
		lista.add("elefante");
		lista.add("murciélago");
		
		System.out.println("Lista: "+lista);
		
		lista.removeFirst();
		System.out.println("Primer elemento después de removeFirst: "+lista.get(0));
		
		System.out.println("Lista: "+lista);
		
		System.out.println("Tamaño de Lista: "+lista.size());
		
		lista.set(2,"ardilla");
		System.out.println("Lista después de set: "+lista);
		
	}

}
