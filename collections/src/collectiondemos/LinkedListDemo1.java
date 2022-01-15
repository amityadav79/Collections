package collectiondemos;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		
		//Declare Linked List
//		LinkedList <Integer> l= new LinkedList <Integer>();
//		LinkedList <String> l= new LinkedList();
		
		LinkedList l=new LinkedList();
		
		//Add elements into linked list
		l.add(100);
		l.add("Welcome");
		l.add(14.5);
		l.add('S');
		l.add(true);
		l.add(null);
		
		System.out.println(l);            //[100, Welcome, 14.5, S, true, null]
		
		System.out.println(l.size());

		//Remove
		l.remove(3); //index
		l.remove(true);// object
		System.out.println("After removing, new element" + l);  //After removing, new element[100, Welcome, 14.5, null]
		
		//Insert/ adding element in the middle of linked list
		l.add(3,"java");
		
		System.out.println("After inserting the element:" + l);  //[100, Welcome, 14.5, java, null]

		//retriving vlue /object
		System.out.println(l.get(3));
		
		//change the value
		l.set(4, "JavaScript");
		System.out.println("After change the values:" + l); //[100, Welcome, 14.5, java, JavaScript]
		
		//contains
		System.out.println(l.contains("java"));  //true
		System.out.println(l.contains("python")); //false
		
		//isempty
		System.out.println(l.isEmpty());
		
		
		//Reading elements from ll using for loop
		/*for(int i=0; i<l.size(); i++)
		{
			System.out.println(l.get(i));
		}8*/
		
		//Reading elements from LL using for....each loop
		
		for(Object value:l) {
			System.out.println(value);
		}
		
		//Iteratot method
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		
		
	}

}
