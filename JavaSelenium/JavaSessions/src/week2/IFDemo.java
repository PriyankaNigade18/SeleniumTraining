package week2;

import java.util.Scanner;

public class IFDemo {

	public static void main(String[] args)
	{
		//If-Else Demo(two different condition)
		System.out.println("system is Checking Details....");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("User is valid for voating");
		}else
		{
			System.out.println("User is not valid for voating");
		}
		
		System.out.println("Checking is completed!");
		sc.close();
		
		
		
		
		
		//Single If Demo
//		    System.out.println("system is Checking Details....");
//			Scanner sc=new Scanner(System.in);
//			System.out.println("Enter your age: ");
//			int age=sc.nextInt();
//			if(age>=18)
//			{
//				System.out.println("User is valid for voating");
//			}
//			
//			System.out.println("Checking is completed!");
			sc.close();

	}

}
