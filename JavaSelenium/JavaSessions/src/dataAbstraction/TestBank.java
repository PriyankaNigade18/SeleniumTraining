package dataAbstraction;

public class TestBank {

	public static void main(String[] args) 
	{
			HDFC h1=new HDFC();
			h1.custData();//individual
			h1.deposite();
			h1.withdraw();
			h1.rateOfInterest();
			
			
			
			Axeis a1=new Axeis();
			a1.deposite();
			a1.withdraw();
			a1.rateOfInterest();

	}

}
