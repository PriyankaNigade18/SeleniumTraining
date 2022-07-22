package week2;

public class CallbyValueVsCallByRef 
{
		
	public  void callByValue(String val)//val is local val=Smita
	{
		System.out.println("Call by Value data is: "+val);
	}
	
	public void callByRef(CallbyValueVsCallByRef ref)//ref=c1
	{
		System.out.println("Data is printing by Call by reference...");
		ref.callByValue("Amit");
	}
	
	
	

	public static void main(String[] args)
	{
		//Call
		
		//c1 is reference variable
		CallbyValueVsCallByRef c1=new CallbyValueVsCallByRef();
		c1.callByValue("Smita");
		c1.callByRef(c1);
		
		
		
		
		
	}

}
