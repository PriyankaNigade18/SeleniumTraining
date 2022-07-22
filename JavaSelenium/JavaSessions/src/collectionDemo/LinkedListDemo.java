package collectionDemo;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	/*LinkedList is class implements List interface
	 * Underline data structure is doubly linked list
	 * frequent operation is insertion and deletion
	 * duplication is allowed
	 * order collection
	 * 
	 */
	public static void main(String[] args) 
	{
		LinkedList<Integer> ls=new LinkedList<>();
		ls.add(90);
		ls.add(56);
		ls.add(89);
		ls.add(44);
		
		System.out.println(ls);
		System.out.println("Total elements: "+ls.size());
		System.out.println(ls.contains(100));//false
		
		
		ls.addFirst(1000);
		ls.addLast(500);
		
		System.out.println("First element: "+ls.getFirst());
		System.out.println("LastElement: "+ls.getLast());
		Iterator<Integer> ir=ls.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		Collections.sort(ls);
		System.out.println(ls);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
