package collectiondemos;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
//		HashSet hs = new HashSet();      //default capacity 16 Load factor 0.75
		
//		HashSet hs= new HashSet(100);    //initial capacity 100
		
//		HashSet hs= new HashSet(100,(float)0.90);
		
//		HashSet <Integer> hs= new HashSet <Integer>();
		
		HashSet hs = new HashSet();
		
		//Add object/elements into Hashset
		hs.add(100);
		hs.add("Welcome");
		hs.add(16.4);
		hs.add('A');
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs); //Insertion order not preserved
		
		//remove()
		hs.remove(16.4); //value
		System.out.println("After removing element:" +hs); //[null, A, 100, Welcome, true]

		// contains()
		System.out.println(hs.contains("Welcome"));
		System.out.println(hs.contains("XYZ"));
		
		System.out.println(hs.isEmpty());
		
		//Reading objects/elements fromm hashSet using for...each
		for(Object e: hs)
		{
			System.out.println(e);
		}
		
		Iterator it= hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
