package week3;

public class BreakandContinueDemo {

	public static void main(String[] args)
	{
		
		System.out.println("Program started");
		for(int i=1;i<=10;i++)
			{	
			if(i==5)
			{
				//break;
				continue;//Skip 
			}
			else
			{
				System.out.println(i);
			}
				
			}

		System.out.println("Program completed!");
		
		
	}

}
