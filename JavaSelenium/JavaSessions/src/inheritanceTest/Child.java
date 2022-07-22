package inheritanceTest;

public class Child extends Parent
{
	
	int cid=102;
	
	public void childIncome()
		{			
		super.parentIncome();
		System.out.println("Parent id: "+pid);
		System.out.println("child Id: "+cid);
		System.out.println("Child Income.....$986700");
	}
	
	Child()
	{
		//super();
		System.out.println("This is Child Constructor");
	}
	

	public static void main(String[] args) 
	{
			Child c1=new Child();
			c1.childIncome();

	}

}
