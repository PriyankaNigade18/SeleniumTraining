package dataAbstraction;

public class HDFC implements RBI
{
	
	
	public void custData()
	{
		System.out.println("HDFC .....Customer details");
	}

	@Override
	public void withdraw()
	{
		System.out.println("HDFC......Withdraw()");
			
	}

	@Override
	public void deposite() {
		System.out.println("HDFC......deposite()");
		
	}

	@Override
	public void rateOfInterest() {
		System.out.println("HDFC......rateofinterest():7.5");
		
	}

}
