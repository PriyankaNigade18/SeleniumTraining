package week2;

public class ParameterPassingDemo1 
{
	public void add()//0 parameter method
	{
		int a=100,b=100;//local
		System.out.println("Addition is: "+(a+b));//200
	}
	public void sub(int a,int b)//2 parameter a=100 b=50
	{
		System.out.println("Paramter passing without return");
		System.out.println("Subtraction is: "+(a-b));
	}
	
	public int mul(int a,int b)//local variable
	{
		System.out.println("Parameter passing with return");
		return a*b;
	}
	
	public int div(int a,int b)
	{
		return a/b;
	}
	
	public static void main(String[] args)
	{
		//call the method
		ParameterPassingDemo1 p1=new ParameterPassingDemo1();
		p1.add();
		//Method call --->Compile time parameter passing
		p1.sub(100,50);//arguments
		int res=p1.mul(100,100);
		System.out.println("Multiplication is: "+res);
		int divres=p1.div(50, 2);
		System.out.println("division is: "+divres);
	}

}
