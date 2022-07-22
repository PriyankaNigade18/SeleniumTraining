package collectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args)
	{
			ArrayList<Integer> al=new ArrayList<>();
			al.add(100);
			al.add(20);
			al.add(300);
			al.add(44);
			al.add(67);
			al.add(3);
			
			System.out.println("Total Elements: "+al.size());
			
			//Iteration
			//for loop
			for(int i=0;i<al.size();i++)
			{
				System.out.println(al.get(i));
			}
			
			System.out.println("******************************");
			//for-each
			
			for(Integer i:al)
			{
				System.out.println(i);
			}
			
			System.out.println("************************************");
			//iterator()
			
			Iterator<Integer> ir=al.iterator();
			while(ir.hasNext())
			{
				System.out.println(ir.next());
			}
			
			System.out.println("Sorted elements");
			Collections.sort(al);
			ArrayList<Integer> resultlist=new ArrayList<>();
			for(Integer i:al)
			{
				//System.out.println(i);
				resultlist.add(i);
			}
			
			System.out.println(resultlist);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

	}

}
