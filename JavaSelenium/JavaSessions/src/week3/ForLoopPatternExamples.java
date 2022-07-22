package week3;

public class ForLoopPatternExamples {

	public static void main(String[] args)
	{

		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=4;c++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		System.out.println("************************");
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=4;c++)
			{
				System.out.print("1"+" ");
			}
			System.out.println();
		}
		System.out.println("************************");
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		System.out.println("************************");
		
		for(int i=1;i<=4;i++)//rows
		{
			for(int j=1;j<=i;j++)//col
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println("************************");
		
		for(int i=1;i<=4;i++)//rows
		{
			for(int j=1;j<=i;j++)//col
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("*********************");
		
		
		for(int i=1;i<=10;i++)
		{
			if(i>=5)
			{
				System.out.print(i+" ");
			}else
			{
				System.out.println(i);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
