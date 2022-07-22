package collectionDemo;

import java.util.ArrayList;

public class ArrayListDemo 
{	/*ArrayList is class implement List interface
	* Underline data structure is Dynamic Array
	* ArrayList in not synchronize
	*frequent operation is data retrival
	*ArrayList can have duplicate value
	*ArryList is order collection.
	*/


	public static void main(String[] args)
	{
		//generic
		ArrayList<Integer> al=new ArrayList<>();
		System.out.println("Is list empty?: "+al.isEmpty());//true
		al.add(10);
		al.add(200);
		al.add(67);
		al.add(null);
		al.add(67);
		al.add(null);
		System.out.println(al);
		System.out.println("Is list empty?: "+al.isEmpty());//false
		System.out.println("Total elements: "+al.size());
		System.out.println("Check for element 100?: "+al.contains(100));
		System.out.println("Check for element 67?: "+al.contains(67));
		al.add(0,500);
		System.out.println(al);
		al.remove(3);
		System.out.println("After removing 3rd element: "+al);
		al.clear();
		System.out.println(al);
		
		
		System.out.println("*******************************************");
		
		ArrayList<String> sname=new ArrayList<>();
		sname.add("Jay");
		sname.add("Pankaj");
		sname.add("Sheetal");
		
		System.out.println("total students: "+sname.size());
		System.out.println(sname);
		
		
		System.out.println("*******************************************");
		
		ArrayList<Double> ald=new ArrayList<>();
		ald.add(89.67);
		ald.add(45.56);
		ald.add(45.56);
		System.out.println(ald.size());
		System.out.println(ald);
		System.out.println("*****************************************");
		
		ArrayList<Object> als=new ArrayList<>();
		als.add("Sarang");
		als.add(30);
		als.add('M');
		als.add(89.78);
		als.add("Pune");
		
		System.out.println("Total elements are: "+als.size());
		System.out.println(als);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//non generic way   1.not type safe    2.type casting need
//		ArrayList al=new ArrayList();
//		al.add(10);
//		al.add(20);
//		al.add("Sameer");
//		al.add('S');
//		al.add(89.56);
//		
//		int num=(int)al.get(0);
//		System.out.println(num);
//		
//		
//		System.out.println(al);
		
		
		
		
		
		

	}

}
