package collectiondemos;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		//Declare ArrayList
//		ArrayList al= new ArrayList();  //Hetrogenous
//		ArrayList <Integer> al= new ArrayList <Integer>(); //Homogenous list
//		ArrayList <String> al= new ArrayList <String>();   //Homogenous
//		List al =new ArrayList();
		
		ArrayList al= new ArrayList();
		
		//Add new elements to the arraylist
		al.add(100);
		al.add("welcome");
		al.add(15.4);
		al.add('A');
		al.add(true);
		
		System.out.println(al); //[100, welcome, 15.4, A, true]

		//size()
		System.out.println("Number of element in array list:"+al.size());
		
		//remove()
		al.remove(2); //here is index
		al.remove("welcome"); //here welcome is element
		
		System.out.println("After removing element from arry list: "+ al); //[100, A, true]

		//insert a new element 
		//add(index , object)
		
		al.add(1, "Amit");
		System.out.println("After adding insetion"+ al); //[100, Amit, A, true]

		//retrive specific element
		System.out.println(al.get(1)); //Amit, here 1 is index of element /object
		
		//change element /replace
		al.set(1,"C#");
		System.out.println("After replacing element:"+ al); //[100,  C#, A, true]
		
		//searching -contains()- Return true or False
		System.out.println(al.contains("C#"));  //true
		
		//isEmpty()
		System.out.println(al.isEmpty());  //false
		
		//1) for loop
		System.out.println("Rading elements using for loop.......");
		
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		
		//2) for each loop
		System.out.println("Reading elements using for..... each loop");
		for( Object e:al){
			System.out.println(e);
		}
		
		//3) iterator()
		System.out.println("Reading  elements  using iterator methods");
		
		Iterator it= al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		

	}

}
