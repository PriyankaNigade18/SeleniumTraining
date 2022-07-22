package week2;

public class VariableDemo 
{
	String sname="Seema";//instance variable
	static String courseName="Software Testing";//static
	static int id;//default value of type int is 0
	public void show()
	{
		int marks=90;//local variable
		System.out.println(marks);
		System.out.println("from show(): "+sname);
		System.out.println(courseName);
	}
	
	
	
//starting point
	public static void main(String[] args)
	{
				
		//show();
		VariableDemo v1=new VariableDemo();
		v1.show();
		
		//System.out.println(sname);
		System.out.println("From Main(): "+v1.sname);
		
		int marks=100;//local
		System.out.println(marks);
		System.out.println(courseName);
		

		VariableDemo v2=new VariableDemo();
		v2.sname="Rohit";
		System.out.println(v2.sname);
		v2.show();
		System.out.println(courseName);
		System.out.println(id);
	}

}
