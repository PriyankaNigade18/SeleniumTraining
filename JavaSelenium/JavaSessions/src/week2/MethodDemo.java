package week2;

public class MethodDemo 
{
	//method definition
	public void accept()
	{
		System.out.println("This is instance method");
	}
	
	public static void show()
	{
		System.out.println("This is static Method");
	}
	
	
	
	

	public static void main(String[] args)
	{//calling area for all method and variable of class
		
		
		MethodDemo.show();
		show();

		MethodDemo m1=new MethodDemo();
		m1.accept();
		//m1.show();
		
		
		
		
		
	}

}
