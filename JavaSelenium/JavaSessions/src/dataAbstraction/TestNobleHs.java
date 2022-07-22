package dataAbstraction;

public class TestNobleHs {

	public static void main(String[] args)
	{

		//parent class ref and child class object
		IndiaMA i1=new NobleHs();
		i1.dentalService();
		i1.physioService();
		i1.covid19Test();
	
		
		USMA u1=new NobleHs();
		u1.cardioService();
		u1.neroService();
		u1.covid19Test();
		
		
		//child class ref and child class object
		NobleHs n1=new NobleHs();
		n1.cardioService();
		n1.physioService();
		n1.neroService();
		n1.dentalService();
		n1.medicalService();
		n1.covid19Test();
		
		
		

	}

}
