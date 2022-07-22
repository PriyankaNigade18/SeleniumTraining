package collectionDemo;

import java.util.HashSet;

public class HashSetDemo
{
	/*HashSet is class implement Set interface
	 * Hashset based on HashTable 
	 * 16 segments you will get
	 * 
	 */

	public static void main(String[] args)
	{

		HashSet<Integer> hs=new HashSet<>();
		if(hs.isEmpty())
		{
		hs.add(89);
		hs.add(10);
		hs.add(20);
		hs.add(40);
		hs.add(40);
		hs.add(null);
		}
		System.out.println(hs.isEmpty());
		System.out.println("total elements: "+hs.size());
		System.out.println("Search for 100?: "+hs.contains(100));//false
		System.out.println(hs);
		
		//iteration
		
		
		
		
	}

}
