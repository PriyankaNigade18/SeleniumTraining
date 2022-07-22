package encapsulationTest;

public class TestEmployee {

	public static void main(String[] args)
	{
			Employee e1=new Employee();
			e1.name="Jay";
//			e1.age=30;
			e1.setAge(44);
			int age=e1.getAge();
			System.out.println(age);
//			e1.salary=67.77;
			e1.setSalary(89.88);
			System.out.println(e1.getSalary());
			e1.show();

	}

}
