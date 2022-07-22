package dataAbstraction;

public class NobleHs implements IndiaMA,USMA//MultipleInheritance
{
	
	public void medicalService()
	{
		System.out.println("NobleHs .......Medical service");
	}

	@Override
	public void physioService() {

		System.out.println("NobleHS.....PhysioService()");
		
	}

	@Override
	public void dentalService() {
		System.out.println("NobleHS.....DentalService()");
		
	}

	@Override
	public void neroService() {
		System.out.println("NobleHS.....NeroService()");
		
	}

	@Override
	public void cardioService() {
		System.out.println("NobleHS.....CardioService()");
		
	}

	@Override
	public void covid19Test() {
		System.out.println("NobleHS.....Covid19Test Service()");
		
	}
	
	
	

}
