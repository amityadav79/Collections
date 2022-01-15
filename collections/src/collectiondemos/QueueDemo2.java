package collectiondemos;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueDemo2 {

	public static void main(String[] args) {
		
		LinkedList q= new LinkedList();
		
		//Adding elements add() offer()
		q.add("A");
		q.add("B");
		q.add("C");
		q.offer("C");
		q.offer(100);
		
		System.out.println(q);   //[A, B, C, C, 100]  //Insertion order preserved & duplicates allowed
		
		//get head element()  peak()
//		System.out.println(q.element()); //A returns Head element, if empty return NoSuchElementException
//		System.out.println(q.peek()); //A returns Head ,if empty return  [] Null

		//Return  & Remove from Queue   remove() poll()
//	System.out.println(q.remove()); //A   , if empty returnNoSuchElementException
//	System.out.println(q); //[B, C, C, 100]
	
	System.out.println(q.poll()); //A   , if empty return Null
	System.out.println(q); //[B, C, C, 100]
	
	/*Iterator it =q.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	for(Object ele:q) {
		System.out.println(ele);
	}
	*/
	

		
		
	}

}
