package week1;

public class Employee
{
	String ename;//null
	int eid;//0
	
	public void display()
	{
		System.out.println("Employee name is: "+ename);
		System.out.println("Employee id is: "+eid);
	}
	

	public static void main(String[] args)
	{
		//Object
		Employee emp1=new Employee();
		emp1.display();
		emp1.ename="Sarang";
		emp1.eid=101;
		emp1.display();

	}

}
