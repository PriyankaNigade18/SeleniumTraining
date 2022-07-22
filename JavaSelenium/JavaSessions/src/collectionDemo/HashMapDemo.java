package collectionDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> hs=new HashMap<>();
		hs.put(101, "C Programing");
		hs.put(102, "C++");
		hs.put(103,"Java");
		hs.put(104,"Python");
		hs.put(105, "Java");
		hs.put(103, "C#");
		
		System.out.println(hs);
		
		System.out.println(hs.size());
	
		
		//Entry
		for(Map.Entry<Integer,String> m:hs.entrySet())
		{
			System.out.println(m.getKey()+":"+m.getValue());
		}
		
		System.out.println("*************************");
		System.out.println(hs.get(105));
		
		

	}

}
