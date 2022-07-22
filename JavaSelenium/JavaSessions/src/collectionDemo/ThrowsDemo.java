package collectionDemo;

public class ThrowsDemo
{

	public void m1()//throws ArithmeticException
	{
	m2();	
	}
	public void m2()//throws ArithmeticException
	{
		m3();
	}
	public void m3()//throws ArithmeticException
	{ try {
		System.out.println(9/0);
	}catch(Exception e)
	{
		System.out.println("Select appropriate number");
	}
		
	}
	
	
	
	
	public static void main(String[] args)
	{

		ThrowsDemo t1=new ThrowsDemo();
		t1.m1();

	}

}
