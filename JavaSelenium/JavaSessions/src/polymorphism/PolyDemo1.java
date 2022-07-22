package polymorphism;

public class PolyDemo1 
{

	public void add()//0 parameter
	{
		int a=100,b=200;//local variable
		System.out.println("Addition is: "+(a+b));
	}
	
	//1.number of arguments 
	
	public void add(int a,int b)//a,b as parameter 2parameter method
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	public void add(int a,int b,int c)//3 parameter
	{
		System.out.println("Addition is: "+(a+b+c));
	}
	//2.different type of arguments 
	
	public void add(int a,double b)//a,b as parameter 2parameter method
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	//3.change order of argument
	public void add(double a,int b)//a,b as parameter 2parameter method
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	PolyDemo1()
	{
		System.out.println("This is default calling");
	}
	
	
	PolyDemo1(String name)
	{
		
		System.out.println(name);
	}
	
	PolyDemo1(int a,int b)
	{
		
	}
	
	PolyDemo1(double a,int b)
	{
		
	}
	public static void main(String[] args) 
	{
		PolyDemo1 p1=new PolyDemo1();
		p1.add();
		p1.add(90,10);
		p1.add(100.11,11);
		p1.add(10,20,30);

		PolyDemo1 p2=new PolyDemo1("Priyanka");
		
		
		
	}

}
