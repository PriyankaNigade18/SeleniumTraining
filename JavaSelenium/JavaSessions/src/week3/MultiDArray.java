package week3;

public class MultiDArray {

	public static void main(String[] args)
	{
//		int id[][]=new int[2][3];
//		id[0][0]=100;
//		id[0][1]=200;
//		id[0][2]=111;
//		
//		
//		id[1][0]=300;
//		id[1][1]=400;
		
		
		int id[][]={{100,200,111},{300,400,500}};
		
		System.out.println("Total number of rows: "+id.length);
		System.out.println("Total number of columns: "+id[1].length);
		
		
		//single data
		System.out.println(id[0][2]);//111
		System.out.println(id[1][2]);//0
		//System.out.println(id[1][3]);//ArrayIndexOutOfBoundsException
		
		//Iteration
		System.out.println("Array elements are:");
		for(int i=0;i<id.length;i++)
		{
			for(int j=0;j<id[i].length;j++)
			{
				System.out.print(id[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Array using for each loop");
		
		for(int i[]:id)//{100,200,111}
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
