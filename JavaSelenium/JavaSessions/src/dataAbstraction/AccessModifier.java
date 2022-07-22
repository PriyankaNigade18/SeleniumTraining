package dataAbstraction;

public class AccessModifier
{
	int id=101;
	private int salary=20000;
	public String name="Priaa";
	protected int phno=909090909;
	public static void main(String[] args)
	{
		AccessModifier a1=new AccessModifier();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.salary);
		System.out.println(a1.phno);

	}

}
