package week2;

public class TypeCastingDemo {

	public static void main(String[] args) 
	{
			//Implicit type casting---JVM(small size to large size conversion)
		int i=100;
		System.out.println("Integer data: "+i);
		long l1=i;//l1=100
		System.out.println("Int to long conversion: "+l1);
		char c1='A';
		int i2=c1;//c1 will pass ASCII for character A-65
		System.out.println("character to int A: "+i2);
		float f1=i;
		System.out.println("Integer to float 100: "+f1);
		float f2=l1;
		System.out.println("long to float 100: "+f2);
		
		System.out.println("**************************");
		//Explicit type casting(manual type)large size data to small size data
		//casting operator -(type)
		int x=(int)l1;
		System.out.println("Long to int conversion: "+x);
		
		int y=120;
		char c2=(char) y;
		System.out.println("Integer to character 120: "+c2);
		
		
		double d1=89.899;
		int k=(int) d1;
		System.out.println("double to integer 89.899: "+k);
		
		
	}

}
