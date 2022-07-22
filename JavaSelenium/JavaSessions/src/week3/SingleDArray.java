package week3;

public class SingleDArray {

	public static void main(String[] args)
	{
			
		//int default value 0
		//object /String default null
		int sid[]=new int[3];
		sid[0]=101;
		sid[1]=102;
		sid[2]=103;
		
		System.out.println("Length of Array is: "+sid.length);
		System.out.println(sid[0]);//0
		System.out.println(sid[2]);//103
		//System.out.println(sid[-1]);//ArrayIndexOutOfBounds
		System.out.println("Iteration with for loop");
		//Iteration
		for(int i=0;i<sid.length;i++)
		{
			System.out.println(sid[i]);
		}
		
		//for each(array+collection)
		System.out.println("Array element using for each loop");
		for(int i:sid)
		{
			System.out.println(i);
		}
		
		System.out.println("*************************************");
		
		
		//way 2 using literals
		//String cname[]=new String[2];
		
		String name[]={"sagar","Mayur","Poonam"};
		System.out.println("Length of Array: "+name.length);
		
		for(String i:name)
		{
			System.out.println(i);
		}
		
		
		System.out.println("*******************************");

		Object stddata[]={"Kishor",'M',"Pune",32,98.88};
		System.out.println("Length is: "+stddata.length);
		for(Object i:stddata)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
