package collectiondemos;

import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		
		l.add("dog");
		l.add("cat");
		l.add("horse");
		l.add("monkey");
		
		System.out.println(l);   //[dog, cat, horse, monkey]
		
		l.addFirst("Tiger");
		l.addLast("Cheetah");
		
		System.out.println(l);   //[Tiger, dog, cat, horse, monkey, Cheetah]
		
		System.out.println(l.getFirst()); //Tiger
		System.out.println(l.getLast()); //Cheetah
		
		l.removeFirst();
		l.removeLast();
		System.out.println("After removing first and last elements:" + l); //[dog, cat, horse, monkey]
		
	}

}
