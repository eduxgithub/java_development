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
		lista.add("murci�lago");
		
		System.out.println("Lista: "+lista);
		
		lista.removeFirst();
		System.out.println("Primer elemento despu�s de removeFirst: "+lista.get(0));
		
		System.out.println("Lista: "+lista);
		
		System.out.println("Tama�o de Lista: "+lista.size());
		
		lista.set(2,"ardilla");
		System.out.println("Lista despu�s de set: "+lista);
		
	}

}
