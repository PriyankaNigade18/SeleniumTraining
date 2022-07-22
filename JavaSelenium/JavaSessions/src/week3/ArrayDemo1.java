package week3;

public class ArrayDemo1 {

	public static void main(String[] args)
	{
		//Array is static data structure size is fix,type is fix
			//Declare array
		int sid[]=new int[5];
		sid[0]=101;
		sid[1]=102;
		sid[2]=103;
		sid[3]=104;
		sid[4]=105;
		
		System.out.println(sid[0]);//101
		System.out.println(sid[4]);//default value of int type
		//System.out.println(sid[-1]);//ArrayIndexOutOfBoundsException
		//System.out.println(sid[4]);//ArrayIndexOutOfBoundsException
		
		System.out.println("Total elements Array: "+sid.length);//5
		//Iterate ---for loop
//		for(int i=0;i<sid.length;i++)//i means index value
//		{
//			System.out.println(sid[i]);
//		}
		
		for(int i:sid)
		{
			System.out.println(i);
		}
		
		
		
		
		System.out.println("*******************************");
		
		String pl[]={"C Programming","C++","Java","Python","c#.net"};
		System.out.println("Total Programming language: "+pl.length);
		
		for(String i:pl)
		{
			System.out.println(i);
		}
//		for(int i=0;i<pl.length;i++)
//		{
//			System.out.println(pl[i]);
//		}
		
		System.out.println("*******************************");
		
		double temp[]= {12.89,34.89,40.56};
		System.out.println("Total temperature values: "+temp.length);
//		for(int i=0;i<temp.length;i++)//Local 
//		{
//			System.out.println(temp[i]);
//		}
		
		for(double i:temp)
		{
			System.out.println(i);
		}
		
		System.out.println("*************************************");
		
		Object sdata[]= {"Akash",101,'M',"Pune",98.78};
		System.out.println("Total records: "+sdata.length);
		
//		for(int i=0;i<sdata.length;i++)
//		{
//			System.out.println(sdata[i]);
//			
//		}
		
		for(Object i:sdata)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
