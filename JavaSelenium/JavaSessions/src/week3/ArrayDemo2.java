package week3;

public class ArrayDemo2 {

	public static void main(String[] args) 
	{

		int data[][]=new int[2][3];
		data[0][0]=10;
		data[0][1]=20;
		data[0][2]=100;
		
		data[1][0]=30;
		data[1][1]=40;
		
		System.out.println(data[0][0]);//10
		//System.out.println(data[0][2]);//ArrayIndexOutofbounds Exception

		System.out.println("Length of row: "+data.length);
		System.out.println("Length of cell: "+data[1].length);
		
		
		for(int i=0;i<data.length;i++)//row
		{
			
			for(int j=0;j<data[i].length;j++)
			{
				System.out.print(data[i][j]+" ");
			}
			
				System.out.println();
			
		}
		
		
		
		
		
		
	}

}
