package collectionDemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args)
	{
		LinkedHashSet<Integer> ls=new LinkedHashSet<>();
		ls.add(90);
		ls.add(67);
		ls.add(99);
		ls.add(10);
		ls.add(56);
		ls.add(90);
		
		
		
		System.out.println("Total elements are: "+ls.size());
		
		for(Integer i:ls)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		

	}

}
