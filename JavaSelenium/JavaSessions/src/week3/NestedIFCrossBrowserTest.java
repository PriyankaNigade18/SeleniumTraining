package week3;

import java.util.Scanner;

public class NestedIFCrossBrowserTest {

	public static void main(String[] args)
	{
			//String bname="chrome";
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name:");
		String bname=sc.nextLine();
			if(bname.equalsIgnoreCase("chrome"))
			{
				System.out.println("Test is running on chrome...");
				
			}else if(bname.equalsIgnoreCase("firefox"))
			{
				System.out.println("Test is running on Firefox....");
			}else if(bname.equalsIgnoreCase("edge"))
			{
				System.out.println("Test is running on edge....");
			}else
			{
				System.out.println("Please provide accurate browser...");
			}
			
			
			sc.close();
			
			
			
			
			
			
			
			
			
			
			
			
//			int x=100;
//			int y=100;
//			if(x==y) {
//				System.out.println("Both are equal...");
//			}else
//			{
//				System.out.println("Bot are not equal...");
//			}

	}

}
