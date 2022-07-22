package inheritanceTest;

public class BMW extends Car
{
	@Override
	public void start()
	{
		System.out.println("BMW.....starts");
	}
	
	@Override
	public void price()
	{
		System.out.println("BMW ....Price");
	}
	
	public void autoParking()
	{
		System.out.println("BMW........autoParking");
	}

}
