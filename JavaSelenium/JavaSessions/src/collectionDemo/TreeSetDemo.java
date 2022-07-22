package collectionDemo;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo
{
	/*TreeSet implement SortedSet interface
	 * TreeSet always return sorted elements
	 * internal structure is Binary search tree
	 *  
	 */

	public static void main(String[] args)
	{

		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(10);
		ts.add(4);
		ts.add(3);
		ts.add(30);
		ts.add(80);
		ts.add(20);
		ts.add(100);
		ts.add(45);
		System.out.println(ts);
		
		Iterator<Integer> ir=ts.iterator();
		
		System.out.println("Total elementS: "+ts.size());
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		System.out.println("Descending order:"+ts.descendingSet());
		System.out.println("headset: Less than numbers"+ts.headSet(45));
		System.out.println("tailset: greater than numbers"+ts.tailSet(45));
		System.out.println("Subset: between numbers"+ts.subSet(3, 80));
		
		
		
		
		
		
		

	}

}
