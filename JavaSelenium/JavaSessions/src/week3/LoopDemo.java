package week3;

import java.util.Scanner;

public class LoopDemo {

	public static void main(String[] args)
	{
		// Print Hello 5 time
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
		}

		System.out.println("**********************************");
		
		//print 1 to 10
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		System.out.println("**************************************");
		
//		for(;;)//true
//		{
//			System.out.println("Hi!");
//		}
		
		//System.out.println("**************************************");
		//While Loop---Entry control
		
		int i=1;
		while(i<=10)
		{
			System.out.println("Hi");
			i++;
			
		}
		
		System.out.println("******************************");
		//do while----Exit control
		
		int j=1;
		do
		{
		System.out.println("Hello");
		j++;
			
		}while(j<=10);
		
		System.out.println("********************************");
		
//		do
//		{
//			System.out.println("Hi");
//			
//		}while(true);
		
		//Nested
		
		//Print table of 2
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		for(int a=1;a<=10;a++)
		{
			System.out.println(num*a);
		}
		
		
		System.out.println("***********************");
		
		
		for(int no=1;no<=10;no++)
		{
			
			for(int x=1;x<=10;x++)
			{
				System.out.print(no*x+"\t");
			}
			
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
