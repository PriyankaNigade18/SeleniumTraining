package week3;

public class AssignmentArray {

	public static void main(String[] args)
	{

		Object auth[][]={{"test1@gmail.com","test1"},{"test2@gmail.com","test2"},{"test3@gmail.com","test3"}};
		System.out.println("Total rows: "+auth.length);
		System.out.println("Total columns: "+auth[0].length);
		//itration
		
		for(Object i[]:auth)//{"test1@gmail.com","test1"}
		{
			
			for(Object j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
