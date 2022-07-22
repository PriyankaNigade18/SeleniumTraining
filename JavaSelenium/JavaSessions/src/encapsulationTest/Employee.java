package encapsulationTest;

public class Employee 
{
	String name;
	private int age;
	private double salary;
	
	///setter and getter
	public void setAge(int a)
	{
		this.age=a;
	}
	
	public int getAge()
	{
		return age;
	}
	
	
	
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	//Main logic
	public void show()
	{
		System.out.println("Employee Name is: "+name);
		System.out.println("Employee age: "+age);
		System.out.println("Employee salary: "+salary);
	}
		
	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.name="Sarang";
		e1.age=45;
		e1.salary=67.55;
		e1.show();

	}

}
